package timer;

/**
 * A simple timer to keep track of the game's "round"
 */
import timer.TimeObserver;

import java.util.ArrayList;

public class SimpleTimer extends Thread implements Timer
{
	protected int round;
	private ArrayList<TimeObserver> theObservers;
	private int sleepTime;
	
	public SimpleTimer()
	{
		theObservers = new ArrayList<TimeObserver>();
		round = 0;
	}
	
	public SimpleTimer(int waitTime)
	{
		theObservers = new ArrayList<TimeObserver>();
		round = 0;
		sleepTime = waitTime;
	}
	
	/**
	 * returns the round we are in
	 */
	public int getRound()
	{
		return round;
	}
	
	/**
	 * adds observers to watch the round
	 */
	@Override
	public void addTimeObserver(TimeObserver observer)
	{
		theObservers.add(observer);
	}
	
	/**
	 * removes time observers
	 */
	@Override
	public void removeTimeObserver(TimeObserver observer)
	{
		int i = theObservers.indexOf(observer);
		
		if(i >= 0)
		{
			theObservers.remove(observer);
		}
	}
	
	/**
	 * updates the time
	 */
	public void timeChanged()
	{
		round = round + 1;
		for(int i = 0; i < theObservers.size(); i++)
		{
			theObservers.get(i).updateTime(round);		
		}
	}
	
	/**
	 * runs the timer
	 */
	public void run()
	{
		for(int x = 0; x < 5; x++)
		{
			try
			{
				Thread.sleep(sleepTime);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			timeChanged();
		}
	}
}

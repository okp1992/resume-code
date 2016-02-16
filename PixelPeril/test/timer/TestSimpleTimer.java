package timer;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSimpleTimer
{
	@Test
	public void testInitialization()
	{
		Timer timer = new SimpleTimer();
		assertEquals(0, timer.getRound());
	}
	
	@Test
	public void testAddObserver()
	{
		Timer timer = new SimpleTimer();
		MockSimpleTimer observer = new MockSimpleTimer();		
		timer.addTimeObserver(observer);
		timer.timeChanged();
		assertEquals(1, observer.myTime);
	}
	
	@Test
	public void testRemoveObserver()
	{
		Timer timer = new SimpleTimer();
		MockSimpleTimer observer = new MockSimpleTimer();		
		timer.addTimeObserver(observer);
		timer.timeChanged();
		timer.removeTimeObserver(observer);
		timer.timeChanged();
		assertEquals(1, observer.myTime);
	}
	
	@Test
	public void testSimpleTimerAsThread() throws InterruptedException
	{
		SimpleTimer st = new SimpleTimer(1000);
		st.start();
		Thread.sleep(250);
		for(int x = 0; x < 5; x++)
		{
			assertEquals(x, st.getRound());
			Thread.sleep(1000);
		}
	}
	
	

}

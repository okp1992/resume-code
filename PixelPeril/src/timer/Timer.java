package timer;

/**
 * interface that the simple timer takes functionality from
 * @author Olivia Pompa
 *
 */
public interface Timer
{
	public void addTimeObserver(TimeObserver observer);
	
	public void removeTimeObserver(TimeObserver observer);
	
	public void timeChanged();	
	
	public int getRound();
}

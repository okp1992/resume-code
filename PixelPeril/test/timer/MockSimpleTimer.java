package timer;

public class MockSimpleTimer implements TimeObserver
{
	public int myTime = 0;

	@Override
	public void updateTime(int time)
	{
		myTime = time;
	}

}

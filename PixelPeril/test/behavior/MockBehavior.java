package behavior;

import behavior.GenericBehavior;

public class MockBehavior extends GenericBehavior
{

	public MockBehavior(int type)
	{
		super(type);
	}
	
	@Override
	public int getStrength()
	{
		return 40;
	}

}

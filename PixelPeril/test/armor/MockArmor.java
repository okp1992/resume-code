package armor;

public class MockArmor extends GenericArmor
{
	public MockArmor(int type)
	{
		super(type);
	}
	
	@Override
	public int getBaseStrength()
	{
		return 15;
	}
}

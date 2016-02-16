package armor;

public class MockReinforcement extends Reinforcement
{
	public MockReinforcement(Armor armor)
	{
		this.armor = armor;
	}
	
	@Override
	public int getType()
	{
		return 0;
	}
	
	@Override
	public int getBaseStrength()
	{
		return 0;
	}
}

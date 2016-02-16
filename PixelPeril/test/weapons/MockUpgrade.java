package weapons;

public class MockUpgrade extends Upgrade
{
	public MockUpgrade(Weapon weapon)
	{
		this.weapon = weapon;
	}
	
	@Override
	public int getType()
	{
		return 0;
	}
	
	@Override
	public int getStrength()
	{
		return 0;
	}
	
}

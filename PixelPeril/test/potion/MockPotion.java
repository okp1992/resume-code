package potion;

import potions.GenericPotion;

public class MockPotion extends GenericPotion
{
	public int currHealth;

	public MockPotion(int type)
	{
		super(type);
	}
	
	@Override
	public int getCurrHealth(int currHealth)
	{
		return 60;
	}
	
}

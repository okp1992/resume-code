package potions;

/**
 * adds functionality to the generic potion by giving health back
 * @author Olivia Pompa
 *
 */
public class HealthPotion extends GenericPotion
{
	public int healthPotionStrength = 10;

	public HealthPotion()
	{
		super(1);
	}
	
	/**
	 * adds health to the person
	 */
	@Override
	public int getCurrHealth(int currHealth)
	{
		return currHealth + healthPotionStrength;
	}

}

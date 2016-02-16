package potions;

/**
 * Sabatoge potion takes health away from a human
 * @author Olivia Pompa
 *
 */
public class SabatogePotion extends GenericPotion
{
	public int sabatogePotionStrength = 10;

	public SabatogePotion()
	{
		super(2);
	}
	
	/**
	 * removes health from a human
	 */
	@Override
	public int getCurrHealth(int currHealth)
	{
		return currHealth - sabatogePotionStrength;
	}

}

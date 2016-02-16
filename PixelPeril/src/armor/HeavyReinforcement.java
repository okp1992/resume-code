package armor;

/**
 * Gives further functionality to reinforcement
 * @author Olivia Pompa
 *
 */
public class HeavyReinforcement extends Reinforcement
{
	int heavyReinforcement = 10;
	
	/**
	 * Checks type being passed so we don't add reinforcement to a reinforcement
	 * @param armor
	 */
	public HeavyReinforcement(Armor armor)
	{
		if(armor.getType() > 10)
		{
			throw new UnsupportedOperationException();
		}
		else
		{
			this.armor = armor;
		}
	}
	
	@Override
	public int getType()
	{
		return armor.getType() + 20;
	}
	
	@Override
    public int getBaseStrength()
	{
		return armor.getBaseStrength() + heavyReinforcement;	
	}
}

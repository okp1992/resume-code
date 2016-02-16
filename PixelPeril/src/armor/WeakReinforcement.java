package armor;

/**
 * Adds weak reinforcement to the armor
 * @author Olivia Pompa
 *
 */
public class WeakReinforcement extends Reinforcement
{
	int weakReinforcement = 5;
	
	/**
	 * Ensures that reinforcement is not added to reinforcement
	 * @param armor
	 */
	public WeakReinforcement(Armor armor)
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
		return armor.getBaseStrength() + weakReinforcement;	
	}
}

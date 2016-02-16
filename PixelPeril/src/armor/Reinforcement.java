package armor;

/**
 * Adds reinforcement to armor
 * @author Olivia Pompa
 *
 */
public class Reinforcement implements Armor
{
	Armor armor;

	@Override
	public int getType()
	{
		return armor.getType();
	}

	@Override
	public int getBaseStrength()
	{
		return armor.getBaseStrength();
	}
	
}

package armor;

/**
 * Adds weak additional functionality to the Generic Armor
 * @author Olivia Pompa
 *
 */
public class WeakArmor extends GenericArmor
{
	public int weakArmorStrength = 10;
	
	public WeakArmor()
	{
		super(1);
	}
	
	/**
	 * returns strength of weak armor
	 */
	@Override
	public int getBaseStrength()
	{
		return weakArmorStrength;
		
	}

}

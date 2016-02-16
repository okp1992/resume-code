package armor;

/**
 * Heavy Armor class adds heavy functionality to Generic Armor
 * @author Olivia Pompa
 *
 */
public class HeavyArmor extends GenericArmor
{
	public int heavyArmorStrength = 20;
	
	public HeavyArmor()
	{
		super(2);
	}
	
	/**
	 * returns strength of heavy armor
	 */
	@Override
	public int getBaseStrength()
	{
		return heavyArmorStrength;
	}

}

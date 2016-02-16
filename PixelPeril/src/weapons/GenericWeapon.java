package weapons;

/**
 * generic weapon that other weapons and upgrades inherit functionality from
 * @author Olivia Pompa
 *
 */
public class GenericWeapon implements Weapon
{
	protected int weaponType;
	protected int weaponBaseStrength;
	protected static SmallWeapon small;
	protected static SmallWeapon large;

	public GenericWeapon(int weaponType)
	{
		this.weaponType = weaponType;
	}
	
	/**
	 * returns the type of weapon as an int
	 */
	public int getType()
	{
		return weaponType;
	}

	/**
	 * gets the strength of the weapon based on type
	 */
	public int getStrength()
	{
		if(weaponType == 1)
		{
			weaponBaseStrength = small.getStrength();
		}
		if(weaponType == 2)
		{
			weaponBaseStrength = large.getStrength();
		}
		return weaponBaseStrength;
	}

}

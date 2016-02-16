package weapons;

/**
 * Large upgrade to be added to a weapon to increase damage
 * @author Olivia Pompa
 *
 */
public class LargeUpgrade extends Upgrade
{
	int largeUpgrade = 10;

	/**
	 * ensures that we don't add an upgrade to an upgrade by checking type number
	 * @param weapon
	 */
	public LargeUpgrade(Weapon weapon)
	{
		if(weapon.getType() > 10)
		{
			throw new UnsupportedOperationException();
		}
		else
		{
			this.weapon = weapon;
		}
	}
	
	/**
	 * changes number type to differentiate between weapons and upgrades
	 */
	@Override
	public int getType()
	{
		return weapon.getType() + 20;
	}
	
	/**
	 * adds strength to basic weapon
	 */
	@Override
	public int getStrength()
	{
		return weapon.getStrength() + largeUpgrade;	
	}

}

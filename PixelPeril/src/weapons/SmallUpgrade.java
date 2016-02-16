package weapons;

/**
 * Small upgrade to be used on either weapon
 * @author Olivia Pompa
 *
 */
public class SmallUpgrade extends Upgrade
{
	int smallUpgrade = 5;
	
	/**
	 * ensures that we don't add an upgrade to an upgrade by checking type number
	 * @param weapon
	 */
	public SmallUpgrade(Weapon weapon)
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
	 * changes the type number so we know the difference between weapons and upgrades
	 */
	@Override
	public int getType()
	{
		return weapon.getType() + 10;
	}
	
	/**
	 * small upgrades give more strength than regular weapons
	 */
	@Override
    public int getStrength()
	{
		return weapon.getStrength() + smallUpgrade;	
	}
}

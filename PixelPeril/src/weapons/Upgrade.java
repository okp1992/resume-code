package weapons;

/**
 * general upgrade that specific upgrades take from
 * @author Olivia Pompa
 *
 */
public abstract class Upgrade implements Weapon
{
	Weapon weapon;

	@Override
	public int getStrength()
	{
		return weapon.getStrength();
	}
}

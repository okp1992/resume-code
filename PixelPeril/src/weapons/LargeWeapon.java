package weapons;

/**
 * Large weapon with more damage than a small weapon
 * @author Olivia Pompa
 *
 */
public class LargeWeapon extends GenericWeapon
{
	public int largeWeaponStrength = 20;

	public LargeWeapon()
	{
		super(2);
	}
	
	/**
	 * has higher strength than a small weapon
	 */
	@Override
	public int getStrength()
	{
		return largeWeaponStrength;
		
	}
}

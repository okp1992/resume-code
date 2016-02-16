package weapons;

/**
 * Small, basic weapon
 * @author Olivia Pompa
 *
 */
public class SmallWeapon extends GenericWeapon
{
	public int smallWeaponStrength = 10;
	
	public SmallWeapon()
	{
		super(1);
	}
	
	/**
	 * small weapon has the lowest strength
	 */
	@Override
	public int getStrength()
	{
		return smallWeaponStrength;
		
	}

}

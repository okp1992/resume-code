package weapons;

public class MockWeapon extends GenericWeapon
{

	public MockWeapon(int weaponType)
	{
		super(weaponType);
	}

    @Override
    public int getStrength()
    {
        return 15;
    } 
}

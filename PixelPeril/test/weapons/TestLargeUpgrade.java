package weapons;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLargeUpgrade
{

	@Test
	public void testWithSmallWeapon()
	{
		Weapon small = new SmallWeapon();
		small = new LargeUpgrade(small);

		assertEquals(20, small.getStrength());
		assertEquals(21, small.getType());

		assertNotEquals(10, small.getStrength());
		assertNotEquals(1, small.getType());
	}

	@Test
	public void testWithLargeWeapon()
	{
		Weapon large = new LargeWeapon();
		large = new LargeUpgrade(large);

		assertEquals(30, large.getStrength());
		assertEquals(22, large.getType());

		assertNotEquals(10, large.getStrength());
		assertNotEquals(1, large.getType());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testCantAddUpgradeToUpgrade()
	{
		Weapon large = new LargeWeapon();
		large = new LargeUpgrade(large);

		new LargeUpgrade(large);
	}

}

package weapons;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSmallUpgrade
{
	@Test
	public void testWithSmallWeapon()
	{
		Weapon small = new SmallWeapon();
		small = new SmallUpgrade(small);

		assertEquals(15, small.getStrength());
		assertEquals(11, small.getType());

		assertNotEquals(10, small.getStrength());
		assertNotEquals(1, small.getType());
	}

	@Test
	public void testWithLargeWeapon()
	{
		Weapon large = new LargeWeapon();
		large = new SmallUpgrade(large);

		assertEquals(25, large.getStrength());
		assertEquals(12, large.getType());

		assertNotEquals(10, large.getStrength());
		assertNotEquals(1, large.getType());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testCantAddToUpgrade()
	{
		Weapon large = new LargeWeapon();
		large = new SmallUpgrade(large);

		new SmallUpgrade(large);
	}

}

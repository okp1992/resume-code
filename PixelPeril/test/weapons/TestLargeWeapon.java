package weapons;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLargeWeapon
{

	@Test
	public void test()
	{
		GenericWeapon weapon = new LargeWeapon();
		assertEquals(20, weapon.getStrength());
		assertEquals(2, weapon.getType());
		
		assertNotEquals(15, weapon.getStrength());
		assertNotEquals(1, weapon.getType());
	}

}

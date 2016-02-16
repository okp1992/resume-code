package weapons;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSmallWeapon
{

	@Test
	public void testConstructor()
	{
		GenericWeapon weapon = new SmallWeapon();
		assertEquals(10, weapon.getStrength());
		assertEquals(1, weapon.getType());
		
		assertNotEquals(15, weapon.getStrength());
		assertNotEquals(2, weapon.getType());
	}

}

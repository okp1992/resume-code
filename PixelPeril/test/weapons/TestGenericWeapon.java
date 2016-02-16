package weapons;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGenericWeapon
{
	@Test
	public void testConstructor()
	{
		GenericWeapon weapon = new MockWeapon(1);
		assertEquals(15, weapon.getStrength());
		assertEquals(1, weapon.getType());
	}

}

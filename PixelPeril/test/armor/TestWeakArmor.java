package armor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakArmor
{
	@Test
	public void testConstructor()
	{
		GenericArmor armor = new WeakArmor();
		assertEquals(10, armor.getBaseStrength());
		assertEquals(1, armor.getType());
		
		assertNotEquals(15, armor.getBaseStrength());
		assertNotEquals(2, armor.getType());
	}

}

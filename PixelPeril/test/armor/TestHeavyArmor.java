package armor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHeavyArmor
{
	@Test
	public void testConstructor()
	{
		GenericArmor armor = new HeavyArmor();
		assertEquals(20, armor.getBaseStrength());
		assertEquals(2, armor.getType());
		
		assertNotEquals(15, armor.getBaseStrength());
		assertNotEquals(1, armor.getType());
	}
}

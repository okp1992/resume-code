package armor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGenericArmor
{
	@Test
	public void testConstructor()
	{
		GenericArmor armor = new MockArmor(1);
		
		assertEquals(15, armor.getBaseStrength());
		assertEquals(1, armor.getType());
	}

}

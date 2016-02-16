package potion;

import static org.junit.Assert.*;
import org.junit.Test;
import potions.GenericPotion;

public class TestGenericPotion
{
	@Test
	public void testConstructor()
	{
		GenericPotion potion = new MockPotion(1);
		
		assertEquals(60, potion.getCurrHealth(50));
		assertEquals(1, potion.getType());
	}

}

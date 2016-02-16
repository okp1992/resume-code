package potion;

import static org.junit.Assert.*;

import org.junit.Test;

import potions.GenericPotion;
import potions.SabatogePotion;

public class TestSabatagePotion
{
	@Test
	public void testConstructor()
	{
		GenericPotion potion = new SabatogePotion();
		assertEquals(40, potion.getCurrHealth(50));
		assertEquals(2, potion.getType());
		
		assertNotEquals(15, potion.getCurrHealth(50));
		assertNotEquals(1, potion.getType());
	}

}

package potion;

import static org.junit.Assert.*;

import org.junit.Test;

import potions.GenericPotion;
import potions.HealthPotion;


public class TestHealthPotion
{
	@Test
	public void testConstructor()
	{
		GenericPotion potion = new HealthPotion();
		assertEquals(60, potion.getCurrHealth(50));
		assertEquals(1, potion.getType());
		
		assertNotEquals(100, potion.getCurrHealth(50));
		assertNotEquals(2, potion.getType());
	}

}

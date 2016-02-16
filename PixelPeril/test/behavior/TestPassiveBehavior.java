package behavior;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPassiveBehavior
{
	@Test
	public void testConstructor()
	{
		GenericBehavior potion = new PassiveBehavior();
		assertEquals(20, potion.getStrength());
		assertEquals(1, potion.getType());
		
		assertNotEquals(100, potion.getStrength());
		assertNotEquals(2, potion.getType());
	}


}

package behavior;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestAggressiveBehavior
{
	@Test
	public void testConstructor()
	{
		GenericBehavior potion = new AggressiveBehavior();
		assertEquals(40, potion.getStrength());
		assertEquals(3, potion.getType());
		
		assertNotEquals(100, potion.getStrength());
		assertNotEquals(2, potion.getType());
	}

}

package behavior;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestDefensiveBehavior
{
	@Test
	public void testConstructor()
	{
		GenericBehavior potion = new DefensiveBehavior();
		assertEquals(30, potion.getStrength());
		assertEquals(2, potion.getType());
		
		assertNotEquals(100, potion.getStrength());
		assertNotEquals(3, potion.getType());
	}

}

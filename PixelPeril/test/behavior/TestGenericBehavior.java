package behavior;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestGenericBehavior
{
	@Test
	public void testConstructor()
	{
		GenericBehavior behavior = new MockBehavior(1);
		
		assertEquals(40, behavior.getStrength());
		assertEquals(1, behavior.getType());
	}

}

package armor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHeavyReinforcement
{
	@Test
	public void testWithWeakArmor()
	{
		Armor weak = new WeakArmor();
		weak = new HeavyReinforcement(weak);

		assertEquals(20, weak.getBaseStrength());
		assertEquals(21, weak.getType());

		assertNotEquals(10, weak.getBaseStrength());
		assertNotEquals(1, weak.getType());
	}
	
	@Test
	public void testWithHeavyArmor()
	{
		Armor armor = new HeavyArmor();
		armor = new HeavyReinforcement(armor);

		assertEquals(30, armor.getBaseStrength());
		assertEquals(22, armor.getType());

		assertNotEquals(10, armor.getBaseStrength());
		assertNotEquals(1, armor.getType());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testCantAddToReinforcement()
	{
		Armor armor = new HeavyArmor();
		armor = new HeavyReinforcement(armor);

		new HeavyReinforcement(armor);
	}

}

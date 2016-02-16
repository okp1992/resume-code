package armor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWeakReinforcement
{
	@Test
	public void testWithWeakArmor()
	{
		Armor weak = new WeakArmor();
		weak = new WeakReinforcement(weak);

		assertEquals(15, weak.getBaseStrength());
		assertEquals(21, weak.getType());

		assertNotEquals(10, weak.getBaseStrength());
		assertNotEquals(1, weak.getType());
	}
	
	@Test
	public void testWithHeavyArmor()
	{
		Armor armor = new HeavyArmor();
		armor = new WeakReinforcement(armor);

		assertEquals(25, armor.getBaseStrength());
		assertEquals(22, armor.getType());

		assertNotEquals(10, armor.getBaseStrength());
		assertNotEquals(1, armor.getType());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testCantAddToReinforcement()
	{
		Armor armor = new HeavyArmor();
		armor = new WeakReinforcement(armor);

		new WeakReinforcement(armor);
	}

}

package entities;

import static org.junit.Assert.*;

import org.junit.Test;

import behavior.PassiveBehavior;

public class TestMonster
{
	@Test
	public void testInitialize()
	{
		Monster monster = new Monster("Name", 100, new PassiveBehavior());
		assertEquals("Name", monster.getName());
		assertEquals(100, monster.getCurrentHealth());
		int behavior = monster.getCombatBehaviorType();
		assertEquals(1, behavior);
		assertEquals(20, monster.getCombatBehaviorStrength(behavior));
	}

}

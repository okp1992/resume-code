package entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEntity
{
	@Test
	public void testInitialize()
	{
		Entity entity = new MockEntity("Name", 100);
		assertEquals("Name", entity.getName());
		assertEquals(100, entity.getCurrentHealth());
	}
	
	@Test
	public void hasAttackPower()
	{
		Entity entity = new MockEntity("Name", 100);
		entity.setAttackPower(8);
		assertEquals(8, entity.getAttackPower());
	}
	
	@Test
	public void hasLocation()
	{
		Entity entity = new MockEntity("Name", 100);
		entity.setRow(2);
		entity.setColumn(5);
		assertEquals(2, entity.getRow());
		assertEquals(5, entity.getColumn());
	}
	
	@Test
	public void takeDamage()
	{
		Entity entity = new MockEntity("Name", 100);
		assertEquals(100, entity.getCurrentHealth());
		entity.takeDamage(10);
		assertEquals(90, entity.getCurrentHealth());
	}

}

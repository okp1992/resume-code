package entities;

import static org.junit.Assert.*;

import org.junit.Test;

import weapons.LargeWeapon;
import behavior.PassiveBehavior;
import armor.HeavyArmor;
import armor.WeakArmor;

public class TestObserver
{
	@Test
	public void testInitialization()
	{
		Person person = new Person("Name", 100, new WeakArmor());
		assertEquals(0, person.getNumberOfObservers());
	}
	
	@Test
	public void testAddAndUpdate()
	{
		Person person = new Person("Name", 100, new HeavyArmor());
		Monster monster = new Monster("Name2", 100, new PassiveBehavior());
		
		person.setWeapon(new LargeWeapon());
		
		person.addObservers(monster);
		person.isLeveledUp();
		assertEquals(1, person.getNumberOfObservers());
		assertEquals(1, monster.getUpdates());
	}
	
	@Test
	public void testRemoveAndUpdate()
	{
		Person person = new Person("Name", 100, new HeavyArmor());
		Monster monster = new Monster("Name2", 100, new PassiveBehavior());
		
		person.setWeapon(new LargeWeapon());
		
		person.addObservers(monster);
		person.removeObservers(monster);
		person.isLeveledUp();
		assertEquals(0, person.getNumberOfObservers());
	}
}

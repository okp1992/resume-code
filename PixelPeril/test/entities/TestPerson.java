package entities;

import static org.junit.Assert.*;

import org.junit.Test;

import behavior.AggressiveBehavior;
import weapons.LargeUpgrade;
import weapons.LargeWeapon;
import weapons.SmallUpgrade;
import weapons.SmallWeapon;
import weapons.Weapon;
import armor.HeavyArmor;
import armor.WeakArmor;

public class TestPerson
{

	@Test
	public void testInitialize()
	{
		Person person = new Person("Name", 100, new WeakArmor());
		assertEquals("Name", person.getName());
		assertEquals(100, person.getCurrentHealth());
		int armor = person.getArmorType();
		assertEquals(1, armor);
		assertEquals(10, person.getArmorStrength(armor));
	}
	
	@Test
	public void testSetWeakWeapon()
	{
		Person person = new Person("Name", 100, new WeakArmor());
		Weapon weapon = new SmallWeapon();
		person.setWeapon(weapon);
		int weaponType = person.getWeaponType();
		assertEquals(1, weaponType);
		assertEquals(10, person.currWeapon.getStrength());
	}
	
	@Test
	public void testSetHeavyWeapon()
	{
		Person person = new Person("Name", 100, new WeakArmor());
		Weapon weapon = new LargeWeapon();
		person.setWeapon(weapon);
		int weaponType = person.getWeaponType();
		assertEquals(2, weaponType);
		assertEquals(20, person.currWeapon.getStrength());
	}
	
	@Test
	public void testCanAttackSmallWeapon()
	{
		Person person = new Person("Name", 100, new WeakArmor());
		Entity entity = new MockEntity("Name2", 100);
		Weapon weapon = new SmallWeapon();
		person.setWeapon(weapon);
		person.attack(person, entity);
		assertEquals(90, entity.getCurrentHealth());
	}
	
	@Test
	public void testCanAttackLargeWeapon()
	{
		Person person = new Person("Name", 100, new WeakArmor());
		Entity entity = new MockEntity("Name2", 100);
		Weapon weapon = new LargeWeapon();
		person.setWeapon(weapon);
		person.attack(person, entity);
		assertEquals(80, entity.getCurrentHealth());
	}
	
	@Test
	public void testSmallWeaponSmallUpgrade()
	{
		Person person = new Person("Name", 100, new WeakArmor());
		Entity entity = new MockEntity("Name2", 100);
		Weapon weapon = new SmallWeapon();
		weapon = new SmallUpgrade(weapon);
		
		person.setWeapon(weapon);
		person.attack(person, entity);
		assertEquals(85, entity.getCurrentHealth());
	}
	
	@Test
	public void testSmallWeaponLargeUpgrade()
	{
		Person person = new Person("Name", 100, new WeakArmor());
		Entity entity = new MockEntity("Name2", 100);
		Weapon weapon = new SmallWeapon();
		weapon = new LargeUpgrade(weapon);
		
		person.setWeapon(weapon);
		person.attack(person, entity);
		assertEquals(80, entity.getCurrentHealth());
	}
	
	@Test
	public void testLargeWeaponSmallUpgrade()
	{
		Person person = new Person("Name", 100, new WeakArmor());
		Entity entity = new MockEntity("Name2", 100);
		Weapon weapon = new LargeWeapon();
		weapon = new SmallUpgrade(weapon);
		
		person.setWeapon(weapon);
		person.attack(person, entity);
		assertEquals(75, entity.getCurrentHealth());
	}
	
	@Test
	public void testLargeWeaponLargeUpgrade()
	{
		Person person = new Person("Name", 100, new HeavyArmor());
		Entity entity = new MockEntity("Name2", 100);
		Weapon weapon = new LargeWeapon();
		weapon = new LargeUpgrade(weapon);
		
		person.setWeapon(weapon);
		person.attack(person, entity);
		assertEquals(70, entity.getCurrentHealth());
	}
	
	@Test
	public void testCanFightMonster()
	{
		Person person = new Person("Name", 100, new HeavyArmor());
		Monster monster = new Monster("Name2", 100, new AggressiveBehavior());
		
		Weapon weapon = new LargeWeapon();
		person.setWeapon(weapon);
		
		person.attack(person, monster);
		assertEquals(80, monster.getCurrentHealth());
		
		monster.attack(monster, person);
		assertEquals(80, person.getCurrentHealth());
	}
}

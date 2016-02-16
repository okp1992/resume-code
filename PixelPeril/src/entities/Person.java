package entities;

/**
 * A person class that extends entity and is the subject of an observer
 * @author Olivia Pompa
 */
import java.util.Vector;

import potions.Potion;
import armor.Armor;
import weapons.Weapon;

public class Person extends Entity implements Subject
{
	protected Armor armor;
	protected Weapon currWeapon;
	protected Potion currPotion = null;
	private Vector<Observer> monsters = new Vector<Observer>();
	int observers;

	public Person(String name, int life, Armor armor)
	{
		super(name, life);
		this.armor = armor;
	}

	/**
	 * sets armor
	 * @param armor
	 */
	public void setArmor(Armor armor)
	{
		this.armor = armor;
	}

	/**
	 * returns armor
	 * @return
	 */
	public int getArmorType()
	{
		return armor.getType();
	}

	/**
	 * returns armor strength
	 * @param armorType
	 * @return
	 */
	public int getArmorStrength(int armorType)
	{
		return armor.getBaseStrength();
	}

	/**
	 * sets weapon
	 * @param weapon
	 */
	public void setWeapon(Weapon weapon)
	{
		if (currWeapon == null)
		{
			currWeapon = weapon;
		}
	}

	/**
	 * returns weapon
	 * @return
	 */
	public int getWeaponType()
	{
		return currWeapon.getType();
	}

	/**
	 * sets current potion
	 * @param potion
	 */
	public void setPotion(Potion potion)
	{
		currPotion = potion;
	}

	/**
	 * gets current potion
	 * @return
	 */
	public int getPotionType()
	{
		return currPotion.getType();
	}
	
	/**
	 * checks if the human has leveled up
	 * @return
	 */
	public boolean isLeveledUp()
	{
		if(armor.getType() == 2 && currWeapon.getType() == 2)
		{
			notifyObservers();
			return true;
		}
		else
		{
			return false;
		}
	}

	/**
	 * method to attack an enemy with a weapon
	 * @param attacker
	 * @param target
	 */
	public void attack(Entity attacker, Entity target)
	{
		if (currWeapon != null)
		{
			target.takeDamage(currWeapon.getStrength());
		}
	}

	/**
	 * adds observers
	 */
	@Override
	public void addObservers(Observer observer)
	{
		monsters.addElement(observer);
		observers++;
	}

	/**
	 * removes observers
	 */
	@Override
	public void removeObservers(Observer observer)
	{
		monsters.removeElement(observer);
		observers--;
	}

	/**
	 * notifies the observers of a change
	 */
	@Override
	public void notifyObservers()
	{
		for(int i = 0; i < monsters.size(); i++)
		{
			monsters.get(i).update();
		}
	}
	
	/**
	 * finds the number of observers it has
	 * @return
	 */
	public int getNumberOfObservers()
	{
		return observers;
	}
	
	/**
	 * allows a human to take damage
	 */
	@Override
	public void takeDamage(int damage)
    {
    	if (currentHealth > damage)
    	{
    		currentHealth = (currentHealth - damage) + armor.getBaseStrength();
    	}
    	else
    		currentHealth = 0;    
    }
}

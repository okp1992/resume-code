package entities;

/**
 *Class that includes functionality for Monsters
 * @author Olivia Pompa
 */
import behavior.CombatBehavior;

public class Monster extends Entity implements Observer
{
	protected CombatBehavior behavior;
	protected int behaviorStrength;
	int updates = 0;

	public Monster(String name, int health, CombatBehavior behavior)
	{
		super(name, health);
		this.behavior = behavior;
	}
	
	/**
	 * sets combat behavior type
	 * @param behavior
	 */
	public void setBehavior(CombatBehavior behavior)
	{
		this.behavior = behavior;
	}
	
	/**
	 * returns combat behavior type
	 * @return
	 */
	public int getCombatBehaviorType()
	{
		return behavior.getType();
	}
	
	/**
	 * gets combat strength based on type
	 * @param behaviorType
	 * @return
	 */
	public int getCombatBehaviorStrength(int behaviorType)
	{
		behaviorStrength = behavior.getStrength();
		return behaviorStrength;
	}
	
	/**
	 * find number of updates it has received
	 * @return
	 */
	public int getUpdates()
	{
		return updates;
	}
	
	/**
	 * attacks an enemy
	 * @param attacker
	 * @param target
	 */
	public void attack(Entity attacker, Entity target)
	{
		if (currentHealth > 0)
		{
			target.takeDamage(behavior.getStrength());
		}
	}

	/**
	 * increases the monster's strength when the human is at a higher level
	 */
	@Override
	public void update()
	{
		behaviorStrength = behavior.getStrength() + 10;
		updates++;
	}
	

}

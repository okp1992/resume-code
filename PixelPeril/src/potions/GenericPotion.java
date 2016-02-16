package potions;

/**
 * generic potion that gives functionality to the specific potions
 * @author Olivia Pompa
 *
 */
public abstract class GenericPotion implements Potion
{
	protected int type;
	protected int currHealth;
	protected static HealthPotion health;
	protected static SabatogePotion sabatoge;

	public GenericPotion(int type)
	{
		this.type = type;
	}
	
	/**
	 * returns the type of potion
	 */
	public int getType()
    {
        return type;
    }
	
	/**
	 * gets person's current health based on potion taken
	 */
	public int getCurrHealth(int currHealth)
    {
    	if(type == 1)
    	{
    		currHealth = health.getCurrHealth(currHealth);
    	}
    	if(type == 2)
    	{
    		currHealth = sabatoge.getCurrHealth(currHealth);
    	}
        return currHealth;
    }
}

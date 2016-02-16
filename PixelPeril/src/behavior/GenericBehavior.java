package behavior;

/**
 * The abstract class that all the Behaviors take from 
 * @author Olivia Pompa
 *
 */
public abstract class GenericBehavior implements CombatBehavior
{
	protected int type;
	protected int strength;
	protected static PassiveBehavior passive;
	protected static DefensiveBehavior defensive;
	protected static AggressiveBehavior aggressive;
	
	public GenericBehavior(int type)
	{
		this.type = type;
	}
	
	/**
	 * returns type of behavior a monster has
	 */
	public int getType()
    {
        return type;
    }
	
	/**
	 * returns the strength a monster has based on its type
	 */
	public int getStrength()
    {
    	if(type == 1)
    	{
    		strength = passive.getStrength();
    	}
    	if(type == 2)
    	{
    		strength = defensive.getStrength();
    	}
    	if(type == 3)
    	{
    		strength = aggressive.getStrength();
    	}
        return strength;
    }
}

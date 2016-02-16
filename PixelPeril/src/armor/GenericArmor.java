package armor;

/**
 * An abstract class that gives general behavior to all types of Armor
 * @author Olivia Pompa
 *
 */
public abstract class GenericArmor implements Armor
{
	protected int type;
	protected int baseStrength;
	protected static WeakArmor weak;
	protected static HeavyArmor heavy;
	

	public GenericArmor(int type)
	{
		this.type = type;
	}
	
	/**
	 * returns the type of armor as an integer
	 */
    public int getType()
    {
        return type;
    }
	
    /**
     * returns the strength of either weak or heavy armor
     */
    public int getBaseStrength()
    {
    	if(type == 1)
    	{
    		baseStrength = weak.getBaseStrength();
    	}
    	if(type == 2)
    	{
    		baseStrength = heavy.getBaseStrength();
    	}
        return baseStrength;
    }
}

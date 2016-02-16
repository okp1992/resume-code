package behavior;

/**
 * Least dangerous type of monster
 * @author Olivia Pompa
 *
 */
public class PassiveBehavior extends GenericBehavior
{
	public int passiveBehaviorStrength = 20;
	
	public PassiveBehavior()
	{
		super(1);
	}

	@Override
	public int getStrength()
	{
		return passiveBehaviorStrength;
	}

}

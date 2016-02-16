package behavior;

/**
 * Most damaging type of monster
 * @author Olivia Pompa
 *
 */
public class AggressiveBehavior extends GenericBehavior
{
	public int aggressiveBehaviorStrength = 40;

	public AggressiveBehavior()
	{
		super(3);
	}

	@Override
	public int getStrength()
	{
		return aggressiveBehaviorStrength;
	}

}

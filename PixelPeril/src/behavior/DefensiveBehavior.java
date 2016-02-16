package behavior;

/**
 * The average aggression type of monster
 * @author Olivia Pompa
 *
 */
public class DefensiveBehavior extends GenericBehavior
{
	public int defensiveBehaviorStrength = 30;

	public DefensiveBehavior()
	{
		super(2);
	}

	@Override
	public int getStrength()
	{
		return defensiveBehaviorStrength;
	}

}

package entities;

/**
 * The basic entity class that all monsters and humans take from
 * @author Olivia Pompa
 *
 */
public abstract class Entity
{
	private String name;
	protected int currentHealth;
	protected int currentAttackPower;
	private int row, column;
	
	public Entity(String name, int health)
	{
		this.name = name;
		currentHealth = health;
	}
	
	/**
	 * returns the name as a string
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * returns current health as an int
	 * @return
	 */
	public int getCurrentHealth()
	{
		return currentHealth;
	}
	
	/**
	 * sets the power an entity can fight with
	 * @param attack
	 */
	public void setAttackPower(int attack)
	{
		currentAttackPower = attack;
	}
	
	/**
	 * returns the attack power an entity has
	 * @return
	 */
	public int getAttackPower()
	{
		return currentAttackPower;
	}
	
	/**
	 * sets the row the entity is in
	 * @param row
	 */
	public void setRow(int row)
	{
		this.row = row;
	}
	
	/**
	 * sets the column the entity is in
	 * @param column
	 */
	public void setColumn(int column)
	{
		this.column = column;
	}
	
	/**
	 * returns the row the entity is in
	 * @return
	 */
	public int getRow()
	{
		return row;
	}
	
	/**
	 * returns the column the entity is in
	 * @return
	 */
	public int getColumn()
	{
		return column;
	}
	
	/**
	 * allows an entity to be damaged correctly
	 * @param damage
	 */
    public void takeDamage(int damage)
    {
    	if (currentHealth > damage)
    	{
    		currentHealth = currentHealth - damage;
    	}
    	else
    		currentHealth = 0;    
    }
    
    
}

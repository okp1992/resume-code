package entities;

/**
 * Interface that gives functionality to the person as a subject
 * @author Olivia Pompa
 *
 */
public interface Subject
{
	void addObservers(Observer observer);
	
	void removeObservers(Observer observer);
	
	void notifyObservers();
}

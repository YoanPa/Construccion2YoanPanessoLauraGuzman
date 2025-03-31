package app.ports;
import app.domain.models.Person;


public interface PersonPort{
	public boolean existPerson(long personId);
	
	public void savePerson(Person person);
	
	public Person findBypersonId(long personId);
}
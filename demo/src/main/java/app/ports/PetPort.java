package app.ports;

import app.domain.models.Person;
import app.domain.models.Pet;

public interface PetPort {
	
	public boolean exitsPetId(Pet petId);

	public Person findbyPersonId(Person PersonId);
	
	

}

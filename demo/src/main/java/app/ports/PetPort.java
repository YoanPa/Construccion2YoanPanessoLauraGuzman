package app.ports;

import app.domain.models.Pet;

public interface PetPort {
	
	public boolean exitsPet(long petId);
	public void savePet(Pet pet);
	public Pet findByPetId(long petId);
}

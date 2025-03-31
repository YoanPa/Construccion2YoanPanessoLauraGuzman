package app.ports;

import app.domain.models.Pet;

public interface PetPort {
	
	public boolean exitsPetId(Pet petId);
	
	public void savePet(Pet pet);
	
	public Pet findbyPetId(Pet petId);
}

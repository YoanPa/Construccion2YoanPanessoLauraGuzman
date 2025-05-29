package app.adapters.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.adapters.pet.entity.PetEntity;
import app.adapters.pet.repository.PetRepository;
import app.domain.models.Pet;
import app.ports.PetPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Service
public class PetAdapter implements PetPort {
	@Autowired
	private PetRepository petRepository;
	
	@Override
	public boolean exitsPet(long petId) {
		
		return petRepository.existsByPetId(petId);
	}


	@Override
	public void savePet(Pet pet) {
		PetEntity petEntity = petAdapter(pet);
		petRepository.save(petEntity);
		pet.setPetId(petEntity.getPetId());
	}

	@Override
	public Pet findByPetId(long petId) {
		PetEntity petEntity = petRepository.findByPetId(petId);
		return petAdapter(petEntity);
	}
	
	private Pet petAdapter(PetEntity petEntity) {
		if (petEntity == null)
			return null;
		Pet pet = new Pet();
		pet.setPetId(petEntity.getPetId());
		pet.setPetname(petEntity.getPetname());
		pet.setOwner(petEntity.getOwner());
		pet.setAge(petEntity.getAge());
		pet.setSpecies(petEntity.getSpecies());
		pet.setBreed(petEntity.getBreed());
		pet.setCharacteristics(petEntity.getCharacteristics());
		pet.setWeight(petEntity.getWeight());
		return pet;
		
	}
	
	private PetEntity petAdapter(Pet pet) {
		PetEntity petEntity = new PetEntity();
		petEntity.setPetId(pet.getPetId());
		petEntity.setPetname(pet.getPetname());
		petEntity.setOwner(pet.getOwner());
		petEntity.setAge(pet.getAge());
		petEntity.setSpecies(pet.getSpecies());
		petEntity.setBreed(pet.getBreed());
		petEntity.setCharacteristics(pet.getCharacteristics());
		petEntity.setWeight(pet.getWeight());
		return petEntity;
	}


}

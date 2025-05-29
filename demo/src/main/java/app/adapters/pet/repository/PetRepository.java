package app.adapters.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.adapters.person.entity.PersonEntity;
import app.adapters.pet.entity.PetEntity;
import app.domain.models.Pet;

public interface PetRepository extends JpaRepository<PetEntity,Long>{
	
	boolean existsByPersonId(Pet petId);
	
	PersonEntity findByPersonId(long personId);
	
	boolean existsByPetId(long petId);
	
	PetEntity findByPetId(long petId);

}

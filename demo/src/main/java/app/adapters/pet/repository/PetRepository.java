package app.adapters.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.adapters.person.entity.PersonEntity;
import app.adapters.pet.entity.PetEntity;

public interface PetRepository extends JpaRepository<PetEntity,Long>{
	
	boolean existsByPersonId(long personId);
	PersonEntity findByPersonId(long personId);

}

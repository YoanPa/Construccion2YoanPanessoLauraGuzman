package app.adapters.hisclin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.adapters.hisclin.entity.HisClinEntity;
import app.adapters.pet.entity.PetEntity;
import app.domain.models.HisClin;

public interface HisClinRepository extends JpaRepository<HisClinEntity, Long> {
	
	boolean existsByHisClinId (long hisclinId);
	
	HisClinEntity findByHisClin(long hisclinId);
	
    HisClinEntity findByPet(PetEntity petEntity);
}

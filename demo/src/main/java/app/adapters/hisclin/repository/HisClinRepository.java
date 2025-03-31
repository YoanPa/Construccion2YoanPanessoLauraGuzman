package app.adapters.hisclin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.adapters.hisclin.entity.HisClinEntity;
import app.adapters.pet.entity.PetEntity;

public interface HisClinRepository extends JpaRepository<HisClinEntity, Long> {
    HisClinEntity findByPet(PetEntity petEntity);
}

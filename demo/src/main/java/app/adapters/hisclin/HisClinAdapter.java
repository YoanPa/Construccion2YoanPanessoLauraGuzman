package app.adapters.hisclin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.adapters.hisclin.entity.HisClinEntity;
import app.adapters.hisclin.repository.HisClinRepository;
import app.adapters.pet.entity.PetEntity;
import app.adapters.person.entity.PersonEntity;
import app.domain.models.HisClin;
import app.domain.models.Pet;
import app.domain.models.Person;
import app.ports.HisClinPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Service
public class HisClinAdapter implements HisClinPort {
    
    @Autowired
    private HisClinRepository hisClinRepository;

    @Override
    public HisClin findByPetId(Pet pet) {
        PetEntity petEntity = petAdapter(pet);
        HisClinEntity hisClinEntity = hisClinRepository.findByPet(petEntity);
        if (hisClinEntity == null) {
            return null;
        }
        return hisClinAdapter(hisClinEntity);
    }

    @Override
    public void save(HisClin hisClin) {
        HisClinEntity hisClinEntity = hisClinAdapter(hisClin);
        hisClinRepository.save(hisClinEntity);
        hisClin.setHistoryId(hisClinEntity.getHistoryId());
    }

    private HisClinEntity hisClinAdapter(HisClin hisClin) {
        HisClinEntity hisClinEntity = new HisClinEntity();
        hisClinEntity.setHistoryId(hisClin.getHistoryId());
        hisClinEntity.setPet(petAdapter(hisClin.getPet()));
        hisClinEntity.setVeterinarian(personAdapter(hisClin.getVeterinarianId()));
        hisClinEntity.setDate(hisClin.getDate());
        hisClinEntity.setDescription(hisClin.getDescription());
        return hisClinEntity;
    }

    private HisClin hisClinAdapter(HisClinEntity hisClinEntity) {
        HisClin hisClin = new HisClin();
        hisClin.setHistoryId(hisClinEntity.getHistoryId());
        hisClin.setPet(petAdapter(hisClinEntity.getPet()));
        hisClin.setVeterinarianId(personAdapter(hisClinEntity.getVeterinarianId()));
        hisClin.setDate(hisClinEntity.getDate());
        hisClin.setDescription(hisClinEntity.getDescription());
        return hisClin;
    }

    private PetEntity petAdapter(Pet pet) {
        PetEntity petEntity = new PetEntity();
        petEntity.setPetId(pet.getPetId());
        petEntity.setPetname(pet.getPetname());
        petEntity.setOwner(personAdapter(pet.getOwner()));
        petEntity.setAge(pet.getAge());
        petEntity.setSpecies(pet.getSpecies());
        petEntity.setBreed(pet.getBreed());
        petEntity.setCharacteristics(pet.getCharacteristics());
        petEntity.setWeight(pet.getWeight());
        return petEntity;
    }

    private PersonEntity personAdapter(Person person) {
        PersonEntity personEntity = new PersonEntity();
        personEntity.setPersonId(person.getPersonId());
        personEntity.setName(person.getName());
        personEntity.setCellPhone(person.getCellPhone());
        personEntity.setDocument(person.getDocument());
        return personEntity;
    }

    private Person personAdapter(PersonEntity personEntity) {
        Person person = new Person();
        person.setPersonId(personEntity.getPersonId());
        person.setName(personEntity.getName());
        person.setCellPhone(personEntity.getCellPhone());
        person.setDocument(personEntity.getDocument());
        return person;
    }

	@Override
	public void saveHisClin(HisClin hisclin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HisClin FindbyHisClin(HisClin hisclin) {
		// TODO Auto-generated method stub
		return null;
	}
}
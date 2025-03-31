package app.adapters.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
import app.adapters.person.entity.PersonEntity;
import app.adapters.person.repository.PersonRepository;
import app.domain.models.Person;
import app.ports.PersonPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Service
public class PersonAdapter implements PersonPort {
	
	@Autowired
	private PersonRepository personRepository;
	@Override
	public boolean existPerson(long personId) {
		return personRepository.existsByPersonId(personId);
=======

import app.adapters.person.entity.PersonEntity;
import app.adapters.person.repository.PersonRepository;
import app.domain.models.Person;
import app.ports.PersonPort;

@Service
public class PersonAdapter implements PersonPort {
    
    @Autowired
    private PersonRepository personRepository;
    
    @Override
    public Person findById(Long id) {
        PersonEntity personEntity = personRepository.findById(id);
        if (personEntity == null) {
            return null;
        }
        return personAdapter(personEntity);
    }
    
    @Override
    public void save(Person person) {
        PersonEntity personEntity = personAdapter(person);
        personRepository.save(personEntity);
        person.setPersonId(personEntity.getPersonId());
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
	public boolean existPerson(long personId) {
		// TODO Auto-generated method stub
		return false;
>>>>>>> 22717d5177611efb1713069b1789642c21527833
	}

	@Override
	public void savePerson(Person person) {
<<<<<<< HEAD
		PersonEntity personEntity = personAdapter(person);
		personRepository.save(personEntity);
		person.setPersonId(personEntity.getPersonId());
=======
		// TODO Auto-generated method stub
		
>>>>>>> 22717d5177611efb1713069b1789642c21527833
	}

	@Override
	public Person findBypersonId(long personId) {
<<<<<<< HEAD
		PersonEntity personEntity = personRepository.findByPersonId(personId);
		return personAdapter(personEntity);
	}

	private Person personAdapter(PersonEntity personEntity) {
		Person person = new Person();
		person.setPersonId(personEntity.getPersonId());
		person.setName(personEntity.getName());
		person.setAge(personEntity.getAge());
		person.setRole(personEntity.getRole());
				return person;
	}
	
	private PersonEntity personAdapter(Person person) {
		PersonEntity personEntity = new PersonEntity();
		personEntity.setPersonId(person.getPersonId());
		personEntity.setName(person.getName());
		personEntity.setAge(person.getAge());
		personEntity.setRole(person.getRole());
		return personEntity;
=======
		// TODO Auto-generated method stub
		return null;
>>>>>>> 22717d5177611efb1713069b1789642c21527833
	}
}

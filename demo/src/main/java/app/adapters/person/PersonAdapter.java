package app.adapters.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
		
	}

	@Override
	public void savePerson(Person person) {

		PersonEntity personEntity = personAdapter(person);
		personRepository.save(personEntity);
		person.setPersonId(personEntity.getPersonId());

	}

	@Override
	public Person findBypersonId(long personId) {

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
		
	}
}
	

package app.adapters.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.adapters.person.entity.PersonEntity;
import app.adapters.user.entity.UserEntity;
import app.adapters.user.repository.UserRepository;
import app.domain.models.Person;
import app.domain.models.User;
import app.ports.PersonPort;
import app.ports.UserPort;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Service
public class UserAdapter implements UserPort {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PersonPort personPort;//dice que no se uso
	
	@Override
	public boolean existUserName(String userName) {
		return userRepository.existsByUserName(userName);
	}

	@Override
	public void saveUser(User user) {
		UserEntity userEntity = userEntityAdapter(user);
		userRepository.save(userEntity);
		user.setUserName(userEntity.getUserName());	
	}
	

	@Override
	public User findByUserName(String userName) {
		UserEntity userEntity = userRepository.findByUserName(userName);
		if (userEntity == null) {
			return null;
		}
		return userAdapter(userEntity);
	}
	
	private User userAdapter(UserEntity userEntity) {
		if (userEntity == null)
			return null;
		User user = new User();
		user.setId(userEntity.getId());
		user.setName(userEntity.getPerson().getName());
		user.setAge(userEntity.getPerson().getAge());
		user.setRole(userEntity.getPerson().getRole());
		user.setUserName(userEntity.getUserName());
		user.setPassword(userEntity.getPassword());
		return user;
	}
	
	private UserEntity userEntityAdapter(User user) {
		PersonEntity personEntity = personAdapter(user);
		UserEntity userEntity = new UserEntity();
		userEntity.setId(user.getPersonId());
		userEntity.setUserName(user.getUserName());
		userEntity.setPassword(user.getPassword());
		return userEntity;
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

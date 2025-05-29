package app.adapters.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.adapters.person.entity.PersonEntity;
import app.adapters.user.entity.UserEntity;
import app.domain.models.User;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	public boolean existsByUserName(String userName);

	UserEntity findByUserName(String userName);

}

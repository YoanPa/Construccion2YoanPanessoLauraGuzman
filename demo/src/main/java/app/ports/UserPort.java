
package app.ports;

import app.domain.models.Person;
import app.domain.models.User;

public abstract class UserPort {
	
	public boolean existUserName(String userName) {
		return false;
	}
    public void saveUser(User user) {
	}
    public User findByPersonId(Person person) {
		return null;
	}
	public User findByUserName(User user) {
		return null;
	}
	
}



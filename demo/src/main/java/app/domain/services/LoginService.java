package app.domain.services;

import org.springframework.beans.factory.annotation.Autowired;

import app.domain.models.User;
import app.ports.UserPort;

public class LoginService {
	@Autowired
	private UserPort userPort;

	public User login(User user) throws Exception {
		User userValidate= userPort.findByUserName(user);
		if(user== null) {
			throw new Exception("Usuario o contraseña invalido");
		}
		return userValidate;
	}
		
}

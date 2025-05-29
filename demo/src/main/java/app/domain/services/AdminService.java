package app.domain.services;

import app.domain.models.User;
import app.ports.PersonPort;
import app.ports.UserPort;

public class AdminService {

	private PersonPort personPort;
	
	private UserPort userPort;
	
	public void registrerSeller(User seller)throws Exception{
		if (personPort.existPerson(seller.getPersonId())) {
			throw new Exception("ya existe una persona con esta cedula");
		}
		if(userPort.existByUserName(seller.getUserName())) {
			throw new Exception("ya existe un usuario con ese nombre");
		}
		if (!"Vendedor".equals(seller.getRole())) {
            throw new Exception("Rol inválido. Solo se permite registrar Vendedores");
        }
		seller.setRole("vendedor");	
		personPort.savePerson(seller);
		userPort.saveUser(seller);
	}
	public void registrerVeterian(User veterinarian)throws Exception{
		if (personPort.existPerson(veterinarian.getPersonId())) {
            throw new Exception("Ya existe una persona con esta cédula");
        }
        if (userPort.existUserName(veterinarian.getUserName())) {
            throw new Exception("Ya existe un usuario con este nombre");
        }
        if (!"Médico Veterinario".equals(veterinarian.getRole())) {
            throw new Exception("Rol inválido. Solo se permite registrar Médicos Veterinarios");
        }
        veterinarian.setRole("vendedor");	
		personPort.savePerson(veterinarian);
		userPort.saveUser(veterinarian);

		//registrar dueño de mascota
	}
}

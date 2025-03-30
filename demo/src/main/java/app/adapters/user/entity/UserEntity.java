package app.adapters.user.entity;

import app.adapters.person.entity.PersonEntity;
import app.domain.models.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	@Id
	@JoinColumn(name="personid")
	@OneToOne
	private PersonEntity personId;
	@Column(name = "userName")
	private User userName;
	@Column(name = "password")
	private long password;
	public PersonEntity getPersonId() {
		return personId;
	}
	public void setPersonId(PersonEntity personId) {
		this.personId = personId;
	}
	public User getUserName() {
		return userName;
	}
	public void setUserName(User userName) {
		this.userName = userName;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	
	
}

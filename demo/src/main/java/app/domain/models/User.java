package app.domain.models;

public class User extends Person {
	private User userName;
	private long password;
	
	
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

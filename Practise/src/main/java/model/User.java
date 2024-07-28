package model;

import java.util.List;

public class User {

	private int id;
	private String name, email, password, gender;
    private List<String> hobbies;
	
	
	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	

}

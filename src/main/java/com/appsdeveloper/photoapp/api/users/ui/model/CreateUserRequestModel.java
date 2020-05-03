package com.appsdeveloper.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {

	@NotNull(message = "First name can not be null")
	private String firstName;
	@NotNull(message = "Last name can not be null")
	private String lastName;
	@NotNull(message = "Email can not be null")
	@Email(message = "Should be vaild email address")
	private String email;

	
	@NotNull(message = "Password can not be null")
	@Size(max = 16, min = 8, message = "Max 16 and minimum 8")
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	
	
}

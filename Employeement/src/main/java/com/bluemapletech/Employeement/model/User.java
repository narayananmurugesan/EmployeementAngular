package com.bluemapletech.Employeement.model;

/*======================In this class is use of user relative detail variable declaration================*/
public class User {

	/*Variable Declaration*/
	private String userName;
	private String password;
	private String temp_password;
	private String email_address;
	private String first_name;
	private String last_name;
	private String dob;
	private String age;
	private String sex;
	private boolean match;
	
	/*========================================Getter and Setter Method========================================*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public boolean isMatch() {
		return match;
	}
	public void setMatch(boolean match) {
		this.match = match;
	}
	/*public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}*/
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTemp_password() {
		return temp_password;
	}
	public void setTemp_password(String temp_password) {
		this.temp_password = temp_password;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}

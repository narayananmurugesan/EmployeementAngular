package com.bluemapletech.Employeement.service;

import java.util.List;

import com.bluemapletech.Employeement.model.User;

/*--------------------------------Using interface the interface are creating methods and same method are implement to Service -------------------------*/
public interface IUserService {

	/*==============username and password string type send to Service===============================*/
	public User userLogin(String userName,String password);
	
	/*======================Register using method and USER class are through to list format.I will send to Service*/
	public List<User> userRegister();

}

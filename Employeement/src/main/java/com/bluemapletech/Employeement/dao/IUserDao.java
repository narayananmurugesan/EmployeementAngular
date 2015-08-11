package com.bluemapletech.Employeement.dao;

import java.util.List;

import com.bluemapletech.Employeement.model.User;

/*--------------------------------Using interface the interface are creating methods and same method are implement to DAO -------------------------*/
public interface IUserDao{
	
	/*==============username and password string type send to dao===============================*/
	public User userLogin(String userName,String password);
	
	/*======================Register using method and class are through to list format.I will send the Dao*/
	public List<User> userRegister();
}

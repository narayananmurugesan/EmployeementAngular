package com.bluemapletech.Employeement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemapletech.Employeement.dao.IUserDao;
import com.bluemapletech.Employeement.model.User;


/*==================Service annotation is business logic using==============*/
/*==================Service annotation===========================*/
@Service
public class UserService implements IUserService {
	
	/*=======================creare a auto wired==========================*/
	@Autowired
	private IUserDao iuserDao; 
	
	/*=====================DAO getter and setter method=============================*/
	public IUserDao getIuserDao() {
		return iuserDao;
	}

	public void setIuserDao(IUserDao iuserDao) {
		this.iuserDao = iuserDao;
	}

	/*======================create Register method  with return of DAO===============================*/
	@Override
	public List<User> userRegister() {
		// TODO Auto-generated method stub
		return iuserDao.userRegister();
	}

	/*===================create Login method  with return type of DAO============================ */
	@Override
	public User userLogin(String userName,String password) {
		// TODO Auto-generated method stub
		return iuserDao.userLogin(userName,password);
	}

}

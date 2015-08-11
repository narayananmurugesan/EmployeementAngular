package com.bluemapletech.Employeement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bluemapletech.Employeement.model.LoginMessage;
import com.bluemapletech.Employeement.model.User;
import com.bluemapletech.Employeement.service.IUserService;

/*++++++++++++++++++++++  can be create a controller  +++++++++++++++++++++++++++++++++++++++++++*/
@RestController
@RequestMapping(value = "/employee")
public class UserController {

	/*-------------------------service calling using autowired----------------*/
	@Autowired
	private IUserService iuserservice;
	
	/*==================service getter and setter method=======================*/
	public IUserService getIuserservice() {
		return iuserservice;
	}

	public void setIuserservice(IUserService iuserservice) {
		this.iuserservice = iuserservice;
	}
	
   /*====================request mapping for login page==========and write login service code=================*/
	
	@RequestMapping(value = "/user/login", method = RequestMethod.POST, produces = "application/json")
	public LoginMessage userLogin(@RequestParam("userName") String userName,
			@RequestParam("password") String password) {
		User user = iuserservice.userLogin(userName, password);
		System.out.println("User result: " + user);
		LoginMessage response = new LoginMessage();
		if (user != null) {
			response.setResult(user);
			response.setInfo("Login successful!");
			return response;
		} else {
			response.setWarning("Invalid UserName or Password!");
		}

		return response;
	}
	 /*====================request mapping for register page==========and write register service code=================*/
	
	@RequestMapping(value = "/user/register", method = RequestMethod.GET, produces = "application/json")
	public LoginMessage userRegister() {

		System.out.println("Get all users service is called!");

		/*======================create a object and calling to service=========================================*/
		
		List<User> users = iuserservice.userRegister();

		/********************************creating of error message and login message object**********************************/
		
		LoginMessage response = new LoginMessage();
		if (users != null) {

			response.setResult(users);
			response.setInfo("Users found!");
			return response;
		}

		response.setInfo("Users not found!");

		return response;
	}

	 /*====================request mapping for Dash Board page===========================*/
	
	@RequestMapping(value = "/user/dashboard", method = RequestMethod.GET, produces = "application/json")
	public ModelAndView userDashBoard() {
		System.out.println("Dash Board");
		return null;
	}

}

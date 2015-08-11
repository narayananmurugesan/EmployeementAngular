package com.bluemapletech.Employeement.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.bluemapletech.Employeement.model.User;

/*Repository is using for program understanding to DAO service 
 * (or) Query can be write and execute the queries*/
@Repository
/*
 * This class is mainly used for data base
 * connectio
 */
public class UserDao implements IUserDao {

	/* ============================JDBC Template are using Autowird and Autowird is called to bean classes=================================*/
	/*=======================JDBC Template is simple format database connection query=============================================================*/
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DataSource dataSoruce;

	/*========================In this method username and password check using database=================*/
	@Override
	public User userLogin(String userName, String password) {
		String sql = "SELECT * FROM user WHERE username=? AND password=?";
		System.out.println("Login Query: " + userName + "," + password);
		try {
			User user = jdbcTemplate.query(sql, new ResultSetExtractor<User>() {

				public User extractData(ResultSet rs) throws SQLException,
						DataAccessException {
					if (rs.next()) {
						User user = new User();
						user.setUserName(rs.getString(1));
						user.setPassword(rs.getString(2));
						return user;
					}
					return null;
				}
			}, new Object[] { userName, password });
			if (user != null) {
				System.out.println(" not null");
				return user;
			}
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
		return null;
	}

	/*In this Method are user details can be store in database */
	@Override
	public List<User> userRegister() {
		
		/*sql query is insert the data from user table*/
		String sql = "INSERT INTO user (username,password,temp_password,email_address,first_name,last_name,dob,age,sex) VALUES(?,?,?,?,?,?,?,?,?)";
		
		/*========================Query are easily execute================*/
		List<User> users = jdbcTemplate.query(sql,
				new ResultSetExtractor<List<User>>() {
					public List<User> extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						/*=================iterate the database table of user=============*/
						/*=======================user table are iterate===================*/
						if (rs.next()) {

							List<User> users = new ArrayList<User>();

							do {
								
								/*############create a object and get the data ##################*/
								User user = new User();
								user.setUserName(rs.getString(1));
								user.setPassword(rs.getString(2));
								user.setTemp_password(rs.getString(3));
								user.setEmail_address(rs.getString(4));
								user.setFirst_name(rs.getString(5));
								user.setLast_name(rs.getString(6));
								user.setDob(rs.getString(7));
								user.setAge(rs.getString(8));
								user.setSex(rs.getString(9));

								users.add(user);
							} while (rs.next());
							return users;

						}

						return null;
					}
				});

		if (users != null) {
			return users;
		}

		return null;
	}

}

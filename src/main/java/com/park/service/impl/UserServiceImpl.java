package com.park.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import com.park.controller.UserController;
import com.park.dao.UserDAO;
import com.park.model.User;
import com.park.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	private static Log logger = LogFactory.getLog(UserController.class);
	
	@Override
	public String insertUser(User userItem) {
		Map<String, Object> ret = new HashMap<String, Object>();
		if(userExistByNumber(userItem.getNumber())){
			ret.put("status", "1003");
			ret.put("message", "user exists");
			logger.info("user exists: userName: " + userItem.getUserName() + "number: " + userItem.getNumber());
		}else{
			if(userDAO.insertUser(userItem) > 0){
				ret.put("status", "1001");
				ret.put("message", "register success");
				logger.info("insert user success: userName: " + userItem.getUserName() + "number: " + userItem.getNumber());
			}else{
				ret.put("status", "1002");
				ret.put("message", "register fail");
				logger.error("insert user error: userName: " + userItem.getUserName() + "number: " + userItem.getNumber());
			}
		}
		
		Gson json = new Gson();
		return json.toJson(ret);	
		
	}

	@Override
	public String getUserPassword(String userName) {
		return userDAO.getUserPassword(userName);
	}

	@Override
	public boolean userExistByUserName(String userName) {
		return userDAO.getUserCountByUserName(userName) > 0;
	}
	
	@Override
	public boolean userExistByNumber(String number) {
		return userDAO.getUserCountByNumber(number) > 0;
	}

	

	@Override
	public List<User> getUsers() {
		
		return userDAO.getUsers();
	}

}

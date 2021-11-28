package com.educandoweb.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.hroauth.entites.User;
import com.educandoweb.hroauth.feignclients.UserFeignClient;



@Service
public class UserService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email).getBody();
		if(user == null) {
			logger.error("email not found " + email);
			throw new IllegalArgumentException("Email nao encontrado");
		}
		logger.info("email found " + email);
		return user;
	}
}

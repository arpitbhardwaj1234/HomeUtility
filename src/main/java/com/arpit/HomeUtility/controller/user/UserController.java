package com.arpit.HomeUtility.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.arpit.HomeUtility.dto.UserDTO;
import com.arpit.HomeUtility.model.user.LoginModel;
import com.arpit.HomeUtility.model.user.UserModel;
import com.arpit.HomeUtility.service.user.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
  
	@PostMapping("/register")
	public ResponseEntity<LoginModel>  registerUser(@RequestBody  UserDTO userDTO)
	{
		LoginModel loginModel =userService.save(userDTO);
		return new ResponseEntity<LoginModel>(loginModel,HttpStatus.CREATED);
	}
	
	
}

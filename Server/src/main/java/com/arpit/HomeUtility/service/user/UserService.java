package com.arpit.HomeUtility.service.user;

import com.arpit.HomeUtility.dto.UserDTO;
import com.arpit.HomeUtility.model.user.LoginModel;
import com.arpit.HomeUtility.model.user.UserModel;

public interface UserService {
	public LoginModel save(UserDTO userDTO);
}

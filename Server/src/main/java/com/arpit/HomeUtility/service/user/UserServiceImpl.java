package com.arpit.HomeUtility.service.user;

import com.arpit.HomeUtility.dto.UserDTO;
import com.arpit.HomeUtility.model.user.LoginModel;
import com.arpit.HomeUtility.model.user.UserModel;
import com.arpit.HomeUtility.repository.user.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
    LoginRepository loginRepository;

  @Override
  public LoginModel save(UserDTO userdto)
  {
	LoginModel loginModel=userdto.login;
	loginModel.setUserDetails(userdto.getUser());
//	return null;
	return loginRepository.save(loginModel);
  }
}

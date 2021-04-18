package com.arpit.HomeUtility.repository.user;

import org.springframework.data.jpa.repository.*;

import com.arpit.HomeUtility.model.user.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel,Long>{

}

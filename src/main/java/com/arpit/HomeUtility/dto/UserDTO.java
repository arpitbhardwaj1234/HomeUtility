package com.arpit.HomeUtility.dto;

import com.arpit.HomeUtility.model.user.LoginModel;
import com.arpit.HomeUtility.model.user.UserModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
 public LoginModel login;
 
 public UserModel user;
}

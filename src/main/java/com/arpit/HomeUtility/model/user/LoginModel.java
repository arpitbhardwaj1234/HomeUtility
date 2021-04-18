package com.arpit.HomeUtility.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Getter
@Setter
@Entity
@Table(name="login")
@AllArgsConstructor
@NoArgsConstructor
public class LoginModel {
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long id;
	
	private String userName;
	
	private String password;
	
	private Boolean isLocked;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ud_id_fk")
	@JsonManagedReference
	private UserModel userDetails;
	
}
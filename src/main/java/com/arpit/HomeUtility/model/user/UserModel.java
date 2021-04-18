package com.arpit.HomeUtility.model.user;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="userMaster")
public class UserModel {
	private static final long serialVersionUID=1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;

	@Column(unique = true)
	private String userName;

	@Column(unique = true)
	private String email;

	private Long age;

	private Date dob;

	private Boolean isEarning;

	private Long salary;

	private Boolean isAdult;

	private String gender;

	private String profilePicture;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "userDetails")
	@JsonBackReference
	private LoginModel loginDetails;
}

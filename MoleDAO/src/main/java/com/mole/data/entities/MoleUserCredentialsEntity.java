package com.mole.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_credentials")
public class MoleUserCredentialsEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_cred_id")
	private int userCredId;
	
	@Column(name="password")
	private String password;
	
	@OneToOne(mappedBy="userCredentials")
	private MoleUserEntity userDetails;
	
	public int getUserCredId() {
		return userCredId;
	}
	public void setUserCredId(int userCredId) {
		this.userCredId = userCredId;
	}
	public MoleUserEntity getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(MoleUserEntity userDetails) {
		this.userDetails = userDetails;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

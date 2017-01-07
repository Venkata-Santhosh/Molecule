package com.mole.data.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_details")
public class MoleUserEntity {

	@Column(name="user_id")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	private String userName;
	private String userEmailId;
	
	@OneToOne(cascade={CascadeType.PERSIST})
	@JoinColumn(name="fk_user_cred_id",unique = true) 
	private MoleUserCredentialsEntity userCredentials;


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserEmailId() {
		return userEmailId;
	}


	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}


	public MoleUserCredentialsEntity getUserCredentials() {
		return userCredentials;
	}


	public void setUserCredentials(MoleUserCredentialsEntity userCredentials) {
		this.userCredentials = userCredentials;
	}
	
}

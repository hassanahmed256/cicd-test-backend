package com.hassan.cicd.models;

import javax.persistence.*;

@Entity
@Table(name = "CONFIG_USERS")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private Integer id;

	@Column(name = "NAME", length = 500)
	private String title;

	@Column(name = "EMPID", length = 100, unique = true)
	private String empId;

	@Column(name = "PASSWORD")
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

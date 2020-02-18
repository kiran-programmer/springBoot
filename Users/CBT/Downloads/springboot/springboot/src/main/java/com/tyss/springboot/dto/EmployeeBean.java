package com.tyss.springboot.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Employee")
@Valid
public class EmployeeBean {

	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	
	@NotBlank(message = "employee name should be mandatory")
	@Size( min=3, max = 15)
	private String name;
	@Column
	@Pattern(regexp = "^[a-zA-Z0-9]{6}", message = "shoud be small and big letter and numbers")
	private String password;
	@Column
	
	private String gender;
	@Column

	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date doj;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
}

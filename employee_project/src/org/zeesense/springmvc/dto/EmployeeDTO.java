package org.zeesense.springmvc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="employee_table")
public class EmployeeDTO implements Serializable {
	@Id
	@GenericGenerator(name = "employee", strategy = "assigned")
	@GeneratedValue(generator="employee")
	@Column(name="e_id")
	private int id;
	@Column(name="e_name")
	private String name;
	@Column(name="e_location")
	private String location;
	@Column(name="e_email")
	private String email;
	@Column(name="e_phone_number")
	private long phoneNumber;
	@Column(name="e_dob")
	private String dob;
	
	
	public EmployeeDTO()
	{
		System.out.println(this.getClass().getSimpleName());
	}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}

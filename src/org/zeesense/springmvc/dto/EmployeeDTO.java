package org.zeesense.springmvc.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee_table")
public class EmployeeDTO implements Serializable {
	@Id
	@GenericGenerator(name = "employee", strategy = "assigned")
	@GeneratedValue(generator="employee")
	@Column(name="employee_id")
	int id;
	@Column(name="employee_name")
	String name;
	@Column(name="employee_password")
	String password;
	@Column(name="employee_email")
	String email;
	@Column(name="employee_location")
	String location;
	@Column(name="employee_phone_number")
	long phoneNumber;
	@Column(name="employee_dob")
	String dob;
	@Column(name="employee_alternate_phone_number")
	long alternatePhone;
	@Column(name="employee_alternate_email")
	String alternateEmail;
	@Column(name="employee_gender")
	String gender;
	@Column(name="employee_age")
	int age;

	public EmployeeDTO() {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	public long getAlternatePhone() {
		return alternatePhone;
	}

	public void setAlternatePhone(long alternatePhone) {
		this.alternatePhone = alternatePhone;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", location=" + location + ", phoneNumber=" + phoneNumber + ", dob=" + dob + ", alternatePhone="
				+ alternatePhone + ", alternateEmail=" + alternateEmail + ", gender=" + gender + ", age=" + age + "]";
	}






}

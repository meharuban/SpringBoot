package com.example.demo.model;

import java.util.Objects;

public class Student {

	private String email;
	private int age;
	private int contactNo;
	public Student(String email, int age, int contactNo) {
		super();
		this.email = email;
		this.age = age;
		this.contactNo = contactNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, contactNo, email);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && contactNo == other.contactNo && Objects.equals(email, other.email);
	}
	@Override
	public String toString() {
		return "Student [email=" + email + ", age=" + age + ", contactNo=" + contactNo + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
}

package com.example.demo.model;

import java.util.Objects;

public class Person {

	private String email;
	private int age;
	private int contactNo;
	
	@Override
	public String toString() {
		return "Person [email=" + email + ", age=" + age + ", contactNo=" + contactNo + "]";
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
		Person other = (Person) obj;
		return age == other.age && contactNo == other.contactNo && Objects.equals(email, other.email);
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

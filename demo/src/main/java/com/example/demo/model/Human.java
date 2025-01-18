package com.example.demo.model;

import java.util.Objects;

public class Human {
	
private String email;
private int age;
private int telephoneNo;

public Human(String email, int age, int telephoneNo) {
	super();
	this.email = email;
	this.age = age;
	this.telephoneNo = telephoneNo;
}


@Override
public String toString() {
	return "Human [email=" + email + ", age=" + age + ", telephoneNo=" + telephoneNo + "]";
}


@Override
public int hashCode() {
	return Objects.hash(age, email, telephoneNo);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Human other = (Human) obj;
	return age == other.age && Objects.equals(email, other.email) && telephoneNo == other.telephoneNo;
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
public int getTelephoneNo() {
	return telephoneNo;
}
public void setTelephoneNo(int telephoneNo) {
	this.telephoneNo = telephoneNo;
}

}

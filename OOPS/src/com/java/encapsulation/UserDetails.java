package com.java.encapsulation;

public class UserDetails {

	public static void main(String[] args) {
		User user= new User();
		user.setName("shivanii");
		user.setAge(20);
		user.setSalary(500000);
		System.err.print(user);
	}
}

package com.java.contructorExample;

public class Class2 extends Class1 {
	double salary;

	Class2(String name, int age,double salary) {
		super(name, age);
		this.salary=salary;
	}

	public void print() {
		System.out.println(name+" "+ age+" "+ salary);
	}
}

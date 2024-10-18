package com.java.abstractionExample;

abstract public class AbstractClass1 {

	int a,b;
	abstract public int method(int a,int b);
	
	AbstractClass1(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}
}

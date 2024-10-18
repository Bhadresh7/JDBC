package com.java.abstractionExample;


class override extends AbstractClass1 {

	override(int a, int b) {
		super(a, b);
	}

	public int method(int a, int b) {
		return a+b;
	}
}

public class AbstractionExample {

	public static void main(String[] args) {

		override ov=new override(1,3);
		int c=ov.method(2, 3);
		System.out.println(c);	
	}
}





package com.java.oop;


class overrider extends Class2{

	public void calculate() {
		System.out.println("Calculating......");

	}
}




public class Class1  {

	public static void main(String[] args) {

		overrider obj=new overrider();
		obj.calculate();
		Class3 cs3=new Class3("hello");
	}


}

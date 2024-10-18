package com.java.polymorphism;

public class mainClass {

	public static void main(String[] args) {

		MechanicalKeyboard mk=new MechanicalKeyboard();
		MembraneKeyboard mbk= new MembraneKeyboard();
		mk.sound();
		mbk.sound();
		
	}
}

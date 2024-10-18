package com.java.ClassandObjectExample;

public class javaBackend {
	public static void main(String[] args) {

		Entity entity = new Entity();
		entity.setName("shivanii");
		entity.setAge(20);
		entity.setAddress("chennai");
		
		System.out.println(entity.getName());
		System.out.println(entity.getAge());
		System.out.println(entity.getAddress());

	}
}

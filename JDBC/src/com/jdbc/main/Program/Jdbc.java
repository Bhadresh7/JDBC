package com.jdbc.main.Program;


import java.util.Scanner;

import com.jdbc.main.Entity.user;
import com.jdbc.main.crudOperations.*;

public class Jdbc {

	
	public static void main(String[] args) {
		crudOperations crd=new crudOperations();

		user user =new user();
		int num;

		do {

			System.out.println("\n\n1.CREATE NEW USER \n\n"
					+ "2.UPDATE THE USER\n\n"
					+ "3.READ TEH USER\n\n"
					+ "4.DELETE THE USER\n\n"
					+"5.EXIT"
					);


			Scanner nu=new Scanner(System.in);
			num=nu.nextInt();


			switch(num) {

			//creating a new user
			case 1:
				System.out.println("Enter the id:");
				Scanner sc=new Scanner(System.in);
				user.setId(sc.nextLong());
				System.out.println("Enter the name:");
				user.setName(sc.next());
				System.out.println("Enter the city:");
				user.setCity(sc.next());
				System.out.println("Enter the address");
				user.setAddress(sc.next());
				crd.createUser(user);
				System.out.println("Created Successfully\n\n");
				break;

				//updating the created user 
			case 2:
				Scanner scan=new Scanner(System.in);
				System.out.println("id");
				user.setId(scan.nextLong());
				System.out.println("Enter the new username:");
				user.setName(scan.next());
				System.out.println("Enter the new city:");
				user.setCity(scan.next());
				System.out.println("Enter the new address:");
				user.setAddress(scan.next());
				crd.updateUser(user);
				break;


				//reading the user 

			case 3:
				System.out.println("Enter the user id:");
				Scanner s=new Scanner(System.in);
				int readId= s.nextInt();
				crd.readUser(readId);
				break;

				//deleting the user
			case 4:
				System.out.println("Enter the user id:");
				Scanner sn=new Scanner(System.in);
				String deleteId= sn.next();
				crd.deleteUser(deleteId);
				System.out.println("Deleted successfully");
				break;

				//exiting the connection 
			case 5:
				
				System.out.println("CONNECTION TERMINATED !!");
				break;


			default:
				System.out.println("ENTER A VALID NUMBER !!!");
				break;
			}

		}while(num!=5);

	}

}


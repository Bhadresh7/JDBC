package com.jdbc.main.crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.main.Entity.user;
import com.jdbc.main.Repository.Repository;


public class crudOperations implements Repository{

	public String url="jdbc:mysql://localhost:3306/jdbc";
	public String username="root";
	public String password="bhadreshpalani";

	//creating a new user 

	@Override
	public void createUser(user user) {
		try {
			String query="INSERT INTO USER (id,name,city,address)VALUES(?,?,?,?)";
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);

			ps.setLong(1,user.getId());
			ps.setString(2,user.getName());
			ps.setString(3,user.getCity());
			ps.setString(4,user.getAddress());

			System.out.println(user);
			ps.executeUpdate();
			ps.close();
			con.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	//updating a the user 

	@Override
	public void updateUser(user user) {
		try {
			String query = "UPDATE user SET name = ?, city = ?, address = ? WHERE id = ?";
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getCity());
			ps.setString(3, user.getAddress());
			ps.setLong(4, user.getId());

			ps.executeUpdate();  
			System.out.println("User updated: " + user);
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	//reading the user from the database

	@Override
	public user readUser(int readId) {
		try {
			String query="SELECT * FROM USER WHERE id = ?";
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,readId);

			ResultSet rs= ps.executeQuery();
			rs.next();
			user user=new user();
			user.setId(rs.getLong("id"));
			user.setName(rs.getString("name"));
			user.setCity(rs.getString("city"));
			user.setAddress(rs.getString("address"));
			System.out.println(user);


		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;

	}


	@Override
	public void deleteUser(String deleteId) {
		String query="DELETE  FROM user WHERE id=?";
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, deleteId);
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}

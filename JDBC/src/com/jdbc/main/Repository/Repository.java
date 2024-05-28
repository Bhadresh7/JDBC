package com.jdbc.main.Repository;
import com.jdbc.main.Entity.*;

public interface Repository {
	public void createUser(user user);
	public void updateUser(user user);
	public user readUser(int id);
	public void deleteUser(String id);
	
	
	
	
}

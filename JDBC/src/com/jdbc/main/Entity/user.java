package com.jdbc.main.Entity;

public class user {

	private Long id;
	private String name;
	private String city;
	private String address;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "id=" + id + "\nname=" + name + "\ncity=" + city + "\naddress=" + address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}

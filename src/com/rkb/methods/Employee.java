package com.rkb.methods;

import java.util.ArrayList;
import java.util.List;

import com.rkb.exercise.Person;

public class Employee {
	
	private int id;
	private String name;
	private List<Person> friends = new ArrayList<>();
	public Employee(int id, String name, List<Person> friends) {
		super();
		this.id = id;
		this.name = name;
		this.friends = friends;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getFriends() {
		return friends;
	}
	public void setFriends(List<Person> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", friends=" + friends + "]";
	}
	
	

}

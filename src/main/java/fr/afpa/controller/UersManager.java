package fr.afpa.controller;

import java.util.List;

import fr.afpa.model.User;

public class UersManager {
	
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	} 
	
	public List<User> addUser(User user){
		
		users.add(user);
		
		return users;
		
	}
	
	
	
	
	

}

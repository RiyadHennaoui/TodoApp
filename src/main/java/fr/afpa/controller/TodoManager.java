package fr.afpa.controller;

import java.util.List;

import fr.afpa.model.Todo;
import fr.afpa.model.User;

public class TodoManager {
	
	private List<Todo> userTodos;

	public List<Todo> getTodos() {
		return userTodos;
	}

	public void setTodos(List<Todo> todos) {
		this.userTodos = todos;
	} 
	
	
	
	public List<Todo> addUserTodo(User user, Todo todo) {
		
		todo.setUserId(user.getUserId());
		userTodos.add(todo); 
		
		return userTodos; 
		
	}

}

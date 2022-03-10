package fr.afpa.model;


import java.util.Date;

public class Todo {

	
	 private String Title;
	    private String Description;
	    private Date creationTodo;
	    private String status;
	    private int userId;

	    public Todo(String title, String description, Date creationTodo, String status, int userId) {
	        Title = title;
	        Description = description;
	        this.creationTodo = creationTodo;
	        this.status = status;
	        this.userId = userId;
	    }

	    public String getTitle() {
	        return Title;
	    }

	    public void setTitle(String title) {
	        Title = title;
	    }

	    public String getDescription() {
	        return Description;
	    }

	    public void setDescription(String description) {
	        Description = description;
	    }

	    public Date getCreationTodo() {
	        return creationTodo;
	    }

	    public void setCreationTodo(Date creationTodo) {
	        this.creationTodo = creationTodo;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}
	    
	    
	
}

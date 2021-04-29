package inheritanceHomework;

public class User {

	private int id;
	private String firstName;
	private String lastName;
	private String identity;
	
	public User() {
		
		
	}
	
	
	public User(int id, String firstName, String lastName, String identity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identity = identity;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getIdentity() {
		return identity;
	}


	public void setIdentity(String identity) {
		this.identity = identity;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}

	
}

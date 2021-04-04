package les21.demo.domain;

public class User {
	private Integer id;
	private String email;
	private String firstName;
	private String lastName;
	private UserRole role;
	private String password;
	
	public User(Integer id, String email, String firstName, String lastName, UserRole role, String password) {
		
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.password = password;
	}

	public User(String email, String firstName, String lastName, UserRole role, String password) {
		
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.password = password;
	}

	public User() {
		super();
	}
	
	
	
	
}

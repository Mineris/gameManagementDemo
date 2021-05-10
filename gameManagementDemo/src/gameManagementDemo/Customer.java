package gameManagementDemo;

public class Customer {
	private int Id;
	private String FirstName;
	private String LastName;
	private String NationalId;
	private String YearOfBirth;
	
	public Customer(int id, String firstName, String lastName, String nationalId, String yearOfBirth) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalId = nationalId;
		YearOfBirth = yearOfBirth;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalId() {
		return NationalId;
	}

	public void setNationalId(String nationalId) {
		NationalId = nationalId;
	}

	public String getYearOfBirth() {
		return YearOfBirth;
	}

	public void setYearOfBirth(String yearOfBirth) {
		YearOfBirth = yearOfBirth;
	}
	
	
}

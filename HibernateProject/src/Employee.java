
public class Employee {

	int EmployeeID;
	String LastName;
	String FirstName;
	String City;
	String HomePhone;
	
	public Employee(){};
	
	public Employee(String lastName, String firstName, String city) {
		super();
		LastName = lastName;
		FirstName = firstName;
		City = city;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}

	
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getHomePhone() {
		return HomePhone;
	}
	public void setHomePhone(String homePhone) {
		HomePhone = homePhone;
	}

}

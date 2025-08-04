package javacore;

public class lab1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Person
{
	private String firstName;
	private String lastName;
	private String gender;
	
	

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

	public String getGender() {
		return gender;
	}

	public void setGender(String g) {
		this.gender= g;
	}

	
	
	public Person() {
		// TODO Auto-generated constructor stub
		
		
	}
	public Person(String firstname,String lastname, String g) {
		setFirstName(firstname);
		setLastName(lastname);
		setGender(g);
	}
	
}

package javacore;

import java.security.PrivateKey;

public class lab1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Person
{
	private String firstName;
	private String lastName;
	private Gender gender;
	private String mobile;
	
	public  enum Gender{M,F};
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender g) {
		this.gender= g;
	}

	
	
	public Person() {
		// TODO Auto-generated constructor stub
		
		
	}
	public Person(String firstname,String lastname, Gender g, String mobile) {
		setFirstName(firstname);
		setLastName(lastname);
		setGender(g);
		setMobile(mobile);
	}
	
}

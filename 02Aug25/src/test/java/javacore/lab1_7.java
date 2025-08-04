package javacore;

import java.security.PrivateKey;

public class lab1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Person1_7
{
	private String firstName;
	private String lastName;
	private String gender;
	private String mobile;
	
	
	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String g) {
		this.gender= g;
	}

	
	
	public Person1_7() {
		// TODO Auto-generated constructor stub
		
		
	}
	public Person1_7(String firstname,String lastname, String g, String mobile) {
		setFirstName(firstname);
		setLastName(lastname);
		setGender(g);
		setMobile(mobile);
	}
	
}

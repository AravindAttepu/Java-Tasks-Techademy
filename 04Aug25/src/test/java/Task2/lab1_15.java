package Task2;

import java.security.PrivateKey;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class lab1_15 {

}

class Person
{

	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	
	public String getFullName() {
		return firstName+" "+lastName;
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
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int calculateage(String dat)
	{
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ldate= LocalDate.parse(dat, df);
		LocalDate cdate=LocalDate .now();
		Period p= Period.between(ldate, cdate);
		int age=p.getYears();
		return age;
		
	}
Person(String firstName,String lastName, String gender, String age)
{
setFirstName(firstName);	
setLastName(lastName);
setGender(gender);
setAge(calculateage(age));
}
	
	
}

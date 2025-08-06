

public class lab3_1 {

	public static void main(String[] args) throws NameException {
		// TODO Auto-generated method stub
		try {
			Person person= new Person("", "", "M");
			System.out.println(person);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		
	}

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
	public Person(String firstname,String lastname, String g) throws NameException{
	
			if(firstname=="" || lastname == "")
			{
				throw new NameException("Name blanks are empty");
			}
			
		setFirstName(firstname);
		setLastName(lastname);
		setGender(g);
		
	}
	
}

class NameException extends Exception
{

	NameException(String msg)
	{
		super(msg);
	}
}

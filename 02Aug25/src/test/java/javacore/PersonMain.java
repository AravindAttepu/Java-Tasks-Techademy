package javacore;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person person= new Person("Aravind", "Attepu" ,"M");
		//Person1_7 person= new Person1_7("Aravind", "Attepu" ,"M", "1234567890");
		Person1_8 person= new Person1_8("Aravind", "Attepu" ,Person1_8.Gender.M,"123456789");
		System.out.println("Person Details:");
		System.out.println("___________________\n");
		System.out.println("First Name: "+person.getFirstName());
		System.out.println("Last Name: "+person.getLastName());
		System.out.println("Gender: "+person.getGender());
		System.out.println("Mobile: "+person.getMobile());
//		System.out.println("Age: 23");
//		System.out.println("Weight: 85.55");
//		
		
		

	}

}

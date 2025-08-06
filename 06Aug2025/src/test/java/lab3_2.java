import javax.lang.model.type.NullType;

public class lab3_2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Person1 p1 = null;
		Person1 p2= null;
		Account a1=null;
		Account a2=null;
		try {
		p1= new Person1("Smith",23);
		p2= new Person1("kathy", 14);
		
		
		//Person p3= new Person("Sagar", 24);
		a1= new Account(1001, 2000, p1);
		a2 = new Account(1002,3000,p2);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		a1.setBalance(2000);
		a2.withdraw(2000);
		
		System.out.println(a1.getAccNum()+" Account has Balance : "+a1.getBalance());
		System.out.println(a2.getAccNum()+" Account has Balance : "+a2.getBalance());
		System.out.println("________________________");
		System.out.println(a1);
		System.out.println(a2);
		

	}

}

class Person1
{
	private String name;
	private int age;
	
	public Person1(String name, int age) throws AgeValidationException {
		// TODO Auto-generated constructor stub
		if(age<=15)
		{
			throw new AgeValidationException("Age of a person should be above 15");
		}
		this.name=name;
		this.age=age;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	
}

class Account
{
private long accNum;
private double balance=500;
private Person1 accHolder;

public Account()
{}

public Account(long accNum,double balance,Person1 person) {
	// TODO Auto-generated constructor stub
	if(person == null ) {
		throw new NullPointerException();
		
	}
	this.accNum=accNum;
	this.balance= balance;
	this.accHolder=person;
}

@Override
public String toString() {
    return "Account Number: " + accNum +
           "\nBalance: " + balance +
           "\nAccount Holder: " + accHolder.getName();
}
public long getAccNum() {
	return accNum;
}

public void setAccNum(long accNum) {
	this.accNum = accNum;
}

public Person1 getAccHolder() {
	return accHolder;
}

public void setAccHolder(Person1 accHolder) {
	this.accHolder = accHolder;
}

public void setBalance(double balance) {
	this.balance = balance;
}


public void deposit(double amount)
{
balance+=amount;	
}

public boolean withdraw(double amount)
{
if(amount< (balance-500))	
{
	balance-=amount;
	return true;
	}
return false;
}

public double getBalance()
{
	return balance;
	}
}


class AgeValidationException extends Exception{
	public AgeValidationException(String msg) {
	super(msg);
	}
	
}
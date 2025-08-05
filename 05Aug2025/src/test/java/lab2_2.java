
public class lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount sa= new SavingsAccount(1001, 1000, new Person("Jack", 23));
		CurrentAccount ca= new CurrentAccount(1002, 1000, new Person("Captain", 30));
		System.out.println(sa.withdraw(1000));
		System.out.println(ca.withdraw(1500));
		
		System.out.println("_____________________");
		
		System.out.println(sa);
		System.out.println(ca);

		
	}

}

class SavingsAccount extends Account
{
	public static final double MINIMUM=500;
	private long accNum;
	private double balance=500;
	private Person accHolder;


	public SavingsAccount(long accNum,double balance,Person person) {
		// TODO Auto-generated constructor stub
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

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public boolean withdraw(double amount)
	{
	if(amount< (balance-MINIMUM))	
	{
		balance-=amount;
		return true;
		}
	return false;
	}
	}


class CurrentAccount extends Account
{
	public static final double OVERDRAFT=500;
	private long accNum;
	private double balance=500;
	private Person accHolder;


	public CurrentAccount(long accNum,double balance,Person person) {
		// TODO Auto-generated constructor stub
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

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public boolean withdraw(double amount)
	{
	if(amount<= (balance+OVERDRAFT))	
	{
		balance-=amount;
		return true;
		}
	return false;
	}
	
}
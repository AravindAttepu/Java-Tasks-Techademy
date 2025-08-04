package Task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lab1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		try {
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Enter Start date in (dd-mm-yyyy)");
		String inp1Date = sc.nextLine();
		LocalDate input1date= LocalDate.parse(inp1Date,dateTimeFormatter);
		
		System.out.println("Enter End date in (dd-mm-yyyy)");
		String inp2Date = sc.nextLine();
		LocalDate input2date= LocalDate.parse(inp2Date,dateTimeFormatter);
		
		Period period = Period.between(input1date, input2date);
		System.out.println("Days : "+period.getDays());
		System.out.println("Months : "+period.getMonths());
		System.out.println("years : "+period.getYears());
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			sc.close();
		}
		
	}

}

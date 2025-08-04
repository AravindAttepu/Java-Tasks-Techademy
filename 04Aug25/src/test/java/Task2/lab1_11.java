package Task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lab1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		try {
		
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Enter date in (dd-mm-yyyy)");
		String inpDate = sc.nextLine();
		LocalDate inputdate= LocalDate.parse(inpDate,dateTimeFormatter);
		LocalDate currDate= LocalDate.now();
		Period period = Period.between(inputdate, currDate);
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

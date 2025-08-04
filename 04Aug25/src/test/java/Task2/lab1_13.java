package Task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lab1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner= new Scanner(System.in);
System.out.println("Enter Product Purchase Date");
		String prodPurchase=scanner.nextLine();
		System.out.println("Enter Warranty Period");
		System.out.println("In Months");
		int months= scanner.nextInt();
		System.out.println("In years");
		int years= scanner.nextInt();
		
		
		
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate pDate= LocalDate.parse(prodPurchase,df);

		LocalDate WExpiresdate= pDate.plusMonths(months).plusYears(years);
		System.out.println("Warranty Expires on "+WExpiresdate);
	}

}

package Task2;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class lab1_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	DateTimeFormatter df= DateTimeFormatter.ofPattern("HH-mm a");
	String[] zoneArea= {"America/New_York","Asia/Kolkata","Europe/London","Asia/Tokyo","US/Pacific","Africa/Cairo"};
	for(int i=0;i<zoneArea.length;i++)
	{
		ZoneId zoneId= ZoneId.of(zoneArea[i]);
		LocalTime time= LocalTime.now(zoneId);
		System.out.println("Zone :"+zoneArea[i]+" Time :"+time.format(df));
	}
	}
}

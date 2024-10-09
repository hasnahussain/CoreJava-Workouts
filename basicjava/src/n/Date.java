package n;
import java.time.*;
import java.time.temporal.ChronoUnit; 
import java.time.LocalDate;
import java.time.LocalTime;

public class Date
{
public static void main(String[] args) 
{
	LocalDate date= LocalDate.now();
	LocalDate yesterday=date.minusDays(1);
	LocalDate tomorrow=yesterday.plusDays(2);
	System.out.println("Today's date  "+date);
	System.out.println("Yesterday date  "+yesterday);
	System.out.println("Tomorrow date  "+tomorrow);
	//true/false
	LocalDate date1=LocalDate.of(2024, 5, 27);
	System.out.println(date1.isLeapYear());
	LocalDate date2=LocalDate.of(2017, 9, 3);
	System.out.println(date2.isLeapYear());
	
	//Time
	
	LocalTime time=LocalTime.now();
	System.out.println(time);
	LocalTime time1=LocalTime.of(10,13,21);
	System.out.println(time1);//minusHours() and minusMinutes()
	LocalTime time2=time1.minusHours(2);
	LocalTime time3=time2.minusMinutes(34);
	System.out.println(time3);
	
	//country time
	
	ZoneId zone1=ZoneId.of("Asia/Kolkata");
	ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
    LocalTime time4 = LocalTime.now(zone1);  
    System.out.println("India Time Zone: "+time4);  
    LocalTime time5 = LocalTime.now(zone2);  
    System.out.println("Japan Time Zone: "+time5);  
    long hours = ChronoUnit.HOURS.between(time4, time2);  
    System.out.println("Hours between two Time Zone: "+hours);  
    long minutes = ChronoUnit.MINUTES.between(time4, time5);  
    System.out.println("Minutes between two time zone: "+minutes);  

// month
    
  MonthDay month=MonthDay.now();
  LocalDate date3=month.atYear(2002);
  System.out.println(date3);
  boolean b=month.isValidYear(2012);
  System.out.println(b);
}

}

package Week2_05_basemodule.date;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime 
	    = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
	 
	String localDateTimeFormat1 
	    = localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
	 
	String localDateTimeFormat2 
	    = localDateTime.format(
	            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS")
	        );
	 
	System.out.println("localDateTime = " + localDateTime);
	System.out.println("localDateTimeFormat1 = " + localDateTimeFormat1);
	System.out.println("localDateTimeFormat2 = " + localDateTimeFormat2);

	}

}

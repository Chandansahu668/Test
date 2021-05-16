package Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class test {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
		//TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		ZoneId zoneid1 = ZoneId.of("America/New_York");  
		   LocalDateTime now = LocalDateTime.now(zoneid1);  
		   //System.out.println(dtf.format(now));
		   //now.atZone(ZoneId.of("America/Chicago"));
		   System.out.println(dtf.format(now));  

	}

}

package maven.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
		
		String date = "20190711";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMdd");
		
		try {
			Date afterSdf = new SimpleDateFormat("yyyyMMdd").parse(date);
			System.out.println(dateFormat.format(afterSdf));
			System.out.println(dateFormat.parse(dateFormat.format(afterSdf)));
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(dateFormat.parse(dateFormat.format(afterSdf)));
			cal.add(Calendar.DATE, 1);
			
			System.out.println(dateFormat.format(cal.getTime()));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

package maven.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateTest {

	public static void main(String[] args) throws DatatypeConfigurationException {
		SimpleDateFormat TimeSdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		String timeStamp = TimeSdf.format(new Date());
		System.out.println(timeStamp+"+09:00");
		
		GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        XMLGregorianCalendar xCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        System.out.println(xCal);
		
//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSSSSSSSS");
//		System.out.println(format.format(new Date()));
	}

}

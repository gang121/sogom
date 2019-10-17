package maven.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		SimpleDateFormat reqFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSSSSSSS");
		System.out.println(reqFormat.format(new Date()));
	}
}

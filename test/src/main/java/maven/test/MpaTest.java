package maven.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MpaTest {

	public static void main(String[] args) {
		//Map<String, Object> map = new HashMap();
		Map<String, Object> map = new LinkedHashMap<String, Object>();

		map.put("test1", 1);
		map.put("test2", 2);
		
		System.out.println(map);
	}

}

package maven.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Map<String, Object>> agecategorieList = new ArrayList<Map<String, Object>>();
		
		
		
		String[] ageArray = {"ADULT", "CHILD"};
		for(int i = 0; i <ageArray.length; i++) {
			Map<String, Object> map = new HashMap();
			map.put(ageArray[i], 1);
			agecategorieList.add(map);
		}
		Collections.reverse(agecategorieList);
		
		for(Map<String, Object> map : agecategorieList) {
			System.out.println(map);
		}
	}

}

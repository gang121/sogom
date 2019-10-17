package maven.test;

public class Split {

	public static void main(String[] args) {
		String code = "001_002";
		
		String[] codearray = code.split("_");
		
		for(String str : codearray) {
			System.out.println(str);
		}
		
	}

}

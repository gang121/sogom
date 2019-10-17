package maven.test;

public class TestVO {
	
	private String name;
	
	private TestVO.TestVO2 vo2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public TestVO.TestVO2 getVo2() {
		if(vo2 == null) {
			vo2 = new TestVO2();
		}
		return vo2;
	}

	public void setVo2(TestVO.TestVO2 vo2) {
		this.vo2 = vo2;
	}

	public static class TestVO2 {
		
		String name2 = "1";

		public String getName2() {
			return name2;
		}

		public void setName2(String name2) {
			this.name2 = name2;
		}
		
	}
	
}

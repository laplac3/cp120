package presintation;

public class InnerClass1 {

	private int outerField;

	public InnerClass1(int val) {
		outerField = val;
	}
	
	public class NestedClass {
		
		public void saySomething() {
			System.out.println("Something" + outerField);
		}
	}
	
}

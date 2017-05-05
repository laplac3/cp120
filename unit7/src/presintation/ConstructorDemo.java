package presintation;

public class ConstructorDemo {
	private long creationTime;
	
	public ConstructorDemo(){
		creationTime = System.currentTimeMillis();
	}
	
	public long getRunTime() {
		long runTime = System.currentTimeMillis() - creationTime;
		return runTime;
	}
	
}

package presintation;

public class A {
	private int field;
	private boolean alwaysCheck;
	
	public void setAlwaysCheck(boolean alwayscheck){
		this.alwaysCheck =alwaysCheck;
	}
	
	public boolean getAlwaysCheck(){
		return this.alwaysCheck;
	}
	
	public A( int param ) {
		field = param;
	}

	public A( String param ) {
		field = Integer.parseInt( param );
	}
	
	public String toString() {
		String str = "" + this.field;
		return str;
	}
	
	public void exA() {
		if ( getAlwaysCheck() ) {
			System.out.println(toString());
		} else {}
	}
}

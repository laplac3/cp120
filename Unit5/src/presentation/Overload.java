package presentation;

public class Overload {


	public static void main(String[] args) {
		double[] a = {1.0,2.0,3.0};
		largest(a);

		
	}
	
	public static int largest( int num1, int num2, int num3 ) {
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public static int largest( int[] array ) {
		int sum =0;
		for ( int a : array )
			sum+=a;
		return sum;
	}
	
	public static double largest( double num1, double num2, double num3 ) {
		double sum = num1 + num2 + num3;
		return sum;
	}
	
	public static double largest( double[] array ) {
		double sum =0;
		for ( double a : array )
			sum+=a;
		return sum;
	}
}
	

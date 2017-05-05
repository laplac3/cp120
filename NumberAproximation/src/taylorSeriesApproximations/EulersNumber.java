package taylorSeriesApproximations;

public class EulersNumber {

	/**
	 * @param args
	 */   
	public static void main(String[] args) {
		 double epsilon = .0001;
		 int i = 0;
		 double sumI = 0;
		 double sumF =0;
		 double term = 0;
		 
		 do {
			sumI = sumF;
			term = 1/fact(i);
			sumF += term;
			i++;
			
		 } while (Math.abs(sumF - sumI)>= epsilon );
		
		System.out.println(sumF);

	}
	
	public static double fact( int n ) {
		double fact = 1;
		for (int i=1; i<= n; i++ )
			fact*=i;
		return fact;
	}

}

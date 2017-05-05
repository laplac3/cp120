package cp120.assignments.assignment004;

import java.math.BigInteger;

public class BigInt {


	public static BigInteger factorial( int num ) {
		
		BigInteger fact = BigInteger.valueOf(1);
		
		for (int k=1; k<=num; k++) {
			fact = fact.multiply(BigInteger.valueOf(k));
		}
		return fact;
	}

}

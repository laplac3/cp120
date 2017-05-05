package misc;
import java.util.*;

public class PrimeNumberChecker {
		
	public boolean validate( int num ) {
		
		boolean result;
		List<Integer> ints = new ArrayList<Integer>(); 
		ints.add(2);
		
		for ( int x = 3; x<= num; x++)
			checkNum( ints, x );
		
		if (num == ints.get(ints.size()-1))
			result = true;
		else
			result = false;
		return result;
	}
	
	private static List<Integer> checkNum(List<Integer> ints, int x) {
		int i=0;
		while (i <= ints.size()-1){
			if ( x % ints.get(i) == 0 )
				break;
			else if ( x % ints.get(i) != 0 && i== ints.size()-1)
				ints.add(x);
			else
				i++;
		}
		return ints;
	}
	
}


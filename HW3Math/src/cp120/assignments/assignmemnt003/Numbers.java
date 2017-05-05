package cp120.assignments.assignmemnt003;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numbers {


	public static void main(String[] args) {
      
		int[]   pArr    = { 0, 1, 2, 3, 4, 5, 7, 9, 11, 13, 14, 15, 17, 19 };
        for ( int num : pArr ) {
            boolean result = isPrime( num );
            System.out.printf( "isPrime( %3d ): %b\n", num, result );
        }
	
		 int[][] arr =
		        {
		            { 0, 0 }, { 0, 1 }, { 1, 1 }, { 1, 2 }, { 2, 2 }, { 2, 3 },
		            { 3, 3 }, { 2, 4 }, { 2, 6 }, { 2, 8 }, { 3, 5 }, { 3, 7 }, 
		            { 5, 7 }, { 5, 13 },
		            { 210, 16 }, { 125, 55 }, { 70, 34 }, { 21, 18 }
		            //  1680         1375        1190        126
		        };
		        
		        for ( int[] pair : arr ) {
		            
		        	int result  = Numbers.lcm( pair[0], pair[1] );
		        	System.out.printf( "lcm( %3d, %3d ): %4d\n", pair[0], pair[1], result );
	
		        }
		       
		
		 for ( int[] pair : arr ) {
	            
	        	int result  = Numbers.gcf( pair[0], pair[1] );
	        	System.out.printf( "gcf( %3d, %3d ): %4d\n", pair[0], pair[1], result );
		 }
	
		
	
        int[]   nums    =
        { 0, 1, 2, 10, 11, 12, 21, 101, 111, 121, 543,
          1975, 945710
        };
    
        
        for ( int num : nums ) {
        	int sum = Numbers.digitSum( num );
        	System.out.printf( "digitSum( %6d ): %2d\n", num, sum );
            
        }
       
		
        double[]    arr1    = { -1 }; // -1
        double[]    arr2    = { -2, 2 }; // 0
        double[]    arr3    = { -.1, -.3, -.2 }; // -.2
        double[]    arr4    = { -.5, .3, -.12, .6, -.8, 22 }; // .09
        double[]    arr5    = { 1, .5, -2.2, -.3, .5, -.4, 3.2 }; // 0.3286
        double[][]  allArrs = { arr1, arr2, arr3, arr4, arr5 };
        
        for ( double[] arr11 : allArrs ) { 
        	double mean = Numbers.mean( arr11 );
        	String          strMean = String.format( "%5.4f", mean );
            StringBuilder   bldr    = new StringBuilder( "mean( " );
            bldr.append( arr11[0] );
            for ( int inx = 1 ; inx < arr11.length ; ++inx )
                bldr.append( ", " ).append( arr11[inx] );
            bldr.append( " ): " ).append( strMean );
            System.out.println( bldr );
        }
        
             
        
        for ( double[] arr21 : allArrs )     {
            double          median      = Numbers.median( arr21 );
            String          strMedian   = String.format( "%5.4f", median );
            StringBuilder   bldr    = new StringBuilder( "median( " );
            bldr.append( arr21[0] );
            for ( int inx = 1 ; inx < arr21.length; ++inx )
                bldr.append( ", " ).append( arr21[inx] );
            bldr.append( " ): " ).append( strMedian );
            System.out.println( bldr );
        }
      
		
        int[]   nums1    =
            {   0,   1,   2,   3,   5,   
           //   1    1    2    6    120
                10,     20,     31 };
           //   3,628,800
           //           2,432,902,008,176,640,000
           //                   8,222,838,654,177,922,817,725,562,880,000,000                                    
          for ( int num : nums1 )
          {
       
              BigInteger  factorial   = Numbers.factorial( num );
              System.out.printf( "factorial( %2d ): %,d\n", num, factorial );
          }
		
	}

	//This method will calculate the greatest common factor of param1 and param2. 
	//If either or both parameters are 0 the result must be 0.
	// gcd(a,b)=gcd(b,a%b)
	public static int gcf( int param1, int param2 ) {
		
		while (param2!=0 || param1!=1) {
			param1 = param1 ^ param2;
			param2 = param2 ^ param1;
			param1 = param1 ^ param2;
			if(param1 != 0) {				
				param2=param2 % param1;
			} else {
				break;
			}
		}
		
		if ( param2 != 0)
			return param2;
		else 
			return param1;
		
	}
	
	
	//This method will calculate the least common multiple of param1 and param2.  
	//If either or both parameters are 0 the result must be 0.
	//Precondition: param1 and param2 are non-negative numbers.
	
	public static int lcm( int param1, int param2 ) {
		
		int GCF = gcf(param1, param2);
		if (GCF !=0)
			return param1*param2 / GCF;
		else
			return param1*param2; 
		
	}




	
	
	//	This method will return true if num is a prime number and false if num is not prime.
	//  0 and 1 must be treated as non-prime.
	//Precondition: num is a non-negative number.
	


public static boolean isPrime( int num ) {
		
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

	

	
	//	This method will calculate the median of the the numbers in arr.
	//Precondition: arr contains at least one element.
	

	public static double median( double[] arr ) {
		
		for (int n=1; n<arr.length; n++)
			arr = sort( arr );
		 
		double result=0;
		int j =0; // array index
		if (arr.length % 2 == 0 ) {
			j = (arr.length-1) / 2;
			result = (arr[j]+arr[j+1]);
			result /=2;
			return result;
		} else {
			
			j = (arr.length-1);
			j /=2;
			result =  arr[j];
		}
		return result;
	}
	
	// Orders a list from smallest to biggest
	public static double[] sort( double[] array ) {
		
		for ( int i=0; i< array.length -1; i++) {
			
			if (array[i] > array[i+1]) {
				
				double temp =  array[i];
				array[i] = array[i+1];
				array[i+1] = temp;				
			}
		}
		// for ( double i : array )
			// System.out.print(i + ", ");
		return array;
	}

	//	This method will calculate the sum of the digits of num.
	//  Precondition: num is a non-negative number.
	
	
	public static int digitSum( int num ) {
		int sum =0;
		while ( num !=0 ) {
			sum +=num % 10; 
			num /= 10;
		}
		return sum;
	}

	
	//  This method will calculate the mean of the the numbers in arr.
	//  Precondition: arr contains at least one element.

	public static double mean( double[] arr ) {
		double sum = 0;
		for (double x : arr) {
			sum += x;
		}
		return sum / arr.length; 
	}


	//This method will calculate the factorial of num, and return it as a BigInteger (you will have to study the documentation for BigInteger). 
	//Note that 0! (0 factorial) is 1.
	//Precondition: num is a non-negative number.

	public static BigInteger factorial( int num ) {
		
		BigInteger fact = BigInteger.valueOf(1);
		
		for (int k=1; k<=num; k++) {
			fact = fact.multiply(BigInteger.valueOf(k));
		}
		return fact;
	}


}
	

package cp120.assignments.assignment005;

import java.util.ArrayList;
import java.util.List;

public class Crypto {

	public static void main(String[] args) {
		   String[]    tests   =
		        {
		            "abcdefghi",
		            "abcdefgh",
		            "abcdefg",
		            "abcdef",
		            "abcde",
		            "abcd",
		            "abc",
		            "ab",
		            "a",
		            "",
		        };
		        for ( String str : tests )
		        {
		            String  encrStr = Crypto.encrypt( str );
		            String  decrStr = Crypto.decrypt( encrStr );
		            printUnicode( encrStr );
		            print( str );
		            print( decrStr );
		            String  msg = "PASS";
		            if ( !str.equals( decrStr ) )
		                msg = "FAIL";
		           System.out.printf( "%s%n%n", msg );
		        }
		        print( "done" );
		    }

		    private static void print( String str )
		    {
		        String  temp = '\"' + str + '\"';
		        System.out.println( temp );
		    }
		    
		    private static void printUnicode( String str )
		    {
		        char[]  arr     = str.toCharArray();
		        for ( char ccc : arr )
		        {
		            System.out.printf( "%3d ", (int)ccc );
		        }
		        System.out.println();

	}
	
			public static String encrypt( String str ) {
				//pad
				if (str.length() % 3 == 0) {
					str += '\u0000';
					str += '\u0000';
					str += '\u0000';
				} else if (str.length() % 3 == 1 ) {
					str += '\u0000';
					str += '\u0000';
				} else {
					str += '\u0000';
					
				}

				//rotate
				String roStr = str.substring(str.length() - 3, str.length() );
				roStr = roStr  + str.substring(0, str.length() - 3);
				

				//Incrementing 
				
				char[] array = roStr.toCharArray();
				for (int i=0; i< roStr.length(); i++ )
					array[i]+=i;
				
				String finalStr = new String(array);
				return finalStr;
				
			}
			
			public static String decrypt( String str ) {
				//De incrementing 
				
				char[] array = str.toCharArray();
				for (int i=0; i< str.length(); i++ )
					array[i]-=i;

				String newStr = new String(array);
			
				//reveres rotate
				String roStr = newStr.substring(3, str.length() );
				roStr = roStr  +newStr.substring(0, 3) ;				
				
				//pad
				char[] array2 = roStr.toCharArray();
				String decipher ="";
				if ((int)array2[array2.length-3]==0 && (int)array2[array2.length-2]==0 && (int)array2[array2.length-1]==0 ) {
					decipher = roStr.substring(0, roStr.length()-3);
					
				} else if (  (int)array2[array2.length-2]==0 && (int)array2[array2.length-1]==0) {
					decipher= roStr.substring(0, roStr.length()-2);
				} else {
					decipher = roStr.substring(0, roStr.length()-1);
				}
				return decipher;
				
			}

		}


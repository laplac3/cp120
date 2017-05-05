package test;

import java.util.ArrayList;
import java.util.List;

public class StrAra {


	public static void main(String[] args) {
		
		String str ="abcdefg";
		
		String cipher = encrypt(str);
		char[] array2 = cipher.toCharArray();
		for ( char c : array2 )
			System.out.print((int)c+" ");
		System.out.println();
		
		
		decrypt(cipher);
		
	
	}
	
	public static String encrypt( String str ) {
		//pad
		if (str.length() % 3 == 0) {
			str += '\u0000';
			str += '\u0000';
			str += '\u0000';
		} else if (str.length() % 2 == 0 ) {
			str += '\u0000';
		} else {
			str += '\u0000';
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

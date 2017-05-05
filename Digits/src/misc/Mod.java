package misc;

public class Mod {

	public static void main(String[] args) {

		
		 // prints out digits of a number
		int temp = 18987;
		
		while(temp != 0) { 
			double digit = temp % 10;
			temp =temp/10;
			System.out.println( digit );
	
		}
		System.out.println(toInt(0b1010010100000));
	}
	
	
	//converts from binary to int
	
	public static int toInt(int numb) {  
	int sum = 0;
	int n = 0;
		while(numb != 0) {
			double digit = numb % 0b10;
			numb =numb / 0b10;
			sum += digit*Math.pow(2, n);
			n++;
		}
		return sum;
	}

}


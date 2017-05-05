// This creates a data file with the desired field bits 



import java.io.*;

public class BitMask {


	public static void main(String[] args) throws FileNotFoundException {
		int[] mask = {0b0000011000000000,0b11110000000000000,0b0000000111000000,0b0000000000100000,0b0000000000011000,0b0000000000000111};
		int[] registry = {0b0110101100011001, 0b0110100100011001, 0b0010101100011101, 0b0110110100011001, 0b0110111100011101};
		bitData(registry, mask);
	}
	
	public static void bitData(int[] registry, int[] mask) throws FileNotFoundException {
		
		
		PrintStream output = new PrintStream(new File("bitRgistry.data")); 
		
		for (int x : registry ) {
			bits(x, mask, output);
			output.println();
		}
	}
	
	public static void bits(int xReg, int[] mask, PrintStream output) {
		
		int j=0;
		
		for (int y : mask ) {
			
			int n =0;
			int maskRem = mask[j];
			while ( true ) {
				if ( maskRem % 0b10 != 0)
					break;
				else {
					maskRem /= 0b10;
					n++;
				}
			}
			
			int x = (y & xReg ) >> n;
			if (j == mask.length-1 )
				output.print(x);
			else {
				output.print(x + ", ");
				j++;
			}
			
			
		}
	}

}

package cp120.assignments.assignment002;


public class bitMask {

	public static void main(String[] args) {
		int[] mask = {0b1111000000000000,0b0000100000000000,0b0000011000000000,0b0000000111100000,0b0000000000011000,0b0000000000000111};
		int[] registry = {0b0110101100011001, 0b0110100100011001, 0b0010101100011101, 0b0110110100011001, 0b0110111100011101};
		int[][] answer = bitArray(registry, mask);  

		for (int[] x : answer ) {
			 for ( int i : x )
				 System.out.format(i + ", ");
			 System.out.println();
		}

	}
	
	public static int[][] bitArray(int[] registry, int[] mask) {
		
		int i =0;
		int[][] xArray = new int[registry.length][mask.length]; 
		
		for (int x : registry ) {
			 xArray[i] = bits(x, mask);
			 i++;
		}
		return xArray;
	}
	
	public static int[] bits(int xReg, int[] mask) {
		
		
		int[] yArray = new int[mask.length];
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
			
			yArray[j] = (y & xReg ) >> n;
			j++;
			
		}
		return yArray;
	}
}
		//System.out.println(n);





public class Presintation2 {
	public static void main(String[] args) {
		int t=1;
		
		if ( true^true ){
		System.out.println("true");
	
		} else {
			System.out.println("false");
		}
		
		//bitwise operations
		//>>
		for (int jnx =0;jnx<5;jnx++) {
		int inx = 12;
		System.out.println(inx >> jnx); //divieds by 2 ^ jnx and then floors it then changes it to int
		}
		
		System.out.println((int)Math.floor(12/Math.pow(2, 4)));
		
		
		
		//<<
		for (int jnx =0;jnx<5;jnx++) {
		int inx = 12;
		System.out.println(inx << jnx); //Multiplies by 2 ^ jnx
		}
		
		System.out.println(buildAddressRegister(15,12,4,0));
		
		parseAddressRegister((short) -3);
		
	}
	
	private static short buildAddressRegister(int drive, int cylinder, int head, int sector) {
		short address = (short)sector;
		
		address = (short)(address | head << 4);// returns address + head *2^4
		System.out.println(address);
		address = (short)(address | cylinder<<5 );// address + cylinder *2^5 
		System.out.println(address);
		address = (short)(address | sector <<13);
		return address;
	}
	
	private static void parseAddressRegister( short reg ) {
		int temp =reg;				
		int sector = 68 & 45;  			//convert to binnary then compute.
		System.out.println(sector);  	// 0x means hexadecimal 0-9 a,b,c,d,e,f  f=15 base ten
										//conversion 0x2af3 =(0x2 * 16^3)+(0xa *16^2)+(0xf * 16^1)+(0x3 *16^0)=(2*4096)+(10*256)+(15*16)+3 =10995
		temp = temp >>> 4;   //
		System.out.println(temp);
		int head = temp & 1;
		System.out.println(head);
	}
	
}

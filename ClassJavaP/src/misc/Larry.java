package misc;

import java.util.ArrayList;
import java.util.List;

import edu.uweo.javaintro.tools.Turtle;

public class Larry {

	
	public static void main(String[] args) {
		//Turtle Larry = new Turtle();
		//Larry.fillCircle(64);
		//for ( char i = 'A'; i<='Z';++i) {
			//System.out.println((int)i);	
		//}
		//String str ="What ever I want \"";
		int in = 56;  
		byte bbb=(byte)in; //narrowing conversion
		in = bbb;  
		
		
		swap(2,7);	
	}
	static void swap(int aaa , int bbb) {
	
		System.out.println("aaa= " + aaa +" bbb= "+ bbb);
		
		aaa = aaa^bbb;	//0010
						//0111
						//0101
		
		bbb = bbb^aaa;  //0111
						//0101
						//0010
		
		aaa = aaa^bbb;	//0101
						//0010
						//0111
		
		System.out.println("aaa= " + aaa +" bbb= "+ bbb);
	}
	
	
		
		//List<Integer> list = new ArrayList();
		
}
//}

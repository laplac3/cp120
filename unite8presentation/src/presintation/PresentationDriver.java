package presintation;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;
import java.util.Comparator;

import presintation.InnerClass1.NestedClass;

public class PresentationDriver {
	 

	public static void main(String[] args) {
		
		RectangleExA testA = new RectangleExA( 5.5, 4.4, 100.6, 100.4 );
		System.out.println( "rectA " + testA.getRect() );

		
		 RectangleExB testB = new RectangleExB( 5.5, 4.4, 100.6, 100.4 ); 
         System.out.println( "rectB " + testB.getRect() );
		    
         RectangleExB testC = new RectangleExB( 5.5, 4.4, 100.6, 100.4 );
         System.out.println( "rectC " + testC.getRect() );
         
         InnerClass1 out1 =  new InnerClass1( 5);
         InnerClass1 out2 =  new InnerClass1( 500);
         
         InnerClass1.NestedClass in1 =  out1.new NestedClass();
         InnerClass1.NestedClass in2 =  out2.new NestedClass();
         
         in1.saySomething();
         in2.saySomething();
         
	}

}

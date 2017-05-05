package cp120.assignments.geo_shape;

import static org.junit.Assert.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.junit.Test;

public class TestGeoOval {

	@Test
	public void testConstructors() {
		GeoPoint origin = new GeoPoint(1f,1f);
		Color color = Color.red;
		double width = 1;
		double height = 1;
		GeoPoint defaultOrigin = new GeoPoint();
		Color defaultColor = Color.blue;
		
		GeoOval ovalA = new GeoOval(origin,color,width,height);
		assertEquals( origin.getXco(), ovalA.getOrigin().getXco(),0);
		assertEquals( origin.getYco(), ovalA.getOrigin().getYco(),0);
		assertEquals( color, ovalA.getColor());
		assertEquals( width, ovalA.getWidth(),0);
		assertEquals(height, ovalA.getHeight(), 0 );
		
		GeoOval ovalB = new GeoOval(origin,width,height);
		assertEquals( origin.getXco(), ovalB.getOrigin().getXco(),0);
		assertEquals( origin.getYco(), ovalB.getOrigin().getYco(),0);
		assertEquals( defaultColor, ovalB.getColor());
		assertEquals( width, ovalB.getWidth(),0);
		assertEquals(height, ovalB.getHeight(), 0 );
		
		GeoOval ovalC = new GeoOval(width,height);
		assertEquals( defaultOrigin.getXco(), ovalC.getOrigin().getXco(),0);
		assertEquals( defaultOrigin.getYco(), ovalC.getOrigin().getYco(),0);
		assertEquals( defaultColor, ovalC.getColor());
		assertEquals( width, ovalC.getWidth(),0);
		assertEquals(height, ovalC.getHeight(), 0 );
	}
	
	@Test
	public void testAreaPermeter() {
		double width = 128.2;
		double height = 256.1;
		GeoOval oval = new GeoOval(new GeoPoint(1.1f,2.2f), width, height);
		double a = width/2;
		double b = height/2;
		
		assertEquals( 2*Math.PI*Math.sqrt((a*a + b*b)/2), oval.perimeter(), 0 );
		assertEquals( a*b*Math.PI, oval.area(), .00000001 );
		
	}
	
	@Test
	public void testDraw() {
		double width = 300;
		double height = 100;
		
		GeoOval oval = new GeoOval(width,height);
		
		oval.setColor(Color.GREEN);
		oval.setEdgeColor(Color.RED);
		oval.setEdgeWidth(20);
		
		
		GeoPlane plane = new GeoPlane();
		plane.addShape(oval);
		plane.show();
		
		
		String msg = "Ugly Green oval with a red border?";
		int result = JOptionPane.showConfirmDialog(null, msg );
		
		assertEquals( JOptionPane.YES_OPTION, result);
		//pause(1000);
		
		}
	
	
	/*private void pause( long mills ) {
		 try {
			 Thread.sleep(mills);
		 }
		 catch (InterruptedException exc ) {
			 
		 }
	}*/
}


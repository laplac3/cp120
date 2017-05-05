package cp120.assignments.geo_shape;

import static org.junit.Assert.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.junit.Test;

public class TestGeoLine {

	@Test
	public void testSettersGettersConstructors() {
		
		GeoPoint origin = new GeoPoint();
		GeoPoint end = new GeoPoint(1f,1f);
		Color colorDefault = Color.BLUE;
		Color color = Color.red;
		
		GeoLine lineA = new GeoLine( origin, color, end);
		assertEquals(origin.getXco(), lineA.getStart().getXco(),0);
		assertEquals(origin.getYco(), lineA.getStart().getYco(),0);
		assertEquals(color, lineA.getColor());
		assertEquals(end.getXco(), lineA.getEnd().getXco(),0);
		assertEquals(end.getYco(), lineA.getEnd().getYco(),0);
		
		GeoLine lineB = new GeoLine(origin, end);
		assertEquals(origin.getXco(), lineB.getStart().getXco(),0);
		assertEquals(origin.getYco(), lineB.getStart().getYco(),0);
		assertEquals( colorDefault, lineB.getColor());
		assertEquals(end.getXco(), lineB.getEnd().getXco(),0);
		assertEquals(end.getYco(), lineB.getEnd().getYco(),0);
		
		GeoPoint newEnd = new GeoPoint(2,2);
		GeoPoint newStart = new GeoPoint(-1,-1);
		lineB.setEnd(newEnd);
		lineB.setStart(newStart);
		lineB.setColor(color);
		
		assertEquals(newStart.getXco(), lineB.getStart().getXco(),0);
		assertEquals(newStart.getYco(), lineB.getStart().getYco(),0);
		assertEquals( color, lineB.getColor());
		assertEquals(newEnd.getXco(), lineB.getEnd().getXco(),0);
		assertEquals(newEnd.getYco(), lineB.getEnd().getYco(),0);
		
	}
	
	@Test
	public void testLengthSlope() {
		GeoPoint start = new GeoPoint();
		GeoPoint end = new GeoPoint(144f,-123f);
		GeoLine line = new GeoLine( start , end);
		
		float delX = end.getXco()-start.getXco();
		float delY = end.getYco()-start.getYco();
		double expectedSlope = delY / delX;
		double actualSlope = line.slope();
		assertEquals( expectedSlope, actualSlope , 0.0000001 );
		//System.out.println("expected slope =" + expectedSlope  );
		//System.out.println("actualslope    =" +actualSlope  );
		
		float xDistSq = (float)(delX*delX);
		float yDistSq = (float)(delY*delY);
		float DistSq = (float)(xDistSq + yDistSq);
		float expectLength = (float)Math.sqrt(DistSq);
		double actualLength = line.length();
		assertEquals( expectLength, actualLength, 0.0000001 );
		//System.out.println("expectLength =" + expectLength  );
		//System.out.println("actualLength    =" +actualLength  );
		
	}
	@Test
	public void testToStringDraw() {
		//toString
		GeoPoint start = new GeoPoint();
		GeoPoint end = new GeoPoint(144f,-123f);
		GeoLine line = new GeoLine( start , end);
		StringBuilder build = new StringBuilder();
		Color DEFAULT_COLOR = Color.BLUE;
		float DEFAULT_EDGE_WIDTH = 1;
		
		build = build.append("origin=").append(start)
				.append(",color=").append(GeoShape.getColorStr(line.getColor()))
				.append(",edgeWidth=").append(DEFAULT_EDGE_WIDTH)
				.append(",edgeColor=").append(GeoShape.getColorStr(DEFAULT_COLOR))
				.append(",end=").append(end);
		
		String actual = line.toString();
		String expected = build.toString();
		//toSting test.
		System.out.println(actual);
		System.out.println(expected);
		assertEquals( expected, actual );
		
	}
	
	@Test
	public void testDraw() {
		
		GeoPoint startZ =new GeoPoint(100,100);
		GeoPoint endZ =new GeoPoint(300,300);
		GeoLine lineZ = new GeoLine(startZ, endZ);
		
		lineZ.setColor(Color.GREEN);
		lineZ.setEdgeColor(Color.GREEN);
		lineZ.setEdgeWidth(3);
		
		
		GeoPlane plane = new GeoPlane();
		plane.addShape(lineZ);
		plane.show();
		
		
		String msg = "thick green line";
		int result = JOptionPane.showConfirmDialog(null, msg );
		
		assertEquals( JOptionPane.YES_OPTION, result);
		//pause(1000);
		//can use the pause instead 
		}
	
/*	private void pause( long mills ) {
		 try {
			 Thread.sleep(mills);
		 }
		 catch (InterruptedException exc ) {
			 
		 }
	}*/
}

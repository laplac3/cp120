package cp120.assignments.goe_shape;
import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import cp120.assignments.goe_shape.GeoPoint;

public class TestGeoPoint {


	@Test
	public void testGettersSetters() {
		
		GeoPoint p1 = new GeoPoint();
		
		// how do you test the geoPoint is null?
		assertEquals(0.0f, p1.getXco());
		assertEquals(0.0f,p1.getYco());
		
		float x = (float)1.0;
		float y = (float)-1.1;
		
		p1.setXco(x);
		assertEquals(x,p1.getXco());
		
		p1.setYco(y);
		assertEquals(y, p1.getYco());
		
	}
	
	@Test
	public void testGetIntPoint() {
		GeoPoint pNull = new GeoPoint();
		Point pNullInt = pNull.getIntPoint();
		
		assertEquals( 0 , pNullInt.getX()  );
		assertEquals( 0 , pNullInt.getY()  );
		
		GeoPoint p1 = new GeoPoint(1.1f,1.1f);
		Point p1Int = p1.getIntPoint();
		assertEquals( 1 , pNullInt.getX()  );
		assertEquals( 1 , pNullInt.getY()  );
		
		GeoPoint p2 = new GeoPoint(1.5f,1.5f);
		Point p2Int = p2.getIntPoint();
		assertEquals( 2 , pNullInt.getX()  );
		assertEquals( 2 , pNullInt.getY()  );
		

	}
	
	public void testDistance() {
		GeoPoint point = new GeoPoint();
		GeoPoint other = new GeoPoint();
		
		double dist = point.distance(other);
		assertEquals( 0, dist );
		
		point.setXco(1);
		point.setYco(1);
		dist = point.distance(other);
		assertEquals(Math.sqrt(2), dist);
		
		point.setXco(-1);
		point.setYco(-1);
		dist = point.distance(other);
		assertEquals(0, dist);
	}
	
	public void testToString() {
		GeoPoint point = new GeoPoint();
		
		String expectedStr = "(0.0,0.0)";
		String actualStr = point.toString();
		assertEquals(expectedStr , actualStr );
		
		expectedStr = "(1.1,1.1)";
		point.setXco((float) 1.1);
		point.setYco((float) 1.1);
		assertEquals(expectedStr , actualStr );
		
	}

}

package cp120.assignments.geo_shape;

import static org.junit.Assert.*;

import java.awt.Point;
import java.awt.geom.Point2D;

import org.junit.Test;

import cp120.assignments.geo_shape.GeoPoint;

public class TestGeoPoint {


	@Test
	public void testGettersSettersConstructors() {
		
		GeoPoint p1 = new GeoPoint();
		assertEquals(0.0f, p1.getXco(),0);
		assertEquals(0.0f,p1.getYco(),0);

		float x = (float)1.0;
		float y = (float)-1.1;		
		GeoPoint p2 = new GeoPoint(1,1);
		p2.setXco(x);
		assertEquals(x,p2.getXco(),0);
		p2.setYco(y);
		assertEquals(y, p2.getYco(),0);
		

		
	}
	
	@Test
	public void testGetIntPoint() {
		GeoPoint pNull = new GeoPoint();
		Point pNullInt = pNull.getIntPoint();
		
		assertEquals( 0 , pNullInt.getX(), 0 );
		assertEquals( 0 , pNullInt.getY(), 0 );
		
		GeoPoint p1 = new GeoPoint(1.1f,-1.1f);
		Point p1Int = p1.getIntPoint();
		assertEquals( 1.0 , p1Int.getX(), 0 );
		assertEquals( -1.0 , p1Int.getY(), 0 );
		
		GeoPoint p2 = new GeoPoint(1.5f,-1.5f);
		Point p2Int = p2.getIntPoint();
		assertEquals( 2.0 , p2Int.getX(), 0 );
		assertEquals( -1.0 , p2Int.getY(), 0 );
		
		GeoPoint p3 = new GeoPoint(0,-1.6f);
		Point p3Int = p3.getIntPoint();
		assertEquals( 0.0 , p3Int.getX(), 0 );
		assertEquals( -2.0 , p3Int.getY(), 0 );
	}
	
	@Test
	public void testDistance() {
		GeoPoint point = new GeoPoint(1,1);
		GeoPoint other = new GeoPoint(0,0);
		
		float xP = 1;
		float yP = 1;
		float xO = 0;
		float yO = 0;
		float xDist = (float)(xO-xP);
		float yDist = (float)(yO-yP);
		float xDistSq = (float)(xDist*xDist);
		float yDistSq = (float)(yDist*yDist);
		float DistSq = (float)(xDistSq + yDistSq);
		float expectDist = (float)Math.sqrt(DistSq);
		
		double actualDist = point.distance(other);
		assertEquals( expectDist, actualDist, 0 );
		

	}
	
	@Test
	public void testToString() {
		GeoPoint point = new GeoPoint();
		
		String expectedStr = "(0.0,0.0)";
		String actualStr = point.toString();
		
		System.out.println("expected =" + expectedStr);
		System.out.println("actual =" + actualStr);
		
		
	}
	
	@Test
	public void testGetPoint2D() {
		float x = 1;
		float y = 1;
		GeoPoint geoPoint = new GeoPoint(x,y);
		Point2D.Float point2D = new Point2D.Float(geoPoint.getXco(),geoPoint.getYco());
		
		assertEquals(point2D.getX(),geoPoint.getPoint2D().getX(), 0);
		assertEquals(point2D.getY(),geoPoint.getPoint2D().getY(), 0);

	}

}

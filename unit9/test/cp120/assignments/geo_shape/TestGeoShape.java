package cp120.assignments.geo_shape;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;
import org.junit.Test;


public class TestGeoShape {

	@Test
	public void testGettersSettersConstructors() {
		Color defaulEdgeColor = Color.blue;
		float defaultEdgeWifth = 1;
		double width = 1;
		double height =1;
		float edgeWidth = 2;
		Color edgeColor = Color.RED;
		
		GeoRectangle rect =new GeoRectangle(width, height);
		//setters and getters for edge width.
		assertEquals(defaultEdgeWifth, rect.getEdgeWidth(), 0);
		rect.setEdgeWidth(edgeWidth);
		assertEquals(edgeWidth, rect.getEdgeWidth(), 0);
		//setters and getters for edge color.
		assertEquals(defaulEdgeColor, rect.getEdgeColor());
		rect.setEdgeColor(edgeColor);
		assertEquals(edgeColor, rect.getEdgeColor());
		
		GeoRectangle rectB =new GeoRectangle(width, height);
		//set edge method for both color and width.
		assertEquals(defaulEdgeColor, rectB.getEdgeColor());
		assertEquals(defaultEdgeWifth, rectB.getEdgeWidth(), 0);
		rectB.setEdge(edgeColor,edgeWidth);
		assertEquals(edgeWidth, rectB.getEdgeWidth(), 0);
		assertEquals(edgeColor, rectB.getEdgeColor());
		
	}
	@Test
	public void testgetIntOriginDraw() {

		double width = 1;
		double height =1;

		//getIntOrigin
		GeoRectangle rect =new GeoRectangle(width, height);
		Point actual = rect.getIntOrigin();
		int actualX = (int)actual.getX();
		int actualY = (int)actual.getY();
		GeoPoint expected = rect.getOrigin();
		Point expectedP = expected.getIntPoint();
		int expectedX = (int)expectedP.getX();
		int expectedY = (int)expectedP.getY();
		assertEquals(expectedX, actualX, 0 );
		assertEquals(expectedY, actualY, 0 );
		
		GeoPlane testPlane = new GeoPlane();
		testPlane.addShape(rect);
		testPlane.removeShape(rect);
		testPlane.redraw();
		
		}

}

package cp120.assignments.geo_shape;

import static org.junit.Assert.*;

import java.awt.Color;
import javax.swing.JOptionPane;
import org.junit.Test;
import cp120.assignments.geo_shape.GeoRectangle;

public class TestGeoRectangle {

	@Test
	public void testSettersGettersConstructor() {
		double widthA = 1;
		double heightA = 1;
		GeoPoint originDefault = new GeoPoint(0f,0f);
		Color colorDefault = Color.blue;
		GeoPoint originA = new GeoPoint(1f,1f);
		Color colorA = Color.RED;
		
		GeoRectangle rectA = new GeoRectangle(widthA,heightA);
		assertEquals(colorDefault,rectA.getColor());
		assertEquals(widthA,rectA.getWidth(),0);
		assertEquals(heightA, rectA.getHeight(), 0 );
		assertEquals(originDefault.getXco(),rectA.getOrigin().getXco(),0);
		assertEquals(originDefault.getYco(),rectA.getOrigin().getYco(),0);
		
		GeoRectangle rectB = new GeoRectangle(originA, colorA, widthA,heightA);
		assertEquals(colorA,rectB.getColor());
		assertEquals(widthA,rectB.getWidth(),0);
		assertEquals(heightA, rectB.getHeight(), 0 );
		assertEquals(originA.getXco(),rectB.getOrigin().getXco(),0);
		assertEquals(originA.getYco(),rectB.getOrigin().getYco(),0);
		
		GeoRectangle rectC = new GeoRectangle(originA, widthA,heightA);
		assertEquals(colorDefault,rectC.getColor());
		assertEquals(widthA,rectC.getWidth(),0);
		assertEquals(heightA, rectC.getHeight(), 0 );
		assertEquals(originA.getXco(),rectB.getOrigin().getXco(),0);
		assertEquals(originA.getYco(),rectB.getOrigin().getYco(),0);
		
		double widthB = 2;
		double heightB = 2;
		rectA.setColor(colorA);
		rectA.setWidth(widthB);
		rectA.setHeight(heightB);
		rectA.setOrigin(originA);
		
		assertEquals(colorA,rectA.getColor());
		assertEquals(widthB,rectA.getWidth(),0);
		assertEquals(heightB, rectA.getHeight(), 0 );
		assertEquals(originA.getXco(),rectA.getOrigin().getXco(),0);
		assertEquals(originA.getYco(),rectA.getOrigin().getYco(),0);
	}
	
	@Test
	public void testAreaPermetertoString() {
		double width = 128.2;
		double height = 256.1;
		GeoRectangle rect = new GeoRectangle(new GeoPoint(1.1f,2.2f), width, height);
		
		double area = width*height;
		assertEquals(area , rect.area(),0);
		
		double permeter = 2*width + 2*height;
		assertEquals(permeter,rect.perimeter(),0.0000001);
		
		
	}
	
	@Test
	public void testToString() {
		double width = 1;
		double height = 1;
		GeoPoint originDefault = new GeoPoint(0f,0f);
		Color colorDefault = Color.blue;
		Color DEFAULT_EDGE_COLOR = Color.BLUE;
		float DEFAULT_EDGE_WIDTH = 1;
		
		GeoRectangle rect = new GeoRectangle(width,height);
		
		StringBuilder strB = new StringBuilder();
		strB = strB.append("origin=").append(originDefault)
				.append(",color=").append(GeoShape.getColorStr(colorDefault))
				.append(",edgeWidth=").append(DEFAULT_EDGE_WIDTH)
				.append(",edgeColor=").append(GeoShape.getColorStr(DEFAULT_EDGE_COLOR))
				.append(",width=").append(width)
				.append(",height=").append(height);
		String expected = strB.toString();
		String actual = rect.toString();
		System.out.println("expected  =" + expected  );
		System.out.println("actual    =" +actual  );
		assertEquals(expected, actual);

		


	}
	@Test
	public void testDraw() {
		double width = 300;
		double height = 100;
		
		GeoRectangle rect = new GeoRectangle(width,height);
		
		rect.setColor(Color.GREEN);
		rect.setEdgeColor(Color.RED);
		rect.setEdgeWidth(20);
		
		
		GeoPlane plane = new GeoPlane();
		plane.addShape(rect);
		plane.show();
		
		
		String msg = "Ugly Green Box with a red border?";
		int result = JOptionPane.showConfirmDialog(null, msg );
		
		assertEquals( JOptionPane.YES_OPTION, result);
		//pause(1000);
		 
		}
	
	/*
	private void pause( long mills ) {
		 try {
			 Thread.sleep(mills);
		 }
		 catch (InterruptedException exc ) {
			 
		 }
	}*/
}
package cp120.assignments.geo_shape;


import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics2D;

public class GeoPlane {
	List<GeoShape> allShapes = new ArrayList<>();
	
	public void addShape(GeoShape shape) {
		allShapes.add(shape);
	}
	
	public void removeShape(GeoShape shape) {
		allShapes.remove(shape);
	}
	
	public void redraw() {
		for ( GeoShape shape : allShapes )
			shape.draw( null );
	}
	
}

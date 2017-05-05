package cp120.assignments.geo_shape;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


public class TestRunner {
	
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestGeoPoint.class, TestGeoRectangle.class, TestGeoShape.class, TestGeoOval.class, TestGeoLine.class);
		
     /* for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }*/
      TestRunner runner = new TestRunner();
      System.out.println(runner);
      System.out.println(result.wasSuccessful());
   }
}  
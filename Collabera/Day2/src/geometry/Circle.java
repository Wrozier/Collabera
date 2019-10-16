package geometry;

public class Circle {
	private double radius;
	private final double PI = 3.14159;
	
	public Circle() {
		radius = 0.0;
	    }
		public void setRadius( double rad) {
			radius = rad;
		}
		public double  getArea() {
			double area = PI * ( radius * radius);
			return area;
			
		}
		public double getCircumference() {
			double circle = radius * 2;
			return circle;
		}
	
}

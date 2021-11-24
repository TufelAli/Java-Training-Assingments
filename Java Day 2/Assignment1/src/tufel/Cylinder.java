package tufel;

public class Cylinder extends Shape3D {
	private int r,h;
	
	public Cylinder(int r,int h) {
		this.r=r;
		this.h=h;
		
	}
	
	public double volume() {
		return Math.PI  * 3.14 * (double) (r*r)*h;
	}
	
	public double surfaceArea() {
		return 2 * Math.PI * r * h * 2 * Math.PI * (r*r);
	}
}

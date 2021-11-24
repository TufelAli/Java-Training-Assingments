package tufel;

public class Cube extends Shape3D {
	private int s;
	public Cube(int s) {
		this.s=s;
	}
	
	public double volume() {
		return s * s * s;
	}
	
	public double surfaceArea() {
		return  6 * (s * s);
	}
}

package tufel;

public class Sphere extends Shape3D {
	private int r;
	
	public Sphere(int r) {
		this.r=r;
	}
	
	public double volume() {
		return (4.0 / 3) * Math.PI * r * r * r;
	}
	
	public double surfaceArea() {
		return 4 * Math.PI * r * r;
	}
}

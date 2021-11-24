package tufel;

public class Main {

	public static void main(String[] args) {
		Cylinder cy = new Cylinder(10,20);
		Sphere sh = new Sphere(10);
		Cube cu = new Cube(20);
		
		System.out.println("Surface Area of Cylinder = " + Math.round(cy.surfaceArea()) + " Volume of Cylinder = " + Math.round(cy.volume()));
		System.out.println("Surface Area of Sphere = " + Math.round(sh.surfaceArea()) + " Volume of Sphere = " + Math.round(sh.volume()));
		System.out.println("Surface Area of Cube = " + Math.round(cu.surfaceArea()) + " Volume of Cube = " + Math.round(cu.volume()));
	}

}

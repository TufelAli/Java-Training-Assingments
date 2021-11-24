package tufel;

public class Truck extends Vehicle {


	public Truck(String vehicleColor, String vehicleModel, int vehicleNumberOfWheels){
	
		super(vehicleColor, vehicleModel, vehicleNumberOfWheels);
		
	}
	
	public void Display(){

		System.out.println("Truck : Model- " + model +" Vehicle Color - " + color +" Number of Wheels- " + noOfwheels);
	}
}

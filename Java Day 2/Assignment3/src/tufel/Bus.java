package tufel;

public class Bus extends Vehicle {


	public Bus(String vehicleColor, String vehicleModel, int vehicleNumberOfWheels){
	
		super(vehicleColor, vehicleModel, vehicleNumberOfWheels);
		
	}
	
	public void Display(){

		System.out.println("Bus : Model- " + model +" Vehicle Color - " + color +" Number of Wheels- " + noOfwheels);
	}
}

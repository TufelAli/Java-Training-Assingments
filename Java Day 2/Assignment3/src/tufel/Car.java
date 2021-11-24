package tufel;

public class Car extends Vehicle {

	//private String CarColor;
	//String CarModel;
	//private String CarNumberOfWheels;

	public Car(String vehicleColor, String vehicleModel, int vehicleNumberOfWheels){
	
		super(vehicleColor, vehicleModel, vehicleNumberOfWheels);
		
	}
	
	public void Display(){
		//System.out.println("Vehicle : Model- " + getModel() + " Vehicle Color - " + Color + " Number of Wheels-" + getNoOfwheels());
		System.out.println("Vehicle : Model- " + model +" Vehicle Color - " + color +" Number of Wheels- " + noOfwheels);
	}
	//super(CarColor, CarModel, CarNumberOfWheels);
}

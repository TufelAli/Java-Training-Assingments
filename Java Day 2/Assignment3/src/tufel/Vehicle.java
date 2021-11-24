package tufel;

public class Vehicle {

protected String color;
protected String model;
protected int noOfwheels;

	public Vehicle(String vehicleColor, String vehicleModel,int vehicleNumberOfWheels) { 
		
		color = vehicleColor;
		model = vehicleModel;
		noOfwheels = vehicleNumberOfWheels;
	//public String vehicleColor;
	//public String vehicleModel;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getNoOfwheels() {
		return noOfwheels;
	}
	
	public void setNoOfwheels(int noOfwheels) {
		this.noOfwheels = noOfwheels;
	}


}

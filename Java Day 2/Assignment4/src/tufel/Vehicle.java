package tufel;

public class Vehicle {
	private String name;
	private String color;
	private String model;
	private int noOfwheels;
	Vehicle(String vehicleName, String vehicleColor, String vehicleModel,int vehicleNumberOfWheels) {
		this.name = vehicleName;
		this.color = vehicleColor;
		this.model = vehicleModel;
		noOfwheels = vehicleNumberOfWheels;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void Display() {
		System.out.println(getName()+" Color is : " +getColor()+ " Model : " +getModel()+ " Number of Wheels : " +getNoOfwheels());
	}
}

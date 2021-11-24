package tufel;

public class City {
	public static void main(String[] args) {
		Car c = new Car("Car","Yellow","BMW",4);
		Truck t = new Truck("Truck","Red","Tata",6);
		Bus b = new Bus("Bus","White","Volvo",4);
		c.Display();
		t.Display();
		b.Display();
	}
}

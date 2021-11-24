package tufel;

public class Road {
	public static void main(String[] args) {
		Car c = new Car("Yellow","BMW",4);
		Truck t = new Truck("Red","Tata",6);
		Bus b = new Bus("White","Volvo",4);
		c.Display();
		t.Display();
		b.Display();
	}
}

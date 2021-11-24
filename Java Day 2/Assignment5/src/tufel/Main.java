package tufel;

public class Main {
	public static void main(String args[]) {
	DailyWorker d=new DailyWorker(32,"Tufel",70);
	SalariedWorker s=new SalariedWorker(70,"Raj",99);
	d.compay(45);
	s.compay();
	}
}

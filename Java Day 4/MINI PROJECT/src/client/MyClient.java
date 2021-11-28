package client;
import java.util.Scanner;

import presentation.*;
public class MyClient {

	public static void main(String[] args) {
		TravelPresentImpl travel=new TravelPresentImpl();
		Scanner sc= new Scanner(System.in);
		while(true) {
			travel.showMenu();
			System.out.println("Enter your Choice");
			int choice =sc.nextInt();
			travel.performMenu(choice);
		}

	}

}

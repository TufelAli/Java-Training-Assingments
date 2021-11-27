package client;

import java.util.Scanner;

import presentation.ElementPresentation;
import presentation.ElementPresentationImpl;

public class MyClient {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ElementPresentation elePresentation=new ElementPresentationImpl();
		while(true) {
			elePresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			elePresentation.performMenu(choice);
		}

	}

}

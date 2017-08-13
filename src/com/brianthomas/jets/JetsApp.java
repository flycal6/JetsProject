package com.brianthomas.jets;

import java.util.Scanner;

public class JetsApp {

	public JetsApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();

		Jet cesna = new Jet("Cesna 172", 188, 736.3, 274_900);
		Jet c5 = new Jet("C-5 Galaxy", 540, 6_320, 100_370_000);
		Jet a380 = new Jet("Airbus A380", 683, 8000, 375_300_300);
		Jet citX = new Jet("Cesna Citation X", 604, 3700, 23_365_000);
		Jet cub = new Jet("Piper Cub J-3", 87, 220, 75_000);

		Jet[] fleet = { cesna, c5, a380, citX, cub};
		ja.displayMenu(fleet);
	}

	public void displayMenu(Jet[] jets) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
	
			System.out.println("\n\nSelect Option: ");
			System.out.println("****************************");
			System.out.println("(1) List Fleet");
			System.out.println("(2) View Fastest Jet");
			System.out.println("(3) View Jet with Longest Range");
			System.out.println("(4) Add a Jet to Fleet");
			System.out.println("(5) Quit");
	
			System.out.print(">> ");
			choice = sc.nextInt();
		
			switch (choice) {
				case 1:
					listFleet(jets);
					break;
				case 2:
					viewFastestJet(jets);
					break;
				case 3:
					viewLongestRangeJet(jets);
					break;
				case 4:
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("\n**Your input could not be read.  Try again :)**\n\n");
//					System.exit(0);
			}
		} while(choice != 5);
		sc.close();
	}
	
	public void viewLongestRangeJet(Jet[] jets) {
		Jet longest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i].getRange() > longest.getRange()) {
				longest = jets[i];
			}
		}
		System.out.println("\n" + longest);
	}
	
	public void viewFastestJet(Jet[] jets) {
		Jet fastest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if(jets[i].getSpeed() > fastest.getSpeed()) {
				fastest = jets[i];
			}
		}
		System.out.println("\n" + fastest);
	}

	public void listFleet(Jet[] jets) {
		// List fleet prints out the model, speed, range, and price of each jet.
		// (There must be at least 5 jets stored when the program starts).
		System.out.println();
		for (int i = 0; i < jets.length; i++) {
			System.out.println(jets[i]);
		}
	}

}

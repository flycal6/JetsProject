package com.brianthomas.jets;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JetsApp {
	private static Scanner sc = new Scanner(System.in);

	public JetsApp() {
	}

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();

		Pilot jimbo = new Pilot("Jimbo", 33, 3);
		Pilot jim	= new Pilot("Jim", 38, 20);
		Pilot jimmy = new Pilot("Jimmy", 23, 18);
		Pilot jimmers = new Pilot("Jimmers", 44, 33);
		Pilot jiminy = new Pilot("Jiminy", 77, 12);
		
		Jet cesna = new Jet("Cesna 172", 188, 736.3, 274_900, jim);
		Jet c5 = new Jet("C-5 Galaxy", 540, 16_320, 100_370_000, jimmy);
		Jet a380 = new Jet("Airbus A380", 683, 8000, 375_300_300, jiminy);
		Jet citX = new Jet("Cesna Citation X", 604, 3700, 23_365_000, jimmers);
		Jet cub = new Jet("Piper Cub J-3", 87, 220, 75_000, jimbo);

		Jet[] fleet = new Jet[10];
		fleet[0] = cesna;
		fleet[1] = citX;
		fleet[2] = cub;
		fleet[3] = a380;
		fleet[4] = c5;

		ja.displayMenu(fleet);
	}

	public void displayMenu(Jet[] jets) {
		// the try is for when people enter something other than a number
		try {
			int choice = 0;
			do {

				System.out.print("\n\nSelect Option: \n" + "****************************\n" + "(1) List Fleet\n"
						+ "(2) View Fastest Jet\n" + "(3) View Jet with Longest Range\n" + "(4) Add a Jet to Fleet\n"
						+ "(5) Quit\n" + ">> ");

				choice = sc.nextInt();
				// necessary to consume the \n char, which is ignored by the above nextInt()
				sc.nextLine();

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
					addJetToFleet(jets);
					break;
				case 5:
					System.exit(0);
					break;
				default:
					System.out.println("\n**Your input could not be read.  Try again :)**\n\n");
					// System.exit(0);
				}
			} while (choice != 5);
		} catch (InputMismatchException ime) {
			System.err.println("Please only enter integers.");

			sc.nextLine();
			displayMenu(jets);
		}
	}

	public void addJetToFleet(Jet[] jets) {

		System.out.print("\nJet Model?\n>> ");
		String model = sc.nextLine();

		System.out.println("\nSpeed (mph)?\n>> ");
		double speed = sc.nextDouble();

		System.out.println("\nRange (nm)?\n>> ");
		double range = sc.nextDouble();

		System.out.println("\nPrice? \n>> ");
		int price = sc.nextInt();

		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = new Jet(model, speed, range, price);
				break;
			}
		}
		System.out.println("\n*** Jet Successfully Added ***\n");
	}

	public void viewLongestRangeJet(Jet[] jets) {
		Jet longest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getRange() > longest.getRange()) {
					longest = jets[i];
				}
			}
		}
		System.out.println("\n" + longest);
	}

	public void viewFastestJet(Jet[] jets) {
		Jet fastest = jets[0];
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				if (jets[i].getSpeed() > fastest.getSpeed()) {
					fastest = jets[i];
				}
			}
		}
		System.out.println("\n" + fastest);
	}

	public void listFleet(Jet[] jets) {
		System.out.println();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i]);
			}
		}
	}

}

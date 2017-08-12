package com.brianthomas.jets;

import java.util.Scanner;

public class JetsApp {

	public JetsApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.displayMenu();
	}

	public int displayMenu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Select Option: ");
		System.out.println("****************************");
		System.out.println("(1) List Fleet");
		System.out.println("(2) View Fastest Jet");
		System.out.println("(3) View Jet with Longest Range");
		System.out.println("(4) Add a Jet to Fleet");
		System.out.println("(5) Quit");

		System.out.print(">> ");
		int choice = sc.nextInt();

		return choice;
	}

}

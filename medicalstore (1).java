
//Use this editor to write, compile and run your Java code online

package medicalstore;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class medicalstore {

	static HashMap<Character, Stack<String>> rack1 = new HashMap<Character, Stack<String>>();
	static HashMap<Character, Stack<String>> rack2 = new HashMap<Character, Stack<String>>();
	static HashMap<Character, Stack<String>> rack3 = new HashMap<Character, Stack<String>>();

	boolean insertDrugInToRack(String drug) {

		if (drug.toLowerCase().charAt(0) >= 97 && drug.toLowerCase().charAt(0) <= 105) {
			if (rack1.containsKey(drug.charAt(0))) {
				Stack<String> rack1Stack = rack1.get(drug.charAt(0));
				rack1Stack.push(drug);
				rack1.put(drug.toLowerCase().charAt(0), rack1Stack);
			} else {
				Stack<String> rack11 = new Stack<>();
				rack11.push(drug);
				rack1.put(drug.charAt(0), rack11);

			}

		}

		if (drug.toLowerCase().charAt(0) >= 106 && drug.toLowerCase().charAt(0) <= 112) {
			if (rack2.containsKey(drug.charAt(0))) {
				Stack<String> rack2Stack = rack2.get(drug.charAt(0));
				rack2Stack.push(drug);
				rack1.put(drug.toLowerCase().charAt(0), rack2Stack);
			} else {
				Stack<String> rack11 = new Stack<>();
				rack11.push(drug);
				rack2.put(drug.charAt(0), rack11);

			}

		}

		if (drug.toLowerCase().charAt(0) >= 113 && drug.toLowerCase().charAt(0) <= 122) {
			if (rack3.containsKey(drug.charAt(0))) {
				Stack<String> rack3Stack = rack3.get(drug.charAt(0));
				rack3Stack.push(drug);
				rack3.put(drug.toLowerCase().charAt(0), rack3Stack);
			} else {
				Stack<String> rack11 = new Stack<>();
				rack11.push(drug);
				rack3.put(drug.charAt(0), rack11);

			}

		}
		return true;
	}

	public boolean removeDrugFromRack(String drug) {

		char ch = drug.toLowerCase().charAt(0);

		if (drug.toLowerCase().charAt(0) >= 97 && drug.toLowerCase().charAt(0) <= 105) {
			if (!rack1.containsKey(ch)) {
				System.out.println("drug not present to remove\n\n");
			} else {
				Stack<String> rack1stack = rack1.get(drug.charAt(0));

				boolean check = rack1stack.remove(drug);

				if (check) {
					System.out.println("Drug" + drug + " is removed\n\n");
				} else {
					System.out.println("Drug" + drug + " is not present to remove\n\n");
				}
			}
		} else if (drug.toLowerCase().charAt(0) >= 106 && drug.toLowerCase().charAt(0) <= 112) {
			
			if (!rack2.containsKey(ch)) {
				System.out.println("drug not present to remove\n\n");
			}else
			{
				Stack<String> rack2stack = rack2.get(drug.charAt(0));

				boolean check = rack2stack.remove(drug);

				if (check) {
					System.out.println("Drug" + drug + " is removed\n\n");
				} else {
					System.out.println("Drug" + drug + " is not present to remove\n\n");
				}
			}
			
		} else if (drug.toLowerCase().charAt(0) >= 113 && drug.toLowerCase().charAt(0) <= 122) {
			if (!rack2.containsKey(ch)) {
				System.out.println("drug not present to remove\n\n");
			}else
			{
				Stack<String> rack3stack = rack3.get(drug.charAt(0));

				boolean check = rack3stack.remove(drug);

				if (check) {
					System.out.println("Drug" + drug + " is removed\n\n");
				} else {
					System.out.println("Drug" + drug + " is not present to remove\n\n");
				}
			}

			
		}

		return true;
	}

	void display() {
		System.out.println("-----------  Rack1 -----------------\n\n");
		System.out.println(rack1);

		System.out.println("-----------  Rack2 -----------------\n\n");
		System.out.println(rack2);

		System.out.println("-----------  Rack3 -----------------\n\n");
		System.out.println(rack3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		medicalstore obj = new medicalstore();
		System.out.println("----------------Welcome To MyMedical Store----------------");
		boolean loop = true;
		while (loop) {
			System.out.println("\nNote : please make sure that first "
					+ "Character of a medicine is Capital i..e, A,B,C.....,X,Y,Z.");

			System.out.println("\nEnter your choice");

			System.out.println("\n        1).   To insert Drug Press 1");
			System.out.println("\n        2).   To remove Drug Press 2");
			System.out.println("\n        3).   Exit press 0");

			int option = sc.nextInt();

			switch (option) {
			case 0:
				System.out.println("\nYou came out of the store");
				loop = false;
				break;
			case 1:
				System.out.println("\nEnter the drug name to insert");
				sc.nextLine();
				String drug = sc.nextLine();
				obj.insertDrugInToRack(drug);
				obj.display();
				break;
			case 2:
				System.out.println("\nselected option 2");
				System.out.println("\nEnter drug name");
				String drugtoremove = sc.next();
				char ch = drugtoremove.charAt(0);

				obj.removeDrugFromRack(drugtoremove);
				obj.display();
				break;
			default:
				System.out.println("\nPlease choose correct option");
			}

		}

	}
}
package dinner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DinnerMain {
	public static Scanner scanner = new Scanner(System.in);
	public static Dish dish = new Dish();

	public static void main(String[] args) {
		boolean quit = false;
		printActions();
		try {
			while (!quit) {
				System.out.println("Enter number to choose action (1 to see them all):");
				int action = scanner.nextInt();
				scanner.nextLine();
				switch (action) {
				case 0:
					System.out.println("Application has been closed.");
					quit = true;
					break;
				case 1:
					printActions();
					break;
				case 2:
					addDish();
					break;
				case 3:
					updateDish();
					break;
				case 4:
					removeDish();
					break;
				case 5:
					searchFor();
					break;
				case 6:
					dish.printList();
					break;
				case 7:
					dish.printDinner();
					break;
				case 8:
					dish.printFDays();
					break;
				default:
					System.out.println("Use proper numbers!");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input.");

		}

	}

	public static void printActions() {
		System.out.println("Action to choose:");
		System.out.println("0 - Close applcation");
		System.out.println("1 - Show list of actions");
		System.out.println("2 - Add a dish to the list");
		System.out.println("3 - Update a dish on the list");
		System.out.println("4 - Remove a dish from the list");
		System.out.println("5 - Search for dish on the list");
		System.out.println("6 - Print the list of your dishes");
		System.out.println("7 - Print a dish for one day");
		System.out.println("8 - Print the list of the dishes for next five days");
	}

	public static void addDish() {
		System.out.println("Enter the name of the dish:");
		dish.addDish(scanner.nextLine());
	}

	public static void updateDish() {
		System.out.println("Enter the name of the dish:");
		String name = scanner.nextLine();
		System.out.println("Enter the position of the dish:");
		int p = scanner.nextInt();
		dish.updateDish(p, name);
	}

	public static void removeDish() {
		System.out.println("Enter the position of the dish, which you want to remove:");
		dish.removeDish(scanner.nextInt());
	}

	public static void searchFor() {
		System.out.println("Enter the name of the dish you looking for:");
		String name = scanner.nextLine();
		if (!dish.findDish(name)) {
			System.out.println("The given dish isn't on the list. Do you want to add it?");
			if (scanner.nextLine().equals("yes")) {
				dish.addDish(name);
			}
		}
	}
}

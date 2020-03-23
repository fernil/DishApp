package dinner;

import java.util.Scanner;

public class DinnerMain {
	public static Scanner scanner = new Scanner(System.in);
	public static Dish dish = new Dish();

	public static void main(String[] args) {
		boolean quit = false;
		printActions();
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
				dish.printList();
				break;
			case 6:
				dish.printDinner();
				break;
			case 7:
				dish.printFDays();
				break;
			default:
				System.out.println("Use proper numbers!");
			}
		}

	}

	public static void printActions() {
		System.out.println("Action to choose:");
		System.out.println("0 - Close applcation");
		System.out.println("1 - Show list of actions");
		System.out.println("2 - Add a dish to the list");
		System.out.println("3 - Update a dish on the list");
		System.out.println("4 - Remove a dish from the list");
		System.out.println("5 - Print the list of your dishes");
		System.out.println("6 - Print a dish for one day");
		System.out.println("7 - Print the list of the dishes for next five days");
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

}

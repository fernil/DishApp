package dinner;

import java.util.ArrayList;
import java.util.Random;

public class Dish {
	private ArrayList<String> dishList = new ArrayList<String>();
	private Random random = new Random();

	public void addDish(String dish) {
		if (!findDish(dish)) {
			dishList.add(dish);
			System.out.println(dish + " has been succesful added.");
		}
	}

	public void updateDish(int position, String dish) {
		if (position > 0 && position <= dishList.size()) {
		dishList.set(position - 1, dish);
		System.out.println("Position " + position +" has been succesful changed.");
		}else 
		System.out.println("Wrong number, you have " + dishList.size() + " position.");
	}
	

	public void removeDish(int position) {
		if (position > 0 && position <= dishList.size()) {
			dishList.remove(position - 1);
			System.out.println("Position " + position + " has been succesful removed.");
		}else 
		System.out.println("Wrong number, you have " + dishList.size() + " positions.");
	}

	public boolean findDish(String dish) {
		boolean exists = dishList.contains(dish);
		if (exists) {
			int position = dishList.indexOf(dish);
			System.out
					.println("The dish is on the list at " + (position + 1) + " positions.");
		}
		return exists;
	}

	public void printList() {
		System.out.println("You have " + dishList.size() + " dishes on the list.");
		if (dishList.size() < 5) {
			System.out.println("Add more dishes to increase the variety of dinners. ");
		}
		for (int i = 0; i < dishList.size(); i++) {
			System.out.println("Position " + (i + 1) + (" - ") + dishList.get(i));
		}
	}

	public void printDinner() {
		System.out
				.println("You should eat " + dishList.get(random.nextInt(dishList.size())) + " for your next dinner.");
	}

	public void printFDays() {
		for (int i = 1; i < 6; i++) {
			System.out.println("On the " + i + " day you should eat " + dishList.get(random.nextInt(dishList.size()))
					+ " for dinner.");
		}
	}
}

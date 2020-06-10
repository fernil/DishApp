package dinner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Dish {
	private List<String> dishList = new ArrayList<>();

	private Random random = new Random();

	public List<String> getDishList() {
		return dishList;
	}

	public void setDishList(List<String> dishList) {
		this.dishList = dishList;
	}

	public void addDish(String dish) {
		if (!findDish(dish)) {
			dishList.add(dish);
			System.out.println(dish + " has been succesfully added.");
		}
	}

	public void updateDish(int position, String dish) {
		if (position > 0 && position <= dishList.size()) {
			dishList.set(position - 1, dish);
			System.out.println("Position " + position + " has been succesfully changed.");
		} else
			System.out.println("Wrong number, you have " + dishList.size() + " position.");
	}

	public void removeDish(int position) {
		if (position > 0 && position <= dishList.size()) {
			dishList.remove(position - 1);
			System.out.println("Position " + position + " has been succesfully removed.");
		} else
			System.out.println("Wrong number, you have " + dishList.size() + " positions.");
	}

	public boolean findDish(String dish) {
		boolean exists = dishList.contains(dish);
		if (exists) {
			int position = dishList.indexOf(dish);
			System.out.println("The dish is on the list at " + (position + 1) + " positions.");
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
		Set<String> fDaysSet = new HashSet<>();
		String dinner = "";
		for (int i = 1; i < 6; i++) {
			dinner = dishList.get(random.nextInt(dishList.size()));
			if (fDaysSet.add(dinner)) {
				System.out.println("On the " + i + " day you should eat " + dinner + " for dinner.");
			} else
				i--;
		}
	}
}

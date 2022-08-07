import java.util.Scanner;

public class Search {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int[] numbers = { 5, 7, 9, 13, 32, 33, 42, 54, 56, 88 };

		System.out.println("Enter a number: ");
		int number = keyboard.nextInt();

		//Linear search O(n)
		boolean found = false;
		for (int i = 0; i < numbers.length; i++) {
			if (number == numbers[i]) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println("The number is in the array.");
		else
			System.out.println("The number is NOT in the array.");
	}

}

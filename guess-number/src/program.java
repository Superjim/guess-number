import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class program {
	public static void main(String[] args) {

		// while loop bool
		boolean bool = true;

		// Create random int between 1 and 10
		int random = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		// print answer for testing
		System.out.println(random);

		// Create scanner object
		Scanner scanner = new Scanner(System.in);

		// Ask user for a number
		System.out.println("Enter a number between 1 and 10:");

		// Wait for user to enter number
		int line = 1;
		line = scanner.nextInt();

		// create while loop
		while (bool = true) {

			// check for valid entry
			if ((line > 10) || (line < 1)) {
				System.out.println("Invalid entry. Enter a number between 1 and 10");
				line = scanner.nextInt();
			}

			else {
				// check if the number matches, break program
				if (line == random) {
					System.out.println("Correct guess!");
					break;
					// if it doesnt match, keep running
				} else {
					System.out.println("Incorrect entry. Please guess again");
					line = scanner.nextInt();
				}
			}
		}
	}
}

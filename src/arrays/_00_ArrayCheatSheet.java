package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] names = { "Julia", "Hans", "Ronald", "Wendy", "Alexa" };
		// 2. print the third element in the array
		System.out.println(names[3]);
		// 3. set the third element to a different value
		names[3] = "Paola";
		// 4. print the third element again
		System.out.println(names[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// 6. make an array of 50 integers
		int[] numbers = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(50);

		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println("Smallest value is " + smallest);
		// 9 print the entire array to see if step 8 was correct
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// 10. print the largest number in the array.
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
		}
		System.out.println("Largest value is " + largest);
	}
}

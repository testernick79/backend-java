package com.example.demo;

public class LessonThreeApplication {

	public static void main(String[] args) {

		// STEP 1

		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = StudentHelper.ReadInputInt();
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// STEP 2
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}

		// STEP 3
		for (int i = 1; i < numbers.length; i += 2) {
			System.out.println(numbers[i]);
		}

	}

}

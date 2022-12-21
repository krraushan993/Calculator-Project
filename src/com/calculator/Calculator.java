package com.calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userChoice;

		double firstNumber, secondNumber;
		do {
			System.out.print("Enter first number: ");
			firstNumber = input.nextDouble();

			System.out.print("Enter second number: ");
			secondNumber = input.nextDouble();

			userChoice = displayMenu(input);

			switch (userChoice) {
			case 1:
				System.out.println("Result of addition is: " + add(firstNumber, secondNumber));
				break;

			case 2:
				System.out.println("Result of addition is: " + sub(firstNumber, secondNumber));
				break;

			case 3:
				System.out.println("Result of addition is: " + mul(firstNumber, secondNumber));
				break;

			case 4:
				System.out.println("Result of addition is: " + div(firstNumber, secondNumber));
				break;

			case 5:
				System.out.println("Thank you and goodbye !");
				break;

			default:
				System.out.println("Wrong entry: Enter a value between 1-5");
				break;
			}
		} while (userChoice != 5);

	}

	public static int displayMenu(Scanner input) {

		System.out.println(" Make a Selection ");
		System.out.println("------------------");
		System.out.println("| 1)     Add     |");
		System.out.println("| 2)   Subtract  |");
		System.out.println("| 3)   Multiply  |");
		System.out.println("| 4)    Divide   |");
		System.out.println("| 5)    Quit     |");
		System.out.println("------------------");

		return input.nextInt();
	}

	public static double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}

	public static double sub(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	public static double mul(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	public static double div(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
}

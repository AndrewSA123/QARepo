package com.qa.LambdaTest;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int Number1 = 10;
		int Number2 = 20;
		int operator = 1;

		if (operator == 1) {
			System.out.println(MathOperations.Addition.operation(Number1, Number2));
		} else if (operator == 2) {
			System.out.println(MathOperations.Subtraction.operation(Number1, Number2));
		} else if (operator == 3) {
			System.out.println(MathOperations.Division.operation(Number1, Number2));
		} else if (operator == 4) {
			System.out.println(MathOperations.Multiplication.operation(Number1, Number2));
		}

	}
}
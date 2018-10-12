package com.qa.LambdaTest;

public interface MathOperations {

	int operation(int a, int b);

	MathOperations Addition = (int a, int b) -> a + b;

	MathOperations Subtraction = (a, b) -> a - b;

	MathOperations Division = (a, b) -> a / b;

	MathOperations Multiplication = (a, b) -> a * b;

}

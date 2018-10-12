package com.qa.LambdaTest;

public interface TextOperations {

	String Operate(String a);

	TextOperations HelloFunction = (a) -> "Hello " + a;

}

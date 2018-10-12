package com.qa.ArrayListTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		PrintEach(numbers);
		OnlyEven(numbers);
		TimesTen(numbers);
		Highest(numbers);
		Lowest(numbers);
		SquareNumbers(numbers);
		UniqueNumbers(numbers);

		numbers.stream().forEach(System.out::println);
		numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		numbers.stream().map(x -> x * 10).forEach(System.out::println);
		int HighestNumber = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(HighestNumber);
		int LowestNumber = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(LowestNumber);
		numbers.stream().map(x -> x * x).collect(Collectors.toList()).stream().forEach(System.out::println);
		numbers.stream().distinct().map(x -> x * x).collect(Collectors.toList()).stream().forEach(System.out::println);

	}

	public static void PrintEach(List<Integer> numbers) {

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
    }

	public static void OnlyEven(List<Integer> numbers) {

		for (int i : numbers) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	public static void TimesTen(List<Integer> numbers) {

		for (int i : numbers) {
			System.out.println(i * 10);
		}

	}

	public static void Highest(List<Integer> numbers) {
		int temp = 0;
		for (int i : numbers) {
			if (i > temp) {
				temp = i;
			}
		}
		System.out.println(temp);
	}

	public static void Lowest(List<Integer> numbers) {

		int temp = 10000;
		for (int i : numbers) {
			if (i < temp) {
				temp = i;
			}
		}
		System.out.println(temp);

	}

	public static void SquareNumbers(List<Integer> numbers) {

		List<Integer> newList = new ArrayList<Integer>();

		for (int i : numbers) {
			int temp = i * i;
			newList.add(i);
			System.out.println(temp);
		}
		for (int i : newList) {
			System.out.println(i);
		}

	}

	public static void UniqueNumbers(List<Integer> numbers) {

		List<Integer> FinalList = new ArrayList<Integer>();
		for (int i : numbers) {
			if (!FinalList.contains(i * i)) {
				FinalList.add(i * i);
				System.out.println(i * i);
			}
		}

	}

}

package com.qa.OOPExcersie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {

		Person a = new Person("Andrew", 22, "Consultant");
		Person b = new Person("Malcolm", 23, "Consultant");
		Person c = new Person("Joe", 25, "Consultant");
		List<Person> PersonList = new ArrayList<Person>();

		PersonList.add(a);
		PersonList.add(b);
		PersonList.add(c);

		System.out.println(a.toString());

		PersonList.stream().map(x -> x.returnName()).forEach(System.out::println);
		PersonList.stream().map(x -> x.returnAge()).forEach(System.out::println);
		PersonList.stream().map(x -> x.returnJob()).forEach(System.out::println);

		System.out.println(SearchByName("Andrew", PersonList));


	}

	public static Person SearchByName(String name, List<Person> ListName) {

		List<Person> OutputName = ListName.stream().filter(x -> x.getClass().getName().equals(name))
				.collect(Collectors.toList());

		return OutputName.get(0);
	}

}

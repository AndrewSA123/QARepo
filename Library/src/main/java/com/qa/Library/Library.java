package com.qa.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

	private List<Item> privateItemList = new ArrayList<Item>();
	private List<People> privatePeopleList = new ArrayList<People>();

	public String setItem(Item a) {
		privateItemList.add(a);
		return "Item Added";
	}

	public String setPerson(People a) {
		privatePeopleList.add(a);
		return "Person added";
	}

	public Item getItem(String a) {
		if (privateItemList.size() > 0) {
			for (int i = 0; i < privateItemList.size(); i++) {
				if (privateItemList.get(i).author == a) {

					return privateItemList.get(i);
				}
			}
		}
		System.out.println("Could not find item");
		return null;
	}

	public Item getItem(int a) {
		if (privateItemList.size() > 0) {
			for (int i = 0; i < privateItemList.size(); i++) {
				if (privateItemList.get(i).UID == a) {
					return privateItemList.get(i);
				}
			}
		}
		System.out.println("Could not find item");
		return null;
	}

	public People getPerson(String a) {
		if (privatePeopleList.size() > 0) {
			for (int i = 0; i < privatePeopleList.size(); i++) {
				if (privatePeopleList.get(i).name == a) {
					return privatePeopleList.get(i);
				}
			}
		}

		System.out.println("Could not find person");
		return null;
	}

	public People getPerson(int a) {
		if (privatePeopleList.size() > 0) {
			for (int i = 0; i < privatePeopleList.size(); i++) {
				if (privatePeopleList.get(i).UID == a) {
					return privatePeopleList.get(i);
				}
			}
		}

		System.out.println("Could not find person");
		return null;
	}

	public String removeItem(String a) {

		if (privateItemList.size() > 0) {
			for (int i = 0; i < privateItemList.size(); i++) {
				if (privateItemList.get(i).author == a) {
					privateItemList.remove(i);
					return "Item Removed";
				}
			}
		}

		return "Item not found";
	}

	public String removeItem(int a) {

		if (privateItemList.size() > 0) {
			for (int i = 0; i < privateItemList.size(); i++) {
				if (privateItemList.get(i).UID == a) {
					privateItemList.remove(i);
					return "Item Removed";
				}
			}
		}

		return "Item not found";
	}

	public String updateItemPrice(String a, int b) {

		if (privateItemList.size() > 0) {
			for (int i = 0; i < privateItemList.size(); i++) {
				if (privateItemList.get(i).author == a) {
					privateItemList.get(i).price = b;
					return "Item updated";
				}
			}
		} else {
			return "Item not found";
		}
		return "Error";
	}

	public String updateItemPrice(int a, int b) {

		if (privateItemList.size() > 0) {
			for (int i = 0; i < privateItemList.size(); i++) {
				if (privateItemList.get(i).UID == a) {
					privateItemList.get(i).price = b;
					return "Item updated";
				}
			}
		} else {
			return "Item not found";
		}
		return "Error";
	}

	public String removePerson(String a) {
		if (privatePeopleList.size() > 0) {
			List<People> tempList = privatePeopleList.stream().filter(p -> p.name.equals(a))
					.collect(Collectors.toList());
			privatePeopleList.removeAll(tempList);
		}

		return "Person not found";
	}

	public String removePerson(int a) {

		if (privatePeopleList.size() > 0) {
			List<People> tempList = privatePeopleList.stream().filter(p -> p.UID == a).collect(Collectors.toList());
			privatePeopleList.removeAll(tempList);

		}

		return "Person not found";
	}

	public String printPeople() {

		if (privatePeopleList.size() > 0) {
			privatePeopleList.stream().forEach(System.out::println);
			return "Printing People";
		}

		return "Printing Error";
	}

	public String printItems() {

		if (privateItemList.size() > 0) {
			privateItemList.stream().forEach(System.out::println);
			return "Printing Items";
		}

		return "Printing Error";
	}


}

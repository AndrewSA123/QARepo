package com.qa.Library;

import java.util.ArrayList;
import java.util.List;

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


}

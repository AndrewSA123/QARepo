package com.qa.InfiniteTerrain;

import java.util.Random;
import java.util.Scanner;

public class GameClass {

	int northDist;
	int southDist;
	int eastDist;
	int westDist;
	Random rand = new Random();
	Player gamePlayer;
	Treasure winCondition;
	int difficulty;
	Scanner sc = new Scanner(System.in);

	public GameClass(int ND, int SD, int ED, int WD, Player player, Treasure Win) {
		this.eastDist = ED;
		this.northDist = ND;
		this.southDist = SD;
		this.westDist = WD;
		this.gamePlayer = player;
		this.winCondition = Win;
	}

	public void intro(Player gamePlayer, Scanner sc, Trap a, GameClass b) {
		System.out.println(
				"Welcome to my Swamp \n" + "You are up to your knees in swamp water and fog is all around you \n"
						+ "input your name to continue");
		gamePlayer.name = sc.nextLine();
		System.out.println("Welcome " + gamePlayer.name + "\nTry North, East, South or West");
		System.out.println("Enter your difficulty (Easy, Medium, Hard");
		this.difficulty = setDifficulty();
		System.out.println("You see a shadowy figure 30 meters to the north!");
		a.placeTraps(b);

	}

	public int setDifficulty() {



		switch (sc.nextLine()) {
		case "easy":
		case "Easy":
			return 1;
		case "medium":
		case "Medium":
			return 2;
		case "hard":
		case "Hard":
			return 3;
		}

		return 1;
	}

	public String move(String dir) {

		if (!(checkPOS(this.gamePlayer, this.winCondition))) {
			switch (dir) {
			case "North":
			case "north":
				if (gamePlayer.yPOS < this.northDist) {
					this.northDist -= gamePlayer.moveSpeed;
					this.southDist += gamePlayer.moveSpeed;
					this.gamePlayer.yPOS += gamePlayer.moveSpeed;
					return "You moved " + gamePlayer.moveSpeed + " meters north";
				} else {
					return "There is a fog wall ahead too dangerous to enter";
				}

			case "South":
			case "south":
				if (gamePlayer.yPOS > this.southDist) {
					this.southDist += gamePlayer.moveSpeed;
					this.northDist -= gamePlayer.moveSpeed;
					this.gamePlayer.yPOS -= gamePlayer.moveSpeed;
					return "You moved " + gamePlayer.moveSpeed + " meters south";
				} else {
					return "There is a fog wall ahead too dangerous to enter";
				}

			case "West":
			case "west":
				if (gamePlayer.xPOS > this.westDist) {
					this.westDist += gamePlayer.moveSpeed;
					this.eastDist -= gamePlayer.moveSpeed;
					this.gamePlayer.xPOS -= gamePlayer.moveSpeed;
					return "You moved " + gamePlayer.moveSpeed + " meters west";

				} else {
					return "There is a fog wall ahead too dangerous to enter";

				}

			case "East":
			case "east":
				if (gamePlayer.xPOS < this.eastDist) {
					this.eastDist -= gamePlayer.moveSpeed;
					this.westDist += gamePlayer.moveSpeed;
					this.gamePlayer.xPOS += gamePlayer.moveSpeed;
					return "You moved " + gamePlayer.moveSpeed + " meters east";
				} else {
					return "There is a fog wall ahead too dangerous to enter";
				}
			}

		} else {
			return "You found the treasure!";
		}
			return "Error";
		}




	public boolean checkPOS(Player gamePlayer, Treasure winCondition) {
		if (((gamePlayer.xPOS >= winCondition.xPOS - 20 && gamePlayer.xPOS <= winCondition.xPOS + 20)
				&& (gamePlayer.yPOS >= winCondition.yPOS - 20 && gamePlayer.yPOS <= winCondition.yPOS + 20))) {
			return true;
		} else {
			return false;
		}

	}

}

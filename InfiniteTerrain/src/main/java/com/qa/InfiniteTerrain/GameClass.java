package com.qa.InfiniteTerrain;

import java.util.Scanner;

public class GameClass {

	int northDist;
	int southDist;
	int eastDist;
	int westDist;
	Player gamePlayer;
	Treasure winCondition;

	public GameClass(int ND, int SD, int ED, int WD, Player player, Treasure Win) {
		this.eastDist = ED;
		this.northDist = ND;
		this.southDist = SD;
		this.westDist = WD;
		this.gamePlayer = player;
		this.winCondition = Win;

	}

	public void intro(Player gamePlayer, Scanner sc) {
		System.out.println(
				"Welcome to my Swamp \n" + "You are up to your knees in swamp water and fog is all around you \n"
						+ "input your name to continue");
		gamePlayer.name = sc.nextLine();
		System.out.println("Welcome " + gamePlayer.name + "\n Try North, East, South or West");

	}

	public String move(String dir) {

		if (!(checkPOS(this.gamePlayer, this.winCondition))) {
			switch (dir) {
			case "North":
			case "north":
				if (gamePlayer.yPOS < this.northDist) {
					this.northDist -= 10;
					this.southDist += 10;
					this.gamePlayer.yPOS += 10;
					return "You moved 10 meters north";
				} else {
					return "There is a fog wall ahead too dangerous to enter";
				}

			case "South":
			case "south":
				if (gamePlayer.yPOS > this.southDist) {
					this.southDist -= 10;
					this.northDist += 10;
					this.gamePlayer.yPOS -= 10;
					return "You moved 10 meters south";
				} else {
					return "There is a fog wall ahead too dangerous to enter";
				}

			case "West":
			case "west":
				if (gamePlayer.xPOS > this.westDist) {
					this.westDist -= 10;
					this.eastDist += 10;
					this.gamePlayer.xPOS -= 10;
					return "You moved 10 meters west";
				} else {
					return "There is a fog wall ahead too dangerous to enter";
				}

			case "East":
			case "east":
				if (gamePlayer.xPOS < this.eastDist) {
					this.eastDist -= 10;
					this.westDist += 10;
					this.gamePlayer.xPOS += 10;
					return "You moved 10 meters east";
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

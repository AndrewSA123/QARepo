package com.qa.Battleships;

public class Runner {


	public static void main(String[] args) {
		PlayBoard board = new PlayBoard(10, 10);
		board.play();
		board.disableButton();


	}

}

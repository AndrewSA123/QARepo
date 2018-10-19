package com.qa.Battleships;

import java.awt.event.ActionEvent;

public class GameManager {

	PlayBoard pb = new PlayBoard();

	public GameManager() {

	}

	public void action(ActionEvent a) {

		pb.disableButton(a);

	}
}

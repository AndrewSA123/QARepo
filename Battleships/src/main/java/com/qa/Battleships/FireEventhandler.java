package com.qa.Battleships;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FireEventhandler implements ActionListener {

	GameManager gm = new GameManager();

	public void actionPerformed(ActionEvent e) {


		System.out.println(e.getActionCommand());

	}

}

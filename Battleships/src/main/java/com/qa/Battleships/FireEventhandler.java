package com.qa.Battleships;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FireEventhandler implements ActionListener {


	public void actionPerformed(ActionEvent e) {
		PlayBoard pb = new PlayBoard();
		System.out.println(e.getActionCommand());
		pb.disableButton(e);

	}

}

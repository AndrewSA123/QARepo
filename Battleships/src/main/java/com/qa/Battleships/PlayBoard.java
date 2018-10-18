package com.qa.Battleships;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PlayBoard {

	int width;
	int length;
	JFrame frame = new JFrame("BattleShips!");
	String[] letters = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
			"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
	int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
			25, 26 };

	FireEventhandler fireEvent = new FireEventhandler();

	public PlayBoard(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public void play() {

		frame.setLayout(new GridLayout(this.width, this.length));
		JButton[][] grid = new JButton[width][length];

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < length; y++) {
				grid[x][y] = new JButton();
				grid[x][y].addActionListener(fireEvent);
				grid[x][y].setText(letters[x] + numbers[y]);

				frame.add(grid[x][y]);

			}

		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
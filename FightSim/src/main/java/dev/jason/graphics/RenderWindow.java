package dev.jason.graphics;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class RenderWindow extends JFrame {

	Screen s;

	RenderWindow() {
		this.setTitle("Fighter Sim");
		this.setSize(472*2, 243*2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.init();
	}

	public void init() {
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(1, 1, 0, 0));
		s = new Screen();
		this.add(s);
		this.setVisible(true);
	}

}

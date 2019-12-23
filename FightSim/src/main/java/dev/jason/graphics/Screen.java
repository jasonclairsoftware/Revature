package dev.jason.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Screen extends JPanel {
	
	private BufferedImage background;
	private BufferedImage dwarf;
	
	public Screen() {
		
		try {
			background = ImageIO.read(getClass().getResourceAsStream("/battlefield.jpg"));
			dwarf = ImageIO.read(getClass().getResourceAsStream("/dwarf.png"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		this.repaint();
	}
	
	public void paint(Graphics g) {
//		draw colors and rectangles
//		g.setColor(Color.GREEN);
//		g.drawRect(50, 50, 200, 200);
//		g.setColor(new Color(250,150,10));
//		g.fillRect(100, 100, 25, 25);
		
		//Draw strings onto the frame
//		g.setFont(new Font("Courier New", Font.BOLD,28));
//		g.setColor(Color.MAGENTA);
//		g.drawString("Thing", 50, 50);
		
		// Draw Ovals to the screen
//		g.setColor(Color.MAGENTA);
//		g.drawOval(50, 50, 100, 100);
//		g.setColor(Color.DARK_GRAY);
//		g.fillOval(150, 150, 50, 100);
		
		// Draw lines to the screen
//		g.setColor(Color.PINK);
//		g.drawLine(10, 10, 100, 100);
		g.drawImage(background, 0,0,background.getWidth()*2,background.getHeight()*2,null);
		g.drawImage(dwarf, 150, 300, (int)(dwarf.getWidth()*0.5),(int)(dwarf.getHeight()*0.5),null);
		g.drawImage(dwarf, 500, 125, (int)(dwarf.getWidth()*0.5),(int)(dwarf.getHeight()*0.5),null);
		g.drawImage(dwarf, 620, 175, (int)(dwarf.getWidth()*0.5),(int)(dwarf.getHeight()*0.5),null);
		g.drawImage(dwarf, 520, 260, (int)(dwarf.getWidth()*0.5),(int)(dwarf.getHeight()*0.5),null);
		
		g.setColor(Color.BLACK);
		g.fillRect(230, 350, 430, 80);
		g.setColor(Color.WHITE);
		g.drawRect(232, 352, 425, 75);
		
	}

}

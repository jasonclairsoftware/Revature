package dev.jason.App;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Screen extends JPanel {

	public List<Warrior> warriors;
	BufferedImage background;
	String message;

	public Screen(List<Warrior> warriors) {
		this.warriors = warriors;
		try {
			background = ImageIO.read(getClass().getResourceAsStream("/battlefield.jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.repaint();
	}

	public void Update(String message) {
		this.message = message;
		this.repaint();
	
	}
	
	public void paint(Graphics g) {

		// Print background
		g.drawImage(background, 0, 0, background.getWidth() * 2, background.getHeight() * 2, null);
		
		// Print sprites

		for (int i = 0; i < warriors.size(); i++) {
			g.drawImage(warriors.get(i).getSpriteSheet(), 
					warriors.get(i).getPx(), 
					warriors.get(i).getPy(),
					warriors.get(i).getEx(), 
					warriors.get(i).getEy(), 
					(warriors.get(i).getSpriteSheet().getWidth()/warriors.get(i).getTotSprites())*(warriors.get(i).getAniState()-1), 
					0,
					(warriors.get(i).getSpriteSheet().getWidth() / warriors.get(i).getTotSprites()) * warriors.get(i).getAniState(),
					warriors.get(i).getSpriteSheet().getHeight(), null);
		}

		// Print txtbox
		g.setColor(Color.BLACK);
		g.fillRect(150, 350, 600, 80);
		g.setColor(Color.WHITE);
		g.drawRect(152, 352, 596, 75);

		// TODO:: Print Text

		g.setColor(Color.YELLOW);
		g.setFont(new Font("Courier New", Font.BOLD, 20));
		g.drawString(this.message, 155, 370);
	}

}

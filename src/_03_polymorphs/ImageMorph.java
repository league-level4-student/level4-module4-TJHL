package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{

	private int width = 50;
	private int height = 50;
	private BufferedImage image;
	
	ImageMorph(int x, int y) {
		super(x, y);
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("missingTexture.jpeg"));
		} catch(Exception d) {
			
		}
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(image, getX(), getY(), width, height, null);
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;	
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;	
	}
}
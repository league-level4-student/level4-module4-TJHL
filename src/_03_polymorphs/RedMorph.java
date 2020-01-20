package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class RedMorph extends Polymorph{

	private int width = 50;
	private int height = 50;
	
	RedMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(getX(), getY(), width, height);
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
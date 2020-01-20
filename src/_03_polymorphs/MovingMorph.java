package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	private int width = 50;
	private int height = 50;
	
	MovingMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), width, height);
		setX(getX()+5);
		setY(getY()+5);
		if(getX()>500) {
			setX(0);
			setY(0);
		}
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
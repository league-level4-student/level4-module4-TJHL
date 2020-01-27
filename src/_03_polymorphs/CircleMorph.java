package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{

	private int width = 50;
	private int height = 50;
	private double unitCircle = 0;
	private int originalX = getX();
	private int originalY = getY();
	
	CircleMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(getX(), getY(), width, height);
		
		
		setX((int)(originalX+50*Math.cos(unitCircle)));
		setY((int)(originalY+50*Math.sin(unitCircle)));
		
		unitCircle = unitCircle +0.1;
		if(unitCircle >= 360) {
			unitCircle = 0;
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
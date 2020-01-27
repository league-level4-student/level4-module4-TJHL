package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseMorph extends Polymorph implements MouseMotionListener {

	private int width = 50;
	private int height = 50;
	private int mouseX = 0;
	private int mouseY = 0;
	
	MouseMorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), width, height);
		setX(mouseX);
		setY(mouseY);

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

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		System.out.println(mouseX);
	}

}
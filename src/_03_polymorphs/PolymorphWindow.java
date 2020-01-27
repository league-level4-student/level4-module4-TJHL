package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> displayed = new ArrayList<Polymorph>();
    
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movingPoly;
    Polymorph circlePoly;
    Polymorph mousePoly;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 
   	 bluePoly = new BluePolymorph(50, 50);
   	 redPoly = new RedMorph(150, 50);
   	 movingPoly = new MovingMorph(0,0);
   	 circlePoly = new CircleMorph(250,250);
   	 mousePoly = new MouseMorph(250,250);
   	 
   	displayed.add(bluePoly);
   	displayed.add(redPoly);
   	displayed.add(movingPoly);
   	displayed.add(circlePoly);
   	displayed.add(mousePoly);
   	 
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (int i = 0; i<displayed.size();i++) {
   		 displayed.get(i).draw(g);
   	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	repaint();
    	for (int i = 0; i<displayed.size();i++) {
    		displayed.get(i).update();
    	}
    }
}

package Raycasting;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Canvas extends JPanel{
	private List<Boundary> boundaries;
	private List<Ray> rays;
	private JFrame frame;
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK); //Draw Background
		g.fillRect(0,0,frame.getWidth(), frame.getHeight());
		
		for(Boundary b: boundaries) //Draw all boundaries
		{
			g.setColor(b.lineColor);
			g.drawLine((int)b.ptA.getX(), (int)b.ptA.getY(), (int)b.ptB.getX(), (int)b.ptB.getY());
		}
		
		for(Ray r: rays) //Draw all rays
		{
			g.setColor(Color.WHITE);
			g.drawLine((int)r.tail.getX(), (int)r.tail.getY(), (int)r.head.getX(), (int)r.head.getY());
			g.drawLine((int)r.tail.getX(), (int)r.tail.getY(), -1*(int)r.head.getX(), -1*(int)r.head.getY());
		}
	}
	
	public Canvas(List<Boundary> b, List<Ray> r)
	{
		boundaries = b;
		rays = r;
	}
	
	public static void main(String[] args) //Setup goes here, may change this later.
	{
		List<Boundary> lines = new ArrayList<>();
		lines.add(new Boundary(300, 100, 300, 300));
		
		int originX = 250;
		int originY = 250;
		
		List<Ray> rays = new ArrayList<>();
		for(int i = 0; i < 180; i+=5)
		{
			rays.add(new Ray(originX, originY, i));
		}
		
		new Canvas(lines, rays).go();
	}
	
	public void go()
	{
		frame = new JFrame("Raycasting!");
		frame.add(this);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
	}
	
}

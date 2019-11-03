package Raycasting;

import java.awt.Point;

public class Ray {
	public double degInRads;
	public Point head;
	public Point tail;
	
	public Ray(int t1, int t2, double deg)
	{
		degInRads = Math.toRadians(deg);
		tail = new Point(t1, t2);
		head = new Point((int)(2000*Math.cos(degInRads)), (int)(2000*Math.sin(degInRads))); //Pseudo infinite vector in one direction
	}
}

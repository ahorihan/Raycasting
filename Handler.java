package Raycasting;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
//import javax.swing.JPanel;

public class Handler implements MouseMotionListener{
	
	private Canvas canvas;

	public Handler(Canvas c)
	{
		canvas = c;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {	
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		canvas.originX = e.getX();
		canvas.originY = e.getY();		
	}

}

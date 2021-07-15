package Pruebas4;
import java.awt.*;
import java.awt.event.*;

public class WithInnerClassDemo extends Frame {
	private static final long serialVersionUID = -5693389658807700440L;
	String msg = "";
	
	public WithInnerClassDemo() {
		addMouseListener(new MyMouseAdapter());
		addWindowListener(new MyWindowAdapter());
	}
	
	class MyMouseAdapter extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			msg = "Mouse clicked";
			repaint();
		}
		
		public void mouseDragged(MouseEvent e) {
			msg = "Mouse dragged";
			repaint();
		}
	}
	class MyWindowAdapter extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		WithouthInnerClassDemo appwin = new WithouthInnerClassDemo();
		
		appwin.setSize(new Dimension(200, 150));
		appwin.setTitle("MousePressedDemo With Inner Class");
		appwin.setVisible(true);
	}
}

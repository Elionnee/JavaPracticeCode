package Pruebas4;
import java.awt.*;

public class WithouthInnerClassDemo extends Frame {
	private static final long serialVersionUID = -8529981577119315247L;
	String msg ="";
	
	public WithouthInnerClassDemo() {
		addMouseListener(new AdapterClasses_MouseListener_MyMouseAdapter(this));
		addMouseMotionListener(new AdapterClasses_MouseListener_MyMouseAdapter(this));
		addWindowListener(new MouseEvents_WindowListener_MyWindowAdapter());
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, 20, 100);
	}
	
	public static void main(String[] args) {
		WithouthInnerClassDemo appwin = new WithouthInnerClassDemo();
		
		appwin.setSize(new Dimension(200, 150));
		appwin.setTitle("MousePressedDemo Withouth Inner Class");
		appwin.setVisible(true);
	}
}
package Pruebas4;
import java.awt.*;

public class AdapterClassesDemo extends Frame {
	private static final long serialVersionUID = 3981606907976117050L;
	String msg = "";
	
	public AdapterClassesDemo() {
		addMouseListener(new AdapterClasses_MouseListener_MyMouseAdapter(this));
		addMouseMotionListener(new AdapterClasses_MouseListener_MyMouseAdapter(this));
		addWindowListener(new MouseEvents_WindowListener_MyWindowAdapter());
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, 20, 80);
	}
	
	public static void main(String[] args) {
		AdapterClassesDemo appwin = new AdapterClassesDemo();
		
		appwin.setSize(new Dimension(200, 500));
		appwin.setTitle("AdapterDemo");
		appwin.setVisible(true);
	}
}

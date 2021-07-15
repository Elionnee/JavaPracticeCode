package Pruebas4;
import java.awt.*;
import java.awt.event.*;

// Si no extiende de Frame no puedo crear los metodos de addMouseListener y addWindowListener 
// sin declararlos.
public class WithAnonymousInnerClassDemo extends Frame {
	private static final long serialVersionUID = 2900478251631884987L;
	String msg = "";
	
	public WithAnonymousInnerClassDemo() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				msg = "Mouse clicked";
				repaint();
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, 20, 80);
	}
	
	public static void main(String[] args) {
		WithAnonymousInnerClassDemo appwin =  new WithAnonymousInnerClassDemo();
		
		appwin.setSize(new Dimension(200, 150));
		appwin.setTitle("MousePressedDemo With Anonymous Inner Class");
		appwin.setVisible(true);
	}
}

package Pruebas4;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class LoadImageDemo extends Frame {
	private static final long serialVersionUID = 8600071814786673994L;
	Image img;
	
	public LoadImageDemo() {
		try {
			File file = new File("MemoriesOfDust.jpg");
			img = ImageIO.read(file);
		} catch(IOException e) {
			System.out.println("Cannot load file.");
			System.exit(0);
		}
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, getInsets().left, getInsets().top, null);
	}
	
	public static void main(String[] args) {
		LoadImageDemo appwin = new LoadImageDemo();
		
		appwin.setSize(new Dimension(1000, 700));
		appwin.setTitle("Memories of Dust.jpg");
		appwin.setVisible(true);
	}
}

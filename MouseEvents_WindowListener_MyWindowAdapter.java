package Pruebas4;

import java.awt.event.*;

public class MouseEvents_WindowListener_MyWindowAdapter extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
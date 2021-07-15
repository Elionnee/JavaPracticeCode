package Pruebas4;

import java.awt.event.*;

public class AdapterClasses_MouseListener_MyMouseAdapter extends MouseAdapter {
	AdapterClassesDemo adapterD = null;

	WithouthInnerClassDemo withouthIC = null;
	
	public AdapterClasses_MouseListener_MyMouseAdapter(AdapterClassesDemo adapterD) {
		this.adapterD = adapterD;
	}
	
	public AdapterClasses_MouseListener_MyMouseAdapter(WithouthInnerClassDemo withouthIC) {
		this.withouthIC = withouthIC;
	}

	public void mouseClicked(MouseEvent e) {
		if(adapterD !=  null) {
			adapterD.msg = "Mouse clicked";
			adapterD.repaint();
		} else if(withouthIC != null) {
			withouthIC.msg = "Mouse clicked";
			withouthIC.repaint();
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		if(adapterD !=  null) {
			adapterD.msg = "Mouse dragged";
			adapterD.repaint();
		} else if(withouthIC != null) {
			withouthIC.msg = "Mouse dragged";
			withouthIC.repaint();
		}
	}
}

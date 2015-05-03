package batlab.ui.controls.scope;

import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class ArrowLabel extends Canvas {
	private int arrowColor;
	private int textColor;
	private String text;
	
	public ArrowLabel(Composite parent, int style) {
		super(parent, style);
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				ArrowLabel.this.paintControl(e);
			}
		});
	}

	public int getArrowColor() {
		return arrowColor;
	}

	public void setArrowColor(int arrowColor) {
		this.arrowColor = arrowColor;
	}

	public int getTextColor() {
		return textColor;
	}

	public void setTextColor(int textColor) {
		this.textColor = textColor;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	protected void paintControl(PaintEvent e) {
		Rectangle client = getClientArea();
		e.gc.drawRectangle(client.x, client.y, client.width, client.height);
	}

}

package packege;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;

public class opticalIllusion {

	JFrame frame = new JFrame();
	double border = 3;
	double boxSize = 4;
	double boxes = 6;
	double boxSpacing = 1;
	BufferedImage image = new BufferedImage((int) getWindowWidth(border,
			boxSize, boxes, boxSpacing), (int) getWindowWidth(border, boxSize,
			boxes, boxSpacing), BufferedImage.TYPE_INT_ARGB);

	public static void main(String[] args) {
		opticalIllusion ol = new opticalIllusion();
		ol.makeWindow();
	}

	private void makeWindow() {

		Graphics2D boxGraphic = image.createGraphics();
		boxGraphic.setPaint(Color.BLACK);
		boxGraphic = fillBoxes(boxGraphic, border, boxSize, boxes, boxSpacing);
		ImageIcon icon = new ImageIcon(image);
		JLabel boxLabel = new JLabel(icon);
		frame.setContentPane(boxLabel);
		frame.pack();
		frame.requestFocusInWindow();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	private Graphics2D fillBoxes(Graphics2D boxGraphic, double border,
			double boxSize, double boxes, double boxSpacing) {
		for (int i = 0; i < boxes; i++) {
			for (int j = 0; j < boxes; j++) {
				boxGraphic.fill(new Rectangle2D.Double(border + i * boxSize + (i * boxSpacing),
						border + j * boxSize + (j * boxSpacing), boxSize, boxSize));
			}
		}
		return null;
	}

	private double getWindowWidth(double border, double boxSize, double boxes,
			double boxSpacing) {

		return (2 * border) + (boxSize * boxes) + (boxSpacing * (boxes - 1));

	}
}

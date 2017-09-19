package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class Rabisco extends JComponent implements MouseListener, MouseMotionListener {
	private ArrayList<Point> pontos;
	private int tamanho = 8;
	private int metade = tamanho / 2;
	private Color cor;
	private Color corTemp;

	public Rabisco(Color cor) {
		this.cor = cor;
		pontos = new ArrayList<Point>(1024);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(cor);
		for (Point ponto : pontos) {
			g2d.fillOval(ponto.x - metade, ponto.y - metade, tamanho, tamanho);
		}
	}

	public void mouseDragged(MouseEvent e) {
		pontos.add(e.getPoint());
		repaint();
	}

	public void mousePressed(MouseEvent e) {
		if (e.getButton() == 1) {
			pontos.add(e.getPoint());
			repaint();
		}
		if (e.getButton() == 3) {
			pontos.remove(e.getPoint());
			repaint();
		}
		if (e.getButton() == 2) {
			pontos.clear();
			repaint();
		}
	}

	public void mouseMoved(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == 3) {
			if(cor == Color.white) {
				cor = corTemp;
			}
			else {
				corTemp = cor;
				cor = Color.white;
			}
		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}
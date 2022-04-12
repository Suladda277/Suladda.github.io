package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import character.Dragon;

public class Eva extends JPanel implements KeyListener{
	Dragon d = new Dragon(50, 300, 50);
	public Eva(){
		addKeyListener(this);
		setFocusable(true);
	}
	
	public void play() {
			d.jump();
	}

	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 =(Graphics2D) g;
		g2.setColor(Color.blue);
		g2.drawRect(d.x,d.y,d.dragonSize,d.dragonSize);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.print(e.getKeyCode())  ;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

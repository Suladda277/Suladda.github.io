package game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import character.Dragon;
import character.Wave;
import event.Event;

public class Game extends JPanel implements KeyListener{
	int gameSeed = 30;
	long lastPress =0;
	Dragon dragon = new Dragon(50,300,50,100);
	Wave[] waveSet = makeWaveSet(4);
	//Wave wave = new Wave(800,300,30,40,30,this);
	//private int waveNumber;
	//private Wave[] waveSet;
	
	public Game() {
		this.setBounds(0,0,1000,600);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.setLayout(null);
	}
	
	public void paint(Graphics g) { 
		super.paint(g);
		Graphics2D g2 =(Graphics2D) g;
		g2.setColor(Color.blue);
		g2.drawRect(dragon.x,dragon.y,dragon.dragonSize,dragon.dragonSize);
		g2.drawString(dragon.health +"%",40, 40);
		g2.setColor(Color.black);
		//g2.drawRect(wave.x, wave.y, wave.width, wave.height);
		for(Wave wave : waveSet){
			g2.drawRect(wave.x, wave.y, wave.width, wave.height);
			if(Event.checkHit(dragon, wave)) {
				g2.setStroke(new BasicStroke(10.0f));
				g2.setColor(Color.red);
				g2.drawRect(0, 0, 1000, 900);
				dragon.health -=1;
		}}
	
	}
	
	private Wave[] makeWaveSet(int waveNumber) {
		Wave[] waveSet = new Wave[waveNumber];
		for(int i=0;i<waveNumber;i++) {
			double waveLocation = 1000+Math.floor(Math.random()*1000);
			waveSet[i] = new Wave((int)waveLocation,300,30,40,30,this);
		}
		return waveSet;
		
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(System.currentTimeMillis()-lastPress>600) {
			System.out.println(e.getKeyCode())  ;
			if(e.getKeyCode()== 38 || e.getKeyCode() == 32) {
				dragon.jump(this);
				this.repaint();
		}
		 lastPress = System.currentTimeMillis();		}
		
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

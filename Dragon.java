package character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Dragon {
	public int x,y,dragonSize,health;
	public int jumpHigh = 100;
	
	public Dragon(int x,int y, int dragonSize,int health) {
		this.x = x;
		this.y = y;
		this.dragonSize = dragonSize;
		this.health = health;
	}
	public void jump(JPanel game) {
		this.y -= jumpHigh;
		game.repaint();
		Timer timer = new Timer(450, new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				y+= jumpHigh;
				game.repaint();
			}	
		});
		timer.setRepeats(false);
		timer.start();
	}
	

}

package game;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JFrame{
	public Display() {
		super("my game");
		this.setSize(1000,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300, 200);
		this.setVisible(true);
		this.getContentPane().setLayout(null);
		this.getContentPane().add(new Game());
		this.pack();
	}
	public static void main(String args[]) {
		Display display = new Display();
		System.out.println("welcome");
		

}
}

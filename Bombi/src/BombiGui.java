import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JComponent;


public class BombiGui extends JComponent{

	BombermanLevel bLevel;
	private static final int WIDTH = 840;
	private static final int HEIGHT = 600;
	
	public BombiGui(){
		bLevel = new BombermanLevel(WIDTH,HEIGHT);}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		bLevel.draw(g);}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Fenster erstellen
		JFrame frame = new JFrame();
		frame.add(new BombiGui());
		frame.setTitle("Bombi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);}

}

package bombi;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JComponent;


public class BombiGui extends JComponent {

	BombermanLevel bLevel;
	private static final int WIDTH = 840;
	private static final int HEIGHT = 600;
	private Image dbImage;
	private Graphics dbg;
	int x=0;
	int y=0;
	int radius=15;
	
	/**
	 * Input für Tasten und Begegung des Objektes
	 * mit den Pfeiltasten.
	 */
		public class AL extends KeyAdapter {
		public void keyPressed(KeyEvent e){
			int keyCode = e.getKeyCode();
			if(keyCode == e.VK_RIGHT) {
				x=x+15;
			}
			if(keyCode == e.VK_LEFT) {
				x=x-15;
			}
			if(keyCode == e.VK_UP) {
				y=y-15;
			}
			if(keyCode == e.VK_DOWN) {
				y=y+15;
			}
	     }
		public void keyReleased(KeyEvent e){
			
		}
	}
	
	public BombiGui(){
		super();   
		setFocusable(true);
	    this.setSize(WIDTH,HEIGHT);
		bLevel = new BombermanLevel(WIDTH,HEIGHT);
	    addKeyListener(new AL()); 
	    }
	/**
	 * Double Buffering wobei ein Image erstellt wird und im Hintergrund
	 * das nächste Bild gemalt wird.
	 */
	public void paint(Graphics g){
		dbImage = createImage(getWidth(), getHeight());
		dbg = dbImage.getGraphics();
		paintComponent(dbg);
		g.drawImage(dbImage, 0, 0, this);
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		bLevel.draw(g);
		//Eine kleine rote Kugel die zum testen der
		//Bewegung und des Double Bufferings gedacht ist
		g.setColor(Color.RED);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
		repaint();
	}
	
	/**
	 * Methode, welche die bevorzugte Größe dieser JComponent
	 * zurück gibt.
	 * @return: Dimension WIDTH x HEIGHT, welche fest codiert sind.
	 */
	@Override
	public Dimension getPreferredSize(){
	    return new Dimension(WIDTH,HEIGHT);}
	
	/**
	 * Startet das Programm ;-)
	 * @param args: Bisher werden alle Parameter ignoriert.
	 */
	public static void main(String[] args){
		//Fenster erstellen
		JFrame frame = new JFrame();
		frame.setTitle("Bombi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//BorderLayout hilft beim automatischen Anpassen der Größe
		frame.setLayout(new BorderLayout());		
		frame.add(new BombiGui(),BorderLayout.CENTER);
		frame.pack(); //passt die Größe dem Inhalt an
		
		//zentriert das Fenster
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);}
	}

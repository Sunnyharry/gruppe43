package bombi;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Einstellungen extends JFrame{

	public static void main(String[] args){
		new Einstellungen();
	}
	
		FlowLayout layout = new FlowLayout();
		
		public Einstellungen(){
		super("Bomberman");
		setLayout(layout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new BackGroundPane("img/Bomberman.png"));
		
		setLocationRelativeTo(null);
		setVisible(true);
		setSize(900,700);
		setLayout(null);
		
		
		JButton button1 = new JButton("Lautstärke");
	    button1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	                
	            }
	        });
	    
		JButton button2 = new JButton("Steurung");
	    button2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	                
	            }
	        });
		
		JButton button3 = new JButton("Schwierigkeitsgrad");
	    button3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	                
	            }
	        });
		
        JButton button4 = new JButton("Zurück");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        setVisible(true);
        
        Insets insets = getInsets();
        Dimension size = button1.getPreferredSize();
        button1.setBounds(360+ insets.left, 280 + insets.top,
        		size.width+30,size.height+5);
        button2.setBounds(360+ insets.left, 315 + insets.top,
        		size.width+30,size.height+5);
        button3.setBounds(360+ insets.left, 350 + insets.top,
        		size.width+30,size.height+5);
        button4.setBounds(360+ insets.left, 385 + insets.top,
        		size.width+30,size.height+5);
		
	}
		
	    class BackGroundPane extends JPanel{
	    	Image img = null;
	    	
			
			BackGroundPane(String imagefile) {
	    		if (imagefile != null) {
	    			MediaTracker mt = new MediaTracker(this);
	    			img = Toolkit.getDefaultToolkit().getImage(imagefile);
	    			mt.addImage(img, 0);
	    			try{
	    				mt.waitForAll();
	    			} catch (InterruptedException e) {
	    				e.printStackTrace();
	    			}
	    		}
	    	}
	    	protected void paintComponent(Graphics g){
	    		super.paintComponent(g);
	    		g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
	    	}
	        
	    }
}

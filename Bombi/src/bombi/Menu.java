package bombi;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Menu extends JFrame{
    
    public static void main(String[] args){
        new Menu();
    }
 
    //Konstruktor
    public Menu(){
        super("Name");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(createMenuPanel());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(250,250);
    }
 
    private JPanel createMenuPanel() {
        JPanel panel = new JPanel(new GridLayout(4 , 1));
        
        JButton start = new JButton("Einzelspieler");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //start das Spiel
            }
        });
        
        JButton button1 = new JButton("Mehrspieler");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        JButton button2 = new JButton("Einstellungen");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
 
        panel.add(start);
        panel.add(button1);
        panel.add(button2);
        panel.add(close);
        return panel;
    }
}
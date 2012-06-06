package bombi;

import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Einstellungen {

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Grid Layout");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250,200);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1));
		JButton label1 = new JButton("Schwierigkeitsgrad");
		JButton label2 = new JButton("Sound");
		JButton label3 = new JButton("Tastatur");
        JButton label4 = new JButton("Zurück");
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		frame.add(panel);
		
	}
}

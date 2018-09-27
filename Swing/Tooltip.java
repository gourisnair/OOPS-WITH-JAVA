import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tooltip extends JFrame {
	private Toolkit toolkit;
	
	public Tooltip() {
		setTitle("Tooltip");
		setSize(300, 200);
		
		toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation((size.width - getWidth())/2, (size.height -
				getHeight())/2);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		
		panel.setLayout(null);
		
		panel.setToolTipText("A Panel Container");
		
		JButton button = new JButton();
		button.setBounds(100, 60, 80, 30);
		button.setToolTipText("A button Component");
		
		panel.add(button);
	}
	
	public static void main(String[] args) {
		Tooltip tooltip = new Tooltip();
		tooltip.setVisible(true);
		}
}

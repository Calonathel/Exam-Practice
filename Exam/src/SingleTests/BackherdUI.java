package SingleTests;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class BackherdUI extends JFrame {

	public BackherdUI() {
		// initialize main frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Backherd");
		setVisible(true);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// create GUI components
		// Label at the top
		JPanel textpanel = new JPanel();
		textpanel.setLayout(new FlowLayout());
		JTextField text = new JTextField("27:00");
		text.setLayout(new FlowLayout(FlowLayout.CENTER));
		textpanel.add(text);
		
		
		// Panel for the buttons
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		// Buttons
		JButton bs = new JButton("<");
		panel.add(bs);
		JButton bss = new JButton("<<");
		panel.add(bss);
		JButton breset = new JButton("reset time");
		panel.add(breset);
		JButton bg = new JButton(">");
		panel.add(bg);
		JButton bgg = new JButton(">>");
		panel.add(bgg);
		
		// add everything
		this.add(textpanel, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		
		// standard
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BackherdUI();
	}
	
}

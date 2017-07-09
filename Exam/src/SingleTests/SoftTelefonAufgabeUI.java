package SingleTests;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class SoftTelefonAufgabeUI extends JFrame implements ActionListener {

	private String textStr = " ";
	
	private JLabel text;
	
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton bD;
	private JButton b0;
	private JButton bC;
	
	
	public SoftTelefonAufgabeUI () {
		// initialize main frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("");
		setVisible(true);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Create GUI components
		// Panel that groups everything
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		// Label at the top
		text = new JLabel();
		text.setText(textStr);
		text.setLayout(new BorderLayout());
		
		// Buttons
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(4,3));
				
		b1 = new JButton("1");
		buttons.add(b1);
		b1.setActionCommand("AC_B1");
		b1.addActionListener(this);
		b2 = new JButton("2");
		buttons.add(b2);
		b2.setActionCommand("B2");
		b2.addActionListener(this);
		b3 = new JButton("3");
		buttons.add(b3);
		b3.setActionCommand("B3");
		b3.addActionListener(this);
		b4 = new JButton("4");
		buttons.add(b4);
		b4.setActionCommand("B4");
		b4.addActionListener(this);
		b5 = new JButton("5");
		buttons.add(b5);
		b5.setActionCommand("B5");
		b5.addActionListener(this);
		b6 = new JButton("6");
		buttons.add(b6);
		b6.setActionCommand("B6");
		b6.addActionListener(this);
		b7 = new JButton("7");
		buttons.add(b7);
		b7.setActionCommand("B7");
		b7.addActionListener(this);
		b8 = new JButton("8");
		buttons.add(b8);
		b8.setActionCommand("B8");
		b8.addActionListener(this);
		b9 = new JButton("9");
		buttons.add(b9);
		b9.setActionCommand("B9");
		b9.addActionListener(this);
		bD = new JButton("D");
		buttons.add(bD);
		bD.setActionCommand("AC_BD");
		bD.addActionListener(this);
		b0 = new JButton("0");
		buttons.add(b0);
		b0.setActionCommand("B0");
		b0.addActionListener(this);
		bC = new JButton("C");
		buttons.add(bC);
		bC.setActionCommand("AC_BC");
		bC.addActionListener(this);
		

		// add things
		panel.add(text, BorderLayout.NORTH);
		panel.add(buttons, BorderLayout.SOUTH);
		this.add(panel, BorderLayout.CENTER);
		
		// standard
		this.pack();
		this.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		String cmd = ae.getActionCommand();
		
		switch(cmd) {
		case "AC_B1": {
			text.setText(text.getText() + "1");
			break;
		}
		case "AC_BC": {
			text.setText(text.getText() + "...");
			b1.setEnabled(false);
			b2.setEnabled(false);
			break;
		}
		case "AC_BD": {
			text.setText("");
			b1.setEnabled(true);
			b2.setEnabled(true);
			break;
		}
		default:
			break;
		}
	}
	
	public static void main (String[] args) {
		new SoftTelefonAufgabeUI();
	}

}

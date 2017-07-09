package SingleTests;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class InputFrame extends JFrame {

  public InputFrame() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Persönliche Daten");
    setSize(430, 295);
    setVisible(true);

    JPanel panel = new JPanel();
    panel.setLayout(null);
    add(panel);

    JLabel nameLabel = new JLabel("Name:");
    panel.add(nameLabel);
    nameLabel.setBounds(20, 20, 100, 20); 

    JTextField nameText = new JTextField();
    panel.add(nameText);
    nameText.setBounds(150, 18, 240, 24);

    JLabel vornameLabel = new JLabel("Vorname:");
    panel.add(vornameLabel);
    vornameLabel.setBounds(20, 50, 100, 20); 

    JTextField vornameText = new JTextField();
    panel.add(vornameText);
    vornameText.setBounds(150, 48, 240, 24);

    JLabel genderLabel = new JLabel("Geschlecht:");
    panel.add(genderLabel);
    genderLabel.setBounds(20, 90, 100, 20); 

    JRadioButton femaleRadio = new JRadioButton();
    panel.add(femaleRadio);
    femaleRadio.setBounds(150, 90, 100, 20);
    femaleRadio.setText("weiblich");

    JRadioButton maleRadio = new JRadioButton();
    panel.add(maleRadio);
    maleRadio.setBounds(150, 120, 100, 20);
    maleRadio.setText("männlich");
    
    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(femaleRadio);
    genderGroup.add(maleRadio);

    JLabel natLabel = new JLabel("Staatsangehörigkeit:");
    panel.add(natLabel);
    natLabel.setBounds(20, 160, 150, 20); 

    JComboBox<String> natCombo = new JComboBox<String>();
    panel.add(natCombo);
    natCombo.setBounds(150, 158, 240, 24);
    natCombo.addItem("Bitte auswählen");
    natCombo.addItem("Chinesisch");
    natCombo.addItem("Deutsch");
    natCombo.addItem("Molwanisch");
    
    JButton okButton = new JButton("Ok");
    panel.add(okButton);
    okButton.setBounds(105, 210, 100, 30); 

    JButton cancelButton = new JButton("Cancel");
    panel.add(cancelButton);
    cancelButton.setBounds(225, 210, 100, 30); 
  }

  public static void main(String[] args) {
    InputFrame inputFrame = new InputFrame();
  }

}
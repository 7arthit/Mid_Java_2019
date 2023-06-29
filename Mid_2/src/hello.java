import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class hello implements ActionListener {
	JFrame frame = new JFrame("Show Text");
	JLabel label = new JLabel("What is your name?");
	JButton button = new JButton("OK");
	JTextField text = new JTextField();
	JLabel out = new JLabel();
	hello() {
		button.setBounds(0, 75, 300, 40);
		button.setFocusable(false);
		button.addActionListener((ActionListener) this);
		label.setBounds(0, 0, 300, 40);
		text.setBounds(0, 40, 300, 40);
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);// กลางจอ
		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.add(text);
		frame.add(button);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			@SuppressWarnings("unused")
			String text2 = text.getText();
			@SuppressWarnings("unused")
			show_text text1 = new show_text(text2);
		}
	}

}
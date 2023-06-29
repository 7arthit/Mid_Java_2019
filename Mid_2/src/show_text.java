import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class show_text implements WindowListener{
	JFrame frame1 = new JFrame("Show Text");
	JLabel label1 = new JLabel();
	public show_text(String text2) {
		label1.setLocation (0, 10);
		label1.setSize (120, 30);
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		label1.setFont(new Font(null, Font.BOLD, 20));
		label1.setText("Hello! "+text2);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);// กลางจอ
		frame1.setSize(300, 100);
		frame1.setLayout(null);
		frame1.setVisible(true);
		frame1.add(label1);
	}
	@Override
	public void windowOpened(WindowEvent e) {

	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
	
	}
	@Override
	public void windowIconified(WindowEvent e) {

	}
	@Override
	public void windowDeiconified(WindowEvent e) {

	}
	@Override
	public void windowActivated(WindowEvent e) {
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {

	}
}
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Atosize {
	public static void main(String[] args) {
		Myframe frame = new Myframe();
		frame.setVisible(true);
	}
}
class Myframe extends JFrame implements ActionListener{
	JFrame jFrame  = new JFrame();
	JPanel jPanel_1 = new JPanel();
	JPanel jPanel_2 = new JPanel();
	JLabel jLabel = new JLabel();
	JTextField jTextField =new JTextField();
	JButton jButton = new JButton("Draw");
	int row,column,amont;
	public Myframe() {
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		setLayout(null);
		jPanel_1.setLayout(new FlowLayout());
		jPanel_1.setBounds(0, 0, 300, 50);
		jPanel_1.setBackground(Color.yellow);
		jLabel.setText("Input size");
		jTextField.setColumns(5);
		jPanel_1.add(jLabel);
		jPanel_1.add(jTextField);
		jPanel_1.add(jButton);
		add(jPanel_1);
		jPanel_2 .setBounds(0,50 , 300, 150);
		jPanel_2 .setBackground(Color.white);
		add(jPanel_2 );}
	@Override
	public void actionPerformed(ActionEvent e) {
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String String = jTextField.getText();
				String[] size = String.split("*");
				row = Integer.parseInt(size[0]);
				column = Integer.parseInt(size[1]);
				jPanel_2 .setLayout(new GridLayout(row,column));	
				JButton[][] small_button=new  JButton[row][column];
				if (row <= 15 && column < 15) {		
				setSize(row*50+15,column*50+90);
				jPanel_2.removeAll();
				jPanel_2.setSize(row*50, 50);
				jPanel_2.setSize(row*50, column*50);	
				for (int i=0;i<row;i++) {
					for(int j=0;j<column;j++) {
						small_button[i][j].setSize(50,50);
						small_button[i][j] = new JButton();
						int r =(int)(Math.random()*255);
						int g =(int)(Math.random()*255);
						int b =(int)(Math.random()*255);
						small_button[i][j].setBackground(new Color(r,g,b));
						jPanel_2.add(small_button[i][j]);		
						}
					}	
				}
			}
		});
	}
		
}

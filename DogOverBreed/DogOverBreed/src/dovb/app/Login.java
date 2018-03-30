package dovb.app;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Login {

	private JFrame frame;
	private JTextField UserNameEntry;
	private JTextField PassEntry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel DOVB_Login_Logo = new JLabel("Dog Over Breed");
		DOVB_Login_Logo.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		DOVB_Login_Logo.setBounds(65, 6, 290, 45);
		frame.getContentPane().add(DOVB_Login_Logo);
		
		JLabel UserNameFld = new JLabel("User Name:");
		UserNameFld.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		UserNameFld.setBounds(50, 75, 95, 25);
		frame.getContentPane().add(UserNameFld);
		
		JLabel PassFld = new JLabel("Password:");
		PassFld.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		PassFld.setBounds(50, 128, 95, 25);
		frame.getContentPane().add(PassFld);
		
		UserNameEntry = new JTextField();
		UserNameEntry.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		UserNameEntry.setBounds(165, 75, 175, 26);
		frame.getContentPane().add(UserNameEntry);
		UserNameEntry.setColumns(10);
		
		PassEntry = new JTextField();
		PassEntry.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		PassEntry.setBounds(165, 128, 175, 26);
		frame.getContentPane().add(PassEntry);
		PassEntry.setColumns(10);
		
		JButton LoginBttn = new JButton("LOGIN");
		LoginBttn.setBounds(50, 190, 117, 29);
		frame.getContentPane().add(LoginBttn);
		
		JButton ClearnBttn = new JButton("CLEAR");
		ClearnBttn.setBounds(179, 190, 117, 29);
		frame.getContentPane().add(ClearnBttn);
		
		JButton ExitBttn = new JButton("EXIT");
		ExitBttn.setBounds(308, 190, 117, 29);
		frame.getContentPane().add(ExitBttn);
	}
}

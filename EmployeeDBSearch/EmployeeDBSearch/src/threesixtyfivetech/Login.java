package threesixtyfivetech;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUname;
	private JTextField txtLoginMsg;
	private JPasswordField txtUpass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Employee Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(95, 110, 80, 20);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(95, 145, 80, 20);
		contentPane.add(lblPassword);
		
		txtUname = new JTextField();
		txtUname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUname.setBounds(185, 110, 110, 20);
		contentPane.add(txtUname);
		txtUname.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				String dbUsername, dbUserpass;
				String url = "jdbc:mysql://127.0.0.1:3306/employee_schema";
				String user = "root";
				String pass = "AAAbbb444$";
				boolean login = false;
				
				try {
					//Get users input
					String uname = txtUname.getText();
					char[] upass = txtUpass.getPassword();
					
					//Database connection
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					
					
					Connection con = DriverManager.getConnection(url, user, pass);
					
					//SQL Query
					PreparedStatement st = con.prepareStatement("select * from employee_schema.emp_login where username=? and pass=?");
					st.setString(1, uname);
					st.setString(2, String.valueOf(txtUpass.getPassword()));
					
					//Execute Query
					ResultSet rs = st.executeQuery();
					
					if (rs.next()) {
						txtLoginMsg.setText("Login Successful!");
						txtLoginMsg.setForeground(Color.GREEN);
						
						//Close jdbc connection
						con.close();
						System.out.println("Connection close");
						
						//Close Login screen
						dispose();
						
						//Open Employee Search
						EmployeeSearch empSearch = new EmployeeSearch();
						empSearch.setVisible(true);
					} else {
						txtLoginMsg.setText("Invalid user name or password");
						txtLoginMsg.setForeground(Color.RED);
						txtUname.setText(null);
						txtUpass.setText(null);
					}
					} catch(InstantiationException e1) {
						System.out.println(e1);
					} catch (IllegalAccessException e2) {
						System.out.println(e2);
					} catch (ClassNotFoundException e3) {
						System.out.println(e3);
					} catch (SQLException e4) {
						System.out.println(e4);
					}
					return;
				}
			}
		);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.setBounds(95, 202, 80, 30);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(215, 202, 80, 30);
		contentPane.add(btnExit);
		
		JLabel lblEmployeeLogin = new JLabel("Employee Login");
		lblEmployeeLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmployeeLogin.setBounds(115, 30, 170, 45);
		contentPane.add(lblEmployeeLogin);
		
		txtLoginMsg = new JTextField();
		txtLoginMsg.setEditable(false);
		txtLoginMsg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtLoginMsg.setBounds(100, 70, 200, 25);
		contentPane.add(txtLoginMsg);
		txtLoginMsg.setColumns(10);
		
		txtUpass = new JPasswordField();
		txtUpass.setBounds(185, 145, 110, 20);
		contentPane.add(txtUpass);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtUname, txtUpass}));
	}
}

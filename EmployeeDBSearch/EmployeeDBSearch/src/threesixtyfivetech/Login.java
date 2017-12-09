package threesixtyfivetech;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
	private JTextField txtUpass;

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
		
		txtUpass = new JTextField();
		txtUpass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUpass.setBounds(185, 145, 110, 20);
		contentPane.add(txtUpass);
		txtUpass.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dbUsername, dbUserpass;
				boolean login = false;
				
				try {
					//Get users input
					String uname = txtUname.getText();
					String upass = txtUpass.getText();
					
					//Database connection
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					String url = "jdbc:mysql://127.0.0.1:3306/employee_schema";
					String user = "root";
					String pass = "AAAbbb444$";
					//"jdbc:mysql://127.0.0.1:3306/employee_schema", "root", "AAAbbb444$"
					Connection con = DriverManager.getConnection(url, user, pass);
					
					//SQL Query
					PreparedStatement st = con.prepareStatement("select * from employee_schema.emp_login where username=? and pass=?");
					st.setString(1, uname);
					st.setString(2, upass);
					
					//Execute Query
					ResultSet rs = st.executeQuery();
					
					while(rs.next()) {
						dbUsername = rs.getString(1);
						dbUserpass = rs.getString(2);
						
						if(dbUsername.equals(uname) && dbUserpass.equals(upass)) {
							//System.out.println("Login in Successful!");
							JOptionPane.showMessageDialog(null, "Login in Successful!");
							login = true;
						}
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
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtUname, txtUpass}));
	}
}

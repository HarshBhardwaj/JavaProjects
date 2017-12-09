/*
 * Description: This application searches for the employee in the Database and then returns there information.
 * Author: Harsh Bhardwaj
 */

package threesixtyfivetech;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class MainApp extends JFrame {

	private JPanel contentPane;
	private JTextField txtNameSearch;
	private JTextField txtFName;
	private JTextField txtLName;
	private JTextField txtUName;
	private JTextField txtEmail;
	private JTextField txtPass;
	private JTextField txtLocation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
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
	public MainApp() {
		setTitle("Employee Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee's Name:");
		lblEmployeeName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmployeeName.setBounds(10, 11, 115, 20);
		contentPane.add(lblEmployeeName);
		
		txtNameSearch = new JTextField();
		txtNameSearch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNameSearch.setBounds(129, 13, 100, 20);
		contentPane.add(txtNameSearch);
		txtNameSearch.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(10, 74, 75, 20);
		contentPane.add(lblFirstName);
		
		txtFName = new JTextField();
		txtFName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFName.setEditable(false);
		txtFName.setBounds(89, 76, 86, 20);
		contentPane.add(txtFName);
		txtFName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLastName.setBounds(10, 105, 75, 20);
		contentPane.add(lblLastName);
		
		txtLName = new JTextField();
		txtLName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLName.setEditable(false);
		txtLName.setBounds(89, 105, 86, 20);
		contentPane.add(txtLName);
		txtLName.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(10, 135, 75, 20);
		contentPane.add(lblUserName);
		
		txtUName = new JTextField();
		txtUName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUName.setEditable(false);
		txtUName.setBounds(89, 136, 86, 20);
		contentPane.add(txtUName);
		txtUName.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(200, 74, 40, 20);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmail.setBounds(245, 75, 145, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass:");
		lblPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPass.setBounds(200, 105, 40, 20);
		contentPane.add(lblPass);
		
		txtPass = new JTextField();
		txtPass.setEditable(false);
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPass.setBounds(245, 105, 145, 20);
		contentPane.add(txtPass);
		txtPass.setColumns(10);
		
		JLabel lblLocation = new JLabel("Location:");
		lblLocation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLocation.setBounds(200, 135, 60, 20);
		contentPane.add(lblLocation);
		
		txtLocation = new JTextField();
		txtLocation.setEditable(false);
		txtLocation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLocation.setBounds(270, 135, 120, 20);
		contentPane.add(txtLocation);
		txtLocation.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create DataBase Connection and fetch records
				
				try {
					//Get users input
					String uinput = txtNameSearch.getText();
					
					//Split the input text: first name and last name
					String[] parts = uinput.split(" ");
					String fName = parts[0];
					String lName = parts[1];
					
					//Database connection
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					String url = "jdbc:mysql://127.0.0.1:3306/employee_schema";
					String user = "root";
					String pass = "AAAbbb444$";
					//"jdbc:mysql://127.0.0.1:3306/employee_schema", "root", "AAAbbb444$"
					Connection con = DriverManager.getConnection(url, user, pass);
					
					//SQL query
					PreparedStatement st = con.prepareStatement("select * from employee_schema.emp where ufname=? and ulname=?");
					st.setString(1, fName);
					st.setString(2, lName);
					
					//Executing Query
					ResultSet rs = st.executeQuery();
					
					if (rs.next()) {
						String resout = rs.getString(1);
						String resout1 = rs.getString(2);
						String resout2 = rs.getString(3);
						String resout3 = rs.getString(4);
						String resout4 = rs.getString(5);
						String resout5 = rs.getString(6);
						
						//Set results in test fields
						txtFName.setText(resout);
						txtLName.setText(resout1);
						txtUName.setText(resout2);
						txtEmail.setText(resout3);
						txtPass.setText(resout4);
						txtLocation.setText(resout5);
					} else {
						JOptionPane.showMessageDialog(null, "Employee not found!");
					}
					//Exception Handler
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubmit.setBounds(35, 195, 90, 25);
		contentPane.add(btnSubmit);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFName.setText(null);
				txtLName.setText(null);
				txtUName.setText(null);
				txtEmail.setText(null);
				txtPass.setText(null);
				txtLocation.setText(null);
				txtNameSearch.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(155, 195, 90, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(280, 195, 90, 25);
		contentPane.add(btnNewButton_1);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtNameSearch, txtFName, txtLName, txtUName, txtEmail, txtPass, txtLocation}));
	}
}

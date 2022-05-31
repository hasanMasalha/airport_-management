package boundry;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sounds.AudioPlay;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class logIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private boolean flag=true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logIn frame = new logIn();
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
	public logIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("UserName:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(157, 32, 106, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(145, 67, 118, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("PassWord:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(157, 116, 94, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(145, 156, 118, 20);
		contentPane.add(passwordField);
		
		btnNewButton = new JButton("LogIn");
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(162, 216, 89, 23);
		contentPane.add(btnNewButton);
		
btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new AudioPlay("Mouse.wav");
				
				HashMap<String,String> x = new HashMap<String,String>();
				x.put("Receptionist","Receptionist123");
				x.put("CateringRes","CateringRes123");
				x.put("HeadNurse","HeadNurse123");
				x.put("InstitueMan","InstitueMan123");
				if(!x.containsKey(textField.getText().toString()))
				{
					JOptionPane.showMessageDialog(null, "Incorrect UserName");
					flag=false;

					
				}
				else {
					if(!x.get(textField.getText().toString()).equals(passwordField.getText().toString())) {
						JOptionPane.showMessageDialog(null, "Incorrect PassWord, please try again.");
						flag=false;

						
					}
				}
				if(textField.getText().toString().equals("Receptionist") && flag) {
					Receptionist r = new Receptionist();
					r.setVisible(true);
					setVisible(false);
				}
				if(textField.getText().toString().equals("CateringRes") && flag) {
					 FoodReport fr = new FoodReport();
					fr.setVisible(true);
					setVisible(false);
				}
				if(textField.getText().toString().equals("HeadNurse") && flag) {
					 HeadNurse t = new HeadNurse();
					t.setVisible(true);
					setVisible(false);
				}
				if(textField.getText().toString().equals("InstitueMan") && flag) {
					 AddNurse n = new AddNurse();
					n.setVisible(true);
					setVisible(false);
				}

				if(textField.getText().isEmpty() || textField.getText().isEmpty()) {
					new AudioPlay("0.wav");
					JOptionPane.showMessageDialog(null, "Something is empty");

				}
				flag=true;
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(logIn.class.getResource("/images/logIn.jpg")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
		
		
		
		
	}
}

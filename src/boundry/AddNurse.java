package boundry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sounds.AudioPlay;
import control.scheduleControl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class AddNurse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNurse frame = new AddNurse();
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
	public AddNurse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scheduleControl.getInstance().getTested();
		
		JLabel lblNewLabel_1 = new JLabel("Nurse ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(98, 53, 123, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(192, 52, 98, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(98, 94, 123, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name:");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(98, 133, 87, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 94, 98, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		

		textField_2 = new JTextField();
		textField_2.setBounds(192, 132, 98, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Vaccination Date:");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(86, 175, 142, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBounds(158, 206, 89, 23);
		contentPane.add(btnNewButton);
btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new AudioPlay("Mouse.wav");
				System.out.println(lblNewLabel_1.getText());
				scheduleControl.getInstance().addNurse(textField_1.getText(),textField_2.getText(),textField.getText(),textField_3.getText());

				JOptionPane.showMessageDialog(null, "The Nurse Was Added Successfully.");
			}});
		
		
		textField_3 = new JTextField();
		textField_3.setBounds(229, 174, 98, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("l");
		lblNewLabel.setBounds(0, 0, 434, 261);
		lblNewLabel.setIcon(new ImageIcon(AddNurse.class.getResource("/images/nurse1.jpg")));
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
			
	}
}

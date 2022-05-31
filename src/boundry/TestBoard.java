package boundry;

import java.awt.BorderLayout;
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

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class TestBoard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestBoard frame = new TestBoard();
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
	public TestBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TestBoardID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(79, 37, 114, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(194, 36, 95, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(89, 83, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(145, 82, 95, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Time:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(89, 128, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox<Integer> comboBox = new JComboBox<Integer>();
		comboBox.setBounds(145, 126, 48, 22);
		contentPane.add(comboBox);
		for(int i=8;i<16;i++) {
			comboBox.addItem(i);
		}
		JComboBox<Integer> comboBox_1 = new JComboBox<Integer>();
		comboBox_1.setBounds(207, 126, 48, 22);
		contentPane.add(comboBox_1);
		for(int j=0;j<60;j+=10) {
			comboBox_1.addItem(j);
		}
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(145, 176, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Timetable was added successfully.");
				new AudioPlay("Mouse.wav");
			}});
		
		JButton btnNewButton_1 = new JButton("Click to add Nurses");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(101, 210, 178, 23);
		contentPane.add(btnNewButton_1);
		
		 btnNewButton_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new AudioPlay("Mouse.wav");

					Nurses n = new Nurses();
					n.setVisible(true);
					setVisible(false);
					
				}
			});
			JButton btnNewButton_2 = new JButton("Back");
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			btnNewButton_2.setForeground(Color.BLACK);
			btnNewButton_2.setBounds(325, 213, 85, 21);
			contentPane.add(btnNewButton_2);
			btnNewButton_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					HeadNurse n = new HeadNurse();
					n.setVisible(true);
					setVisible(false);
					// TODO Auto-generated method stub
					
				}
			});
			
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 434, 261);
		lblNewLabel.setIcon(new ImageIcon(TestBoard.class.getResource("/images/testBoard1.jpg")));
		contentPane.add(lblNewLabel);
		

		
		
		
		
	
		
		
		
		
		
		
		
	
		
		
		
		
	}
}

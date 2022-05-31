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

import javax.swing.JButton;
import java.awt.Color;

public class AddOrSkip extends JFrame {
	private int ID;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddOrSkip frame = new AddOrSkip(ID);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public AddOrSkip(int id) {
		this.ID=id;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Click Add to add more family members");
		lblNewLabel_1.setBounds(69, 77, 300, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(94, 139, 89, 23);
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		  btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new AudioPlay("Mouse.wav");

					FamilyMember f = new FamilyMember(id);
					f.setVisible(true);
					setVisible(false);
					
				}
			});
		
		
		
		JButton btnNewButton_1 = new JButton("Finish");
		btnNewButton_1.setBounds(234, 139, 89, 23);
		btnNewButton_1.setForeground(new Color(128, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton_1);
btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new AudioPlay("Mouse.wav");
				JOptionPane.showMessageDialog(null, "Check-In was done successfully.");
			}});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 434, 261);
		lblNewLabel.setIcon(new ImageIcon(AddOrSkip.class.getResource("/images/reception1.jpg")));
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
		
		
	}

}

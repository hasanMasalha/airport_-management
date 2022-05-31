package boundry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sounds.AudioPlay;
import control.scheduleControl;
import entity.Nurse;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Nurses extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try { 
					Nurses frame = new Nurses();
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
	public Nurses() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Choose Nurses To Today's Tests:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(98, 51, 297, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(126, 104, 174, 22);
		contentPane.add(comboBox);
		for(Nurse n : scheduleControl.getInstance().getNurses()) {
		comboBox.addItem(n.getFirstName() +" " +n.getLastName());
		}
		
		JButton btnNewButton = new JButton("Choose Nurse.");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "The nurse was chosen successfully.");
				new AudioPlay("Mouse.wav");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(142, 166, 140, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Finish");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(168, 209, 89, 23);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "All the nurses were added successfully");
				new AudioPlay("Mouse.wav");
				setVisible(false);
			}});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 434, 261);
		lblNewLabel.setIcon(new ImageIcon(Nurses.class.getResource("/images/testBoard1.jpg")));
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
		
		
	}

}

package boundry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sounds.AudioPlay;
import control.scheduleControl;
import entity.Hotel;
import entity.Room;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;

public class FamilyMember extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private boolean flag=false;
	private int ID;
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FamilyMember frame = new FamilyMember();
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
	public FamilyMember(int id) {
		this.ID=id;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setBounds(37, 36, 46, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setBounds(37, 75, 85, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name:");
		lblNewLabel_3.setBounds(37, 115, 85, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone Number:");
		lblNewLabel_4.setBounds(10, 163, 116, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Relation:");
		lblNewLabel_5.setBounds(237, 36, 73, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_5);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(308, 34, 102, 22);
		contentPane.add(comboBox);
		ArrayList<String> re = new ArrayList<String>();
		re.add("Spouse");
		re.add("Child");
		comboBox.addItem("Spouse");
		comboBox.addItem("Child");
		
		textField = new JTextField();
		textField.setBounds(72, 35, 102, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 74, 102, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(132, 114, 102, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(132, 162, 102, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Food Preference:");
		lblNewLabel_6.setBounds(267, 60, 129, 14);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_6);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(277, 84, 102, 22);
		contentPane.add(comboBox_1);
		ArrayList<String> foods = new ArrayList<String>();
		foods.add("Vegan");
		foods.add("naturalistic");
		foods.add("Gloten Free");
		foods.add("Carnivor");

		comboBox_1.addItem("Vegan");
		comboBox_1.addItem("naturalistic");
		comboBox_1.addItem("Gloten Free");
		comboBox_1.addItem("Carnivor");
		
		 JLabel lblNewLabel_7 = new JLabel("Schedule Room:");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_7.setBounds(277, 194, 146, 14);
			contentPane.add(lblNewLabel_7);
			
			JComboBox<String> comboBox_2 = new JComboBox<String>();
			comboBox_2.setBounds(276, 218, 103, 22);
			contentPane.add(comboBox_2);
			
			
			JLabel lblNewLabel_8 = new JLabel("Hotel:");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_8.setBounds(308, 115, 51, 14);
			contentPane.add(lblNewLabel_8);
			
			JComboBox<String> comboBox_3 = new JComboBox<String>();
			comboBox_3.setBounds(267, 139, 145, 21);
			contentPane.add(comboBox_3);
			ArrayList<Hotel> temp =new ArrayList<Hotel>();
			for(Hotel h : scheduleControl.getInstance().getHotels()) {
				comboBox_3.addItem(h.getHotelName() + " " +h.getHotelID());
				temp.add(h);
			}
			
			
			JButton btnNewButton_1 = new JButton("View Rooms");
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_1.setForeground(new Color(128, 0, 0));
			btnNewButton_1.setBounds(267, 162, 143, 21);
			contentPane.add(btnNewButton_1);
			ArrayList<String> rooms = new ArrayList<String>();
			
			btnNewButton_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					int i =temp.get(comboBox_3.getSelectedIndex()).getHotelID();
					for(Room r : scheduleControl.getInstance().getRooms()) {
						if(r.getHotelID() == i) {
						comboBox_2.addItem(r.getRoomID() +"");
						flag=true;
						rooms.add(r.getRoomID()+"");
						}
					}
					
				}
			});
			
			
			
		JButton btnNewButton = new JButton("Check-in");
		btnNewButton.setBounds(57, 216, 116, 23);
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(btnNewButton);
		
		  btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new AudioPlay("Mouse.wav");
					scheduleControl.getInstance().addIsRelated(id, textField.getText(), re.get(comboBox.getSelectedIndex()));
					scheduleControl.getInstance().addPerson(textField.getText(), textField_1.getText(), textField_2.getText(), textField_3.getText(), foods.get(comboBox_1.getSelectedIndex()));
					scheduleControl.getInstance().stayIn(textField.getText(), temp.get(comboBox_3.getSelectedIndex()).getHotelID()
							,rooms.get(comboBox_2.getSelectedIndex()));

					AddOrSkip a = new AddOrSkip(id);
					a.setVisible(true);
					setVisible(false);
					
				}
			});
		
	
		 
			
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 434, 261);
		lblNewLabel.setIcon(new ImageIcon(FamilyMember.class.getResource("/images/reception1.jpg")));
	
		
	
		contentPane.add(lblNewLabel);
		
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package boundry;


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
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Receptionist extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_2;
	private JTextField textField_1;
	private JLabel lblNewLabel_3;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField_3;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JLabel lblNewLabel_6;
	private JTextField textField_5;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JComboBox<String> comboBox;
	private JLabel lblNewLabel_9;
	private JComboBox<String> comboBox_1;
	private JLabel lblNewLabel_10;
	private JComboBox<String> comboBox_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receptionist frame = new Receptionist();
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
	public Receptionist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel_1 = new JLabel("ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(22, 57, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(67, 56, 97, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 97, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 96, 97, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Last Name:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 140, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 139, 97, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 176, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(65, 170, 141, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_5 = new JLabel("City:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 211, 62, 14);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(65, 210, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Phone:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 254, 62, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(65, 253, 118, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		lblNewLabel_7 = new JLabel("check-in");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_7.setForeground(new Color(128, 0, 0));
		lblNewLabel_7.setBounds(191, 11, 118, 27);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Kupat-Holim:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(248, 57, 97, 14);
		contentPane.add(lblNewLabel_8);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(355, 55, 105, 22);
		contentPane.add(comboBox);
		ArrayList<String> ko = new ArrayList<String>();
		ko.add("meuhedet");
		ko.add("clalit");
		ko.add("maccabi");
		ko.add("leumit");
		comboBox.addItem("meuhedet");
		comboBox.addItem("clalit");
		comboBox.addItem("maccabi");
		comboBox.addItem("leumit");
		
		
		lblNewLabel_9 = new JLabel("Food Preference:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(227, 111, 134, 14);
		contentPane.add(lblNewLabel_9);
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(355, 109, 105, 22);
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
		
		 lblNewLabel_10 = new JLabel("Schedule Room:");
			lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_10.setBounds(227, 227, 118, 14);
			contentPane.add(lblNewLabel_10);
			
			comboBox_2 = new JComboBox<String>();
			comboBox_2.setBounds(355, 225, 105, 22);
			contentPane.add(comboBox_2);
			
			
			
			
			JLabel lblNewLabel_11 = new JLabel("Hotel");
			lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_11.setBounds(291, 157, 45, 13);
			contentPane.add(lblNewLabel_11);
			
			JComboBox<String> comboBox_3 = new JComboBox<String>();
			comboBox_3.setBounds(355, 155, 127, 21);
			contentPane.add(comboBox_3);
			ArrayList<Hotel> temp = new ArrayList<Hotel>();
			for(Hotel h : scheduleControl.getInstance().getHotels()) {
				comboBox_3.addItem(h.getHotelName() +" " +h.getHotelID());
				temp.add(h);
			}
			
			
			JButton btnNewButton_1 = new JButton("View Rooms");
			btnNewButton_1.setForeground(new Color(128, 0, 0));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_1.setBounds(365, 186, 117, 21);
			contentPane.add(btnNewButton_1);
			ArrayList<String> rooms = new ArrayList<String>();
			btnNewButton_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int i =temp.get(comboBox_3.getSelectedIndex()).getHotelID();
					for(Room r : scheduleControl.getInstance().getRooms()) {
						if(r.getHotelID() == i) {
						comboBox_2.addItem(r.getRoomID() +"");
						rooms.add(r.getRoomID()+"");
						}
					}
					
					
				}
			});
			
		JButton btnNewButton = new JButton("Check-in");
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(410, 268, 86, 23);
		contentPane.add(btnNewButton);
		
        btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new AudioPlay("Mouse.wav");
				scheduleControl.getInstance().addHeadOfFamily(textField_3.getText(), textField_4.getText(), ko.get(comboBox.getSelectedIndex()), textField.getText(),
						textField_1.getText(), textField_2.getText(), textField_5.getText(), foods.get(comboBox_1.getSelectedIndex()));
				scheduleControl.getInstance().stayIn(textField.getText(), temp.get(comboBox_3.getSelectedIndex()).getHotelID(),rooms.get(comboBox_2.getSelectedIndex()));
				AddOrSkip a = new AddOrSkip(Integer.parseInt(textField.getText()));
				a.setVisible(true);
				setVisible(false);
				
			}
		});
		
		
       
		
		
		
		JLabel lblNewLabel = new JLabel("check-in");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setIcon(new ImageIcon(Receptionist.class.getResource("/images/reception1.jpg")));
		lblNewLabel.setBounds(0, 0, 504, 299);
		contentPane.add(lblNewLabel);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	
		
		
		
	
		
		
		
		
		
		
		
		
	}
}

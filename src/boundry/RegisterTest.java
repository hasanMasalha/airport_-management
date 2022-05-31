package boundry;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sounds.AudioPlay;
import control.scheduleControl;
import entity.Nurse;
import entity.Scheduled;
import entity.TestBoard;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class RegisterTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterTest frame = new RegisterTest();
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
	public RegisterTest() {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
			int help=0;
		  LocalDateTime now = LocalDateTime.now();  
		ArrayList<Nurse> nurses = scheduleControl.getInstance().getNurses();
		ArrayList<TestBoard> tests = scheduleControl.getInstance().getTests();
		ArrayList<Scheduled> sc = scheduleControl.getInstance().getScheduleds();
		ArrayList<Integer> n = new ArrayList<Integer>();
		for(TestBoard t : tests) {
			if(t.getDate().equals(dtf.format(now))) {
				help=t.getTestBoradID();
			}
		}
		for(Scheduled s : sc) {
			if(s.getTestBoardID()==help) {
				n.add(s.getNurseID());
			}
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Register For Corona Test");
		lblNewLabel_1.setBounds(110, 24, 199, 14);
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setBounds(132, 71, 46, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Choose Hour:");
		lblNewLabel_3.setBounds(110, 107, 101, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Choose Nurse:");
		lblNewLabel_4.setBounds(108, 142, 117, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 70, 101, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(221, 105, 101, 22);
		contentPane.add(comboBox);
		ArrayList<String> times = new ArrayList<String>();
		for(TestBoard tb : tests) {
			if(tb.getTestBoradID()==help) {
				comboBox.addItem(tb.getHour()+" : " +tb.getMinute());
				times.add(tb.getHour()+":" +tb.getMinute());
			}
		}
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(221, 140, 101, 22);
		contentPane.add(comboBox_2);
		ArrayList<Nurse> newNu = new ArrayList<Nurse>();
		for(Integer in : n) {
			for(Nurse nur : nurses) {
				if(in==nur.getNurseID()) {
					comboBox_2.addItem(nur.getFirstName() +" "+ nur.getLastName());
					newNu.add(nur);
				}
			}
		}
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(173, 188, 98, 23);
		contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AudioPlay("Mouse.wav");
				System.out.println("Yes");
				System.out.println(textField_1.getText() +" "+newNu.get(comboBox_2.getSelectedIndex()).getNurseID() +" " + times.get(comboBox.getSelectedIndex()));
				scheduleControl.getInstance().addTested(textField_1.getText(), newNu.get(comboBox_2.getSelectedIndex()).getNurseID(), times.get(comboBox.getSelectedIndex()));
				JOptionPane.showMessageDialog(null, "Your registration was received successfully.");
			}});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 434, 261);
		lblNewLabel.setIcon(new ImageIcon(RegisterTest.class.getResource("/images/coronaTest1.jpg")));
		contentPane.add(lblNewLabel);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package boundry;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sounds.AudioPlay;
import Sounds.AudioPlay1;
import javax.swing.JLabel;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import java.awt.EventQueue;

public class mainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage frame = new mainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public class TimePanel extends Thread {
		SimpleDateFormat time = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		public static final int SECOND = 1000;
		private JLabel timeLabel;

		public TimePanel(JLabel timeLabel) {
			this.timeLabel = timeLabel;
		}

		public void setTimeLabel(JLabel timeLabel) {
			this.timeLabel = timeLabel;
		}

		public void run() {
			while (true) {
				timeLabel.setText(getDateTime());
				try {
					sleep(SECOND);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		private String getDateTime() {
			Date now = new Date();
			return time.format(now).toString();
		}
	}

	/**
	 * Create the frame.
	 * @throws LineUnavailableException 
	 * @throws IOException 
	 * @throws UnsupportedAudioFileException 
	 */
	public mainPage() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		AudioPlay1 ap = new AudioPlay1();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBounds(297, 216, 89, 23);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnNewButton);
	btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new AudioPlay("Mouse.wav");
				logIn li = new logIn();
				li.setVisible(true);
				setVisible(false);
				
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("Stop!");
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(355, 12, 79, 23);
		contentPane.add(btnNewButton_1);
		
btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ap.pause();
				
			}
		});
JLabel lblNewLabel_1 = new JLabel("");
lblNewLabel_1.setBounds(158, 21, 119, 14);
contentPane.add(lblNewLabel_1);

TimePanel clock = new TimePanel(lblNewLabel_1);
clock.start();

JButton btnNewButton_2 = new JButton("Register for Covid-Test");
btnNewButton_2.setForeground(new Color(255, 0, 0));
btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
btnNewButton_2.setBounds(25, 216, 211, 23);
contentPane.add(btnNewButton_2);


btnNewButton_2.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new AudioPlay("Mouse.wav");
		RegisterTest r = new RegisterTest();
		r.setVisible(true);
		setVisible(false);
		
	}
});

ap.play();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 434, 261);
		lblNewLabel.setIcon(new ImageIcon(mainPage.class.getResource("/images/welcomeimage.jpg")));
		contentPane.add(lblNewLabel);
		
		
		
		
		
		
		
	}

}

package hmm;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sch extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnSch;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sch frame = new Sch();
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
	public Sch() {
		setTitle("Alarm");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 470);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlarm = new JLabel("Alarm : ");
		lblAlarm.setFont(new Font("Tahoma", Font.PLAIN, 62));
		lblAlarm.setBounds(10, 154, 232, 134);
		contentPane.add(lblAlarm);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 62));
		textField.setBounds(258, 155, 140, 134);
		contentPane.add(textField);
		textField.setColumns(2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 62));
		textField_1.setColumns(2);
		textField_1.setBounds(444, 154, 140, 134);
		contentPane.add(textField_1);
		
		JLabel label = new JLabel(" :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 69));
		label.setBounds(388, 152, 46, 134);
		contentPane.add(label);
		
		btnSch = new JButton("Schedule");
		btnSch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				OpenScedule();
				
			}
		});
		btnSch.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnSch.setBounds(209, 341, 176, 90);
		contentPane.add(btnSch);
	}

	public void OpenScedule() {
		
	}

}

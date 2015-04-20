package ra136249;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class print extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel("Title");
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel lastNameLabel = new JLabel("Last Name");
	JLabel birthDateLabel = new JLabel("Birth Date");
	JLabel emailLabel = new JLabel("Email");
	JLabel cpfLabel = new JLabel("CPF");
	JLabel phoneLabel = new JLabel("Phone");
	JLabel address1Label = new JLabel("Address1");
	JLabel address2Label = new JLabel("Address2");
	JLabel cepLabel = new JLabel("CEP");
	JLabel cityLabel = new JLabel("City");
	JLabel stateLabel = new JLabel("State");
	JLabel countryLabel = new JLabel("Country");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print frame = new print();					
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
	public print() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		titleLabel.setBounds(102, 50, 216, 15);
		contentPane.add(titleLabel);
		
		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		firstNameLabel.setBounds(102, 80, 216, 15);
		contentPane.add(firstNameLabel);		
		
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lastNameLabel.setBounds(102, 110, 216, 15);
		contentPane.add(lastNameLabel);
		
		birthDateLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		birthDateLabel.setBounds(102, 140, 216, 15);
		contentPane.add(birthDateLabel);
		
		emailLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		emailLabel.setBounds(102, 170, 216, 15);
		contentPane.add(emailLabel);
		
		cpfLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cpfLabel.setBounds(102, 200, 216, 15);
		contentPane.add(cpfLabel);
		
		phoneLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		phoneLabel.setBounds(102, 230, 216, 15);
		contentPane.add(phoneLabel);
		
		address1Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		address1Label.setBounds(102, 260, 216, 15);
		contentPane.add(address1Label);
		
		address2Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		address2Label.setBounds(102, 290, 216, 15);
		contentPane.add(address2Label);
		
		cepLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cepLabel.setBounds(102, 320, 216, 15);
		contentPane.add(cepLabel);
		
		cityLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cityLabel.setBounds(102, 350, 216, 15);
		contentPane.add(cityLabel);
		
		stateLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		stateLabel.setBounds(102, 380, 216, 15);
		contentPane.add(stateLabel);
		
		countryLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		countryLabel.setBounds(102, 410, 216, 15);
		contentPane.add(countryLabel);
		
		JLabel lblFormTitle = new JLabel("Form Printed");
		lblFormTitle.setFont(new Font("Dialog", Font.BOLD, 20));
		lblFormTitle.setBounds(139, 12, 159, 31);
		contentPane.add(lblFormTitle);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 50, 70, 15);
		contentPane.add(lblTitle);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(12, 80, 106, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(12, 110, 98, 15);
		contentPane.add(lblLastName);
		
		JLabel lblBirthDate = new JLabel("Birth Date:");
		lblBirthDate.setBounds(12, 140, 98, 15);
		contentPane.add(lblBirthDate);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(12, 170, 98, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(12, 200, 98, 15);
		contentPane.add(lblCPF);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(12, 230, 98, 15);
		contentPane.add(lblPhone);
		
		JLabel lblAddress1 = new JLabel("Address1:");
		lblAddress1.setBounds(12, 260, 98, 15);
		contentPane.add(lblAddress1);
		
		JLabel lblAddress2 = new JLabel("Address2:");
		lblAddress2.setBounds(12, 290, 98, 15);
		contentPane.add(lblAddress2);
		
		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setBounds(12, 320, 98, 15);
		contentPane.add(lblCEP);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(12, 350, 98, 15);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(12, 380, 98, 15);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(12, 410, 98, 15);
		contentPane.add(lblCountry);
						
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(12, 450, 117, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}

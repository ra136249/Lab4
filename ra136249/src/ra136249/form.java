package ra136249;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textFirstName;
	public JTextField textLastName;
	public JTextField textBirthDate;
	public JTextField textEmail;
	public JTextField textCPF;
	public JTextField textPhone;
	public JTextField textAddress1;
	public JTextField textAddress2;
	public JTextField textCEP;
	public JTextField textCity;
	public JTextField textState;
	public JTextField textCountry;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFirstName = new JTextField();
		textFirstName.setBounds(100, 60, 300, 19);
		contentPane.add(textFirstName);
		textFirstName.setColumns(10);
		
		textLastName = new JTextField();
		textLastName.setBounds(100, 90, 300, 19);
		contentPane.add(textLastName);
		textLastName.setColumns(10);
		
		textBirthDate = new JTextField();
		textBirthDate.setBounds(100, 120, 300, 19);
		contentPane.add(textBirthDate);
		textBirthDate.setColumns(10);
		textBirthDate.setUI(new JTextFieldHintUI("DD/MM/AAAA", Color.black));
		
		textEmail = new JTextField();
		textEmail.setBounds(100, 150, 300, 19);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(100, 180, 300, 19);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setBounds(100, 210, 300, 19);
		contentPane.add(textPhone);
		textPhone.setColumns(10);
		textPhone.setUI(new JTextFieldHintUI("Including international country code and DDD", Color.black));
		
		textAddress1 = new JTextField();
		textAddress1.setBounds(100, 240, 300, 19);
		contentPane.add(textAddress1);
		textAddress1.setColumns(10);
		
		textAddress2 = new JTextField();
		textAddress2.setBounds(100, 270, 300, 19);
		contentPane.add(textAddress2);
		textAddress2.setColumns(10);
		textAddress2.setUI(new JTextFieldHintUI("Apt, floor, suite, etc.", Color.black));
		
		textCEP = new JTextField();
		textCEP.setBounds(100, 300, 300, 19);
		contentPane.add(textCEP);
		textCEP.setColumns(10);
		
		textCity = new JTextField();
		textCity.setBounds(100, 330, 300, 19);
		contentPane.add(textCity);
		textCity.setColumns(10);
		
		textState = new JTextField();
		textState.setBounds(100, 360, 300, 19);
		contentPane.add(textState);
		textState.setColumns(10);
		
		textCountry = new JTextField();
		textCountry.setBounds(100, 390, 300, 19);
		contentPane.add(textCountry);
		textCountry.setColumns(10);
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 12, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 17, 90, 15);
		contentPane.add(lblTitle);
		
		JLabel lblFirstName = new JLabel("First Name*:");
		lblFirstName.setBounds(12, 60, 90, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name*:");
		lblLastName.setBounds(12, 90, 90, 15);
		contentPane.add(lblLastName);
				
		JLabel lblBirthDate = new JLabel("Birth Date*:");
		lblBirthDate.setBounds(12, 120, 90, 15);
		contentPane.add(lblBirthDate);
		
		JLabel lblEmail = new JLabel("Email*:");
		lblEmail.setBounds(12, 150, 90, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCPF = new JLabel("CPF*:");
		lblCPF.setBounds(12, 180, 90, 15);
		contentPane.add(lblCPF);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(12, 210, 90, 15);
		contentPane.add(lblPhone);
		
		JLabel lblAddress1 = new JLabel("Address1:");
		lblAddress1.setBounds(12, 240, 90, 15);
		contentPane.add(lblAddress1);
		
		JLabel lblAddress2 = new JLabel("Address2:");
		lblAddress2.setBounds(12, 270, 90, 15);
		contentPane.add(lblAddress2);
		
		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setBounds(12, 300, 90, 15);
		contentPane.add(lblCEP);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(12, 330, 90, 15);
		contentPane.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(12, 360, 90, 15);
		contentPane.add(lblState);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(12, 390, 90, 15);
		contentPane.add(lblCountry);
		
		final JButton btnError = new JButton("OK");
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				//contentPane.setVisible(false);
				if(textFirstName.getText().isEmpty()){
					JOptionPane.showMessageDialog(btnError, "Error: 'First Name' is a required field");
					textFirstName.setUI(new JTextFieldHintUI("This field must be completed", Color.red));
				}
				
				else if(textLastName.getText().isEmpty()){
					JOptionPane.showMessageDialog(btnError, "Error: 'Last Name' is a required field");
					textLastName.setUI(new JTextFieldHintUI("This field must be completed", Color.red));
				}
				
				else if(textBirthDate.getText().isEmpty()){
					JOptionPane.showMessageDialog(btnError, "Error: 'Birth Date' is a required field");
					textBirthDate.setUI(new JTextFieldHintUI("This field must be completed", Color.red));
				}
				
				else if(!(textBirthDate.getText().matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))){
					JOptionPane.showMessageDialog(btnError, "Error: 'Birth Date' doesn't seem to be OK");
					textBirthDate.setText("");
					textBirthDate.setUI(new JTextFieldHintUI("This field must be DD/MM/YYYY", Color.red));
				}
								
				else if(textEmail.getText().isEmpty()){
					JOptionPane.showMessageDialog(btnError, "Error: 'Email' is a required field");
					textEmail.setUI(new JTextFieldHintUI("This field must be completed", Color.red));
				}
				
				// Pattern can be found at:
				// http://stackoverflow.com/questions/624581/what-is-the-best-java-email-address-validation-method
				else if(!(textEmail.getText().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\"
						+ ".[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"))){
					JOptionPane.showMessageDialog(btnError, "Error: 'Email' doesn't seem to be OK");
					textEmail.setText("");
					textEmail.setUI(new JTextFieldHintUI("Enter a valid email account", Color.red));
				}
				
				else if(textCPF.getText().isEmpty()){
					JOptionPane.showMessageDialog(btnError, "Error: 'CPF' is a required field");
					textCPF.setUI(new JTextFieldHintUI("This field must be completed", Color.red));
				}
				
				else{
					print printForm = new print();
					printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
					printForm.firstNameLabel.setText(textFirstName.getText());
					printForm.lastNameLabel.setText(textLastName.getText());
					printForm.birthDateLabel.setText(textBirthDate.getText());
					printForm.emailLabel.setText(textEmail.getText());
					printForm.cpfLabel.setText(textCPF.getText());
					printForm.phoneLabel.setText(textPhone.getText());
					printForm.address1Label.setText(textAddress1.getText());
					printForm.address2Label.setText(textAddress2.getText());
					printForm.cepLabel.setText(textCEP.getText());
					printForm.cityLabel.setText(textCity.getText());
					printForm.stateLabel.setText(textState.getText());
					printForm.countryLabel.setText(textCountry.getText());
					//printForm.contentPane.setVisible(true);				
					printForm.show();
				}
				
			}
		});
		btnPrint.setBounds(12, 420, 74, 25);
		contentPane.add(btnPrint);
	}
}

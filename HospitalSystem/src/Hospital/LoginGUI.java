package Hospital;

import java.awt.EventQueue;
import java.sql.*;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel w_pane;
	private JTextField fld_hasta_tc;
	private JTextField fld_hasta_pass;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args){
	
		


	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setResizable(false);
		setTitle("Hastane Otomasyon Sistemi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 478);
		w_pane = new JPanel();
		w_pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(w_pane);
		w_pane.setLayout(null);
		
		JLabel logo = new JLabel(new ImageIcon(getClass().getResource("saglik-bakanligi-logosu(2).png")));
		logo.setBounds(163, 10, 154, 100);
		w_pane.add(logo);
		
		JLabel lblNewLabel = new JLabel("Hastane Yönetim Sistemine Hoş Geldiniz.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(44, 114, 448, 29);
		w_pane.add(lblNewLabel);
		
		JTabbedPane w_tabpane = new JTabbedPane(JTabbedPane.TOP);
		w_tabpane.setBounds(10, 204, 470, 227);
		w_pane.add(w_tabpane);
		
		JPanel w_hastalogin = new JPanel();
		w_hastalogin.setBackground(new Color(255, 255, 255));
		w_tabpane.addTab("Hasta Girişi", null, w_hastalogin, null);
		w_hastalogin.setLayout(null);
		
		JLabel lblTcNumaranz = new JLabel("TC Numaranız: ");
		lblTcNumaranz.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblTcNumaranz.setBounds(17, 10, 229, 26);
		w_hastalogin.add(lblTcNumaranz);
		
		JLabel lblifre = new JLabel("Şifre");
		lblifre.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblifre.setBounds(20, 87, 172, 29);
		w_hastalogin.add(lblifre);
		
		fld_hasta_tc = new JTextField();
		fld_hasta_tc.setBounds(186, 7, 245, 39);
		w_hastalogin.add(fld_hasta_tc);
		fld_hasta_tc.setColumns(10);
		
		fld_hasta_pass = new JTextField();
		fld_hasta_pass.setBounds(186, 85, 245, 39);
		w_hastalogin.add(fld_hasta_pass);
		fld_hasta_pass.setColumns(10);
		
		JButton btn_hastakayit = new JButton("KAYIT OL");
		btn_hastakayit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_hastakayit.setBounds(10, 149, 185, 41);
		w_hastalogin.add(btn_hastakayit);
		
		JButton btnHasta_giris = new JButton("GİRİŞ YAP");
		btnHasta_giris.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnHasta_giris.setBounds(265, 152, 245, 38);
		w_hastalogin.add(btnHasta_giris);
		
		JPanel w_doctorlogin = new JPanel();
		w_doctorlogin.setBackground(new Color(255, 255, 255));
		w_tabpane.addTab("Doktor Girişi", null, w_doctorlogin, null);
		w_doctorlogin.setLayout(null);
		
		JPanel w_hastalogin_1 = new JPanel();
		w_hastalogin_1.setLayout(null);
		w_hastalogin_1.setBackground(Color.WHITE);
		w_hastalogin_1.setBounds(0, 0, 465, 200);
		w_doctorlogin.add(w_hastalogin_1);
		
		JLabel lblTcNumaranz_1 = new JLabel("TC Numaranız: ");
		lblTcNumaranz_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblTcNumaranz_1.setBounds(17, 10, 229, 26);
		w_hastalogin_1.add(lblTcNumaranz_1);
		
		JLabel lblifre_1 = new JLabel("Şifre");
		lblifre_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblifre_1.setBounds(20, 87, 172, 29);
		w_hastalogin_1.add(lblifre_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(186, 7, 245, 39);
		w_hastalogin_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(186, 85, 245, 39);
		w_hastalogin_1.add(textField_1);
		
		JButton btn_doktor_giris = new JButton("GİRİŞ YAP");
		btn_doktor_giris.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btn_doktor_giris.setBounds(0, 152, 455, 38);
		w_hastalogin_1.add(btn_doktor_giris);
	}
}

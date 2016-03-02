import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;

public class SkaneGUI extends JFrame {

	private JPanel contentPane;
	public JTextField Searchfield;
	public JTextField toField;
	public JTextField fromField;
	public JTextArea textArea1;
	public JTextArea textArea_2;
	Parser p = new Parser();
	SkaneGUI g = this;
	
	ArrayList<Station> stations = new ArrayList<Station>();
			

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkaneGUI frame = new SkaneGUI();
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
	public SkaneGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 392);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Sök station");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Thread t=new StationThread(p,g);
			t.start();
			}
		});
		btnNewButton.setBounds(153, 111, 100, 29);
		contentPane.add(btnNewButton);
		
		Searchfield = new JTextField();
		Searchfield.setBounds(23, 111, 130, 26);
		contentPane.add(Searchfield);
		Searchfield.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 167, 140, 141);
		contentPane.add(scrollPane);
		
		textArea1 = new JTextArea();
		scrollPane.setViewportView(textArea1);
		
		toField = new JTextField();
		toField.setBounds(302, 111, 130, 26);
		contentPane.add(toField);
		toField.setColumns(10);
		
		fromField = new JTextField();
		fromField.setBounds(302, 62, 130, 26);
		contentPane.add(fromField);
		fromField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Sök resa");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread d=new JourneyThread(p,g);
				d.start();
			}
		});
		btnNewButton_1.setBounds(458, 111, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(315, 167, 117, 144);
		contentPane.add(scrollPane_1);
		
		textArea_2 = new JTextArea();
		scrollPane_1.setViewportView(textArea_2);
		
		JLabel lblFrn = new JLabel("Från");
		lblFrn.setBounds(265, 67, 61, 16);
		contentPane.add(lblFrn);
		
		JLabel lblTill = new JLabel("Till");
		lblTill.setBounds(265, 116, 61, 16);
		contentPane.add(lblTill);
	}
}

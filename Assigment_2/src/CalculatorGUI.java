import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

//import se.mah.KD405A.cat.CalculatorGUI;

public class CalculatorGUI extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	Calculator myCalculator;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		myCalculator = new Calculator();
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.GRAY);
		textField.setBounds(185, 30, 250, 210);
		contentPane.add(textField);
		textField.setColumns(10);
		

		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(7);
				textField.setText("7");
				
			}
		});
		button.setBounds(6, 171, 57, 29);
		contentPane.add(button);
		
		JButton button_2 = new JButton("9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(9);
				textField.setText("9");
			}
		});
		button_2.setBounds(118, 170, 55, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(4);
				textField.setText("4");
			}
		});
		button_3.setBounds(6, 129, 57, 29);
		contentPane.add(button_3);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(6);
				textField.setText("6");
			}
		});
		button_5.setBounds(118, 129, 55, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(1);
				textField.setText("1");
			}
		});
		button_6.setForeground(Color.DARK_GRAY);
		button_6.setBackground(Color.PINK);
		button_6.setBounds(6, 88, 57, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(2);
				textField.setText("2");
			}
		});
		button_7.setBounds(63, 88, 55, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("3");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(3);
				textField.setText("3");
			}
		});
		button_8.setBounds(118, 88, 55, 29);
		contentPane.add(button_8);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(5);
				textField.setText("5");
			}
		});
		button_4.setBounds(63, 129, 55, 29);
		contentPane.add(button_4);
		
		JButton button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.numberButtonPressed(8);
				textField.setText("8");
			}
		});
		button_1.setBounds(63, 170, 55, 29);
		contentPane.add(button_1);
		
		JButton button_9 = new JButton("=");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				textField.setText(String.valueOf(myCalculator.getResult()));
			}
		});
		button_9.setBounds(118, 209, 55, 29);
		contentPane.add(button_9);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.clear();
				textField.setText("");
			}
		});
		btnClear.setBounds(6, 47, 167, 29);
		contentPane.add(btnClear);
		
		JButton button_10 = new JButton("+");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.plus();
				textField.setText("+");
			}
		});
		button_10.setBounds(63, 211, 55, 29);
		contentPane.add(button_10);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.minus();
				textField.setText("-");
			}
		});
		button_12.setBounds(6, 212, 55, 29);
		contentPane.add(button_12);
		
	}
}


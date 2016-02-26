
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class AnimalsGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblAnimalList;
	private ArrayList<Animal> animals = new ArrayList<Animal>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI frame = new AnimalsGUI();
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
	public AnimalsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 56, 408, 184);
		contentPane.add(textArea);
		
		JLabel lblAnimalList = new JLabel("Animal List");
		lblAnimalList.setBounds(12, 13, 91, 16);
		contentPane.add(lblAnimalList);
		
		animals.add(new Snake("python", false));
		animals.add(new Dog("Canis latranis", true, "Bosse"));
		animals.add(new Cat("Lynx", 9, 5));
		animals.add(new Snake("python", true));
		animals.add(new Dog("Canis latranis", 8, false));
		
		for(int i = 0; i < animals.size(); i++){
			textArea.append(animals.get(i).getInfo() + "\n");
		}
		
	}
}
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;

public class HouseGUI extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 414);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(106, 75, 203, 199);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		

		House house1;
		House house2;
		House house3;
		house1 = new House(1992, 800);
		house2 = new House(2006, 500);
		house3 = new House(1989, 400);
		
		
		int houseSize = house1.getSize();
		int houseYear = house1.getYearBuilt();
		int houseSize2 = house2.getSize();
		int houseYear2 = house2.getYearBuilt();
		int houseSize3 = house3.getSize();
		int houseYear3 = house3.getYearBuilt();
		
		System.out.println("Storleken på hus 1 är " + houseSize);
		System.out.println("Hus 1 är byggt år " + houseYear);

		System.out.println("Storleken på hus 2 är " + houseSize2);
		System.out.println("Hus 2 är byggt år " + houseYear2);

		System.out.println("Storleken på hus 2 är " + houseSize3);
		System.out.println("Hus 3 är byggt år " + houseYear3);
		
		textArea.append("Uppgift 1.2" + "\n");
		textArea.append("Hus 1 är byggt år " + houseYear + " och är " + houseSize + " kvm stort" + "\n");
		textArea.append("Hus 2 är byggt år " + houseYear2 + " och är " + houseSize2 + " kvm stort" + "\n");
		textArea.append("Hus 3 är byggt år " + houseYear3 + " och är " + houseSize3 + " kvm stort" + "\n");
		
		
		House[] myHouses = new House[10];
		
		myHouses[0] = new House(1999, 200);
		myHouses[1] = new House(1980, 300);
		myHouses[2] = new House(2011, 500);
		myHouses[3] = new House(2014, 800);
		myHouses[4] = new House(2002, 850);
		myHouses[5] = new House(1977, 244);
		myHouses[6] = new House(1890, 380);
		myHouses[7] = new House(2000, 120);
		myHouses[8] = new House(1995, 350);
		myHouses[9] = new House(1950, 290);
		
		textArea.append("Uppgift 1.3" + "\n");
		
		for(int i = 0; i < myHouses.length; i++){
			textArea.append("Huset är byggt år " + myHouses[i].getYearBuilt() + " och är " + myHouses[i].getSize() + " kvm stort" + "\n");
		}
		
		ArrayList<House> myTown;
		myTown = new ArrayList<House>();
		int year;
		int size;
		Random rand = new Random();
		year = rand.nextInt((2015 - 1800)+ 1) + 1800;
		size = rand.nextInt((1000 - 10)+ 1) + 10;
		
		textArea.append("Uppgift 1.4" + "\n");
		
		for(int i = 0; i < 100; i++){
			year = rand.nextInt((2015 - 1800)+ 1) + 1800;
			size = rand.nextInt((1000 - 10)+ 1) + 10;
			myTown.add(new House(year, size));
		}
		
		for(House house : myTown){
			house.getYearBuilt();
			house.getSize();
			textArea.append("Huset är byggt år " + String.valueOf(house.getYearBuilt()) + " och är " + String.valueOf(house.getSize()) + " kvm stort" + "\n");
		}
	}
}

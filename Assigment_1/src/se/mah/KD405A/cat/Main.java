package se.mah.KD405A.cat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 367);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.GRAY);
		menuBar.setToolTipText("Menu");
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Arkiv");
		menuBar.add(mnMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Skriv ut");
		mnMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnMenu.add(mntmAvsluta);
		
		JMenu mnNewMenu = new JMenu("Medlem");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnNewMenu.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnNewMenu.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Hjälp");
		mnHjlp.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Om programmet");
		mnHjlp.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 6, 156, 317);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setFont(new Font("Lantinghei SC", Font.PLAIN, 12));
		list.setBackground(Color.WHITE);
		list.setToolTipText("");
		list.setVisibleRowCount(14);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Andreas Andersson", "Anders Blom", "Anna Andersson", "Benjamin Karlsson", "Beatrice Stål", "Caroline Hansson", "Cindy Hansson", "Cristoffer Nilsson", "Isak Hansson", "Iris Malinsson", "Josefine Blomkvist", "Karoline Jansson", "Kelly Gelevska", "Kenneth Persson", "Linda Karlsson", "Linus Andersson", "Stefan Svensson", "Stefan Karlsson"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JTextPane txtpnIsakHanssonIsakhanssonyahoocom = new JTextPane();
		txtpnIsakHanssonIsakhanssonyahoocom.setFont(new Font("Lantinghei SC", Font.PLAIN, 13));
		txtpnIsakHanssonIsakhanssonyahoocom.setText("Isak Hansson\t\nisak.hansson87@yahoo.com\n870506-9999\n070-9546733\n\nÖstergatan 6B\n32456 Malmö\n");
		txtpnIsakHanssonIsakhanssonyahoocom.setBounds(325, 213, 192, 73);
		contentPane.add(txtpnIsakHanssonIsakhanssonyahoocom);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main.class.getResource("/images/profil.jpg")));
		label.setBounds(325, 109, 96, 118);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Main.class.getResource("/images/gym2000.jpg")));
		label_1.setBounds(0, -11, 523, 334);
		contentPane.add(label_1);
	}
}

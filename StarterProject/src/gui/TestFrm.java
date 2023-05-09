package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TestFrm extends JFrame {

	private JPanel contentPane;
	private ButtonGroup buttonGroup;
	private DefaultListModel<String> dlm;
	private JTextField textField;

	/**
	 * Vazne napomene:
	 * 
	 * try-catch blok omogucava da aplikacija nastavi sa radom i nakon 
	 * izuzetaka koji mogu da se dese tokom rada aplikacije
	 * 
	 *  setVisible metoda koju koristimo u TestFrm klasi 
	 *  dolazi od JFrame klase, koju TestFrm nasledjuje
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrm frame = new TestFrm();
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
	public TestFrm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCenter = new JPanel();
		contentPane.add(pnlCenter, BorderLayout.CENTER);
		GridBagLayout gbl_pnlCenter = new GridBagLayout();
		gbl_pnlCenter.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_pnlCenter.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlCenter.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlCenter.setLayout(gbl_pnlCenter);
		
		/* Svim komponentama mozemo pridodati osluskivace (Event Listener-e)
		 * koji ce pratiti da li se odredjena akcija nad elementom izvrsila
		 * 
		 * actionPerformed metoda se izvrsava samo kada se izvrsi akcija
		 * nad komponentom 
		 * */
		JToggleButton tglbtnRed = new JToggleButton("Red");
		tglbtnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(tglbtnRed.getText());
			}
		});
		GridBagConstraints gbc_tglbtnRed = new GridBagConstraints();
		gbc_tglbtnRed.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnRed.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnRed.gridx = 0;
		gbc_tglbtnRed.gridy = 0;
		pnlCenter.add(tglbtnRed, gbc_tglbtnRed);
		
		JLabel lblRed = new JLabel("Red");
		GridBagConstraints gbc_lblRed = new GridBagConstraints();
		gbc_lblRed.insets = new Insets(0, 0, 5, 5);
		gbc_lblRed.gridx = 1;
		gbc_lblRed.gridy = 0;
		pnlCenter.add(lblRed, gbc_lblRed);
		
		JToggleButton tglbtnBlue = new JToggleButton("Blue");
		tglbtnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement("Blue");
			}
		});
		GridBagConstraints gbc_tglbtnBlue = new GridBagConstraints();
		gbc_tglbtnBlue.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnBlue.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnBlue.gridx = 0;
		gbc_tglbtnBlue.gridy = 1;
		pnlCenter.add(tglbtnBlue, gbc_tglbtnBlue);
		
		JLabel lblBlue = new JLabel("Blue");
		GridBagConstraints gbc_lblBlue = new GridBagConstraints();
		gbc_lblBlue.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlue.gridx = 1;
		gbc_lblBlue.gridy = 1;
		pnlCenter.add(lblBlue, gbc_lblBlue);
		
		JToggleButton tglbtnYellow = new JToggleButton("Yellow");
		tglbtnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.addElement(tglbtnYellow.getText());
			}
		});
		GridBagConstraints gbc_tglbtnYellow = new GridBagConstraints();
		gbc_tglbtnYellow.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnYellow.fill = GridBagConstraints.HORIZONTAL;
		gbc_tglbtnYellow.gridx = 0;
		gbc_tglbtnYellow.gridy = 2;
		pnlCenter.add(tglbtnYellow, gbc_tglbtnYellow);
		
		JLabel lblYellow = new JLabel("Yellow");
		GridBagConstraints gbc_lblYellow = new GridBagConstraints();
		gbc_lblYellow.insets = new Insets(0, 0, 5, 5);
		gbc_lblYellow.gridx = 1;
		gbc_lblYellow.gridy = 2;
		pnlCenter.add(lblYellow, gbc_lblYellow);
		
		/*Toggle button-i su dodati u ButtonGroup
		 * kako bi se obezbedilo da u jednom trenutku moze biti prtisnut 
		 * samo jedan 
		 * */
		buttonGroup = new ButtonGroup();
		buttonGroup.add(tglbtnRed);
		buttonGroup.add(tglbtnBlue);
		buttonGroup.add(tglbtnYellow);
		
		/*Napomena: varijabla lblAdditionalColor morala je biti deklarisana pre
		 * deklaracije event listener-a
		 * */
		JLabel lblNewLabel = new JLabel("Additional color");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		pnlCenter.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		DefaultComboBoxModel model = new DefaultComboBoxModel(new String[] {"", "Orange", "Purple", "Green"});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = comboBox.getSelectedItem().toString();
				dlm.addElement(selected);
				switch(selected) {
				case "Green":
					lblNewLabel.setForeground(Color.green);
					break;
				case "Orange":
					lblNewLabel.setForeground(Color.orange);
					break;
				case "Purple":
					lblNewLabel.setForeground(Color.magenta);
					break;
				default:
					lblNewLabel.setForeground(Color.black);
				}
			}
		});
		comboBox.setModel(model);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 3;
		pnlCenter.add(comboBox, gbc_comboBox);
	
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 3;
		pnlCenter.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		dlm = new DefaultListModel<String>();
		list.setModel(dlm);
		
		JLabel lblZadatak = new JLabel("Zadatak 1");
		lblZadatak.setForeground(new Color(176, 224, 230));
		lblZadatak.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblZadatak, BorderLayout.NORTH);
		
		JPanel pnlSouth = new JPanel();
		contentPane.add(pnlSouth, BorderLayout.SOUTH);
		
		JLabel lblAddColor = new JLabel("Add color");
		pnlSouth.add(lblAddColor);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					dlm.addElement(textField.getText());
					textField.setText("");
				}
			}
		});
		pnlSouth.add(textField);
		textField.setColumns(10);
		
		JButton btnAddColor = new JButton("Add color");
		btnAddColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DlgColor dlg = new DlgColor();
				dlg.setVisible(true);
				/* Posto je dijalog modalan, izvrsenje koda se zaustavlja na liniji
				 * dlg.SetVisible(true) dok god se dijalog ne sakrije (klikom na OK/Cancel/X)
				 * */
				//System.out.println("Dialog is closed");
				String color = dlg.getColor();
				dlm.addElement(color);
			}
		});
		pnlSouth.add(btnAddColor);
		
		JButton btnEditColor = new JButton("Edit color");
		btnEditColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedElementIndex = list.getSelectedIndex();
					String selected = dlm.get(selectedElementIndex); //34 34 34
					String[] splits = selected.split(" ");
					DlgColor dlg = new DlgColor();
					dlg.getTxtRed().setText(splits[0]);
					dlg.getTxtGreen().setText(splits[1]);
					dlg.getTxtBlue().setText(splits[2]);
					dlg.setVisible(true);
					String color = dlg.getColor();
					dlm.remove(selectedElementIndex);
					dlm.add(selectedElementIndex, color);
				}catch(ArrayIndexOutOfBoundsException ex) {
					JOptionPane.showMessageDialog(null, "You cannot edit this color");
				}
			}
		});
		pnlSouth.add(btnEditColor);
	}

}

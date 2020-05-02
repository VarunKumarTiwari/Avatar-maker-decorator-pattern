


import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;
import java.awt.Point;

import javax.swing.JFrame;
import javax.print.attribute.SetOfIntegerSyntax;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JRadioButton;

import com.FM.ClassDec.Character;
import com.FM.ClassDec.Eyes;
import com.FM.ClassDec.Face;
import com.FM.ClassDec.FaceNose;
import com.FM.ClassDec.FaceShape;
import com.FM.ClassDec.mouth;

public class FacGUI {

	public JFrame frame;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	// private String[] splitStr;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3,lblNewLabel_8,lblNewLabel_9;
	private JPanel panel_2, panel_9, panel_11;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_4;
	private JPanel panel;
	private JPanel panel_1;
	private String eyes = null;
	private String Hair = null;
	private String nose = null;
	private String lips = null;
	private String[] AryEye = { "background/eye11.png", "background/eye12.png", "background/eye13.png",
			"background/eye14.png", "background/eye15.png", "background/eye16.png", "background/eye17.png",
			"background/eye18.png", "background/eye19.png", "background/eye20.png" };
	private String[] ArrNose = { "background/nose1.png", "background/nose11.png", "background/nose114.jpg",
			"background/nose117.png", "background/nose12.png", "background/nose13.png", "background/nose15.png",
			"background/nose16.png", "background/nose17.png", "background/nose18.png", "background/nose19.png" };
	
	private String[] ArrLips = { "background/lips7.png", "background/lips8.png", "background/lips9.png",
			"background/lips10.png", "background/lips12.png", "background/lips13.png", "background/lips14.png",
			"background/lips15.png", "background/lips16.png", "background/mo1.jpg", "background/mo2.jpg",
			"background/mo3.jpg", "background/mo4.jpg.gif", "background/mo5.png", "background/mo6.png" };
	
	private String[] ArrHair = { "background/hair.png", "background/hair2.png", "background/hair4.png",
			"background/hair3.png", "background/hair5.png", "background/hair6.png" };

	/**
	 * Launch the application.
	 */


	public Dimension getSize(JLabel lblNewLabel_22) {
		Dimension size = lblNewLabel_22.getSize();
		return size;
	}

	/**
	 * Create the application.
	 */
	public FacGUI() {
		initialize();
		panel_1.setVisible(true);
		panel_9.setVisible(false);
		panel_11.setVisible(false);
		panel_2.setVisible(false);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_9.setVisible(false);

	}

	public void HairFill(String Hair) {
		Face face = new FaceShape(new Face(), Hair);
		String str = face.SetLayout();
		String[] splitStr2 = str.split("\\s+");
		Dimension size3 = getSize(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[1])).getImage()
				.getScaledInstance(size3.width, size3.height, Image.SCALE_SMOOTH)));
		int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed");
		if (input == 0) {
			panel_1.setVisible(false);
			panel_9.setVisible(false);
			panel_11.setVisible(false);
			panel_2.setVisible(true);
		}

	}

	public void EyeFill(String Eye) {
		Face face = new Eyes(new FaceShape(new Face(), Hair), Eye);
		String str = face.SetLayout();
		String[] splitStr2 = str.split("\\s+");

		
		
		Dimension size3_ = getSize(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[1])).getImage()
				.getScaledInstance(size3_.width, size3_.height, Image.SCALE_SMOOTH)));
		
		
		Dimension size3 = getSize(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[2])).getImage()
				.getScaledInstance(size3.width, size3.height, Image.SCALE_SMOOTH)));


		int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed");
		if (input == 0) {
			panel_1.setVisible(false);
			panel_9.setVisible(true);
			panel_11.setVisible(false);
			panel_2.setVisible(false);
		}

	}

	public void NoseFill(String Nose) {
		Face face = new FaceNose(new Eyes(new FaceShape(new Face(), Hair), eyes), Nose);
		String str = face.SetLayout();
		String[] splitStr2 = str.split("\\s+");

		
		
		Dimension size2 = getSize(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[3])).getImage()
				.getScaledInstance(size2.width, size2.height, Image.SCALE_SMOOTH)));
		

		
		Dimension size3 = getSize(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[2])).getImage()
				.getScaledInstance(size3.width, size3.height, Image.SCALE_SMOOTH)));
		
		
		Dimension size3_ = getSize(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[1])).getImage()
				.getScaledInstance(size3_.width, size3_.height, Image.SCALE_SMOOTH)));

		
		

		int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed");
		if (input == 0) {
			panel_1.setVisible(false);
			panel_9.setVisible(false);
			panel_11.setVisible(true);
			panel_2.setVisible(false);
		}

	}

	public void LipsFill(String Lips) {
		Face face = new mouth(new FaceNose(new Eyes(new FaceShape(new Face(), Hair), eyes), nose), Lips);
		String str = face.SetLayout();
		String[] splitStr2 = str.split("\\s+");

		
		
		
		Dimension size2 = getSize(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[3])).getImage()
				.getScaledInstance(size2.width, size2.height, Image.SCALE_SMOOTH)));

		Dimension size1 = getSize(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[4])).getImage()
				.getScaledInstance(size1.width, size1.height, Image.SCALE_SMOOTH)));

		Dimension size21 = getSize(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[3])).getImage()
				.getScaledInstance(size21.width, size21.height, Image.SCALE_SMOOTH)));
		
		Dimension size3 = getSize(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[2])).getImage()
				.getScaledInstance(size3.width, size3.height, Image.SCALE_SMOOTH)));
		
		lblNewLabel_3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[4])).getImage()
				.getScaledInstance(size1.width, size1.height, Image.SCALE_SMOOTH)));
		
		
		Dimension size4 = getSize(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(splitStr2[1])).getImage()
				.getScaledInstance(size4.width, size4.height, Image.SCALE_SMOOTH)));
		
		
		
		
		int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed");
		if (input == 0) {
			Character ch = new Character();
			String text = ch.getCharac(Hair, eyes, nose, Lips);
			lblNewLabel_8.setVisible(true);
			lblNewLabel_9.setVisible(true);
			lblNewLabel_9.setText(text);
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblNewLabel_1 = new JLabel();

		
		lblNewLabel_1.setBackground(new Color(255, 160, 122));
		lblNewLabel_1.setBounds(617, 195, 111, 31);

		frame.getContentPane().add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBackground(new Color(255, 160, 122));
		
		lblNewLabel_2.setBounds(668, 226, 24, 23);
		frame.getContentPane().add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel();
		
		lblNewLabel_3.setBackground(new Color(255, 160, 122));
		lblNewLabel_3.setBounds(653, 260, 37, 31);
		frame.getContentPane().add(lblNewLabel_3);

		

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 11, 473, 517);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

		panel_1 = new JPanel();
		layeredPane.add(panel_1, "name_165382102371700");
		panel_1.setLayout(null);

		lblNewLabel_5 = new JLabel("Hair");
		lblNewLabel_5.setBounds(203, 11, 54, 32);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel_1.add(lblNewLabel_5);

		ButtonGroup group = new ButtonGroup();

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(25, 54, 180, 121);
		panel_1.add(panel);
		panel.setLayout(null);

		JRadioButton rdbtnHair1 = new JRadioButton("");
		rdbtnHair1.setBackground(Color.DARK_GRAY);
		rdbtnHair1.setBounds(6, 48, 21, 21);
		panel.add(rdbtnHair1);
		rdbtnHair1.setSelected(true);
		group.add(rdbtnHair1);

		lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrHair[0])).getImage()
				.getScaledInstance(137, 99, Image.SCALE_SMOOTH)));

		lblNewLabel_4.setBounds(33, 11, 137, 99);
		panel.add(lblNewLabel_4);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		// lblNewLabel_2.setIcon(new ImageIcon(new
		// javax.swing.ImageIcon(getClass().getResource("background/hair.png")).getImage().getScaledInstance(121,
		// 180, Image.SCALE_SMOOTH)));
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(269, 54, 180, 121);
		panel_1.add(panel_4);

		JRadioButton rdbtnHair2 = new JRadioButton("");
		rdbtnHair2.setBackground(Color.DARK_GRAY);
		rdbtnHair2.setBounds(6, 48, 21, 21);
		panel_4.add(rdbtnHair2);

		JLabel lblNewLabel_4_1 = new JLabel();
		lblNewLabel_4_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrHair[1])).getImage()
				.getScaledInstance(137, 99, Image.SCALE_SMOOTH)));

		lblNewLabel_4_1.setBounds(33, 11, 137, 99);
		panel_4.add(lblNewLabel_4_1);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(25, 198, 180, 121);
		panel_1.add(panel_3);

		JRadioButton rdbtnHair3 = new JRadioButton("");
		rdbtnHair3.setBackground(Color.DARK_GRAY);
		rdbtnHair3.setBounds(6, 48, 21, 21);
		panel_3.add(rdbtnHair3);

		JLabel lblNewLabel_4_2 = new JLabel();
		lblNewLabel_4_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrHair[2])).getImage()
				.getScaledInstance(137, 99, Image.SCALE_SMOOTH)));
		lblNewLabel_4_2.setBounds(33, 11, 137, 99);
		panel_3.add(lblNewLabel_4_2);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.DARK_GRAY);
		panel_5.setBounds(269, 198, 180, 121);
		panel_1.add(panel_5);

		JRadioButton rdbtnHair4 = new JRadioButton("");
		rdbtnHair4.setBackground(Color.DARK_GRAY);
		rdbtnHair4.setBounds(6, 48, 21, 21);
		panel_5.add(rdbtnHair4);

		JLabel lblNewLabel_4_3 = new JLabel();
		lblNewLabel_4_3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrHair[3])).getImage()
				.getScaledInstance(137, 99, Image.SCALE_SMOOTH)));

		lblNewLabel_4_3.setBounds(33, 11, 137, 99);
		panel_5.add(lblNewLabel_4_3);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.DARK_GRAY);
		panel_6.setBounds(25, 337, 180, 121);
		panel_1.add(panel_6);

		JRadioButton rdbtnHair5 = new JRadioButton("");
		rdbtnHair5.setBackground(Color.DARK_GRAY);
		rdbtnHair5.setBounds(6, 48, 21, 21);
		panel_6.add(rdbtnHair5);

		JLabel lblNewLabel_4_4 = new JLabel();
		lblNewLabel_4_4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrHair[4])).getImage()
				.getScaledInstance(137, 99, Image.SCALE_SMOOTH)));

		lblNewLabel_4_4.setBounds(33, 11, 137, 99);
		panel_6.add(lblNewLabel_4_4);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(Color.DARK_GRAY);
		panel_7.setBounds(269, 337, 180, 121);
		panel_1.add(panel_7);

		JRadioButton rdbtnHair6 = new JRadioButton("");
		rdbtnHair6.setBackground(Color.DARK_GRAY);
		rdbtnHair6.setBounds(6, 48, 21, 21);
		panel_7.add(rdbtnHair6);

		JLabel lblNewLabel_4_5 = new JLabel();
		lblNewLabel_4_5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrHair[5])).getImage()
				.getScaledInstance(137, 99, Image.SCALE_SMOOTH)));

		lblNewLabel_4_5.setBounds(33, 11, 137, 99);
		panel_7.add(lblNewLabel_4_5);

		panel_2 = new JPanel();
		layeredPane.add(panel_2, "name_165400808002500");
		panel_2.setLayout(null);

		JLabel lblNewLabel_5_1 = new JLabel("Eyes");
		lblNewLabel_5_1.setBounds(206, 5, 63, 32);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel_2.add(lblNewLabel_5_1);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(Color.DARK_GRAY);
		panel_8.setBounds(21, 64, 190, 70);
		panel_2.add(panel_8);

		JRadioButton rdbtnEye1 = new JRadioButton("");
		rdbtnEye1.setSelected(true);
		rdbtnEye1.setBackground(Color.DARK_GRAY);
		rdbtnEye1.setBounds(6, 26, 21, 21);
		panel_8.add(rdbtnEye1);

		JLabel lblNewLabel_4_6 = new JLabel();
		lblNewLabel_4_6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[0])).getImage()
				.getScaledInstance(137, 50, Image.SCALE_SMOOTH)));

		lblNewLabel_4_6.setBounds(43, 11, 137, 50);
		panel_8.add(lblNewLabel_4_6);

		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBackground(Color.DARK_GRAY);
		panel_8_1.setBounds(262, 64, 190, 70);
		panel_2.add(panel_8_1);

		JRadioButton rdbtnEye2 = new JRadioButton("");
		rdbtnEye2.setSelected(true);
		rdbtnEye2.setBackground(Color.DARK_GRAY);
		rdbtnEye2.setBounds(6, 28, 21, 21);
		panel_8_1.add(rdbtnEye2);

		JLabel lblNewLabel_4_6_1 = new JLabel();
		lblNewLabel_4_6_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[9])).getImage()
				.getScaledInstance(137, 50, Image.SCALE_SMOOTH)));

		lblNewLabel_4_6_1.setBounds(33, 11, 137, 50);
		panel_8_1.add(lblNewLabel_4_6_1);

		JPanel panel_8_2 = new JPanel();
		panel_8_2.setLayout(null);
		panel_8_2.setBackground(Color.DARK_GRAY);
		panel_8_2.setBounds(21, 240, 190, 63);
		panel_2.add(panel_8_2);

		JRadioButton rdbtnEye5 = new JRadioButton("");
		rdbtnEye5.setSelected(true);
		rdbtnEye5.setBackground(Color.DARK_GRAY);
		rdbtnEye5.setBounds(6, 23, 21, 21);
		panel_8_2.add(rdbtnEye5);

		JLabel lblNewLabel_4_6_2 = new JLabel();
		lblNewLabel_4_6_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[1])).getImage()
				.getScaledInstance(137, 50, Image.SCALE_SMOOTH)));

		lblNewLabel_4_6_2.setBounds(43, 11, 137, 50);
		panel_8_2.add(lblNewLabel_4_6_2);

		JPanel panel_8_3 = new JPanel();
		panel_8_3.setLayout(null);
		panel_8_3.setBackground(Color.DARK_GRAY);
		panel_8_3.setBounds(262, 155, 190, 63);
		panel_2.add(panel_8_3);

		JRadioButton rdbtnEye4 = new JRadioButton("");
		rdbtnEye4.setSelected(true);
		rdbtnEye4.setBackground(Color.DARK_GRAY);
		rdbtnEye4.setBounds(6, 25, 21, 21);
		panel_8_3.add(rdbtnEye4);

		JLabel lblNewLabel_4_6_3 = new JLabel();
		lblNewLabel_4_6_3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[2])).getImage()
				.getScaledInstance(137, 50, Image.SCALE_SMOOTH)));
		lblNewLabel_4_6_3.setBounds(33, 11, 137, 50);
		panel_8_3.add(lblNewLabel_4_6_3);

		JPanel panel_8_4 = new JPanel();
		panel_8_4.setLayout(null);
		panel_8_4.setBackground(Color.DARK_GRAY);
		panel_8_4.setBounds(21, 324, 190, 63);
		panel_2.add(panel_8_4);

		JRadioButton rdbtnEye7 = new JRadioButton("");
		rdbtnEye7.setSelected(true);
		rdbtnEye7.setBackground(Color.DARK_GRAY);
		rdbtnEye7.setBounds(6, 29, 21, 21);
		panel_8_4.add(rdbtnEye7);

		JLabel lblNewLabel_4_6_4 = new JLabel();
		lblNewLabel_4_6_4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[3])).getImage()
				.getScaledInstance(137, 50, Image.SCALE_SMOOTH)));

		lblNewLabel_4_6_4.setBounds(33, 11, 137, 50);
		panel_8_4.add(lblNewLabel_4_6_4);

		JPanel panel_8_5 = new JPanel();
		panel_8_5.setLayout(null);
		panel_8_5.setBackground(Color.DARK_GRAY);
		panel_8_5.setBounds(262, 240, 190, 63);
		panel_2.add(panel_8_5);

		JRadioButton rdbtnEye6 = new JRadioButton("");
		rdbtnEye6.setSelected(true);
		rdbtnEye6.setBackground(Color.DARK_GRAY);
		rdbtnEye6.setBounds(6, 27, 21, 21);
		panel_8_5.add(rdbtnEye6);

		JLabel lblNewLabel_4_6_5 = new JLabel();
		lblNewLabel_4_6_5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[4])).getImage()
				.getScaledInstance(137, 50, Image.SCALE_SMOOTH)));

		lblNewLabel_4_6_5.setBounds(43, 11, 137, 50);
		panel_8_5.add(lblNewLabel_4_6_5);

		JPanel panel_8_6 = new JPanel();
		panel_8_6.setLayout(null);
		panel_8_6.setBackground(Color.DARK_GRAY);
		panel_8_6.setBounds(21, 155, 190, 63);
		panel_2.add(panel_8_6);

		JRadioButton rdbtnEye3 = new JRadioButton("");
		rdbtnEye3.setSelected(true);
		rdbtnEye3.setBackground(Color.DARK_GRAY);
		rdbtnEye3.setBounds(6, 26, 21, 21);
		panel_8_6.add(rdbtnEye3);

		JLabel lblNewLabel_4_6_6 = new JLabel();
		lblNewLabel_4_6_6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[5])).getImage()
				.getScaledInstance(137, 50, Image.SCALE_SMOOTH)));

		lblNewLabel_4_6_6.setBounds(43, 11, 137, 50);
		panel_8_6.add(lblNewLabel_4_6_6);

		JPanel panel_8_4_1 = new JPanel();
		panel_8_4_1.setLayout(null);
		panel_8_4_1.setBackground(Color.DARK_GRAY);
		panel_8_4_1.setBounds(262, 324, 190, 63);
		panel_2.add(panel_8_4_1);

		JRadioButton rdbtnEye8 = new JRadioButton("");
		rdbtnEye8.setSelected(true);
		rdbtnEye8.setBackground(Color.DARK_GRAY);
		rdbtnEye8.setBounds(6, 29, 21, 21);
		panel_8_4_1.add(rdbtnEye8);

		JLabel lblNewLabel_4_6_4_1 = new JLabel();
		lblNewLabel_4_6_4_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[6]))
				.getImage().getScaledInstance(137, 50, Image.SCALE_SMOOTH)));

		lblNewLabel_4_6_4_1.setBounds(33, 11, 137, 50);
		panel_8_4_1.add(lblNewLabel_4_6_4_1);

		JPanel panel_8_4_2 = new JPanel();
		panel_8_4_2.setLayout(null);
		panel_8_4_2.setBackground(Color.DARK_GRAY);
		panel_8_4_2.setBounds(21, 398, 190, 63);
		panel_2.add(panel_8_4_2);

		JRadioButton rdbtnEye9 = new JRadioButton("");
		rdbtnEye9.setSelected(true);
		rdbtnEye9.setBackground(Color.DARK_GRAY);
		rdbtnEye9.setBounds(6, 29, 21, 21);
		panel_8_4_2.add(rdbtnEye9);

		JLabel lblNewLabel_4_6_4_2 = new JLabel();
		lblNewLabel_4_6_4_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[7]))
				.getImage().getScaledInstance(137, 50, Image.SCALE_SMOOTH)));

		lblNewLabel_4_6_4_2.setBounds(33, 11, 137, 50);
		panel_8_4_2.add(lblNewLabel_4_6_4_2);

		JPanel panel_8_4_3 = new JPanel();

		panel_8_4_3.setLayout(null);
		panel_8_4_3.setBackground(Color.DARK_GRAY);
		panel_8_4_3.setBounds(262, 398, 190, 63);
		panel_2.add(panel_8_4_3);

		JRadioButton rdbtnEye10 = new JRadioButton("");
		rdbtnEye10.setSelected(true);
		rdbtnEye10.setBackground(Color.DARK_GRAY);
		rdbtnEye10.setBounds(6, 29, 21, 21);
		panel_8_4_3.add(rdbtnEye10);

		JLabel lblNewLabel_4_6_4_3 = new JLabel();
		lblNewLabel_4_6_4_3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(AryEye[8]))
				.getImage().getScaledInstance(137, 50, Image.SCALE_SMOOTH)));

		lblNewLabel_4_6_4_3.setBounds(33, 11, 137, 50);
		panel_8_4_3.add(lblNewLabel_4_6_4_3);

		group.add(rdbtnHair6);
		group.add(rdbtnHair5);
		group.add(rdbtnHair4);
		group.add(rdbtnHair2);
		group.add(rdbtnHair3);

		JButton btnNewButton_1 = new JButton("Select Hair\r\n");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String str;
				if (rdbtnHair1.isSelected()) {

					Hair = ArrHair[0];

					HairFill(Hair);

				}
				if (rdbtnHair2.isSelected()) {

					Hair = ArrHair[1];

					HairFill(Hair);

				}
				if (rdbtnHair3.isSelected()) {

					Hair = ArrHair[2];

					HairFill(Hair);

				}
				if (rdbtnHair4.isSelected()) {

					Hair = ArrHair[3];

					HairFill(Hair);

				}
				if (rdbtnHair5.isSelected()) {

					Hair = ArrHair[4];

					HairFill(Hair);

				}
				if (rdbtnHair6.isSelected()) {

					Hair = ArrHair[5];

					HairFill(Hair);

				}

			}
		});
		btnNewButton_1.setBounds(186, 483, 104, 23);
		panel_1.add(btnNewButton_1);

		ButtonGroup groupEye = new ButtonGroup();
		groupEye.add(rdbtnEye10);
		groupEye.add(rdbtnEye9);
		groupEye.add(rdbtnEye8);
		groupEye.add(rdbtnEye3);
		groupEye.add(rdbtnEye6);
		groupEye.add(rdbtnEye7);
		groupEye.add(rdbtnEye4);
		groupEye.add(rdbtnEye5);
		groupEye.add(rdbtnEye2);
		groupEye.add(rdbtnEye1);

		JButton btnNewButton_2 = new JButton("Select Eye");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str;
				if (rdbtnEye1.isSelected()) {
					eyes = AryEye[0];
					EyeFill(eyes);
				}
				if (rdbtnEye2.isSelected()) {

					eyes = AryEye[9];

					EyeFill(eyes);
				}
				if (rdbtnEye3.isSelected()) {
					eyes = AryEye[5];
					EyeFill(eyes);
				}
				if (rdbtnEye4.isSelected()) {
					eyes = AryEye[2];
					EyeFill(eyes);
				}
				if (rdbtnEye5.isSelected()) {
					eyes = AryEye[1];
					EyeFill(eyes);
				}
				if (rdbtnEye6.isSelected()) {
					eyes = AryEye[4];
					EyeFill(eyes);
				}
				if (rdbtnEye7.isSelected()) {
					eyes = AryEye[3];
					EyeFill(eyes);
				}
				if (rdbtnEye8.isSelected()) {
					eyes = AryEye[6];
					EyeFill(eyes);
				}
				if (rdbtnEye9.isSelected()) {
					eyes = AryEye[7];
					EyeFill(eyes);
				}
				if (rdbtnEye10.isSelected()) {
					eyes = AryEye[8];
					EyeFill(eyes);
				}

			}
		});
		btnNewButton_2.setBounds(180, 483, 112, 23);
		panel_2.add(btnNewButton_2);

		panel_9 = new JPanel();
		layeredPane.add(panel_9, "name_10576133804600");
		panel_9.setLayout(null);

		JLabel lblNewLabel_5_1_1 = new JLabel("Nose");
		lblNewLabel_5_1_1.setBounds(199, 5, 62, 32);
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel_9.add(lblNewLabel_5_1_1);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.DARK_GRAY);
		panel_10.setBounds(10, 48, 106, 70);
		panel_9.add(panel_10);
		panel_10.setLayout(null);

		JRadioButton rdbtnNose1 = new JRadioButton("");
		rdbtnNose1.setBackground(Color.DARK_GRAY);
		rdbtnNose1.setBounds(6, 23, 21, 23);
		panel_10.add(rdbtnNose1);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[0])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6.setBounds(33, 11, 59, 45);
		panel_10.add(lblNewLabel_6);

		JPanel panel_10_1 = new JPanel();
		panel_10_1.setLayout(null);
		panel_10_1.setBackground(Color.DARK_GRAY);
		panel_10_1.setBounds(173, 48, 106, 70);
		panel_9.add(panel_10_1);

		JRadioButton rdbtnNose2 = new JRadioButton("");
		rdbtnNose2.setBackground(Color.DARK_GRAY);
		rdbtnNose2.setBounds(6, 23, 21, 23);
		panel_10_1.add(rdbtnNose2);

		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setOpaque(true);
		lblNewLabel_6_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[1])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6_1.setBackground(Color.WHITE);
		lblNewLabel_6_1.setBounds(33, 11, 59, 45);
		panel_10_1.add(lblNewLabel_6_1);

		JPanel panel_10_2 = new JPanel();
		panel_10_2.setLayout(null);
		panel_10_2.setBackground(Color.DARK_GRAY);
		panel_10_2.setBounds(325, 48, 106, 70);
		panel_9.add(panel_10_2);

		JRadioButton rdbtnNose3 = new JRadioButton("");
		rdbtnNose3.setBackground(Color.DARK_GRAY);
		rdbtnNose3.setBounds(6, 23, 21, 23);
		panel_10_2.add(rdbtnNose3);

		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[2])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6_2.setOpaque(true);
		lblNewLabel_6_2.setBackground(Color.WHITE);
		lblNewLabel_6_2.setBounds(33, 11, 59, 45);
		panel_10_2.add(lblNewLabel_6_2);

		JPanel panel_10_3 = new JPanel();
		panel_10_3.setLayout(null);
		panel_10_3.setBackground(Color.DARK_GRAY);
		panel_10_3.setBounds(10, 164, 106, 70);
		panel_9.add(panel_10_3);

		JRadioButton rdbtnNose4 = new JRadioButton("");
		rdbtnNose4.setBackground(Color.DARK_GRAY);
		rdbtnNose4.setBounds(6, 23, 21, 23);
		panel_10_3.add(rdbtnNose4);

		JLabel lblNewLabel_6_3 = new JLabel("");
		lblNewLabel_6_3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[3])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6_3.setOpaque(true);
		lblNewLabel_6_3.setBackground(Color.WHITE);
		lblNewLabel_6_3.setBounds(33, 11, 59, 45);
		panel_10_3.add(lblNewLabel_6_3);

		JPanel panel_10_4 = new JPanel();
		panel_10_4.setLayout(null);
		panel_10_4.setBackground(Color.DARK_GRAY);
		panel_10_4.setBounds(173, 164, 106, 70);
		panel_9.add(panel_10_4);

		JRadioButton rdbtnNose5 = new JRadioButton("");
		rdbtnNose5.setBackground(Color.DARK_GRAY);
		rdbtnNose5.setBounds(6, 23, 21, 23);
		panel_10_4.add(rdbtnNose5);

		JLabel lblNewLabel_6_4 = new JLabel("");
		lblNewLabel_6_4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[4])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6_4.setOpaque(true);
		lblNewLabel_6_4.setBackground(Color.WHITE);
		lblNewLabel_6_4.setBounds(33, 11, 59, 45);
		panel_10_4.add(lblNewLabel_6_4);

		JPanel panel_10_5 = new JPanel();
		panel_10_5.setLayout(null);
		panel_10_5.setBackground(Color.DARK_GRAY);
		panel_10_5.setBounds(325, 164, 106, 70);
		panel_9.add(panel_10_5);

		JRadioButton rdbtnNose6 = new JRadioButton("");
		rdbtnNose6.setBackground(Color.DARK_GRAY);
		rdbtnNose6.setBounds(6, 23, 21, 23);
		panel_10_5.add(rdbtnNose6);

		JLabel lblNewLabel_6_5 = new JLabel("");
		lblNewLabel_6_5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[5])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6_5.setOpaque(true);
		lblNewLabel_6_5.setBackground(Color.WHITE);
		lblNewLabel_6_5.setBounds(33, 11, 59, 45);
		panel_10_5.add(lblNewLabel_6_5);

		JPanel panel_10_6 = new JPanel();
		panel_10_6.setLayout(null);
		panel_10_6.setBackground(Color.DARK_GRAY);
		panel_10_6.setBounds(10, 293, 106, 70);
		panel_9.add(panel_10_6);

		JRadioButton rdbtnNose7 = new JRadioButton("");
		rdbtnNose7.setBackground(Color.DARK_GRAY);
		rdbtnNose7.setBounds(6, 23, 21, 23);
		panel_10_6.add(rdbtnNose7);

		JLabel lblNewLabel_6_6 = new JLabel("");
		lblNewLabel_6_6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[6])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6_6.setOpaque(true);
		lblNewLabel_6_6.setBackground(Color.WHITE);
		lblNewLabel_6_6.setBounds(33, 11, 59, 45);
		panel_10_6.add(lblNewLabel_6_6);

		JPanel panel_10_7 = new JPanel();
		panel_10_7.setLayout(null);
		panel_10_7.setBackground(Color.DARK_GRAY);
		panel_10_7.setBounds(173, 293, 106, 70);
		panel_9.add(panel_10_7);

		JRadioButton rdbtnNose8 = new JRadioButton("");
		rdbtnNose8.setBackground(Color.DARK_GRAY);
		rdbtnNose8.setBounds(6, 23, 21, 23);
		panel_10_7.add(rdbtnNose8);

		JLabel lblNewLabel_6_7 = new JLabel("");
		lblNewLabel_6_7.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[7])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6_7.setOpaque(true);
		lblNewLabel_6_7.setBackground(Color.WHITE);
		lblNewLabel_6_7.setBounds(33, 11, 59, 45);
		panel_10_7.add(lblNewLabel_6_7);

		JPanel panel_10_8 = new JPanel();
		panel_10_8.setLayout(null);
		panel_10_8.setBackground(Color.DARK_GRAY);
		panel_10_8.setBounds(325, 293, 106, 70);
		panel_9.add(panel_10_8);

		JRadioButton rdbtnNose9 = new JRadioButton("");
		rdbtnNose9.setBackground(Color.DARK_GRAY);
		rdbtnNose9.setBounds(6, 23, 21, 23);
		panel_10_8.add(rdbtnNose9);

		JLabel lblNewLabel_6_8 = new JLabel("");
		lblNewLabel_6_8.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[8])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6_8.setOpaque(true);
		lblNewLabel_6_8.setBackground(Color.WHITE);
		lblNewLabel_6_8.setBounds(33, 11, 59, 45);
		panel_10_8.add(lblNewLabel_6_8);

		JPanel panel_10_9 = new JPanel();
		panel_10_9.setLayout(null);
		panel_10_9.setBackground(Color.DARK_GRAY);
		panel_10_9.setBounds(173, 384, 106, 70);
		panel_9.add(panel_10_9);

		JRadioButton rdbtnNose10 = new JRadioButton("");
		rdbtnNose10.setBackground(Color.DARK_GRAY);
		rdbtnNose10.setBounds(6, 23, 21, 23);
		panel_10_9.add(rdbtnNose10);

		JLabel lblNewLabel_6_9 = new JLabel("");
		lblNewLabel_6_9.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrNose[9])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_6_9.setOpaque(true);
		lblNewLabel_6_9.setBackground(Color.WHITE);
		lblNewLabel_6_9.setBounds(33, 11, 59, 45);
		panel_10_9.add(lblNewLabel_6_9);

		ButtonGroup groupNose = new ButtonGroup();
		group.add(rdbtnNose10);
		group.add(rdbtnNose9);
		group.add(rdbtnNose8);
		group.add(rdbtnNose7);
		group.add(rdbtnNose6);
		group.add(rdbtnNose5);
		group.add(rdbtnNose4);
		group.add(rdbtnNose3);
		group.add(rdbtnNose2);
		group.add(rdbtnNose1);

		JButton btnNewButton_4 = new JButton("Select Nose");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str;
				if (rdbtnNose1.isSelected()) {
					nose = ArrNose[0];
					NoseFill(nose);
				}
				if (rdbtnNose2.isSelected()) {
					nose = ArrNose[1];
					NoseFill(nose);
				}
				if (rdbtnNose3.isSelected()) {
					nose = ArrNose[2];
					NoseFill(nose);
				}
				if (rdbtnNose4.isSelected()) {
					nose = ArrNose[3];
					NoseFill(nose);
				}
				if (rdbtnNose5.isSelected()) {
					nose = ArrNose[4];
					NoseFill(nose);
				}
				if (rdbtnNose6.isSelected()) {
					nose = ArrNose[5];
					NoseFill(nose);
				}
				if (rdbtnNose7.isSelected()) {
					nose = ArrNose[6];
					NoseFill(nose);
				}
				if (rdbtnNose8.isSelected()) {
					nose = ArrNose[7];
					NoseFill(nose);
				}
				if (rdbtnNose9.isSelected()) {
					nose = ArrNose[8];
					NoseFill(nose);
				}
				if (rdbtnNose10.isSelected()) {
					nose = ArrNose[9];
					NoseFill(nose);
				}

			}
		});
		btnNewButton_4.setBounds(199, 472, 106, 23);
		panel_9.add(btnNewButton_4);

		panel_11 = new JPanel();
		layeredPane.add(panel_11, "name_12572905181100");
		panel_11.setLayout(null);

		JLabel lblNewLabel_5_1_1_1 = new JLabel("Lips");
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_5_1_1_1.setBounds(196, 11, 53, 32);
		panel_11.add(lblNewLabel_5_1_1_1);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.DARK_GRAY);
		panel_12.setBounds(23, 70, 104, 56);
		panel_11.add(panel_12);
		panel_12.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[0])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7.setBounds(37, 11, 59, 36);
		panel_12.add(lblNewLabel_7);

		JRadioButton rdbtnLips1 = new JRadioButton("");
		rdbtnLips1.setBackground(Color.DARK_GRAY);
		rdbtnLips1.setBounds(19, 11, 21, 36);
		panel_12.add(rdbtnLips1);

		JPanel panel_12_1 = new JPanel();
		panel_12_1.setLayout(null);
		panel_12_1.setBackground(Color.DARK_GRAY);
		panel_12_1.setBounds(189, 70, 104, 56);
		panel_11.add(panel_12_1);

		JRadioButton rdbtnLips2 = new JRadioButton("");
		rdbtnLips2.setBackground(Color.DARK_GRAY);
		rdbtnLips2.setBounds(19, 11, 21, 36);
		panel_12_1.add(rdbtnLips2);

		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[1])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_1.setBounds(37, 11, 59, 36);
		panel_12_1.add(lblNewLabel_7_1);

		JPanel panel_12_2 = new JPanel();
		panel_12_2.setLayout(null);
		panel_12_2.setBackground(Color.DARK_GRAY);
		panel_12_2.setBounds(347, 70, 104, 56);
		panel_11.add(panel_12_2);

		JRadioButton rdbtnLips3 = new JRadioButton("");
		rdbtnLips3.setBackground(Color.DARK_GRAY);
		rdbtnLips3.setBounds(6, 0, 21, 56);
		panel_12_2.add(rdbtnLips3);

		JLabel lblNewLabel_7_2 = new JLabel("");
		lblNewLabel_7_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[2])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_2.setBounds(37, 11, 59, 36);
		panel_12_2.add(lblNewLabel_7_2);

		JPanel panel_12_3 = new JPanel();
		panel_12_3.setLayout(null);
		panel_12_3.setBackground(Color.DARK_GRAY);
		panel_12_3.setBounds(23, 159, 104, 56);
		panel_11.add(panel_12_3);

		JRadioButton rdbtnLips4 = new JRadioButton("");
		rdbtnLips4.setBackground(Color.DARK_GRAY);
		rdbtnLips4.setBounds(17, 0, 26, 56);
		panel_12_3.add(rdbtnLips4);

		JLabel lblNewLabel_7_3 = new JLabel("");
		lblNewLabel_7_3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[3])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_3.setBounds(37, 11, 59, 36);
		panel_12_3.add(lblNewLabel_7_3);

		JPanel panel_12_4 = new JPanel();
		panel_12_4.setLayout(null);
		panel_12_4.setBackground(Color.DARK_GRAY);
		panel_12_4.setBounds(189, 159, 104, 56);
		panel_11.add(panel_12_4);

		JRadioButton rdbtnLips5 = new JRadioButton("");

		rdbtnLips5.setBackground(Color.DARK_GRAY);
		rdbtnLips5.setBounds(19, 11, 21, 36);
		panel_12_4.add(rdbtnLips5);

		JLabel lblNewLabel_7_4 = new JLabel("");
		lblNewLabel_7_4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[4])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_4.setBounds(37, 11, 59, 36);
		panel_12_4.add(lblNewLabel_7_4);

		JPanel panel_12_5 = new JPanel();
		panel_12_5.setLayout(null);
		panel_12_5.setBackground(Color.DARK_GRAY);
		panel_12_5.setBounds(347, 159, 104, 56);
		panel_11.add(panel_12_5);

		JRadioButton rdbtnLips6 = new JRadioButton("");
		rdbtnLips6.setBackground(Color.DARK_GRAY);

		rdbtnLips6.setBounds(19, 11, 21, 36);
		panel_12_5.add(rdbtnLips6);

		JLabel lblNewLabel_7_5 = new JLabel("");
		lblNewLabel_7_5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[5])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_5.setBounds(37, 11, 59, 36);
		panel_12_5.add(lblNewLabel_7_5);

		JPanel panel_12_6 = new JPanel();
		panel_12_6.setLayout(null);
		panel_12_6.setBackground(Color.DARK_GRAY);
		panel_12_6.setBounds(23, 246, 104, 56);
		panel_11.add(panel_12_6);

		JRadioButton rdbtnLips7 = new JRadioButton("");
		rdbtnLips7.setBackground(Color.DARK_GRAY);
		rdbtnLips7.setBounds(26, 11, 21, 36);
		panel_12_6.add(rdbtnLips7);

		JLabel lblNewLabel_7_6 = new JLabel("");
		lblNewLabel_7_6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[6])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_6.setBounds(37, 11, 59, 36);
		panel_12_6.add(lblNewLabel_7_6);

		JPanel panel_12_7 = new JPanel();
		panel_12_7.setLayout(null);
		panel_12_7.setBackground(Color.DARK_GRAY);
		panel_12_7.setBounds(189, 246, 104, 56);
		panel_11.add(panel_12_7);

		JRadioButton rdbtnLips8 = new JRadioButton("");
		rdbtnLips8.setBackground(Color.DARK_GRAY);
		rdbtnLips8.setBounds(19, 11, 21, 36);
		panel_12_7.add(rdbtnLips8);

		JLabel lblNewLabel_7_7 = new JLabel("");
		lblNewLabel_7_7.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[7])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_7.setBounds(37, 11, 59, 36);
		panel_12_7.add(lblNewLabel_7_7);

		JPanel panel_12_8 = new JPanel();
		panel_12_8.setLayout(null);
		panel_12_8.setBackground(Color.DARK_GRAY);
		panel_12_8.setBounds(347, 246, 104, 56);
		panel_11.add(panel_12_8);

		JRadioButton rdbtnLips9 = new JRadioButton("");

		rdbtnLips9.setBackground(Color.DARK_GRAY);
		rdbtnLips9.setBounds(22, 11, 21, 36);
		panel_12_8.add(rdbtnLips9);

		JLabel lblNewLabel_7_8 = new JLabel("");
		lblNewLabel_7_8.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[8])).getImage()
				.getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_8.setBounds(37, 11, 59, 36);
		panel_12_8.add(lblNewLabel_7_8);

		ButtonGroup groupLips = new ButtonGroup();
		groupLips.add(rdbtnLips9);
		groupLips.add(rdbtnLips8);
		groupLips.add(rdbtnLips7);
		groupLips.add(rdbtnLips6);
		groupLips.add(rdbtnLips5);
		groupLips.add(rdbtnLips4);
		groupLips.add(rdbtnLips3);
		groupLips.add(rdbtnLips2);
		groupLips.add(rdbtnLips1);

		JPanel panel_12_5_4 = new JPanel();
		panel_12_5_4.setLayout(null);
		panel_12_5_4.setBackground(Color.DARK_GRAY);
		panel_12_5_4.setBounds(23, 334, 104, 56);
		panel_11.add(panel_12_5_4);

		JRadioButton rdbtnLips10 = new JRadioButton("");
		rdbtnLips10.setBackground(Color.DARK_GRAY);
		rdbtnLips10.setBounds(19, 11, 21, 36);
		panel_12_5_4.add(rdbtnLips10);

		JLabel lblNewLabel_7_5_4 = new JLabel("");
		lblNewLabel_7_5_4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[12]))
				.getImage().getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_5_4.setBounds(37, 11, 59, 36);
		panel_12_5_4.add(lblNewLabel_7_5_4);

		JPanel panel_12_5_5 = new JPanel();
		panel_12_5_5.setLayout(null);
		panel_12_5_5.setBackground(Color.DARK_GRAY);
		panel_12_5_5.setBounds(189, 334, 104, 56);
		panel_11.add(panel_12_5_5);

		JRadioButton rdbtnLips11 = new JRadioButton("");
		rdbtnLips11.setBackground(Color.DARK_GRAY);
		rdbtnLips11.setBounds(19, 11, 21, 36);
		panel_12_5_5.add(rdbtnLips11);

		JLabel lblNewLabel_7_5_5 = new JLabel("");
		lblNewLabel_7_5_5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[13]))
				.getImage().getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_5_5.setBounds(37, 11, 59, 36);
		panel_12_5_5.add(lblNewLabel_7_5_5);

		JPanel panel_12_5_6 = new JPanel();
		panel_12_5_6.setLayout(null);
		panel_12_5_6.setBackground(Color.DARK_GRAY);
		panel_12_5_6.setBounds(347, 334, 104, 56);
		panel_11.add(panel_12_5_6);

		JRadioButton rdbtnLips12 = new JRadioButton("");
		rdbtnLips12.setBackground(Color.DARK_GRAY);
		rdbtnLips12.setBounds(19, 11, 21, 36);
		panel_12_5_6.add(rdbtnLips12);

		JLabel lblNewLabel_7_5_6 = new JLabel("");
		lblNewLabel_7_5_6.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(ArrLips[14]))
				.getImage().getScaledInstance(59, 45, Image.SCALE_SMOOTH)));

		lblNewLabel_7_5_6.setBounds(37, 11, 59, 36);
		panel_12_5_6.add(lblNewLabel_7_5_6);
		groupLips.add(rdbtnLips11);
		groupLips.add(rdbtnLips10);
		groupLips.add(rdbtnLips12);

		JButton btnNewButton_3 = new JButton("Select Lips");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnLips1.isSelected()) {
					lips = ArrLips[0];
					LipsFill(lips);
				}
				if (rdbtnLips2.isSelected()) {
					lips = ArrLips[1];
					LipsFill(lips);
				}
				if (rdbtnLips3.isSelected()) {
					lips = ArrNose[2];
					LipsFill(lips);
				}
				if (rdbtnLips4.isSelected()) {
					lips = ArrLips[3];
					LipsFill(lips);
				}
				if (rdbtnLips5.isSelected()) {
					lips = ArrLips[4];
					LipsFill(lips);
				}
				if (rdbtnLips6.isSelected()) {
					lips = ArrLips[5];
					LipsFill(lips);
				}
				if (rdbtnLips7.isSelected()) {
					lips = ArrLips[6];
					LipsFill(lips);
				}
				if (rdbtnLips8.isSelected()) {
					lips = ArrLips[7];
					LipsFill(lips);
				}
				if (rdbtnLips9.isSelected()) {
					lips = ArrLips[8];
					LipsFill(lips);
				}
				if (rdbtnLips10.isSelected()) {
					lips = ArrLips[12];
					LipsFill(lips);
				}
				if (rdbtnLips11.isSelected()) {
					lips = ArrLips[13];
					LipsFill(lips);
				}
				if (rdbtnLips12.isSelected()) {
					lips = ArrLips[14];
					LipsFill(lips);
				}
				
			}
		});
		btnNewButton_3.setBounds(163, 483, 104, 23);
		panel_11.add(btnNewButton_3);
		lblNewLabel = new JLabel();
		
		lblNewLabel.setBackground(Color.WHITE);
//		 lblNewLabel.setIcon(new ImageIcon(new
//		 javax.swing.ImageIcon(getClass().getResource("background/hair.png")).getImage().getScaledInstance( 369 
//		 ,325 , Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(523, 59, 329, 319);
		frame.getContentPane().add(lblNewLabel);
		
		 lblNewLabel_8 = new JLabel("Character");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(523, 479, 85, 23);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel label = new JLabel("New label");
		label.setBounds(623, 485, 55, -4);
		frame.getContentPane().add(label);
		
		lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(633, 479, 95, 20);
		frame.getContentPane().add(lblNewLabel_9);
	}
}

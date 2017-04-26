package KP.Energozberegenna;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TeploOputuvanna extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Nazad;
	private JLabel l_Hapka;
	private JLabel l_putanna1;
	private JLabel l_putanna2;
	private JLabel l_putanna4;
	private JLabel l_putanna5;
	private JRadioButton radioB_putanna1_1;
	private JRadioButton radioB_putanna1_2;
	private JSlider slider_putanna4;
	private JLabel l_slider_putanna4_1;
	private JLabel l_slider_putanna4_2;
	private JRadioButton radioB_putanna5_1;
	private ButtonGroup group_putanna3;
	private ButtonGroup group_putanna5;
	private ButtonGroup group_putanna1;
	private JRadioButton radioB_putanna5_2;

	private JButton b_Gotovo;

	SliderListener4 slider4 = new SliderListener4();

	private int i_slider_putanna4 = 50;

	private int i_putanna1;
	private int i_putanna3;
	private int i_putanna5;

	private JLabel l_fonVodaOputuvanna;
	private JLabel l_choice1_1;
	private JLabel l_choice1_2;
	private Choice choice_putanna1_2;
	private JLabel l_putanna3;
	private JRadioButton radioB_putanna3_1;
	private JRadioButton radioB_putanna3_2;
	private Choice choice_putanna1_1;

	public TeploOputuvanna(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		b_Nazad = new JButton("Назад");
		b_Nazad.setBounds(661, 0, 133, 34);
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Енергозбереження дому");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Nazad);

		l_Hapka = new JLabel("Пройдіть, будь ласка, опитування");
		l_Hapka.setForeground(Color.ORANGE);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 25));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(90, 4, 595, 30);
		getContentPane().add(l_Hapka);

		l_putanna1 = new JLabel("Де Ви мешкаєте ?");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setBounds(28, 47, 727, 30);
		getContentPane().add(l_putanna1);

		l_putanna2 = new JLabel("Вкажіть кількість кімнат та приблизну площу :");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setBounds(28, 136, 727, 30);
		getContentPane().add(l_putanna2);

		l_putanna4 = new JLabel("Чи є у Вас вентелі, регулятори на батареях ?");
		l_putanna4.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna4.setBounds(28, 324, 727, 30);
		getContentPane().add(l_putanna4);

		l_putanna5 = new JLabel("Чи є у Вас система \"тепла підлога\"  ?");
		l_putanna5.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna5.setBounds(28, 436, 727, 30);
		getContentPane().add(l_putanna5);

		radioB_putanna1_1 = new JRadioButton("Квартира");
		radioB_putanna1_1.setOpaque(false);
		radioB_putanna1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 1;
			}
		});
		radioB_putanna1_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_1.setBounds(90, 86, 322, 25);
		getContentPane().add(radioB_putanna1_1);

		radioB_putanna1_2 = new JRadioButton("Будинок");
		radioB_putanna1_2.setOpaque(false);
		radioB_putanna1_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_2.setBounds(506, 86, 249, 25);
		getContentPane().add(radioB_putanna1_2);
		radioB_putanna1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 2;
			}
		});

		slider_putanna4 = new JSlider();
		slider_putanna4.setOpaque(false);
		slider_putanna4.setBounds(20, 367, 770, 26);
		getContentPane().add(slider_putanna4);

		l_slider_putanna4_1 = new JLabel("Жодного");
		l_slider_putanna4_1.setForeground(Color.BLACK);
		l_slider_putanna4_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_1.setBounds(30, 407, 115, 16);
		getContentPane().add(l_slider_putanna4_1);

		l_slider_putanna4_2 = new JLabel("На кожній батареї");
		l_slider_putanna4_2.setForeground(Color.BLACK);
		l_slider_putanna4_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_2.setBounds(599, 407, 195, 16);
		getContentPane().add(l_slider_putanna4_2);

		radioB_putanna5_1 = new JRadioButton("Так, я маю цю систему");
		radioB_putanna5_1.setForeground(Color.BLACK);
		radioB_putanna5_1.setOpaque(false);
		radioB_putanna5_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna5_1.setBounds(90, 475, 322, 25);
		getContentPane().add(radioB_putanna5_1);
		radioB_putanna5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna5 = 1;
			}
		});

		radioB_putanna5_2 = new JRadioButton("Ні, не маю");
		radioB_putanna5_2.setForeground(Color.BLACK);
		radioB_putanna5_2.setOpaque(false);
		radioB_putanna5_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna5_2.setBounds(506, 475, 249, 25);
		getContentPane().add(radioB_putanna5_2);
		radioB_putanna5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna5 = 2;
			}
		});

		group_putanna1 = new ButtonGroup();
		group_putanna1.add(radioB_putanna1_1);
		group_putanna1.add(radioB_putanna1_2);

		group_putanna3 = new ButtonGroup();
		group_putanna3.add(radioB_putanna3_1);
		group_putanna3.add(radioB_putanna3_2);

		group_putanna5 = new ButtonGroup();
		group_putanna5.add(radioB_putanna5_1);
		group_putanna5.add(radioB_putanna5_2);

		b_Gotovo = new JButton("Готово");
		b_Gotovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s_putanna2_1 = choice_putanna1_1.getSelectedItem();
				String s_putanna2_2 = choice_putanna1_2.getSelectedItem();
				
				 System.out.println("s_putanna1 " + i_putanna1);
				 System.out.println("s_putanna2_1 " + s_putanna2_1);
				 System.out.println("s_putanna2_2 " + s_putanna2_2);
				 System.out.println("i_putanna3 " + i_putanna3);
				 System.out.println("i_slider_putanna4 " + i_slider_putanna4);
				 System.out.println("i_slider_putanna5 " + i_putanna5); 

				if (i_putanna1 == 0 || i_putanna3 == 0 || i_putanna5 == 0) {
					JOptionPane.showMessageDialog(null, "Помилка введення !");
				} else {
					// new VodaRezultatu("Водозбереження. Результат",i_putanna1,
					// i_putanna2, i_slider_putanna3, i_slider_putanna4,
					// i_slider_putanna5,
					// i_putanna6, i_slider_putanna7);
					setVisible(false);
				}

			}
		});
		b_Gotovo.setBounds(528, 524, 266, 41);
		getContentPane().add(b_Gotovo);

		// l_fonVodaOputuvanna = new JLabel("");
		// l_fonVodaOputuvanna.setBounds(0, 0, 794, 565);
		// l_fonVodaOputuvanna.setIcon(new
		// ImageIcon("res/fon_VodaOputuvanna.jpg"));
		// getContentPane().add(l_fonVodaOputuvanna);

		choice_putanna1_1 = new Choice();
		choice_putanna1_1.setBounds(222, 194, 94, 22);
		getContentPane().add(choice_putanna1_1);
		choice_putanna1_1.add("1");
		choice_putanna1_1.add("2");
		choice_putanna1_1.add("");
		choice_putanna1_1.add("4");
		choice_putanna1_1.add("5");

		l_choice1_1 = new JLabel("Кімнати :");
		l_choice1_1.setForeground(Color.BLACK);
		l_choice1_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_choice1_1.setBounds(101, 193, 115, 16);
		getContentPane().add(l_choice1_1);

		l_choice1_2 = new JLabel("Раз на тиждень :");
		l_choice1_2.setForeground(Color.BLACK);
		l_choice1_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_choice1_2.setBounds(425, 194, 160, 16);
		getContentPane().add(l_choice1_2);

		choice_putanna1_2 = new Choice();
		choice_putanna1_2.setBounds(591, 194, 105, 22);
		getContentPane().add(choice_putanna1_2);
		choice_putanna1_2.add("До 20 м2");
		choice_putanna1_2.add("20 Х 30 м2");
		choice_putanna1_2.add("30 Х 40 м2");
		choice_putanna1_2.add("40 Х 50 м2");
		choice_putanna1_2.add("50 Х 60 м2");
		choice_putanna1_2.add("60 Х 70 м2");
		choice_putanna1_2.add("70 Х 80 м2");
		choice_putanna1_2.add("80 Х 90 м2");
		choice_putanna1_2.add("90 Х 100 м2");
		choice_putanna1_2.add("Понад 100 м2");

		l_putanna3 = new JLabel("Яке у Вас теплопостачання ?");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setBounds(28, 238, 727, 30);
		getContentPane().add(l_putanna3);

		radioB_putanna3_1 = new JRadioButton("Центральне");
		radioB_putanna3_1.setOpaque(false);
		radioB_putanna3_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna3_1.setBounds(90, 277, 322, 25);
		getContentPane().add(radioB_putanna3_1);
		radioB_putanna3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna3 = 1;
			}
		});

		radioB_putanna3_2 = new JRadioButton("Автономне");
		radioB_putanna3_2.setOpaque(false);
		radioB_putanna3_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna3_2.setBounds(506, 277, 249, 25);
		getContentPane().add(radioB_putanna3_2);
		radioB_putanna3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna3 = 2;
			}
		});

		slider_putanna4.addChangeListener(slider4);

		setVisible(true);
	}

	class SliderListener4 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna4 = (JSlider) e.getSource();
			i_slider_putanna4 = (int) slider_putanna4.getValue();
		}
	}
}

package KP.Energozberegenna;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TeploOputuvanna1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Nazad;
	private JLabel l_Hapka;
	private JLabel l_putanna1;
	private JLabel l_putanna2;
	private JLabel l_putanna4;
	private JRadioButton radioB_putanna1_1;
	private JRadioButton radioB_putanna1_2;
	private JRadioButton radioB_putanna4_1;
	private ButtonGroup group_putanna3;
	private ButtonGroup group_putanna4;
	private ButtonGroup group_putanna1;
	private JRadioButton radioB_putanna4_2;

	private JButton b_Gotovo;

	private int i_putanna_grup1;
	private int i_putanna_grup3;
	private int i_putanna_grup4;

	private int i_putanna_grup4Var2;

	private JLabel l_fonVodaOputuvanna;
	private JLabel l_putanna3;
	private JRadioButton radioB_putanna3_1;
	private JRadioButton radioB_putanna3_2;
	private JRadioButton radioB_putanna1_6;
	private JRadioButton radioB_putanna1_7;
	private JRadioButton radioB_putanna1_8;
	private JRadioButton radioB_putanna1_9;
	private JButton b_Menu;

	private JRadioButton radioB_putanna1_3;
	private JRadioButton radioB_putanna1_4;
	private JRadioButton radioB_putanna1_5;

	private JCheckBox checkBox_putanna2_1;
	private JCheckBox checkBox_putanna2_2;
	private JCheckBox checkBox_putanna2_3;
	private JLabel l_putanna3Var2;
	private JLabel l_slider_putanna3Var2_3;
	private JLabel l_slider_putanna3Var2_1;
	private JLabel l_putanna4Var2;
	private JRadioButton radioB_putanna4Var2_1;
	private JRadioButton radioB_putanna4Var2_2;

	private JCheckBox checkBox_putanna2Var2_1;
	private JCheckBox checkBox_putanna2Var2_2;
	private JCheckBox checkBox_putanna2Var2_3;
	private JCheckBox checkBox_putanna2Var2_4;
	private JCheckBox checkBox_putanna2Var2_5;
	private JCheckBox checkBox_putanna2Var2_6;
	private JLabel l_slider_putanna3Var2_2;

	private JSlider slider_putanna3Var2;

	SliderListener3Var2 slider3Var2 = new SliderListener3Var2();

	private int i_slider_putanna3Var2 = 50;

	private ButtonGroup group_putanna4Var2;

	public TeploOputuvanna1(String s, final int i_putanna1, final int i_putanna2_1, final String s_putanna2_2,
			final int i_putanna3, final int i_slider_putanna4, final int i_putanna5) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		b_Nazad = new JButton("Назад");
		b_Nazad.setBounds(661, 33, 133, 34);
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeploOputuvanna("Теплозбереження");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Nazad);

		b_Menu = new JButton("Меню");
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Енергозбереження дому");
				setVisible(false);
			}
		});
		b_Menu.setBounds(661, 0, 133, 34);
		getContentPane().add(b_Menu);

		l_Hapka = new JLabel("Пройдіть, будь ласка, опитування");
		l_Hapka.setForeground(Color.BLUE);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 25));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(90, 4, 595, 30);
		getContentPane().add(l_Hapka);

		l_putanna1 = new JLabel("Кількість членів сім'ї ?");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setBounds(28, 47, 727, 30);
		getContentPane().add(l_putanna1);

		l_putanna2 = new JLabel("Чи проводились якісь роботи задля економії (зменшення витрат) ?");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setBounds(28, 153, 727, 30);
		getContentPane().add(l_putanna2);

		radioB_putanna1_1 = new JRadioButton("1");
		radioB_putanna1_1.setOpaque(false);

		radioB_putanna1_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_1.setBounds(90, 101, 62, 25);
		getContentPane().add(radioB_putanna1_1);
		radioB_putanna1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna_grup1 = 1;
			}
		});

		radioB_putanna1_2 = new JRadioButton("2");
		radioB_putanna1_2.setOpaque(false);
		radioB_putanna1_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_2.setBounds(156, 101, 62, 25);
		getContentPane().add(radioB_putanna1_2);
		radioB_putanna1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna_grup1 = 2;
			}
		});

		radioB_putanna1_3 = new JRadioButton("3");
		radioB_putanna1_3.setOpaque(false);
		radioB_putanna1_3.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_3.setBounds(222, 101, 62, 25);
		getContentPane().add(radioB_putanna1_3);
		radioB_putanna1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna_grup1 = 3;
			}
		});

		radioB_putanna1_4 = new JRadioButton("4");
		radioB_putanna1_4.setOpaque(false);
		radioB_putanna1_4.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_4.setBounds(288, 101, 62, 25);
		getContentPane().add(radioB_putanna1_4);
		radioB_putanna1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna_grup1 = 4;
			}
		});

		radioB_putanna1_5 = new JRadioButton("5");
		radioB_putanna1_5.setOpaque(false);
		radioB_putanna1_5.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_5.setBounds(354, 101, 62, 25);
		getContentPane().add(radioB_putanna1_5);
		radioB_putanna1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna_grup1 = 5;
			}
		});

		radioB_putanna1_6 = new JRadioButton("6");
		radioB_putanna1_6.setOpaque(false);
		radioB_putanna1_6.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_6.setBounds(420, 101, 62, 25);
		getContentPane().add(radioB_putanna1_6);
		radioB_putanna1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna_grup1 = 6;
			}
		});

		radioB_putanna1_7 = new JRadioButton("7");
		radioB_putanna1_7.setOpaque(false);
		radioB_putanna1_7.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_7.setBounds(486, 101, 62, 25);
		getContentPane().add(radioB_putanna1_7);
		radioB_putanna1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna_grup1 = 7;
			}
		});

		radioB_putanna1_8 = new JRadioButton("8");
		radioB_putanna1_8.setOpaque(false);
		radioB_putanna1_8.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_8.setBounds(553, 101, 62, 25);
		getContentPane().add(radioB_putanna1_8);
		radioB_putanna1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna_grup1 = 8;
			}
		});

		radioB_putanna1_9 = new JRadioButton("9+");
		radioB_putanna1_9.setOpaque(false);
		radioB_putanna1_9.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_9.setBounds(623, 101, 62, 25);
		getContentPane().add(radioB_putanna1_9);
		radioB_putanna1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna_grup1 = 9;
			}
		});

		group_putanna1 = new ButtonGroup();
		group_putanna1.add(radioB_putanna1_1);
		group_putanna1.add(radioB_putanna1_2);
		group_putanna1.add(radioB_putanna1_3);
		group_putanna1.add(radioB_putanna1_4);
		group_putanna1.add(radioB_putanna1_5);
		group_putanna1.add(radioB_putanna1_6);
		group_putanna1.add(radioB_putanna1_7);
		group_putanna1.add(radioB_putanna1_8);
		group_putanna1.add(radioB_putanna1_9);

		b_Gotovo = new JButton("Готово");
		b_Gotovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// int i_putanna1, int i_putanna2_1, String s_putanna2_2, int
				// i_putanna3,int i_slider_putanna4, int i_putanna5

				// System.out.println("i_putanna_grup1 " + i_putanna_grup1);
				// System.out.println("JCheckBox ");
				// if (i_putanna3 == 1) {
				// System.out.println("i_putanna_grup3 " + i_putanna_grup3);
				// System.out.println("i_putanna_grup4 " + i_putanna_grup4);
				// } else {
				// System.out.println("i_slider_putanna3Var2 " +
				// i_slider_putanna3Var2);
				// System.out.println("i_putanna_grup4Var2 " +
				// i_putanna_grup4Var2);
				// }
				//
				// System.out.println("");
				// System.out.println("");

				if (i_putanna3 == 1) {
					if (i_putanna_grup1 == 0 || i_putanna_grup4 == 0 || i_putanna_grup3 == 0) {
						JOptionPane.showMessageDialog(null, "Помилка введення !");
					} else {

						int i_checkBox_putanna2_1 = 0;
						int i_checkBox_putanna2_2 = 0;
						int i_checkBox_putanna2_3 = 0;

						if (checkBox_putanna2_1.isSelected() == false) {
							i_checkBox_putanna2_1 = 1;
						}
						if (checkBox_putanna2_2.isSelected() == false) {
							i_checkBox_putanna2_2 = 1;
						}
						if (checkBox_putanna2_3.isSelected() == false) {
							i_checkBox_putanna2_3 = 1;
						}

						new TeploRezultatu("Теплозбереження. Результати", i_putanna1, i_putanna2_1, s_putanna2_2,
								i_slider_putanna4, i_putanna5, i_putanna_grup1, i_checkBox_putanna2_1,
								i_checkBox_putanna2_2, i_checkBox_putanna2_3, i_putanna_grup3, i_putanna_grup4);
						setVisible(false);

					}
				} else {
					if (i_putanna_grup1 == 0 || i_slider_putanna3Var2 == 0) {
						JOptionPane.showMessageDialog(null, "Помилка введення !");
					} else {

						int i_checkBox_putanna2Var2_1 = 0;
						int i_checkBox_putanna2Var2_2 = 0;
						int i_checkBox_putanna2Var2_3 = 0;
						int i_checkBox_putanna2Var2_4 = 0;
						int i_checkBox_putanna2Var2_5 = 0;
						int i_checkBox_putanna2Var2_6 = 0;

						if (checkBox_putanna2Var2_1.isSelected() == false) {
							i_checkBox_putanna2Var2_1 = 1;
						}
						if (checkBox_putanna2Var2_2.isSelected() == false) {
							i_checkBox_putanna2Var2_2 = 1;
						}
						if (checkBox_putanna2Var2_3.isSelected() == false) {
							i_checkBox_putanna2Var2_3 = 1;
						}
						if (checkBox_putanna2Var2_4.isSelected() == false) {
							i_checkBox_putanna2Var2_4 = 1;
						}
						if (checkBox_putanna2Var2_5.isSelected() == false) {
							i_checkBox_putanna2Var2_5 = 1;
						}
						if (checkBox_putanna2Var2_6.isSelected() == false) {
							i_checkBox_putanna2Var2_6 = 1;
						}

						new TeploRezultatu("Теплозбереження. Результати", i_putanna1, i_putanna2_1, s_putanna2_2,
								i_slider_putanna4, i_putanna5, i_putanna_grup1, i_checkBox_putanna2Var2_1,
								i_checkBox_putanna2Var2_2, i_checkBox_putanna2Var2_3, i_checkBox_putanna2Var2_4,
								i_checkBox_putanna2Var2_5, i_checkBox_putanna2Var2_6, i_slider_putanna3Var2,
								i_putanna_grup4Var2);
						setVisible(false);
					}
				}
			}
		});
		b_Gotovo.setBounds(528, 524, 266, 41);
		getContentPane().add(b_Gotovo);

		if (i_putanna3 == 1) {

			l_putanna3 = new JLabel("Чи є у Вас лічильник ?");
			l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
			l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_putanna3.setBounds(28, 334, 727, 30);
			getContentPane().add(l_putanna3);

			radioB_putanna3_1 = new JRadioButton("Так, є");
			radioB_putanna3_1.setOpaque(false);
			radioB_putanna3_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			radioB_putanna3_1.setBounds(198, 390, 209, 25);
			getContentPane().add(radioB_putanna3_1);
			radioB_putanna3_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i_putanna_grup3 = 1;
				}
			});

			radioB_putanna3_2 = new JRadioButton("Немає");
			radioB_putanna3_2.setOpaque(false);
			radioB_putanna3_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			radioB_putanna3_2.setBounds(469, 390, 249, 25);
			getContentPane().add(radioB_putanna3_2);
			radioB_putanna3_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i_putanna_grup3 = 2;
				}
			});

			checkBox_putanna2_1 = new JCheckBox("Утеплення стін");
			checkBox_putanna2_1.setOpaque(false);
			checkBox_putanna2_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			checkBox_putanna2_1.setBounds(232, 208, 383, 25);
			getContentPane().add(checkBox_putanna2_1);

			checkBox_putanna2_2 = new JCheckBox("Сучасні, надійні, щільні двері");
			checkBox_putanna2_2.setOpaque(false);
			checkBox_putanna2_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			checkBox_putanna2_2.setBounds(232, 293, 275, 25);
			getContentPane().add(checkBox_putanna2_2);

			checkBox_putanna2_3 = new JCheckBox("Вікна із 2-3 шарами");
			checkBox_putanna2_3.setOpaque(false);
			checkBox_putanna2_3.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			checkBox_putanna2_3.setBounds(232, 249, 185, 25);
			getContentPane().add(checkBox_putanna2_3);

			l_putanna4 = new JLabel("Яке управління у Вашому ополювальному центрі ?");
			l_putanna4.setHorizontalAlignment(SwingConstants.CENTER);
			l_putanna4.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_putanna4.setBounds(28, 436, 727, 30);
			getContentPane().add(l_putanna4);

			radioB_putanna4_1 = new JRadioButton("ОСББ");
			radioB_putanna4_1.setForeground(Color.BLACK);
			radioB_putanna4_1.setOpaque(false);
			radioB_putanna4_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			radioB_putanna4_1.setBounds(250, 475, 133, 25);
			getContentPane().add(radioB_putanna4_1);
			radioB_putanna4_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i_putanna_grup4 = 1;
				}
			});

			radioB_putanna4_2 = new JRadioButton("ЖЕК");
			radioB_putanna4_2.setForeground(Color.BLACK);
			radioB_putanna4_2.setOpaque(false);
			radioB_putanna4_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			radioB_putanna4_2.setBounds(435, 475, 121, 25);
			getContentPane().add(radioB_putanna4_2);
			radioB_putanna4_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i_putanna_grup4 = 2;
				}
			});

		} else {

			l_putanna3Var2 = new JLabel("Якого віку Ваша опалювальна техніка ?");
			l_putanna3Var2.setHorizontalAlignment(SwingConstants.CENTER);
			l_putanna3Var2.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_putanna3Var2.setBounds(23, 332, 727, 30);
			getContentPane().add(l_putanna3Var2);

			slider_putanna3Var2 = new JSlider();
			slider_putanna3Var2.setOpaque(false);
			slider_putanna3Var2.setBounds(15, 375, 770, 26);
			getContentPane().add(slider_putanna3Var2);

			l_slider_putanna3Var2_3 = new JLabel("10 і більше");
			l_slider_putanna3Var2_3.setForeground(Color.BLACK);
			l_slider_putanna3Var2_3.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			l_slider_putanna3Var2_3.setBounds(687, 415, 102, 16);
			getContentPane().add(l_slider_putanna3Var2_3);

			l_slider_putanna3Var2_1 = new JLabel("Нова, 1 рік");
			l_slider_putanna3Var2_1.setForeground(Color.BLACK);
			l_slider_putanna3Var2_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			l_slider_putanna3Var2_1.setBounds(25, 415, 115, 16);
			getContentPane().add(l_slider_putanna3Var2_1);

			l_putanna4Var2 = new JLabel("Чи осучаснили Ви вентиляцію ? Зробили рекуперацію тепла ?");
			l_putanna4Var2.setHorizontalAlignment(SwingConstants.CENTER);
			l_putanna4Var2.setFont(new Font("Times New Roman", Font.BOLD, 20));
			l_putanna4Var2.setBounds(23, 444, 727, 30);
			getContentPane().add(l_putanna4Var2);

			radioB_putanna4Var2_1 = new JRadioButton("Так, я маю цю систему");
			radioB_putanna4Var2_1.setOpaque(false);
			radioB_putanna4Var2_1.setForeground(Color.BLACK);
			radioB_putanna4Var2_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			radioB_putanna4Var2_1.setBounds(85, 483, 322, 25);
			getContentPane().add(radioB_putanna4Var2_1);
			radioB_putanna4Var2_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i_putanna_grup4Var2 = 1;
				}
			});

			radioB_putanna4Var2_2 = new JRadioButton("Ні, не маю");
			radioB_putanna4Var2_2.setOpaque(false);
			radioB_putanna4Var2_2.setForeground(Color.BLACK);
			radioB_putanna4Var2_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			radioB_putanna4Var2_2.setBounds(501, 483, 249, 25);
			getContentPane().add(radioB_putanna4Var2_2);
			radioB_putanna4Var2_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i_putanna_grup4Var2 = 2;
				}
			});

			checkBox_putanna2Var2_1 = new JCheckBox("Утеплення стін із західної, північної сторони");
			checkBox_putanna2Var2_1.setOpaque(false);
			checkBox_putanna2Var2_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			checkBox_putanna2Var2_1.setBounds(38, 192, 389, 25);
			getContentPane().add(checkBox_putanna2Var2_1);

			checkBox_putanna2Var2_2 = new JCheckBox("Утеплення стін із східної, південної сторони");
			checkBox_putanna2Var2_2.setOpaque(false);
			checkBox_putanna2Var2_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			checkBox_putanna2Var2_2.setBounds(38, 234, 389, 25);
			getContentPane().add(checkBox_putanna2Var2_2);

			checkBox_putanna2Var2_3 = new JCheckBox("Сучасні, надійні, щільні двері");
			checkBox_putanna2Var2_3.setOpaque(false);
			checkBox_putanna2Var2_3.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			checkBox_putanna2Var2_3.setBounds(38, 279, 275, 25);
			getContentPane().add(checkBox_putanna2Var2_3);

			checkBox_putanna2Var2_4 = new JCheckBox("Вікна із 2-3 шарами");
			checkBox_putanna2Var2_4.setOpaque(false);
			checkBox_putanna2Var2_4.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			checkBox_putanna2Var2_4.setBounds(466, 192, 185, 25);
			getContentPane().add(checkBox_putanna2Var2_4);

			checkBox_putanna2Var2_5 = new JCheckBox("Утеплена підлога");
			checkBox_putanna2Var2_5.setOpaque(false);
			checkBox_putanna2Var2_5.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			checkBox_putanna2Var2_5.setBounds(466, 235, 185, 25);
			getContentPane().add(checkBox_putanna2Var2_5);

			checkBox_putanna2Var2_6 = new JCheckBox("Утеплена стеля");
			checkBox_putanna2Var2_6.setOpaque(false);
			checkBox_putanna2Var2_6.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			checkBox_putanna2Var2_6.setBounds(466, 280, 185, 25);
			getContentPane().add(checkBox_putanna2Var2_6);

			l_slider_putanna3Var2_2 = new JLabel("5 років");
			l_slider_putanna3Var2_2.setForeground(Color.BLACK);
			l_slider_putanna3Var2_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
			l_slider_putanna3Var2_2.setBounds(377, 414, 74, 16);
			getContentPane().add(l_slider_putanna3Var2_2);

			slider_putanna3Var2.addChangeListener(slider3Var2);

		}

		group_putanna3 = new ButtonGroup();
		group_putanna3.add(radioB_putanna3_1);
		group_putanna3.add(radioB_putanna3_2);

		group_putanna4 = new ButtonGroup();
		group_putanna4.add(radioB_putanna4_1);
		group_putanna4.add(radioB_putanna4_2);

		group_putanna4Var2 = new ButtonGroup();
		group_putanna4Var2.add(radioB_putanna4Var2_1);
		group_putanna4Var2.add(radioB_putanna4Var2_2);

		l_fonVodaOputuvanna = new JLabel("");
		l_fonVodaOputuvanna.setBounds(0, 0, 794, 565);
		l_fonVodaOputuvanna.setIcon(new ImageIcon("res/fon_TeploOputuvanna.jpg"));
		getContentPane().add(l_fonVodaOputuvanna);

		setVisible(true);
	}

	class SliderListener3Var2 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna3Var2 = (JSlider) e.getSource();
			i_slider_putanna3Var2 = (int) slider_putanna3Var2.getValue();
		}
	}

}

package KP.Energozberegenna;

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
import javax.swing.ImageIcon;

public class ElektroenergiaOputuvanna extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Nazad;
	private JLabel l_Hapka;
	private JLabel l_putanna1;
	private JLabel l_putanna2;
	private JLabel l_putanna4;
	private JLabel l_putanna3;
	private JLabel l_putanna6;
	private JLabel l_putanna5;
	private JRadioButton radioB_putanna1_1;
	private JRadioButton radioB_putanna1_2;
	private JSlider slider_putanna3;
	private JLabel l_slider_putanna3_1;
	private JLabel l_slider_putanna3_2;
	private JSlider slider_putanna4;
	private JLabel l_slider_putanna4_1;
	private JLabel l_slider_putanna4_2;
	private JSlider slider_putanna5;
	private JLabel l_slider_putanna5_1;
	private JLabel l_slider_putanna5_2;
	private ButtonGroup group_putanna1;

	private JButton b_Gotovo;
	
	SliderListener2 slider2 = new SliderListener2();
	SliderListener3 slider3 = new SliderListener3();
	SliderListener4 slider4 = new SliderListener4();
	SliderListener5 slider5 = new SliderListener5();
	SliderListener6 slider6 = new SliderListener6();

	private int i_slider_putanna2 = 50;
	private int i_slider_putanna3 = 50;
	private int i_slider_putanna4 = 50;
	private int i_slider_putanna5 = 50;
	private int i_slider_putanna6 = 50;

	private int i_putanna1;

	private JLabel l_fonVodaOputuvanna;
	private JLabel l_Hapka1;
	private JLabel l_slider_putanna2_2;
	private JLabel l_slider_putanna2_1;
	private JSlider slider_putanna2;
	private JLabel l_slider_putanna6_2;
	private JSlider slider_putanna6;
	private JLabel l_slider_putanna6_1;
	private JButton b_Utocnenna5;
	private JButton b_Utocnenna6;;

	public ElektroenergiaOputuvanna(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		b_Nazad = new JButton("Назад");
		b_Nazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Енергозбереження дому");
				setVisible(false);
			}
		});
		b_Nazad.setBounds(661, 0, 133, 34);
		getContentPane().add(b_Nazad);
		
		b_Utocnenna5 = new JButton("");
		b_Utocnenna5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Місцеве освітлення призначається для освітлення тільки робочих поверхонь.");
			}
		});
		b_Utocnenna5.setIcon(new ImageIcon("res/ZnakPutana.png"));
		b_Utocnenna5.setBounds(731, 382, 24, 25);
		getContentPane().add(b_Utocnenna5);
		
		b_Utocnenna6 = new JButton("");
		b_Utocnenna6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Етіпні люстри - це люстри, що забезпечують різний рівень освітлення.");
			}
		});
		b_Utocnenna6.setIcon(new ImageIcon("res/ZnakPutana.png"));
		b_Utocnenna6.setBounds(731, 452, 24, 25);
		getContentPane().add(b_Utocnenna6);

		l_Hapka = new JLabel("Пройдіть, будь ласка, опитування");
		l_Hapka.setForeground(Color.BLUE);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 25));
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setBounds(90, 4, 595, 30);
		getContentPane().add(l_Hapka);

		l_putanna1 = new JLabel("Чи використовуєте Ви прилади управління освітленістю ? (датчики руху, таймери)");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setBounds(8, 83, 774, 30);
		getContentPane().add(l_putanna1);

		l_putanna2 = new JLabel("Чи використовуєте Ви енергозберігаючі лампи ? ");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setBounds(28, 156, 727, 30);
		getContentPane().add(l_putanna2);

		l_putanna4 = new JLabel("Якого кольору Ваш інтер'єр ?");
		l_putanna4.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna4.setBounds(28, 303, 727, 30);
		getContentPane().add(l_putanna4);

		l_putanna3 = new JLabel("Як часто Ви проводите комплексне вологе прибирання ?");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setBounds(28, 242, 727, 30);
		getContentPane().add(l_putanna3);

		l_putanna6 = new JLabel("Чи використовуєте Ви етапні люстри ?");
		l_putanna6.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna6.setBounds(28, 447, 727, 30);
		getContentPane().add(l_putanna6);

		l_putanna5 = new JLabel("Чи використовуєте Ви пакетне, місцеве освітлення ?");
		l_putanna5.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna5.setBounds(28, 377, 727, 30);
		getContentPane().add(l_putanna5);

		radioB_putanna1_1 = new JRadioButton("Так, використовую");
		radioB_putanna1_1.setForeground(Color.BLACK);
		radioB_putanna1_1.setOpaque(false);
		radioB_putanna1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 1;
			}
		});
		radioB_putanna1_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_1.setBounds(90, 122, 322, 25);
		getContentPane().add(radioB_putanna1_1);

		radioB_putanna1_2 = new JRadioButton("Ні, не використовую");
		radioB_putanna1_2.setForeground(Color.BLACK);
		radioB_putanna1_2.setOpaque(false);
		radioB_putanna1_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		radioB_putanna1_2.setBounds(506, 122, 249, 25);
		getContentPane().add(radioB_putanna1_2);
		radioB_putanna1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_putanna1 = 2;
			}
		});

		slider_putanna3 = new JSlider();
		slider_putanna3.setOpaque(false);
		slider_putanna3.setBounds(8, 264, 770, 26);
		getContentPane().add(slider_putanna3);

		l_slider_putanna3_1 = new JLabel("Раз на тиждень");
		l_slider_putanna3_1.setForeground(Color.BLACK);
		l_slider_putanna3_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna3_1.setBounds(8, 285, 143, 16);
		getContentPane().add(l_slider_putanna3_1);

		l_slider_putanna3_2 = new JLabel("Раз на місяць і більше");
		l_slider_putanna3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna3_2.setForeground(Color.BLACK);
		l_slider_putanna3_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna3_2.setBounds(587, 291, 195, 16);
		getContentPane().add(l_slider_putanna3_2);

		slider_putanna4 = new JSlider();
		slider_putanna4.setOpaque(false);
		slider_putanna4.setBounds(8, 330, 770, 26);
		getContentPane().add(slider_putanna4);

		l_slider_putanna4_1 = new JLabel("Світлі, яскраві кольори");
		l_slider_putanna4_1.setForeground(Color.BLACK);
		l_slider_putanna4_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_1.setBounds(8, 356, 195, 16);
		getContentPane().add(l_slider_putanna4_1);

		l_slider_putanna4_2 = new JLabel("Темні, тьмяні кольори");
		l_slider_putanna4_2.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna4_2.setForeground(Color.BLACK);
		l_slider_putanna4_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna4_2.setBounds(587, 357, 195, 16);
		getContentPane().add(l_slider_putanna4_2);

		slider_putanna5 = new JSlider();
		slider_putanna5.setOpaque(false);
		slider_putanna5.setBounds(8, 406, 770, 26);
		getContentPane().add(slider_putanna5);

		l_slider_putanna5_1 = new JLabel("Не використовую");
		l_slider_putanna5_1.setForeground(Color.BLACK);
		l_slider_putanna5_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna5_1.setBounds(8, 432, 157, 17);
		getContentPane().add(l_slider_putanna5_1);

		l_slider_putanna5_2 = new JLabel("На кожномі робочому місці");
		l_slider_putanna5_2.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna5_2.setForeground(Color.BLACK);
		l_slider_putanna5_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna5_2.setBounds(538, 433, 244, 16);
		getContentPane().add(l_slider_putanna5_2);

		group_putanna1 = new ButtonGroup();
		group_putanna1.add(radioB_putanna1_1);
		group_putanna1.add(radioB_putanna1_2);

		b_Gotovo = new JButton("Готово");
		b_Gotovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				 System.out.println("s_putanna1 " + i_putanna1);
//				 System.out.println("s_putanna2 " + i_slider_putanna2);
//				 System.out.println("i_slider_putanna3 " + i_slider_putanna3);
//				 System.out.println("i_slider_putanna4 " + i_slider_putanna4);
//				 System.out.println("i_slider_putanna5 " + i_slider_putanna5);
//				 System.out.println("s_putanna6 " + i_slider_putanna6);

				if (i_putanna1 == 0) {
					JOptionPane.showMessageDialog(null, "Помилка введення !");
				} else {
					 new ElektroenergiaRezultatu("Електроенергія. Оптимізація світла. Результат",
					 i_putanna1, i_slider_putanna2, i_slider_putanna3,
					 i_slider_putanna4, i_slider_putanna5, i_slider_putanna6);
					setVisible(false);
				}

			}
		});
		b_Gotovo.setBounds(528, 524, 266, 41);
		getContentPane().add(b_Gotovo);

		l_Hapka1 = new JLabel("для рекомендацій по оптимізації освітлення:");
		l_Hapka1.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka1.setForeground(Color.BLUE);
		l_Hapka1.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 25));
		l_Hapka1.setBounds(100, 40, 595, 30);
		getContentPane().add(l_Hapka1);

		l_slider_putanna2_2 = new JLabel("Всі мої лампи енергозберігаючі");
		l_slider_putanna2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna2_2.setForeground(Color.BLACK);
		l_slider_putanna2_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna2_2.setBounds(538, 213, 244, 16);
		getContentPane().add(l_slider_putanna2_2);

		l_slider_putanna2_1 = new JLabel("Не використовую");
		l_slider_putanna2_1.setForeground(Color.BLACK);
		l_slider_putanna2_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna2_1.setBounds(8, 212, 143, 17);
		getContentPane().add(l_slider_putanna2_1);

		slider_putanna2 = new JSlider();
		slider_putanna2.setOpaque(false);
		slider_putanna2.setBounds(8, 186, 770, 26);
		getContentPane().add(slider_putanna2);

		l_slider_putanna6_2 = new JLabel("Всі мої люстри етапні");
		l_slider_putanna6_2.setHorizontalAlignment(SwingConstants.RIGHT);
		l_slider_putanna6_2.setForeground(Color.BLACK);
		l_slider_putanna6_2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna6_2.setBounds(538, 502, 244, 16);
		getContentPane().add(l_slider_putanna6_2);

		slider_putanna6 = new JSlider();
		slider_putanna6.setOpaque(false);
		slider_putanna6.setBounds(8, 475, 770, 26);
		getContentPane().add(slider_putanna6);

		l_slider_putanna6_1 = new JLabel("Не використовую");
		l_slider_putanna6_1.setForeground(Color.BLACK);
		l_slider_putanna6_1.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		l_slider_putanna6_1.setBounds(8, 501, 143, 17);
		getContentPane().add(l_slider_putanna6_1);

		 l_fonVodaOputuvanna = new JLabel("");
		 l_fonVodaOputuvanna.setBounds(0, 0, 794, 565);
		 l_fonVodaOputuvanna.setIcon(new
		 ImageIcon("res/fon_SvitloOputuvanna.jpg"));
		 getContentPane().add(l_fonVodaOputuvanna);

		slider_putanna2.addChangeListener(slider2);
		slider_putanna3.addChangeListener(slider3);
		slider_putanna4.addChangeListener(slider4);
		slider_putanna5.addChangeListener(slider5);
		slider_putanna6.addChangeListener(slider6);

		setVisible(true);
	}

	class SliderListener2 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna2 = (JSlider) e.getSource();
			i_slider_putanna2 = (int) slider_putanna2.getValue();
		}
	}
	
	class SliderListener3 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna3 = (JSlider) e.getSource();
			i_slider_putanna3 = (int) slider_putanna3.getValue();
		}
	}

	class SliderListener4 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna4 = (JSlider) e.getSource();
			i_slider_putanna4 = (int) slider_putanna4.getValue();
		}
	}

	class SliderListener5 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna5 = (JSlider) e.getSource();
			i_slider_putanna5 = (int) slider_putanna5.getValue();
		}
	}
	
	class SliderListener6 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			slider_putanna6 = (JSlider) e.getSource();
			i_slider_putanna6 = (int) slider_putanna6.getValue();
		}
	}

}

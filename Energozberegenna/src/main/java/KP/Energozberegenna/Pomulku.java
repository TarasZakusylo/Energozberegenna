package KP.Energozberegenna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

public class Pomulku extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton b_Nazad;

	private JLabel l_Hapka;
	private JLabel l_pomulka1;
	private JLabel l_pomulka2;
	private JLabel l_pomulka3;
	private JLabel l_pomulka4;
	private JLabel l_pomulka8;
	private JLabel l_pomulka7;
	private JLabel l_pomulka6;
	private JLabel l_pomulka5;
	private JLabel l_pomulka10;
	private JLabel l_pomulka9;
	private JLabel l_ZnakVidsotkiv1;
	private JLabel l_ZnakVidsotkiv2;
	private JLabel l_ZnakVidsotkiv3;
	private JLabel l_ZnakVidsotkiv4;
	private JLabel l_ZnakVidsotkiv8;
	private JLabel l_ZnakVidsotkiv7;
	private JLabel l_ZnakVidsotkiv6;
	private JLabel l_ZnakVidsotkiv5;
	private JLabel l_ZnakVidsotkiv10;
	private JLabel l_ZnakVidsotkiv9;
	private JLabel l_PomulkuZnacenna2;
	private JLabel l_PomulkuZnacenna4;
	private JLabel l_PomulkuZnacenna3;
	private JLabel l_PomulkuZnacenna8;
	private JLabel l_PomulkuZnacenna7;
	private JLabel l_PomulkuZnacenna6;
	private JLabel l_PomulkuZnacenna5;
	private JLabel l_PomulkuZnacenna10;
	private JLabel l_PomulkuZnacenna9;
	private JLabel l_PomulkuZnacenna1;

	private JLabel l_Pomulku;
	
	public Pomulku(String s) {
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
		
		l_PomulkuZnacenna1 = new JLabel("");
		l_PomulkuZnacenna1.setIcon(new ImageIcon("res/PomulkuZnacenna1.png"));
		l_PomulkuZnacenna1.setBounds(29, 63, 62, 43);
		getContentPane().add(l_PomulkuZnacenna1);
		
		l_Hapka = new JLabel("ТОП-10  Помилок");
		l_Hapka.setForeground(Color.ORANGE);
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 35));
		l_Hapka.setBounds(84, 9, 601, 35);
		getContentPane().add(l_Hapka);
		
		l_pomulka1 = new JLabel("залишають електроприлади в режимі «стенд-бай»,");
		l_pomulka1.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka1.setForeground(Color.BLUE);
		l_pomulka1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka1.setBounds(168, 71, 601, 35);
		getContentPane().add(l_pomulka1);
		
		l_pomulka2 = new JLabel("гріють у чайнику більше води, ніж потрібно,");
		l_pomulka2.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka2.setForeground(Color.BLUE);
		l_pomulka2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka2.setBounds(168, 119, 601, 35);
		getContentPane().add(l_pomulka2);
		
		l_pomulka3 = new JLabel("залишають невикористовувані зарядні пристрої у розетці,");
		l_pomulka3.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka3.setForeground(Color.BLUE);
		l_pomulka3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka3.setBounds(168, 167, 601, 35);
		getContentPane().add(l_pomulka3);
		
		l_pomulka4 = new JLabel("залишають світло у порожніх кімнатах,");
		l_pomulka4.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka4.setForeground(Color.BLUE);
		l_pomulka4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka4.setBounds(168, 215, 601, 35);
		getContentPane().add(l_pomulka4);
		
		l_pomulka8 = new JLabel("використовують сушку одягу замість сушки на повітрі,");
		l_pomulka8.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka8.setForeground(Color.BLUE);
		l_pomulka8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka8.setBounds(168, 407, 601, 35);
		getContentPane().add(l_pomulka8);
		
		l_pomulka7 = new JLabel("не вимикають мотор у машині, яка зупинилася,");
		l_pomulka7.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka7.setForeground(Color.BLUE);
		l_pomulka7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka7.setBounds(168, 359, 601, 35);
		getContentPane().add(l_pomulka7);
		
		l_pomulka6 = new JLabel("обирають занадто гарячий режим прання,");
		l_pomulka6.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka6.setForeground(Color.BLUE);
		l_pomulka6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka6.setBounds(168, 311, 601, 35);
		getContentPane().add(l_pomulka6);
		
		l_pomulka5 = new JLabel("їздять на авто навіть у короткі поїздки,");
		l_pomulka5.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka5.setForeground(Color.BLUE);
		l_pomulka5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka5.setBounds(168, 263, 601, 35);
		getContentPane().add(l_pomulka5);
		
		l_pomulka10 = new JLabel("сильніше вмикають опалення замість того, щоб одягти светра.");
		l_pomulka10.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka10.setForeground(Color.BLUE);
		l_pomulka10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka10.setBounds(168, 502, 601, 35);
		getContentPane().add(l_pomulka10);
		
		l_pomulka9 = new JLabel("опалюють пустий будинок,");
		l_pomulka9.setHorizontalAlignment(SwingConstants.LEFT);
		l_pomulka9.setForeground(Color.BLUE);
		l_pomulka9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		l_pomulka9.setBounds(168, 454, 601, 35);
		getContentPane().add(l_pomulka9);
		
		l_ZnakVidsotkiv1 = new JLabel("");
		l_ZnakVidsotkiv1.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv1.setBounds(84, 60, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv1);
		
		l_ZnakVidsotkiv2 = new JLabel("");
		l_ZnakVidsotkiv2.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv2.setBounds(84, 111, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv2);
		
		l_ZnakVidsotkiv3 = new JLabel("");
		l_ZnakVidsotkiv3.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv3.setBounds(84, 157, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv3);
		
		l_ZnakVidsotkiv4 = new JLabel("");
		l_ZnakVidsotkiv4.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv4.setBounds(84, 207, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv4);
		
		l_ZnakVidsotkiv8 = new JLabel("");
		l_ZnakVidsotkiv8.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv8.setBounds(84, 399, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv8);
		
		l_ZnakVidsotkiv7 = new JLabel("");
		l_ZnakVidsotkiv7.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv7.setBounds(84, 349, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv7);
		
		l_ZnakVidsotkiv6 = new JLabel("");
		l_ZnakVidsotkiv6.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv6.setBounds(84, 303, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv6);
		
		l_ZnakVidsotkiv5 = new JLabel("");
		l_ZnakVidsotkiv5.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv5.setBounds(84, 252, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv5);
		
		l_ZnakVidsotkiv10 = new JLabel("");
		l_ZnakVidsotkiv10.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv10.setBounds(84, 494, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv10);
		
		l_ZnakVidsotkiv9 = new JLabel("");
		l_ZnakVidsotkiv9.setIcon(new ImageIcon("res/PomulkuVidsotku.png"));
		l_ZnakVidsotkiv9.setBounds(84, 444, 64, 43);
		getContentPane().add(l_ZnakVidsotkiv9);
		
		l_PomulkuZnacenna2 = new JLabel("");
		l_PomulkuZnacenna2.setIcon(new ImageIcon("res/PomulkuZnacenna2.png"));
		l_PomulkuZnacenna2.setBounds(29, 111, 62, 43);
		getContentPane().add(l_PomulkuZnacenna2);
		
		l_PomulkuZnacenna4 = new JLabel("");
		l_PomulkuZnacenna4.setIcon(new ImageIcon("res/PomulkuZnacenna4.png"));
		l_PomulkuZnacenna4.setBounds(29, 207, 62, 43);
		getContentPane().add(l_PomulkuZnacenna4);
		
		l_PomulkuZnacenna3 = new JLabel("");
		l_PomulkuZnacenna3.setIcon(new ImageIcon("res/PomulkuZnacenna3.png"));
		l_PomulkuZnacenna3.setBounds(29, 159, 62, 43);
		getContentPane().add(l_PomulkuZnacenna3);
		
		l_PomulkuZnacenna8 = new JLabel("");
		l_PomulkuZnacenna8.setIcon(new ImageIcon("res/PomulkuZnacenna8.png"));
		l_PomulkuZnacenna8.setBounds(29, 399, 62, 43);
		getContentPane().add(l_PomulkuZnacenna8);
		
		l_PomulkuZnacenna7 = new JLabel("");
		l_PomulkuZnacenna7.setIcon(new ImageIcon("res/PomulkuZnacenna7.png"));
		l_PomulkuZnacenna7.setBounds(29, 351, 62, 43);
		getContentPane().add(l_PomulkuZnacenna7);
		
		l_PomulkuZnacenna6 = new JLabel("");
		l_PomulkuZnacenna6.setIcon(new ImageIcon("res/PomulkuZnacenna6.png"));
		l_PomulkuZnacenna6.setBounds(29, 303, 62, 43);
		getContentPane().add(l_PomulkuZnacenna6);
		
		l_PomulkuZnacenna5 = new JLabel("");
		l_PomulkuZnacenna5.setIcon(new ImageIcon("res/PomulkuZnacenna5.png"));
		l_PomulkuZnacenna5.setBounds(29, 255, 62, 43);
		getContentPane().add(l_PomulkuZnacenna5);
		
		l_PomulkuZnacenna10 = new JLabel("");
		l_PomulkuZnacenna10.setIcon(new ImageIcon("res/PomulkuZnacenna10.png"));
		l_PomulkuZnacenna10.setBounds(29, 494, 62, 43);
		getContentPane().add(l_PomulkuZnacenna10);
		
		l_PomulkuZnacenna9 = new JLabel("");
		l_PomulkuZnacenna9.setIcon(new ImageIcon("res/PomulkuZnacenna9.png"));
		l_PomulkuZnacenna9.setBounds(29, 446, 62, 43);
		getContentPane().add(l_PomulkuZnacenna9);
 
		l_Pomulku = new JLabel("");
		l_Pomulku.setBounds(0, 0, 794, 565);
		l_Pomulku.setIcon(new ImageIcon("res/fon_Pomulku.jpg"));
		getContentPane().add(l_Pomulku);
		
		setVisible(true);
	}

}

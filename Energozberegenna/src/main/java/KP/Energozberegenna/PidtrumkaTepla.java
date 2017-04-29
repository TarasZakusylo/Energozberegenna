package KP.Energozberegenna;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class PidtrumkaTepla extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_Hapka;
	private JButton b_Menu;

	private JLabel l_fon;

	String s_Recomendacii1 = "";
	String s_Recomendacii2 = "";
	String s_Recomendacii3 = "";

	String s_OscadBank1 = "Вимоги до позичальника: строк існування ОСББ не обмежений; 2/3 співвласників будинку на загальних зборах проголосували «ЗА» виконання проекту за рахунок кредиту; позичальник не має судових позовів, а рівень надходження платежів – не менше 85%. Умови: термін – від 6 місяців до 5 років; максимальна сума кредиту – до 100% вартості проекту, але не більше ніж 42 тис. грн на одну квартиру; власний внесок відсутній; ставка – 18,5% - 18,8%; разова комісія – 1% від розміру кредиту/кредитного ліміту.";
	String s_UkrgasBank1 = "Вимоги до позичальника: 2/3 співвласників будинку на загальних зборах проголосували «ЗА» виконання проекту за рахунок кредиту. Умови: термін – до 10 років; сума кредиту – до 10 млн грн; ставка – 19,5% до 1 року, 20,5% – більше 1 року; разова комісія – 1,25% суми кредиту; власний внесок та необхідність страхування – відсутні; застава/іпотека – не вимагається.";
	String s_PruvatBank1 = "Вимоги до позичальника: 2/3 співвласників будинку на загальних зборах проголосували «ЗА» виконання проекту за рахунок кредиту; відсутність судових позовів у ОСББ та його управителя; наявність поточного рахунку у Приватбанку. Умови: термін – до 36 місяців; сума – до 500 тис. грн; ставка – до 18%; початковий внесок відсутній; разова комісія – відсутня. Погашення кредиту здійснюється щомісяця рівними частинами протягом строку кредитування.";

	String s_OscadBank2 = "Кредитує населення в рамках програми «Ощадний дім». Кредит може отримати кожен громадянин у віці від 18 років. Умови: термін – до 3 років; сума кредиту – від 1 до 50 тис. грн; початковий внесок – від 10%; ставка – 17,99%; разова комісія – 4,3%. ";
	String s_UkrgasBank2 = "Позичальником може бути кожен громадянин у віці від 21 до 65 років. Умови: термін – до 3 років; сума – від 1 тис. до 50 тис. грн; власний внесок – від 10%; ставка – до 17,5%; разова комісія – 4,3%.";
	String s_PruvatBank2 = "Кредит може отримати кожен громадянин у віці від 18 до 65 років за наявності картки «Універсальна». Умови: термін кредитування до 24 місяців; сума – до 50 тис. грн; ставка – 0% – до 55 днів користування кредитом; разова комісія та  початковий внесок – відсутній.";

	Desktop desktop = Desktop.getDesktop();

	public PidtrumkaTepla(String s, final int i_VudPidtrumku) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		b_Menu = new JButton("Меню");
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Енергозбереження дому");
				setVisible(false);
			}
		});
		b_Menu.setBounds(661, 0, 133, 34);
		getContentPane().add(b_Menu);

		l_Hapka = new JLabel("Підтримка");
		l_Hapka.setForeground(Color.ORANGE);
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 35));
		l_Hapka.setBounds(84, 9, 601, 35);
		getContentPane().add(l_Hapka);

		if (i_VudPidtrumku == 1) {
			s_Recomendacii1 = s_OscadBank1;
			s_Recomendacii2 = s_UkrgasBank1;
			s_Recomendacii3 = s_PruvatBank1;

		} else {
			s_Recomendacii1 = s_OscadBank2;
			s_Recomendacii2 = s_UkrgasBank2;
			s_Recomendacii3 = s_PruvatBank2;
		}

		JLabel l_OscadBank = new JLabel("ОЩАДБАНК");
		l_OscadBank.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		l_OscadBank.setBounds(44, 57, 211, 34);
		getContentPane().add(l_OscadBank);

		JTextPane textPane_OscadBank = new JTextPane();
		textPane_OscadBank.setText(s_Recomendacii1);
		textPane_OscadBank.setForeground(Color.MAGENTA);
		textPane_OscadBank.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textPane_OscadBank.setBackground(Color.WHITE);
		textPane_OscadBank.setBounds(12, 89, 770, 106);
		getContentPane().add(textPane_OscadBank);

		JLabel l_UkrgasBank = new JLabel("УКРГАЗБАНК");
		l_UkrgasBank.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		l_UkrgasBank.setBounds(44, 228, 211, 34);
		getContentPane().add(l_UkrgasBank);

		JTextPane textPane_UkrgasBank = new JTextPane();
		textPane_UkrgasBank.setText(s_Recomendacii2);
		textPane_UkrgasBank.setForeground(Color.MAGENTA);
		textPane_UkrgasBank.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textPane_UkrgasBank.setBackground(Color.WHITE);
		textPane_UkrgasBank.setBounds(12, 260, 770, 106);
		getContentPane().add(textPane_UkrgasBank);

		JLabel l_PruvatBank = new JLabel("ПРИВАТБАНК");
		l_PruvatBank.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		l_PruvatBank.setBounds(46, 399, 211, 34);
		getContentPane().add(l_PruvatBank);

		JTextPane textPane_PruvatBank = new JTextPane();
		textPane_PruvatBank.setText(s_Recomendacii3);
		textPane_PruvatBank.setForeground(Color.MAGENTA);
		textPane_PruvatBank.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textPane_PruvatBank.setBackground(Color.WHITE);
		textPane_PruvatBank.setBounds(14, 431, 770, 106);
		getContentPane().add(textPane_PruvatBank);

		JLabel l_DetalniheOscadBank = new JLabel("Детальніше...");
		l_DetalniheOscadBank.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					if (i_VudPidtrumku == 1) {
						desktop.browse(new URI("https://www.oschadbank.ua/ua/business/loans/osbb/"));
					} else {
						desktop.browse(new URI("https://www.oschadbank.ua/ua/press-service/news/3408610/"));
					}

				} catch (Exception e1) {
				}
			}
		});
		l_DetalniheOscadBank.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l_DetalniheOscadBank.setBounds(671, 193, 111, 25);
		getContentPane().add(l_DetalniheOscadBank);

		JLabel l_DetalniheUkrgasBank = new JLabel("Детальніше...");
		l_DetalniheUkrgasBank.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if (i_VudPidtrumku == 1) {
						desktop.browse(new URI("http://saee.gov.ua/uk/pressroom/497"));
					} else {
						desktop.browse(new URI(
								"http://zolotonosha.ck.ua/programa-kredy-tuvannya-tepla-oselya-vid-ukrgazbanku/"));
					}
				} catch (Exception e1) {
				}
			}
		});
		l_DetalniheUkrgasBank.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l_DetalniheUkrgasBank.setBounds(671, 366, 111, 25);
		getContentPane().add(l_DetalniheUkrgasBank);

		JLabel l_DetalnihePruvatBank = new JLabel("Детальніше...");
		l_DetalnihePruvatBank.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if (i_VudPidtrumku == 1) {
						desktop.browse(new URI(
								"https://privatbank.ua/news/privatbank-vydajot-osmd-t-oplyje-kredity-za-3-dn-a/"));
					} else {
						desktop.browse(new URI(
								"https://privatbank.ua/news/privatbank-budet-vydavat-teplyje-kredity-po-bezbumazhnoj-tehnologii/"));
					}
				} catch (Exception e1) {
				}
			}
		});
		l_DetalnihePruvatBank.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l_DetalnihePruvatBank.setBounds(671, 540, 111, 25);
		getContentPane().add(l_DetalnihePruvatBank);

		// l_fon = new JLabel("");
		// l_fon.setBounds(0, 0, 794, 565);
		// l_fon.setIcon(new ImageIcon("res/fon_Pomulku.jpg"));
		// getContentPane().add(l_fon);

		setVisible(true);
	}
}

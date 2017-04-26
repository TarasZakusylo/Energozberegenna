package KP.Energozberegenna;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class ElektroenergiaRezultatu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Menu;
	private JLabel l_Hapka;
	private JScrollPane scrollPane_Rekomendacia;
	private JTextPane textPane_Rekomendacia;

	private int k_PunktivRekomendaciy = 0;
	private int k_Motuvacia = 0;

	String s_Recomendacia = "1.   Йдучи з приміщення, гасіть світло\r\nМабуть, це правило є найпростішим способом економити електроенергію. Якщо ви забудькуваті, напишіть записку з нагадуванням і прикипіть її біля вхідних дверей. Ця порада є однією з найефективніших.\r\n2.   Використання освітлювальних приладів лише за необхідністю;\r\n3.   Максимальне використання денного світла (збільшення кількості, площі та прозорості вікон);";

	private JLabel l_fonVodaRecomendacii;

	private JLabel l_Pohvala;
	private JLabel l_fotoPohvala;

	public ElektroenergiaRezultatu(String s, int i_putanna1, int i_slider_putanna2, int i_slider_putanna3,
			int i_slider_putanna4, int i_slider_putanna5, int i_slider_putanna6) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		b_Menu = new JButton("Меню");
		b_Menu.setBounds(697, 0, 97, 25);
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Енергозбереження дому");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Menu);

		l_Hapka = new JLabel("Вам необхідно:");
		l_Hapka.setForeground(Color.YELLOW);
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 28));
		l_Hapka.setBounds(84, 9, 601, 35);
		getContentPane().add(l_Hapka);

		if (i_putanna1 == 2) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Використовуйте допоміжні прилади.\nЗ розвитком сучасних технологій з'явилися прилади, які допомагають значно заощадити електроенергію. До них належать різні дистанційні та автоматичні вимикачі, реле, трансформатори і багато іншого. Такі чудеса техніки були створені спеціально з метою зниження комунальних платежів. Завдяки цим приладам економія електроенергії зростає в 8-10 разів.";
		}

		if (i_slider_putanna2 <= 75) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Використовуйте енергозберігаючі лампи.\nОдним із способів економити світло є проста заміна звичайних ламп розжарювання на енергозберігаючі. І хоча вартість таких лампочок вища, ніж звичайних, але служать вони набагато довше. За рахунок того, що дані лампочки практично не нагріваються, витрачена енергія йде тільки на освітлення. У середньому, термін їх служби сягає трьох років.";
		}

		if (i_slider_putanna3 > 50) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Робіть пробирання частіше. Протирайте лампочки, люстри.\nЗамислюючись над тим, як економити електрику в квартирі, мало хто згадує про необхідність протирати лампочки. Небагато хто прислухається до цієї поради, адже набагато простіше замінити потьмянілу лампу більш потужною. Варто знати, що пил може \"з'їдати\" до 20% світла від лампи. Крім того, не варто забувати і про плафони.";
		}

		if (i_slider_putanna4 > 50) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Зробіть косметичний ремонт.\nНевеликий косметичний ремонт так само допоможе заощадити на електриці. Для цього вам буде потрібно всього лише поклеїти світлі шпалери і пофарбувати стелю в білий колір. Світлі стіни здатні повертати до вісімдесяти відсотків променів. Чим темніші шпалери, тим меншою буде світловіддача, наприклад чорний колір віддає лише дев'ять відсотків світла.";
		}

		if (i_slider_putanna5 <= 75) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Використовуйте світильники безпосередньо над робочим місцем.\nПрактика показала, що один і той же рівень освітленості робочого місця при пакетному, місцевому способі підтримується в 2 рази меншим числом світильників.";
		}

		if (i_slider_putanna6 <= 75) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Використовуйте різнорівневі люстри.\nЕкономії електроенергії також сприяє установка в кімнатах подвійних вмикачів. Це дозволяє при необхідності включати люстри повністю або частково. ";
		}

		scrollPane_Rekomendacia = new JScrollPane();
		getContentPane().add(scrollPane_Rekomendacia);

		if (k_Motuvacia == 0) {
			scrollPane_Rekomendacia.setBounds(10, 53, 772, 114);

			l_Pohvala = new JLabel("У Вас чудово світлоопримізоване житло !");
			l_Pohvala.setHorizontalAlignment(SwingConstants.CENTER);
			l_Pohvala.setForeground(Color.YELLOW);
			l_Pohvala.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 28));
			l_Pohvala.setBounds(84, 187, 601, 35);
			getContentPane().add(l_Pohvala);

			l_fotoPohvala = new JLabel("");
			l_fotoPohvala.setHorizontalAlignment(SwingConstants.CENTER);
			l_fotoPohvala.setBounds(150, 235, 470, 317);
			l_fotoPohvala.setIcon(new ImageIcon("res/Pohvala.png"));
			getContentPane().add(l_fotoPohvala);

		} else {
			scrollPane_Rekomendacia.setBounds(10, 53, 772, 499);
		}

		textPane_Rekomendacia = new JTextPane();
		textPane_Rekomendacia.setBackground(Color.WHITE);
		textPane_Rekomendacia.setForeground(Color.MAGENTA);
		textPane_Rekomendacia.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane_Rekomendacia.setViewportView(textPane_Rekomendacia);
		textPane_Rekomendacia.setText(s_Recomendacia);

		l_fonVodaRecomendacii = new JLabel("");
		l_fonVodaRecomendacii.setBounds(0, 0, 794, 565);
		l_fonVodaRecomendacii.setIcon(new ImageIcon("res/fon_VodaRecomendacii.jpg"));
		getContentPane().add(l_fonVodaRecomendacii);

		setVisible(true);
	}

	private void PunktuRekomendaciy(int k_PunktivRekomendaciy1) {

		this.k_PunktivRekomendaciy = k_PunktivRekomendaciy1;

		switch (k_PunktivRekomendaciy) {
		case 0: {
			s_Recomendacia = s_Recomendacia + "\r\n4.   ";
		}
			break;
		case 1: {
			s_Recomendacia = s_Recomendacia + "\r\n5.   ";
		}
			break;
		case 2: {
			s_Recomendacia = s_Recomendacia + "\r\n6.   ";
		}
			break;
		case 3: {
			s_Recomendacia = s_Recomendacia + "\r\n7.   ";
		}
			break;
		case 4: {
			s_Recomendacia = s_Recomendacia + "\r\n8.   ";
		}
			break;
		case 5: {
			s_Recomendacia = s_Recomendacia + "\r\n9.   ";
		}
			break;
		}
		k_PunktivRekomendaciy++;
		k_Motuvacia++;
	}

}

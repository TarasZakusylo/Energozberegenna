package KP.Energozberegenna;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class TeploRezultatu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Menu;
	private JLabel l_Hapka;
	private JScrollPane scrollPane_Rekomendacia;
	private JTextPane textPane_Rekomendacia;

	private int k_PunktivRekomendaciy = 0;
	private int k_Motuvacia = 0;
	private double d_gustotaNaselenna = 0;
	private int i_plosca = 0;

	String s_Recomendacia = "1.   Опалювальні прилади та радіатори будуть більш ефективними, якщо їх не затуляти меблями, одягом чи декоративними панелями.\r\n"
			+ "2.   Перед початком кожного опалювального сезону слід перевіряти систему. Варто усунути повітряні пробки, відремонтувати місця можливого протікання, звертаючи особливу увагу на місця з’єднань частин системи. Це дозволить уникнути проривів  під час експлуатації системи у холодний період.\r\n"
			+ "3.   Щільні штори допомагають утримувати тепло в оселі, але заважають надходженню тепла з радіаторів.\r\n"
			+ "4.   Товстий килим знижує тепловитрати, які йдуть через підлогу.\r\n"
			+ "5.   Розмістіть за батареями теплозахисні екрани або фольгу, тоді тепловіддача збільшиться на 20%.";

	private JLabel l_fonVodaRecomendacii;

	private JLabel l_Pohvala;
	private JLabel l_fotoPohvala;
	private JButton b_AlternatuvneOpalenna;
	private JButton b_Pidtrumka;

	Desktop desktop = Desktop.getDesktop();

	public TeploRezultatu(String s, int i_putanna1, int i_putanna2_1, String s_putanna2_2, int i_slider_putanna4,
			int i_putanna5, int i_putanna_grup1, int i_checkBox_putanna2_1, int i_checkBox_putanna2_2,
			int i_checkBox_putanna2_3, int i_putanna_grup3, int i_putanna_grup4) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		b_Menu = new JButton("Меню");
		b_Menu.setBounds(661, 0, 133, 34);
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Енергозбереження дому");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Menu);

		l_Hapka = new JLabel("Вам необхідно:");
		l_Hapka.setForeground(Color.BLUE);
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 28));
		l_Hapka.setBounds(84, 9, 601, 35);
		getContentPane().add(l_Hapka);

		switch (s_putanna2_2) {
		case "До 20 м2": {
			i_plosca = 20;
		}
			break;
		case "20 Х 30 м2": {
			i_plosca = 25;
		}
			break;
		case "30 Х 40 м2": {
			i_plosca = 35;
		}
			break;
		case "40 Х 50 м2": {
			i_plosca = 45;
		}
			break;
		case "50 Х 60 м2": {
			i_plosca = 55;
		}
			break;
		case "60 Х 70 м2": {
			i_plosca = 65;
		}
			break;
		case "70 Х 80 м2": {
			i_plosca = 75;
		}
			break;
		case "80 Х 90 м2": {
			i_plosca = 85;
		}
			break;
		case "90 Х 100 м2": {
			i_plosca = 95;
		}
			break;
		case "Понад 100 м2": {
			i_plosca = 100;
		}
			break;
		}

		d_gustotaNaselenna = i_plosca / i_putanna_grup1;

		if (d_gustotaNaselenna < 12) {
			JOptionPane.showMessageDialog(null,
					"На жаль, Ваше житло затісне для вашої родини.\nВам варто розшорюватись.");
		}

		if (d_gustotaNaselenna >= 30 && i_putanna2_1 > 1) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "У Вас велике житло. Задля економії рекомендовано оптимізувати своє житло. Законсервувати кімнати, що менше використовуються, зменшіть там температуру на кілька градусів, регулярно поровітрюйте та прогрівайте. Слідкуйте за грибком.";
			k_Motuvacia--;
		}

		if (i_putanna_grup3 == 2) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Тепловий лічильник в квартирі дає змогу відслідкувати скільки тепла ви отримали та платити тільки за цю кількість.";
		}

		if (i_slider_putanna4 <= 75) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Термостатичний вентиль на радіатор дозволить контролювати температуру в будинку, квартирі чи окремій кімнаті.";
		}

		if (i_putanna5 == 2) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Система “тепла підлога” – спосіб підвести тепло саме туди, де воно найбільше потрібно. Наприклад, під робочий стіл або на ділянку підлоги, де ходять мешканці.";
		}

		if (i_putanna_grup4 == 2) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Об'є́днання співвла́сників багатокварти́рного буди́нку, або ОСББ — (юридична особа, створена для представлення спільних інтересів об'єднань) це неприбуткова юридична особа, створена власниками житлових та нежитлових приміщень для спільного користування, утримання та управління своїм будинком та прибудинковою територією, а також для юридичного оформлення їхніх майнових прав на будинок та прибудинкову територію.";
		}

		if (i_checkBox_putanna2_1 == 1) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Вам необхідно утеплити житло(стіни, фундаменти, стелі, горища, підвали). Використовуйте для утеплення такі матеріали, як пінополістирол, екструзійний пінополістирол, мінераловатні плити, базальтові плити, енергозберігаючі фарби. Непоганий варіант – спеціальні кількашарові системи утеплення.";
		}

		if (i_checkBox_putanna2_2 == 1) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Вікна з подвійним або потрійним заскленням у кілька разів зменшують втрати тепла. Найбільш доступний варіант, який може обрати кожен - утеплити вікна поролоновими смужками.";
		}

		if (i_checkBox_putanna2_3 == 1) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Необхідно підвищити теплоізоляцію вхідних дверей, звертаючи увагу на низ, верх та бічні стики між дверима і стіною. Найбільш доступний варіант, який може обрати кожен - підтягнути дверні петлі та додатково оббити самі двері, задути монтажною піною місця виходу та входу труб з оселі.";
		}

		scrollPane_Rekomendacia = new JScrollPane();
		getContentPane().add(scrollPane_Rekomendacia);

		if (k_Motuvacia == 0) {

			scrollPane_Rekomendacia.setBounds(10, 43, 772, 174);

			l_Pohvala = new JLabel("У Вас чудово світлооптимізоване житло !");
			l_Pohvala.setHorizontalAlignment(SwingConstants.CENTER);
			l_Pohvala.setForeground(Color.BLUE);
			l_Pohvala.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 28));
			l_Pohvala.setBounds(84, 220, 601, 35);
			getContentPane().add(l_Pohvala);

			l_fotoPohvala = new JLabel("");
			l_fotoPohvala.setHorizontalAlignment(SwingConstants.CENTER);
			l_fotoPohvala.setBounds(150, 245, 470, 317);
			l_fotoPohvala.setIcon(new ImageIcon("res/Pohvala.png"));
			getContentPane().add(l_fotoPohvala);

		} else {
			scrollPane_Rekomendacia.setBounds(10, 53, 772, 480);
		}

		textPane_Rekomendacia = new JTextPane();
		textPane_Rekomendacia.setBackground(Color.WHITE);
		textPane_Rekomendacia.setForeground(Color.MAGENTA);
		textPane_Rekomendacia.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane_Rekomendacia.setViewportView(textPane_Rekomendacia);
		textPane_Rekomendacia.setText(s_Recomendacia);

		b_Pidtrumka = new JButton("Підтримка");
		b_Pidtrumka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PidtrumkaTepla("Підтримка", 1);
				setVisible(false);
			}
		});
		b_Pidtrumka.setBounds(0, 531, 398, 34);
		getContentPane().add(b_Pidtrumka);

		b_AlternatuvneOpalenna = new JButton("Альтернативні котли");
		b_AlternatuvneOpalenna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					desktop.browse(new URI("http://bio.ukrbio.com/ua/articles/7541/"));
					desktop.browse(new URI("http://vtepli.com.ua/news/yak-vibrati-pravilniy-tverdopalivniy-kotel/"));
					desktop.browse(new URI("http://ekonomteplo.com.ua/tverdopalyvni-kotly/"));
				} catch (Exception e1) {
				}
			}
		});
		b_AlternatuvneOpalenna.setBounds(396, 531, 398, 34);
		getContentPane().add(b_AlternatuvneOpalenna);

		l_fonVodaRecomendacii = new JLabel("");
		l_fonVodaRecomendacii.setBounds(0, 0, 794, 565);
		l_fonVodaRecomendacii.setIcon(new ImageIcon("res/fon_TeploRecomendacii.jpg"));
		getContentPane().add(l_fonVodaRecomendacii);

		setVisible(true);
	}

	public TeploRezultatu(String s, int i_putanna1, int i_putanna2_1, String s_putanna2_2, int i_slider_putanna4,
			int i_putanna5, int i_putanna_grup1, int i_checkBox_putanna2Var2_1, int i_checkBox_putanna2Var2_2,
			int i_checkBox_putanna2Var2_3, int i_checkBox_putanna2Var2_4, int i_checkBox_putanna2Var2_5,
			int i_checkBox_putanna2Var2_6, int i_slider_putanna3Var2, int i_putanna_grup4Var2) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);

		b_Menu = new JButton("Меню");
		b_Menu.setBounds(661, 0, 133, 34);
		b_Menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu("Енергозбереження дому");
				setVisible(false);
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(b_Menu);

		l_Hapka = new JLabel("Вам необхідно:");
		l_Hapka.setForeground(Color.GREEN);
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 28));
		l_Hapka.setBounds(84, 9, 601, 35);
		getContentPane().add(l_Hapka);

		switch (s_putanna2_2) {
		case "До 20 м2": {
			i_plosca = 20;
		}
			break;
		case "20 Х 30 м2": {
			i_plosca = 25;
		}
			break;
		case "30 Х 40 м2": {
			i_plosca = 35;
		}
			break;
		case "40 Х 50 м2": {
			i_plosca = 45;
		}
			break;
		case "50 Х 60 м2": {
			i_plosca = 55;
		}
			break;
		case "60 Х 70 м2": {
			i_plosca = 65;
		}
			break;
		case "70 Х 80 м2": {
			i_plosca = 75;
		}
			break;
		case "80 Х 90 м2": {
			i_plosca = 85;
		}
			break;
		case "90 Х 100 м2": {
			i_plosca = 95;
		}
			break;
		case "Понад 100 м2": {
			i_plosca = 100;
		}
			break;
		}

		d_gustotaNaselenna = i_plosca / i_putanna_grup1;

		if (d_gustotaNaselenna < 12) {
			JOptionPane.showMessageDialog(null,
					"На жаль, Ваше житло затісне для вашої родини.\nВам варто розшорюватись.");
		}

		if (d_gustotaNaselenna >= 30 && i_putanna2_1 > 1) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "У Вас велике житло. Задля економії рекомендовано оптимізувати своє житло. Законсервувати кімнати, що менше використовуються, зменшіть там температуру на кілька градусів, регулярно поровітрюйте та прогрівайте. Слідкуйте за грибком.";
			k_Motuvacia--;
		}

		if (i_putanna_grup4Var2 == 2) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Модернізація системи вентиляції, а саме рекуперація тепла, – це реальний спосіб економії.Рекуперація тепла - процес повернення тепла з відпрацьованого витяжного повітря. Тепле повітря, що виводиться з приміщення, в теплообміннику віддає більшу частину свого тепла холодному повітрю, що надходить з вулиці.";
		}

		if (i_slider_putanna4 <= 75) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Термостатичний вентиль на радіатор дозволить контролювати температуру в будинку, квартирі чи окремій кімнаті.";
		}

		if (i_putanna5 == 2) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Система “тепла підлога” – спосіб підвести тепло саме туди, де воно найбільше потрібно. Наприклад, під робочий стіл або на ділянку підлоги, де ходять мешканці.";
		}

		if (i_slider_putanna3Var2 >= 75) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Вам варто звернути увагу на опалювальну техніку. Їй необхідна діагностика, чистка, заміна деталей, а можливо і повна заміна.";
		}

		if (i_checkBox_putanna2Var2_1 == 1 && i_checkBox_putanna2Var2_2 == 1 && i_checkBox_putanna2Var2_5 == 1
				&& i_checkBox_putanna2Var2_6 == 1) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Вам необхідно комплексно утеплити житло (стіни, фундаменти, стелі, горища, підвали). Використовуйте для утеплення такі матеріали, як пінополістирол, екструзійний пінополістирол, мінераловатні плити, базальтові плити, енергозберігаючі фарби. Непоганий варіант – спеціальні кількашарові системи утеплення.";
		} else {
			if (i_checkBox_putanna2Var2_1 == 1 || i_checkBox_putanna2Var2_2 == 1 || i_checkBox_putanna2Var2_5 == 1
					|| i_checkBox_putanna2Var2_6 == 1) {
				PunktuRekomendaciy(k_PunktivRekomendaciy);
				s_Recomendacia = s_Recomendacia
						+ "Часткове утеплення не надасть повноцінного ефекту, утепліть повністю і стіни, і фундамент, і стелю. Використовуйте для утеплення такі матеріали, як пінополістирол, екструзійний пінополістирол, мінераловатні плити, базальтові плити, енергозберігаючі фарби. Непоганий варіант – спеціальні кількашарові системи утеплення.";
			}
		}

		if (i_checkBox_putanna2Var2_4 == 1) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Вікна з подвійним або потрійним заскленням у кілька разів зменшують втрати тепла. Найбільш доступний варіант, який може обрати кожен - утеплити вікна поролоновими смужками.";
		}

		if (i_checkBox_putanna2Var2_3 == 1) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "Необхідно підвищити теплоізоляцію вхідних дверей, звертаючи увагу на низ, верх та бічні стики між дверима і стіною. Найбільш доступний варіант, який може обрати кожен - підтягнути дверні петлі та додатково оббити самі двері, задути монтажною піною місця виходу та входу труб з оселі.";
		}

		scrollPane_Rekomendacia = new JScrollPane();
		getContentPane().add(scrollPane_Rekomendacia);

		if (k_Motuvacia == 0) {

			scrollPane_Rekomendacia.setBounds(10, 43, 772, 174);

			l_Pohvala = new JLabel("У Вас чудово світлооптимізоване житло !");
			l_Pohvala.setHorizontalAlignment(SwingConstants.CENTER);
			l_Pohvala.setForeground(Color.BLUE);
			l_Pohvala.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 28));
			l_Pohvala.setBounds(84, 220, 601, 35);
			getContentPane().add(l_Pohvala);

			l_fotoPohvala = new JLabel("");
			l_fotoPohvala.setHorizontalAlignment(SwingConstants.CENTER);
			l_fotoPohvala.setBounds(150, 245, 470, 317);
			l_fotoPohvala.setIcon(new ImageIcon("res/Pohvala.png"));
			getContentPane().add(l_fotoPohvala);

		} else {
			scrollPane_Rekomendacia.setBounds(10, 53, 772, 480);
		}

		textPane_Rekomendacia = new JTextPane();
		textPane_Rekomendacia.setBackground(Color.WHITE);
		textPane_Rekomendacia.setForeground(Color.MAGENTA);
		textPane_Rekomendacia.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane_Rekomendacia.setViewportView(textPane_Rekomendacia);
		textPane_Rekomendacia.setText(s_Recomendacia);

		b_Pidtrumka = new JButton("Підтримка");
		b_Pidtrumka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PidtrumkaTepla("Підтримка", 2);
				setVisible(false);
			}
		});
		b_Pidtrumka.setBounds(0, 531, 398, 34);
		getContentPane().add(b_Pidtrumka);

		b_AlternatuvneOpalenna = new JButton("Альтернативні котли");
		b_AlternatuvneOpalenna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					desktop.browse(new URI("http://bio.ukrbio.com/ua/articles/7541/"));
					desktop.browse(new URI("http://vtepli.com.ua/news/yak-vibrati-pravilniy-tverdopalivniy-kotel/"));
					desktop.browse(new URI("http://ekonomteplo.com.ua/tverdopalyvni-kotly/"));
				} catch (Exception e1) {
				}
			}
		});
		b_AlternatuvneOpalenna.setBounds(396, 531, 398, 34);
		getContentPane().add(b_AlternatuvneOpalenna);

		l_fonVodaRecomendacii = new JLabel("");
		l_fonVodaRecomendacii.setBounds(0, 0, 794, 565);
		l_fonVodaRecomendacii.setIcon(new ImageIcon("res/fon_TeploRecomendacii.jpg"));
		getContentPane().add(l_fonVodaRecomendacii);

		setVisible(true);

	}

	private void PunktuRekomendaciy(int k_PunktivRekomendaciy1) {

		this.k_PunktivRekomendaciy = k_PunktivRekomendaciy1;

		switch (k_PunktivRekomendaciy) {
		case 0: {
			s_Recomendacia = s_Recomendacia + "\r\n6.   ";
		}
			break;
		case 1: {
			s_Recomendacia = s_Recomendacia + "\r\n7.   ";
		}
			break;
		case 2: {
			s_Recomendacia = s_Recomendacia + "\r\n8.   ";
		}
			break;
		case 3: {
			s_Recomendacia = s_Recomendacia + "\r\n9.   ";
		}
			break;
		case 4: {
			s_Recomendacia = s_Recomendacia + "\r\n10.   ";
		}
			break;
		case 5: {
			s_Recomendacia = s_Recomendacia + "\r\n11.   ";
		}
			break;
		case 6: {
			s_Recomendacia = s_Recomendacia + "\r\n12.   ";
		}
			break;
		}
		k_PunktivRekomendaciy++;
		k_Motuvacia++;
	}
}

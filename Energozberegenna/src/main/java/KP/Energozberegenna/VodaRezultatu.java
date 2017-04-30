package KP.Energozberegenna;

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
import java.awt.Color;

public class VodaRezultatu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Menu;
	private JLabel l_Hapka;
	private JScrollPane scrollPane_Rekomendacia;
	private JTextPane textPane_Rekomendacia;

	private int k_PunktivRekomendaciy = 0;

	String s_Recomendacia = "1.   Закривати воду, якщо не користуєтеся водою тут і зараз. Наприклад, закривайте кран під час гоління, чищення зубів, зняття шкірки з овочів і фруктів, або встановіть електронний змішувач.\r\n2.   Ощадливіше користуватися змішувачем у вигляді ручки, ніж стандартними двома кранами. Можна встановити комфортну температуру, вмикати та вимикати кран одним рухом, а не крутити крани щоразу, марно витрачаючи воду та гаючи час.\r\n3.   Необхідно перекривати вентиль для води, якщо приміщення залишають на кілька днів.\r\n4.   Слідкуйте за станом своєї сантехніки! Якщо ваш кран протікає – ви втрачаєте до 500 літрів води за добу. Якщо витікає гаряча вода – ви ще й марно витрачаєте газ, який іде на її підігрівання! За день з несправного туалетного бачка може витекти до 2 000 літрів води. \r\n5.   Встановіть у туалеті економний зливний бачок, з двома клавішами змиву. Так ви будете використовувати всього 6 або навіть 3 літри води замість 10-12 за одне зливання.\r\n6.   Придбайте і встановіть спеціальну насадку-розпилювач типу «душ» на кран у кухні.\r\n";

	private JLabel l_fonVodaRecomendacii;

	public VodaRezultatu(String s, int i_putanna1, int i_putanna2, int i_slider_putanna3, int i_slider_putanna4,
			int i_slider_putanna5, int i_putanna6, int i_slider_putanna7) {
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
		l_Hapka.setForeground(Color.YELLOW);
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 28));
		l_Hapka.setBounds(84, 9, 601, 35);
		getContentPane().add(l_Hapka);

		if (i_putanna1 == 1) {
			if (i_putanna2 != 4) {
				PunktuRekomendaciy(k_PunktivRekomendaciy);
				s_Recomendacia = s_Recomendacia
						+ "   Вам варто встановити лічильники на воду, як гарячу, так і холодну. Інакше Ви сплачуватиме з власної кишені за кожен прорив на трасі або за сусіда, який не відремонтував свій кран.\r\n";
			}
		} else {
			if (i_putanna2 == 1) {
				PunktuRekomendaciy(k_PunktivRekomendaciy);
				s_Recomendacia = s_Recomendacia
						+ "   Вам варто встановити лічильники на воду. Таким чином, Ви зможете краще контролювати себе та слідкувати за витратами.\r\n";
			}
		}
		if (i_slider_putanna3 < 66) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "   Приймати душ економніше, ніж ванну. Через насадки, які розпилюють воду, витратиться у кілька разів менше води.\r\n";
		}

		if (i_slider_putanna4 < 66) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "   Не рекомендується розморожувати продукти – м’ясо, рибу - під струменем. Це не лише марне витрачання води та тепла, але й знищення корисних речовин продуктів.\r\n";
		}

		if (i_slider_putanna5 > 66) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "   Слід використовувати побутові прилади, які заощаджують працю, час та ресурси. Наприклад, автоматичні пральні машини, посудомийні машини тощо.  Робіть повне завантаження пральної машини. Під час часткового заповнення споживається майже та сама кількість енергії, що й за повного. Періть речі у холодній воді, адже 90 % енергії, яку споживає пральна машина, йде на обігрів води.\r\n";
		}

		if (i_putanna6 == 1) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia
					+ "   Миття машини за допомогою відра замість шланга значно зменшить витрати води.\r\n";
		}

		if (i_slider_putanna7 > 49) {
			PunktuRekomendaciy(k_PunktivRekomendaciy);
			s_Recomendacia = s_Recomendacia + "   Для поливу квітників та газонів використовуйте дощову воду.";
		}

		scrollPane_Rekomendacia = new JScrollPane();
		scrollPane_Rekomendacia.setBounds(10, 53, 772, 499);
		getContentPane().add(scrollPane_Rekomendacia);

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
			s_Recomendacia = s_Recomendacia + "7.";
		}
			break;
		case 1: {
			s_Recomendacia = s_Recomendacia + "8.";
		}
			break;
		case 2: {
			s_Recomendacia = s_Recomendacia + "9.";
		}
			break;
		case 3: {
			s_Recomendacia = s_Recomendacia + "10.";
		}
			break;
		case 4: {
			s_Recomendacia = s_Recomendacia + "11.";
		}
			break;
		case 5: {
			s_Recomendacia = s_Recomendacia + "12.";
		}
			break;
		}
		k_PunktivRekomendaciy++;
	}

}

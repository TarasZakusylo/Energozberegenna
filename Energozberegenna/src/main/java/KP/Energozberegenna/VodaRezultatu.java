package KP.Energozberegenna;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class VodaRezultatu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Menu;
	private JLabel l_Hapka;
	private JScrollPane scrollPane_Rekomendacia;
	private JTextPane textPane_Rekomendacia;

	String s_Recomendacia = "1.   Закривати воду, якщо не користуєтеся водою тут і зараз. Наприклад закривайте кран під час гоління, чищення зубів, зняття шкірки з овочів і фруктів, або встановіть електронний змішувач.\r\n2.   Ощадливіше користуватися змішувачем у вигляді ручки, ніж стандартними двома кранами. Можна встановити комфортну температуру, вмикати та вимикати кран одним рухом, а не крутити крани щоразу, марно витрачаючи воду та гаючи час.\r\n3.   Необхідно перекривати вентиль для води, якщо приміщення залишають на кілька днів.\r\n4.   Слідкуйте за станом своєї сантехніки! Якщо ваш кран протікає – ви втрачаєте до 500 літрів води за добу. Якщо витікає гаряча вода – ви ще й марно витрачаєте газ, який іде на її підігрівання! За день з несправного туалетного бачка може витекти до 2 000 літрів води. \r\n5.   Встановіть у туалеті економний зливний бачок, з двома клавішами змиву. Так ви будете використовувати всього 6 або навіть 3 літри води замість 10-12 за одне зливання.\r\n6.   Придбайте і встановіть спеціальну насадку-розпилювач типу «душ» на кран у кухні.\r\n";

	public VodaRezultatu(String s, int s_putanna1, int s_putanna2, int i_slider_putanna3, int i_slider_putanna4,
			int i_slider_putanna5, int s_putanna6, int i_slider_putanna7) {
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
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.ITALIC, 25));
		l_Hapka.setBounds(84, 9, 601, 35);
		getContentPane().add(l_Hapka);
		
		if (s_putanna1 == 1) {
			if (s_putanna2 != 4) {
				s_Recomendacia = s_Recomendacia
						+ "7.   Вам варто встановити лічильники на воду, як гарячу, так і холодну. Інакше Ви сплачуватиме з власної кишені за кожен прорив на трасі або за сусіда, який не відремонтував свій кран.";
				}
		}else{
			if (s_putanna2 == 1) {
				s_Recomendacia = s_Recomendacia
						+ "7.   Вам варто встановити лічильники на воду. Таким чином, Ви зможете краще контролювати себе та слідкувати за витратами.";
			}
		}

		scrollPane_Rekomendacia = new JScrollPane();
		scrollPane_Rekomendacia.setBounds(10, 53, 772, 453);
		getContentPane().add(scrollPane_Rekomendacia);

		textPane_Rekomendacia = new JTextPane();
		scrollPane_Rekomendacia.setViewportView(textPane_Rekomendacia);
		textPane_Rekomendacia.setText(s_Recomendacia);
		
		setVisible(true);
	}
}

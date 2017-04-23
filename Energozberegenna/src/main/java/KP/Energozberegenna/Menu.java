package KP.Energozberegenna;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel l_Nazva;
	private JButton b_Teplo;
	private JButton b_Elektroenergia;
	private JButton b_Voda;
	private JButton b_Pruladu;
	private JButton b_Pomulku;
	private JLabel l_Zakk;
	private JLabel l_logo;

	public Menu(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		l_Nazva = new JLabel("Енергозбереження дому");
		l_Nazva.setForeground(Color.YELLOW);
		l_Nazva.setFont(new Font("Palatino Linotype", Font.ITALIC, 55));
		l_Nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_Nazva.setBounds(0, 0, 794, 78);
		getContentPane().add(l_Nazva);

		b_Teplo = new JButton("Тепло");
		b_Teplo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeploOputuvanna("Теплозбереження");
				setVisible(false);
			}
		});
		b_Teplo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Teplo.setBounds(12, 261, 202, 46);
		getContentPane().add(b_Teplo);

		b_Elektroenergia = new JButton("Електроенергія");
		b_Elektroenergia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ElektroenergiaOputuvanna("Електрозбереження");
				setVisible(false);
			}
		});
		b_Elektroenergia.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Elektroenergia.setBounds(580, 261, 202, 46);
		getContentPane().add(b_Elektroenergia);

		b_Voda = new JButton("Вода");
		b_Voda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new VodaOputuvanna("Водозбереження");
				setVisible(false);
			}
		});
		b_Voda.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Voda.setBounds(71, 366, 202, 46);
		getContentPane().add(b_Voda);

		b_Pruladu = new JButton("Прилади");
		b_Pruladu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PruladuOputuvanna("Приладозбереження");
				setVisible(false);
			}
		});
		b_Pruladu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Pruladu.setBounds(505, 366, 202, 46);
		getContentPane().add(b_Pruladu);

		b_Pomulku = new JButton("Помилки");
		b_Pomulku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PomulkuOputuvanna("Помилки");
				setVisible(false);
			}
		});
		b_Pomulku.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Pomulku.setBounds(292, 464, 202, 46);
		getContentPane().add(b_Pomulku);

		l_Zakk = new JLabel("");
		l_Zakk.setBounds(698, 481, 84, 71);
		l_Zakk.setIcon(new ImageIcon("res/Zakk.png"));
		getContentPane().add(l_Zakk);
		
		l_logo = new JLabel("");
		l_logo.setBounds(0, 0, 794, 565);
		l_logo.setIcon(new ImageIcon("res/logo_menu.jpg"));
		getContentPane().add(l_logo);

		setVisible(true);
	}
}

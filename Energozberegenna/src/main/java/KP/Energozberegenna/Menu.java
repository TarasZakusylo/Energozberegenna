package KP.Energozberegenna;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;

	public Menu(String s) {
		super();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JLabel l_Nazva = new JLabel("Енергозбереження дому");
		l_Nazva.setFont(new Font("Palatino Linotype", Font.ITALIC, 55));
		l_Nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_Nazva.setBounds(0, 0, 794, 78);
		getContentPane().add(l_Nazva);
		
		JButton b_Teplo = new JButton("Тепло");
		b_Teplo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TeploOputuvanna("Теплозбереження");
			}
		});
		b_Teplo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Teplo.setBounds(12, 184, 202, 46);
		getContentPane().add(b_Teplo);
		
		JButton b_Elektroenergia = new JButton("Електроенергія");
		b_Elektroenergia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ElektroenergiaOputuvanna("Електрозбереження");
			}
		});
		b_Elektroenergia.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Elektroenergia.setBounds(580, 184, 202, 46);
		getContentPane().add(b_Elektroenergia);
		
		JButton b_Voda = new JButton("Вода");
		b_Voda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new VodaOputuvanna("Водозбереження");
			}
		});
		b_Voda.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Voda.setBounds(71, 289, 202, 46);
		getContentPane().add(b_Voda);
		
		JButton b_Pruladu = new JButton("Прилади");
		b_Pruladu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PruladuOputuvanna("Приладозбереження");
			}
		});
		b_Pruladu.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Pruladu.setBounds(505, 289, 202, 46);
		getContentPane().add(b_Pruladu);
		
		JButton b_Pomulku = new JButton("Помилки");
		b_Pomulku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new PomulkuOputuvanna("Помилки");
			}
		});
		b_Pomulku.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b_Pomulku.setBounds(292, 387, 202, 46);
		getContentPane().add(b_Pomulku);

		setVisible(true);
	}
}

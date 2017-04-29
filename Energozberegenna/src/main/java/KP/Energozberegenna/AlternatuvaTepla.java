package KP.Energozberegenna;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AlternatuvaTepla extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel l_Hapka;
	private JButton b_Menu;

	private JLabel l_Pomulku;

	public AlternatuvaTepla(String s) {
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

		l_Hapka = new JLabel("Альтернативне опалення");
		l_Hapka.setForeground(Color.ORANGE);
		l_Hapka.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 35));
		l_Hapka.setBounds(84, 9, 601, 35);
		getContentPane().add(l_Hapka);
		
//		l_Pomulku = new JLabel("");
//		l_Pomulku.setBounds(0, 0, 794, 565);
//		l_Pomulku.setIcon(new ImageIcon("res/fon_Pomulku.jpg"));
//		getContentPane().add(l_Pomulku);

		setVisible(true);
	}

}

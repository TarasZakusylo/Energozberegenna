package KP.Energozberegenna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VodaRezultatu  extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton b_Menu;
	
	public VodaRezultatu(String s, int s_putanna1, int s_putanna2,int i_slider_putanna3,int i_slider_putanna4,int i_slider_putanna5,
			int s_putanna6, int i_slider_putanna7) {
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
		b_Menu.setBounds(697, 0, 97, 25);
		getContentPane().add(b_Menu);
		
		setVisible(true);
	}

}

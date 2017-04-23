package KP.Energozberegenna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ElektroenergiaOputuvanna extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton b_Nazad;
	
	public ElektroenergiaOputuvanna(String s) {
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
		b_Nazad.setBounds(697, 0, 97, 25);
		getContentPane().add(b_Nazad);
		
		setVisible(true);
	}

}

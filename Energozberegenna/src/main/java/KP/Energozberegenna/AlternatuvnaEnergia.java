package KP.Energozberegenna;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AlternatuvnaEnergia extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JLabel l_Hapka1;
	private JButton b_Menu;
	private JLabel l_alternatuva1;
	private JLabel l_alternatuva2;
	private JLabel l_alternatuva4;
	private JLabel l_alternatuva3;
	private JLabel l_strilka1;
	private JLabel l_strilka2;
	private JLabel l_strilka4;
	private JLabel l_strilka3;
	private JLabel l_Hapka2;

	Desktop desktop = Desktop.getDesktop();
	
	private JLabel l_Komentar;
	private JLabel l_Kartunka1;
	private JLabel l_Kartunka3;
	private JLabel l_Kartunka4;
	private JLabel l_Kartunka2;

	private JLabel l_fonAlternatuvnaEnergia;
	
	public AlternatuvnaEnergia(String s) {
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

		l_Hapka1 = new JLabel("Альтернативна");
		l_Hapka1.setForeground(Color.BLUE);
		l_Hapka1.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka1.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 35));
		l_Hapka1.setBounds(12, 252, 770, 35);
		getContentPane().add(l_Hapka1);
		
		l_Hapka2 = new JLabel("енергія");
		l_Hapka2.setHorizontalAlignment(SwingConstants.CENTER);
		l_Hapka2.setForeground(Color.BLUE);
		l_Hapka2.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 35));
		l_Hapka2.setBounds(12, 300, 770, 35);
		getContentPane().add(l_Hapka2);
		
		l_alternatuva1 = new JLabel("Сонячні батареї");
		l_alternatuva1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/sonyachni-batarei-ta-kolektori"));					
				} catch (Exception e1) {
				}
			}
		});
		l_alternatuva1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_alternatuva1.setHorizontalAlignment(SwingConstants.CENTER);
		l_alternatuva1.setBounds(12, 47, 250, 56);
		getContentPane().add(l_alternatuva1);
		
		l_alternatuva2 = new JLabel("Сонячні колектори");
		l_alternatuva2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/sonyachni-kolektori"));					
				} catch (Exception e1) {
				}
			}
		});
		l_alternatuva2.setHorizontalAlignment(SwingConstants.CENTER);
		l_alternatuva2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_alternatuva2.setBounds(532, 47, 250, 56);
		getContentPane().add(l_alternatuva2);
		
		l_alternatuva4 = new JLabel("Теплові насоси");
		l_alternatuva4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/teplovi-nasosi"));					
				} catch (Exception e1) {
				}
			}
		});
		l_alternatuva4.setHorizontalAlignment(SwingConstants.CENTER);
		l_alternatuva4.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_alternatuva4.setBounds(532, 461, 250, 56);
		getContentPane().add(l_alternatuva4);
		
		l_alternatuva3 = new JLabel("Вітрогенератори");
		l_alternatuva3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/vitrogeneratori"));					
				} catch (Exception e1) {
				}
			}
		});
		l_alternatuva3.setHorizontalAlignment(SwingConstants.CENTER);
		l_alternatuva3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l_alternatuva3.setBounds(12, 461, 250, 56);
		getContentPane().add(l_alternatuva3);
		
		l_strilka1 = new JLabel("");
		l_strilka1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/sonyachni-batarei-ta-kolektori"));					
				} catch (Exception e1) {
				}
			}
		});
		l_strilka1.setBounds(258, 106, 130, 130);
		l_strilka1.setIcon(new ImageIcon("res/Strilka1.png"));
		getContentPane().add(l_strilka1);
		
		l_strilka2 = new JLabel("");
		l_strilka2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/sonyachni-kolektori"));					
				} catch (Exception e1) {
				}
			}
		});
		l_strilka2.setIcon(new ImageIcon("res/Strilka2.png"));
		l_strilka2.setBounds(406, 106, 130, 130);
		getContentPane().add(l_strilka2);
		
		l_strilka4 = new JLabel("");
		l_strilka4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/teplovi-nasosi"));					
				} catch (Exception e1) {
				}
			}
		});
		l_strilka4.setIcon(new ImageIcon("res/Strilka4.png"));
		l_strilka4.setBounds(406, 336, 130, 130);
		getContentPane().add(l_strilka4);
		
		l_strilka3 = new JLabel("");
		l_strilka3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/vitrogeneratori"));					
				} catch (Exception e1) {
				}
			}
		});
		l_strilka3.setIcon(new ImageIcon("res/Strilka3.png"));
		l_strilka3.setBounds(258, 336, 130, 130);
		getContentPane().add(l_strilka3);
		
		l_Komentar = new JLabel("Для детальнішого розгляду натисніть, будь ласка, на вид альтернативної енергї, що Вас цікавить");
		l_Komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_Komentar.setForeground(Color.BLACK);
		l_Komentar.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l_Komentar.setBounds(12, 530, 770, 35);
		getContentPane().add(l_Komentar);
		
		l_Kartunka1 = new JLabel("");
		l_Kartunka1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/sonyachni-batarei-ta-kolektori"));					
				} catch (Exception e1) {
				}
			}
		});
		l_Kartunka1.setIcon(new ImageIcon("res/Kartunka1.jpg"));
		l_Kartunka1.setBounds(12, 99, 250, 154);
		getContentPane().add(l_Kartunka1);
		
		l_Kartunka3 = new JLabel("");
		l_Kartunka3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/vitrogeneratori"));					
				} catch (Exception e1) {
				}
			}
		});
		l_Kartunka3.setIcon(new ImageIcon("res/Kartunka3.jpg"));
		l_Kartunka3.setBounds(12, 312, 250, 154);
		getContentPane().add(l_Kartunka3);
		
		l_Kartunka4 = new JLabel("");
		l_Kartunka4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/teplovi-nasosi"));					
				} catch (Exception e1) {
				}
			}
		});
		l_Kartunka4.setHorizontalAlignment(SwingConstants.CENTER);
		l_Kartunka4.setIcon(new ImageIcon("res/Kartunka4.png"));
		l_Kartunka4.setBounds(532, 312, 250, 154);
		getContentPane().add(l_Kartunka4);
		
		l_Kartunka2 = new JLabel("");
		l_Kartunka2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					desktop.browse(new URI("http://www.ecosvit.net/ua/sonyachni-kolektori"));					
				} catch (Exception e1) {
				}
			}
		});
		l_Kartunka2.setHorizontalAlignment(SwingConstants.CENTER);
		l_Kartunka2.setIcon(new ImageIcon("res/Kartunka2.jpg"));
		l_Kartunka2.setBounds(532, 99, 250, 154);
		getContentPane().add(l_Kartunka2);
		
		l_fonAlternatuvnaEnergia = new JLabel("");
		l_fonAlternatuvnaEnergia.setBounds(0, 0, 794, 565);
		l_fonAlternatuvnaEnergia.setIcon(new ImageIcon("res/fon_AlternatuvnaEnergia.jpg"));
		getContentPane().add(l_fonAlternatuvnaEnergia);

		setVisible(true);
	}
}

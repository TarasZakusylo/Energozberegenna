package KP.Energozberegenna;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class PruladuOputuvanna extends JFrame {

	private static final long serialVersionUID = 1L;

	private JButton b_Nazad;
	private JLabel l_HapkaZagalno;
	private JRadioButton radioB_Holodulnuku;
	private JRadioButton radioB_Plutu;
	private JRadioButton radioB_Konducioneru;
	private JRadioButton radioB_KompTel;
	private JRadioButton radioB_PralniMahun;
	private JTextPane textPane_Zagalno;
	private JLabel l_Detalnihe;
	private JRadioButton radioB_Zagalno;
	private ButtonGroup group_pruladu;
	private JLabel l_fonVodaRecomendacii;
	private JLabel l_Kartunka;

	public PruladuOputuvanna(String s) {
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
		b_Nazad.setBounds(661, 0, 133, 34);
		getContentPane().add(b_Nazad);

		l_HapkaZagalno = new JLabel("Загально про прилади :");
		l_HapkaZagalno.setForeground(Color.GREEN);
		l_HapkaZagalno.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 25));
		l_HapkaZagalno.setHorizontalAlignment(SwingConstants.CENTER);
		l_HapkaZagalno.setBounds(90, 4, 595, 30);
		getContentPane().add(l_HapkaZagalno);

		l_Detalnihe = new JLabel("Детальніше про :");
		l_Detalnihe.setForeground(Color.YELLOW);
		l_Detalnihe.setHorizontalAlignment(SwingConstants.CENTER);
		l_Detalnihe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_Detalnihe.setBounds(589, 51, 193, 25);
		getContentPane().add(l_Detalnihe);

		radioB_Holodulnuku = new JRadioButton("Холодильники");
		radioB_Holodulnuku.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		radioB_Holodulnuku.setForeground(Color.YELLOW);
		radioB_Holodulnuku.setOpaque(false);
		radioB_Holodulnuku.setBounds(589, 93, 193, 25);
		getContentPane().add(radioB_Holodulnuku);
		radioB_Holodulnuku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Zagalno.setText(
						"1.   Холодильник та морозильник варто тримати в чистоті, без льоду та снігу, регулярно розморожуйте ці прилади. Треба стежити за тим, щоб дверцята були щільно закритими.\r\n"
								+ "2.   Охолоджуйте їжу перед тим, як поставити її в холодильник. По-перше, гаряча каструля змусить холодильник працювати інтенсивніше, а по-друге, вона нагріє інші продукти, і вони можуть зіпсуватися.\r\n"
								+ "3.   Оптимальна температура в холодильнику – від нуля до п’яти градусів тепла. Регулюйте її відповідно до температури на кухні та кількості продуктів.\r\n"
								+ "4.   Менше відкривайте, проаналізуйте, що може зберігатися поза межами холодильника без втрати якості.\r\n"
								+ "5.   Холодильник бажано ставити в саме прохолодне місце кухні або кімнати і бажано біля зовнішньої стіни.");
				radioB_Zagalno.setBounds(589, 319, 193, 25);
			}
		});

		radioB_Konducioneru = new JRadioButton("Кондиціонери");
		radioB_Konducioneru.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		radioB_Konducioneru.setForeground(Color.YELLOW);
		radioB_Konducioneru.setOpaque(false);
		radioB_Konducioneru.setBounds(589, 135, 193, 25);
		getContentPane().add(radioB_Konducioneru);
		radioB_Konducioneru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Zagalno.setText(
						"1.   Правильно підбирайте потужність і місце встановлення для досягнення максимально ефективності роботи;\r\n"
								+ "2.   Закривайте двері та вікна під час кондиціонування;\r\n"
								+ "3.   Вчасно чистить фільтр;\r\n"
								+ "4.   Використовуйте режим автоматично підтримання температури (оптимальне енергоспоживання досягається при температурі приміщення 20-22 °C);\r\n"
								+ "5.   Вимикайте, коли не користуєтесь приміщенням.");
				radioB_Zagalno.setBounds(589, 319, 193, 25);
			}
		});

		radioB_Plutu = new JRadioButton("Плити");
		radioB_Plutu.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		radioB_Plutu.setForeground(Color.YELLOW);
		radioB_Plutu.setOpaque(false);
		radioB_Plutu.setBounds(589, 182, 193, 25);
		getContentPane().add(radioB_Plutu);
		radioB_Plutu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Zagalno.setText(
						"1.   Зверніть увагу, щоб посуд відповідав рекомендованим розмірам. Відповідність рекомендованих розмірів посуду - це від 5 до 10% економії на зовсім непотрібних і безглуздих втратах. Пам'ятайте: необхідно застосовувати посуд з дном, яке відповідає діаметру конфорки або може трохи більше. Посуд з нерівностями і викривленням дна призводить до перевитрати електроенергії на 40-60%.\r\n"
								+ "2.   Обов'язково закривайте кришкою каструлю, в якій готуєте. Швидке випаровування води збільшує час приготування на 20-30%, що в свою чергу суттєво відбивається на стані вашого гаманця. Після закипання, при необхідності, бажано перейти на низькотемпературний режим готування, це також дозволить заощадити \"зайву\" копійку.\r\n"
								+ "3.   Не забувайте видаляти накип з електрочайника. Вона утворюється в результаті використання нефільтрованої води і багаторазового нагрівання, має низьку теплопровідність, чим збільшує час, а відповідно і витрати щодо його використання.\r\n"
								+ "4.   Грійте в чайнику тільки необхідну на даний час кількість води.\r\n"
								+ "5.   Вимикайте конфорку за декілька хвилин до готовності їжі.\r\n"
								+ "6.   Використовуйте НВЧ-печі, МХ-печі та індукційні плити – вони працюють швидко та економічно.");
				radioB_Zagalno.setBounds(589, 319, 193, 25);
			}
		});

		radioB_PralniMahun = new JRadioButton("Пральні машини");
		radioB_PralniMahun.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		radioB_PralniMahun.setForeground(Color.YELLOW);
		radioB_PralniMahun.setOpaque(false);
		radioB_PralniMahun.setBounds(589, 228, 193, 25);
		getContentPane().add(radioB_PralniMahun);
		radioB_PralniMahun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Zagalno.setText(
						"1.   Практика показує, що все ж дуже бажано не перевищувати норми максимального завантаження білизни, також слід уникати і надто малого завантаження пральної машини. Не раціональна витрата електроенергії в цих випадках може становити від 10 до 15%.\r\n"
								+ "2.   Сортуйте білизну перед пранням, т.к. в разі середньої або слабкої ступені забруднення бажано відмовлятися від режиму попереднього прання.\r\n"
								+ "3.   Уважно ставтеся до вибору програм, при неправильній програмі прання перевитрата електроенергії може скласти - до 30%. Враховуючи, що пральна машина досить добре споживає електроенергію та прання (залежно від обраної програми) може тривати не одну годину, а прати треба кілька разів на тиждень (а в деяких випадках і кожен день), її раціональне використання неухильно відіб'ється на вашому добробуті.");
				radioB_Zagalno.setBounds(589, 319, 193, 25);
			}
		});

		radioB_KompTel = new JRadioButton("Коп'ютери, телефони");
		radioB_KompTel.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		radioB_KompTel.setForeground(Color.YELLOW);
		radioB_KompTel.setOpaque(false);
		radioB_KompTel.setBounds(589, 273, 193, 25);
		getContentPane().add(radioB_KompTel);
		radioB_KompTel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Zagalno.setText(
						"1.   Режим очікування для комп’ютера доречний, якщо залишати його на кілька хвилин, а не на всю ніч. Слід вимикати пристрої, якими ніхто не користується. А ще краще – вимикати взагалі штекер з розетки. Це не лише дозволить заощадити електроенергію, але й вбереже пристрої від впливу можливих перепадів електроенергії. Можна також встановити автоматичні вимикачі.\r\n"
								+ "2.   Не залишайте ваше обладнання в режимі очікування! Це не тільки небезпечно, але і згадайте знамените гасло: \"йдучи - гасіть світло\", це стосується і вашої решти приладів.\r\n"
								+ "3.   Не можна залишати прилади, що працюють від акумулятора (наприклад, мобільні телефони), увімкненими довше, ніж потрібно для повної зарядки акумулятора.\r\n"
								+ "4.   Після виходу на роботу постарайтеся вимкнути цю техніку з розетки. Завдяки цьому процесу ви зможете значно продовжити термін служби своєї техніки, а також значно заощадити електроенергію.");
				radioB_Zagalno.setBounds(589, 319, 193, 25);
			}
		});

		radioB_Zagalno = new JRadioButton("Загально");
		radioB_Zagalno.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		radioB_Zagalno.setForeground(Color.YELLOW);
		radioB_Zagalno.setOpaque(false);
		radioB_Zagalno.setBounds(0, 0, 0, 0);
		getContentPane().add(radioB_Zagalno);
		radioB_Zagalno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane_Zagalno.setText(
						"1.   При виборі нових пристроїв надавайте перевагу приладам з меншим енергоспоживанням, як в активному режимі, так і у режимі стенд-бай; Енергозберігаючі побутові прилади мають маркування «А» чи «А+». Холодильник такого класу споживатиме на 30-50% менше електроенергії, ніж пристрій такого ж об’єму марки «В».\r\n"
								+ "2.   Використовуйте режим автовимкнення;\r\n"
								+ "3.   Намагайтесь не використовувати подовжувачі, а якщо це необхідно — використовуйте якісні та з більшим перерізом (при малому провід більше гріється, а отже менше корисне використання енергії);\r\n"
								+ "4.   Використовуйте енергоощадні, насамперед, світлодіодні, а ззовні, натрієві лампи.\r\n"
								+ "5.   Використовуйте стабілізатори напруги! Це стосується не тільки телевізорів застарілих моделей, але і всіх енергоспоживаючих приладів: холодильників, пральних машин, кондиціонерів і посудомийної техніки, міксерів та інших електроприладів. В сучасних приладах звичайно ж опрацьовані ці моменти і виражаються класом енергоспоживання, але на практиці, не заглиблюючись в технічні подробиці, стабілізатори напруги дозволяють скоротити споживання в деяких випадках в 2-2,3 рази.\r\n"
								+ "6.   Прості побутові речі часто зберігають значну кількість газу та електроенергії. Наприклад, холодильник повинен розташовуватися подалі від плити, нагрівача, колонки чи бойлера, батареї та прямих сонячних променів, а сучасні пристрої для приготування їжі, наприклад, мультиварки, дають змогу готувати 2-3 страви одночасно , що зберігає як газ, так і електроенергію.");
				radioB_Zagalno.setBounds(0, 0, 0, 0);
			}
		});

		textPane_Zagalno = new JTextPane();
		textPane_Zagalno.setText(
				"1.   При виборі нових пристроїв надавайте перевагу приладам з меншим енергоспоживанням, як в активному режимі, так і у режимі стенд-бай; Енергозберігаючі побутові прилади мають маркування «А» чи «А+». Холодильник такого класу споживатиме на 30-50% менше електроенергії, ніж пристрій такого ж об’єму марки «В».\r\n"
						+ "2.   Використовуйте режим автовимкнення;\r\n"
						+ "3.   Намагайтесь не використовувати подовжувачі, а якщо це необхідно — використовуйте якісні та з більшим перерізом (при малому провід більше гріється, а отже менше корисне використання енергії);\r\n"
						+ "4.   Використовуйте енергоощадні, насамперед, світлодіодні, а ззовні, натрієві лампи.\r\n"
						+ "5.   Використовуйте стабілізатори напруги! Це стосується не тільки телевізорів застарілих моделей, але і всіх енергоспоживаючих приладів: холодильників, пральних машин, кондиціонерів і посудомийної техніки, міксерів та інших електроприладів. В сучасних приладах звичайно ж опрацьовані ці моменти і виражаються класом енергоспоживання, але на практиці, не заглиблюючись в технічні подробиці, стабілізатори напруги дозволяють скоротити споживання в деяких випадках в 2-2,3 рази.\r\n"
						+ "6.   Прості побутові речі часто зберігають значну кількість газу та електроенергії. Наприклад, холодильник повинен розташовуватися подалі від плити, нагрівача, колонки чи бойлера, батареї та прямих сонячних променів, а сучасні пристрої для приготування їжі, наприклад, мультиварки, дають змогу готувати 2-3 страви одночасно , що зберігає як газ, так і електроенергію.");
		textPane_Zagalno.setForeground(Color.MAGENTA);
		textPane_Zagalno.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textPane_Zagalno.setBackground(Color.WHITE);
		textPane_Zagalno.setBounds(12, 42, 565, 497);
		getContentPane().add(textPane_Zagalno);

		group_pruladu = new ButtonGroup();
		group_pruladu.add(radioB_Holodulnuku);
		group_pruladu.add(radioB_Konducioneru);
		group_pruladu.add(radioB_Plutu);
		group_pruladu.add(radioB_PralniMahun);
		group_pruladu.add(radioB_KompTel);
		group_pruladu.add(radioB_Zagalno);

		l_Kartunka = new JLabel("");
		l_Kartunka.setBounds(578, 344, 216, 221);
		l_Kartunka.setIcon(new ImageIcon("res/KartunkaDlaPruladiv.png"));
		getContentPane().add(l_Kartunka);
		
		l_fonVodaRecomendacii = new JLabel("");
		l_fonVodaRecomendacii.setBounds(0, 0, 794, 565);
		l_fonVodaRecomendacii.setIcon(new ImageIcon("res/fon_PruladuRecomendacii.jpg"));
		getContentPane().add(l_fonVodaRecomendacii);
		

		
		setVisible(true);
	}
}

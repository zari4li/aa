package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import java.awt.*;/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import java.awt.event.*;/*Подключаем объект event, который содержит свойства, описывающие некое событие.
Каждый раз, когда происходит какое-либо событие, 
объект Event передается соответствующей программе обработки.
Используемым событием в нашей программе являются ACTION события.
*/
import javax.swing.*;// библиотека для графического интерфейса
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы

public class Smeta extends JDialog {/*Класс Calc_distance, который доступен для любого файла из пакета pack наследует 
	функции элемента JDialog */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {/*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		try {/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
			Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
			 прерывается, и управление прыгает в начало блока catch(err).
			*/
			Smeta Smeta = new Smeta(); 
			Smeta.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //при закрытии формы происходит выход из приложения
			Smeta.setVisible(true); //устанавливаем что окно видимое
			Calculation.Smeta_sost(); //рассчитваем необходимые данные. Функция расположена в файле Calc
		} catch (Exception e) {
			/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
			Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
			Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
			1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
			доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
			 прерывается, и управление прыгает в начало блока catch(err).
			*/
			e.printStackTrace();
		}
	}

public static JLabel Name_label, Kol_prod_label, Mat_zatr_label, Stoim_mater_label, Stoim_kompl_label, Stoim_vspom_mater_label, Toplivo_label,
	Zaprl_label, Otch_label,Pens_label, Medic_label, Soc_strah_label, Amort_label, Pr_rash_label, Itogo_label;
	//текстовые поля,доступные из любого файла пакета pack
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
и переменным можно обращаться через имя класса.*/
	
	public Smeta() {//метод, описывающий какие поля и кнопки располагаются на JDialog
		
		
		setTitle("Смета затрат на производство мебели"); //устанавливаем заголовок окна
		setSize(540, 540); // указывает ширину и высоту.
		setLocationRelativeTo(null);//установить посередине экрана
		setResizable(false); //запрет на расширение окна 
		
		getContentPane().setLayout(new BorderLayout());// для данной панели устанавливается менеджер компоновки BorderLayout
		 /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/
		
		JPanel Smeta_panel = new JPanel();//Панель на которой располагается текстовое поле
		JPanel Smeta_panel_1 = new JPanel(); //Панель на которой располагаются текстовые поля и поля для ввода текста
		JPanel Button_panel = new JPanel();//Панель на которой располагается кнопки

		add(Smeta_panel, BorderLayout.NORTH);//Добавление панели Panel_Text наверх
		add(Smeta_panel_1, BorderLayout.CENTER);//Добавление панели Panel_Text по центру
		add(Button_panel, BorderLayout.SOUTH);//Добавление панели Panel_Button снизу

		Smeta_panel.setBorder(new EmptyBorder(5,10,5,10));//установка внутренних отступов(5 справа и слева,10сверху и снизу)
		Smeta_panel_1.setBorder(new EmptyBorder(5,10,5,10));//установка внутренних отступов

		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в таблицу */
		Smeta_panel.setLayout(new GridLayout(1,1,0,15));//на панели 1 строка,1столбец ("смета затрат...")
		Smeta_panel_1.setLayout(new GridLayout(15,2,0,5));/* на панеле будет 15 строк, 2 столбца, расстояние между
		 столбцами 0, расстояние между строками 5 */
		Button_panel.setLayout(new GridLayout(2,1));//на панели 1 строка,1столбец, будет расположена кнопка
		
		
		JLabel Smeta_1 = new JLabel("Смета затрат на производство мебели.", JLabel.CENTER);
		JLabel Smeta_2 = new JLabel("Наименование изделия:", JLabel.LEFT);
		JLabel Smeta_3 = new JLabel("Количество изделий:", JLabel.LEFT);
		JLabel Smeta_4 = new JLabel("1. Материальные затраты:", JLabel.LEFT);
		JLabel Smeta_5 = new JLabel("     1.1. Сырье и материалы", JLabel.LEFT);
		JLabel Smeta_6 = new JLabel("     1.2. Комплектующие изделия:", JLabel.LEFT);
		JLabel Smeta_7 = new JLabel("     1.3. Вспомогательные материалы:", JLabel.LEFT);
		JLabel Smeta_8 = new JLabel("     1.4. Топливо и энергия:", JLabel.LEFT);
		JLabel Smeta_9 = new JLabel("2. Затраты на оплату труда:", JLabel.LEFT);
		JLabel Smeta_10 = new JLabel("3. Отчисления на социальные нужды:", JLabel.LEFT);
		JLabel Smeta_11 = new JLabel("     3.1. В пенсионный фонд:", JLabel.LEFT);
		JLabel Smeta_12 = new JLabel("     3.2. На медицинское обслуживание:", JLabel.LEFT);
		JLabel Smeta_13 = new JLabel("     3.3. В фонд социального страхования:", JLabel.LEFT);
		JLabel Smeta_14 = new JLabel("4. Амортизация", JLabel.LEFT);
		JLabel Smeta_15 = new JLabel("5. Прочие расходы:", JLabel.LEFT);
		JLabel Smeta_16 = new JLabel("Итого:", JLabel.RIGHT);
		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру, RIGHT - по правому краю
		*/
		
		
				//создаем текстовые поля для того чтобы в них записывать рассчитанные результаты
		Name_label = new JLabel("", JLabel.RIGHT);
		Kol_prod_label = new JLabel("", JLabel.RIGHT);
		Mat_zatr_label = new JLabel("", JLabel.RIGHT);
		Stoim_mater_label = new JLabel("", JLabel.RIGHT);
		Stoim_kompl_label = new JLabel("", JLabel.RIGHT);
		Stoim_vspom_mater_label = new JLabel("", JLabel.RIGHT);
		Toplivo_label = new JLabel("", JLabel.RIGHT);
		Zaprl_label = new JLabel("", JLabel.RIGHT);
		Otch_label = new JLabel("", JLabel.RIGHT);
		Pens_label = new JLabel("", JLabel.RIGHT);
		Medic_label = new JLabel("", JLabel.RIGHT);
		Soc_strah_label = new JLabel("", JLabel.RIGHT);
		Amort_label = new JLabel("", JLabel.RIGHT);
		Pr_rash_label = new JLabel("", JLabel.RIGHT);
		Itogo_label = new JLabel("", JLabel.RIGHT);
		//создаем текстовые поля для того чтобы в них записывать рассчитанные результаты

		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели Smeta_panel и Smeta_panel_1
		Smeta_panel.add(Smeta_1);
		Smeta_panel_1.add(Smeta_2);
		Smeta_panel_1.add(Name_label);
		Smeta_panel_1.add(Smeta_3);
		Smeta_panel_1.add(Kol_prod_label);
		Smeta_panel_1.add(Smeta_4);
		Smeta_panel_1.add(Mat_zatr_label);
		Smeta_panel_1.add(Smeta_5);
		Smeta_panel_1.add(Stoim_mater_label);
		Smeta_panel_1.add(Smeta_6);
		Smeta_panel_1.add(Stoim_kompl_label);	
		Smeta_panel_1.add(Smeta_7);
		Smeta_panel_1.add(Stoim_vspom_mater_label);	
		Smeta_panel_1.add(Smeta_8);
		Smeta_panel_1.add(Toplivo_label);	
		Smeta_panel_1.add(Smeta_9);
		Smeta_panel_1.add(Zaprl_label);
		Smeta_panel_1.add(Smeta_10);
		Smeta_panel_1.add(Otch_label);
		Smeta_panel_1.add(Smeta_11);
		Smeta_panel_1.add(Pens_label);
		Smeta_panel_1.add(Smeta_12);
		Smeta_panel_1.add(Medic_label);
		Smeta_panel_1.add(Smeta_13);
		Smeta_panel_1.add(Soc_strah_label);
		Smeta_panel_1.add(Smeta_14);
		Smeta_panel_1.add(Amort_label);
		Smeta_panel_1.add(Smeta_15);
		Smeta_panel_1.add(Pr_rash_label);	
		Smeta_panel_1.add(Smeta_16);
		Smeta_panel_1.add(Itogo_label);	
		//Добавление компонентов JLabel, JTextField, JComboBox, JCheckBox на панели Smeta_panel и Smeta_panel_1
	
		JButton Button_del = new JButton("Очистить результаты"); /*В скобках надпись на кнопке*/
		Button_panel.add(Button_del);/*  Добавление кнопки в панель */
			
		JButton Button_exit = new JButton("Закрыть");
		Button_panel.add(Button_exit);
		
		
		Button_exit.addActionListener(new ActionListener() //добавляем слушателя события для кнопки 
				/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
			 	addActionListener - добавление слушателя ActionListener к кнопке
			  	new - Оператор new создает экземпляр указанного класса 
			  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
			  	который будет отвечать за реагирование на события. 
			  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
			  	Поэтому будет использоваться интерфейс "ActionListener", 
			  	предназначенный для обработки событий "ActionEvent".
			  	тело интерфейса указывается ниже после фигурной скобки "{"
	    	    */              
		   {                                                         
		    public void actionPerformed(ActionEvent e)      
		    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/  
		    {    // описываем что будет происходить при нажатии на кнопку Закрыть - программа завершит свою работу
	            System.exit(0);		    	
		    }                                                        
		   }); 
		

		
		Button_del.addActionListener(new ActionListener()     
				//добавляем слушателя события для кнопки 
				/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
			 	addActionListener - добавление слушателя ActionListener к кнопке
			  	new - Оператор new создает экземпляр указанного класса 
			  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
			  	который будет отвечать за реагирование на события. 
			  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
			  	Поэтому будет использоваться интерфейс "ActionListener", 
			  	предназначенный для обработки событий "ActionEvent".
			  	тело интерфейса указывается ниже после фигурной скобки "{"
	    	    */   
		   {		
		    public void actionPerformed(ActionEvent e)  
		    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
	      	который реализуется путем простого вызова обработчика событий ActionPerformed.
	      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
	      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
	      	*/  
		    {
		    	setVisible(false);//данное окно станет невидимым
		    	Index.Index_frame.setVisible(true); /*устанавливаем что окно в котором пользователь вводит данные видимое */
		    	
		    	//	Обнуляем все поля, переменные, флажки ставим в состояние выключен
		    	Index.Kol_prod_text.setText("");
		    	Index.Stoim_mater_text.setText("");    			
		    	Index.Stoim_kompl_text.setText("");
		    	Index.Stoim_vspom_mater_text.setText("");
		    	Index.Toplivo_text.setText("");
		    	Index.Zaprl_text.setText("");
		    	Index.Stoim_stanka_text.setText("");
		    	Index.Srok_sl_text.setText("");
		    	Index.Amort_text.setText("");
		    	Index.Pr_rash_text.setText("");
		    	Index.Kol_detal_text.setText("");
		    	Index.Ras_amort_checkbox.setSelected(false);
		    	Index.Name_combo_int=0;
		    	Index.Ras_amort_int=0;
		    	Index.ver=0;

		    }                                                        
		   }); 
	}}
		

package pack;

public class Calculation {
static double Amort, Stoim_stanka, Srok_sl, Kol_prod, Stoim_mater, Stoim_kompl, Stoim_vspom_mater, Toplivo, Zaprl,
	Pr_rash, Kol_detal, Mat_zatr, Stoim_mater_1, Stoim_kompl_1, Stoim_vspom_mater_1, Toplivo_1, Otch, Pens, Medic, 
	Soc_strah, Zaprl_1, Amort_1, Pr_rash_1, Itogo;
	static String Name;
	/* Переменные типа double - с плавающей точкой. служат для представления чисел, имеющих дробную часть */
	/*static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса.*/

	public static void Smeta_gettext() {/*Класс Smeta_gettext, который доступен для любого файла из пакета pack */
		/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
	    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
	    void означает, что метод не возвращает данных в программу, которая его вызвала.
	    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
	    */
		if (Index.Ras_amort_int==0){ //если флажок Рассчитать был выключен
			Amort = Double.parseDouble(Index.Amort_text.getText());/* В переменную записываются данные введеные 
			пользователем в текстовое поле которое расположено в файле Index. Преобразование данных в тип Double. */
		} else {
			Stoim_stanka = Double.parseDouble(Index.Stoim_stanka_text.getText());
			Srok_sl = Double.parseDouble(Index.Srok_sl_text.getText());
		}
		Kol_prod = Double.parseDouble(Index.Kol_prod_text.getText());
		Stoim_mater = Double.parseDouble(Index.Stoim_mater_text.getText());	
		Stoim_kompl = Double.parseDouble(Index.Stoim_kompl_text.getText());	
		Stoim_vspom_mater = Double.parseDouble(Index.Stoim_vspom_mater_text.getText());	
		Toplivo = Double.parseDouble(Index.Toplivo_text.getText());	
		Zaprl = Double.parseDouble(Index.Zaprl_text.getText());	
		Pr_rash = Double.parseDouble(Index.Pr_rash_text.getText());	
		Kol_detal = Double.parseDouble(Index.Kol_detal_text.getText());	
		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
		Преобразование данных в тип Double. */
		
		if (Index.Name_int==0) {Name="стол";} //Name_int-переменная которая отвечает за выпадающий список.
		else if (Index.Name_int==1) {Name="стул";} 
		else if (Index.Name_int==2) {Name="шкаф";}
		else if (Index.Name_int==2) {Name="кровать";} 
		else {Name="тумба";} 
		
	}
		public static void Smeta_sost() {/*Класс, который доступен для любого файла из пакета pack */
			/*  Модификатор доступа public означает, что метод виден и доступен любому классу.
		    static означает, что не нужно создавать экземпляр(копию) объекта в памяти, чтобы использовать этот метод.
		    void означает, что метод не возвращает данных в программу, которая его вызвала.
		    Метод с пустыми скобками, это означает, что метод не имеет аргументов(параметров)
		    */
			
			/*стоимость материалов, комплектующих, вспомогательных материалов, расходы на топливо на определенное число
			 * изделий считаются как стоимость материалов,комплектующих.. за месяц разделенное на количество изделий,
			 * изготовленных за месяц и умноженное на определенное число изделий, на которые составляется смета */
		Stoim_mater_1=Stoim_mater/Kol_prod*Kol_detal; 
		Stoim_kompl_1=Stoim_kompl/Kol_prod*Kol_detal;
		Stoim_vspom_mater_1=Stoim_vspom_mater/Kol_prod*Kol_detal;
		Toplivo_1=Toplivo/Kol_prod*Kol_detal;
		Mat_zatr=Stoim_mater_1+Stoim_kompl_1+Stoim_vspom_mater_1+Toplivo_1;
		/* материальные затраты считаются как сумма стоимости материалов, комплектующих, вспомогательных материалов,
		 *  расходы на топливо */
		
		/*затраты на оплату труда на определенное количество изделий рассчитываются как затраты труда за месяц 
		 * разделенное на количество изделий, изготовленных за месяц и умноженное на определенное число изделий,
		 *  на которые составляется смета */
		Zaprl_1=Zaprl/Kol_prod*Kol_detal;
		
		/*Отчисления в пенсионный фонд составляют 22% от затратов на оплату труда, мед.обслуж - 5,1%, соц.страх - 2,9%.
		 * Отчисления - сумма всех отчислений (в пенс.фонд,мед.обслуж,соц.страх) */
		
		Pens=Zaprl_1*0.22;
		Medic=Zaprl_1*0.051;
		Soc_strah=Zaprl_1*0.029;
		Otch=Pens+Medic+Soc_strah;
		
		/* Если пользователь нажал на флажок Рассчитать амортизацию, то амортизация за месяц рассчитается по формуле: 
		  Стоимость станка разделить на срок службы станка */
		if (Index.Ras_amort_int==0){ //Если флажок Рассчитать был выключен
			Amort_1=Amort/Kol_prod;
		} else {
			Amort_1=Stoim_stanka/Srok_sl/Kol_prod;
		}
		
		/*прочие расходы на определенное количество изделий рассчитываются как прочие расхооды за месяц 
		 * разделенное на количество изделий, изготовленных за месяц и умноженное на определенное число изделий,
		 *  на которые составляется смета */
		Pr_rash_1=Pr_rash/Kol_prod*Kol_detal;
		
		/* Итого - сумма всех статей затрат */
		Itogo=Mat_zatr+Zaprl_1+Amort_1+Pr_rash_1;
		
		//форматированный вывод
	    String Kol_detal_str = String.format("%.2f", Kol_detal);
	    String Stoim_mater_str = String.format("%.2f", Stoim_mater_1);
	    String Stoim_kompl_str = String.format("%.2f", Stoim_kompl_1);
	    String Stoim_vspom_mater_str = String.format("%.2f", Stoim_vspom_mater_1);
	    String Toplivo_str = String.format("%.2f", Toplivo_1);
	    String Mat_zatr_str = String.format("%.2f", Mat_zatr);
	    String Zaprl_str = String.format("%.2f", Zaprl_1);
	    String Pens_str = String.format("%.2f", Pens);
	    String Medic_str = String.format("%.2f", Medic);
	    String Soc_strah_str = String.format("%.2f", Soc_strah);
	    String Otch_str = String.format("%.2f", Otch);
	    String Amort_str = String.format("%.2f", Amort_1);
	    String Pr_rash_str = String.format("%.2f", Pr_rash_1);
	    String Itogo_str = String.format("%.2f", Itogo);

	    /* String - указываем что переменная будет иметь строковый тип,
	     * String_sred_100km_1 - название новой переменной,
	     * String.format - преобразование переменной в строкой тип,
	     	%.2f - указываем что переменная будет отображать только 2 цифры после запятой,
	     	double_sred_100km - переменная типа double, которую надо преобразовать в строковый тип
	     	 */
		
	    Smeta.Name_label.setText(Name);
	    Smeta.Kol_prod_label.setText(Kol_detal_str);
	    Smeta.Mat_zatr_label.setText(Mat_zatr_str);
	    Smeta.Stoim_mater_label.setText(Stoim_mater_str);
	    Smeta.Stoim_kompl_label.setText(Stoim_kompl_str);
	    Smeta.Stoim_vspom_mater_label.setText(Stoim_vspom_mater_str);
	    Smeta.Toplivo_label.setText(Toplivo_str);
	    Smeta.Zaprl_label.setText(Zaprl_str);
	    Smeta.Otch_label.setText(Otch_str);
	    Smeta.Pens_label.setText(Pens_str);
	    Smeta.Medic_label.setText(Medic_str);
	    Smeta.Soc_strah_label.setText(Soc_strah_str);
	    Smeta.Amort_label.setText(Amort_str);
	    Smeta.Pr_rash_label.setText(Pr_rash_str);
	    Smeta.Itogo_label.setText(Itogo_str);    
	    /* Записываем строковые переменные в текстовые поля Name.., которые расположены в файле Smeta */
	}	
	
	
	
}

package lista_10.dependencias.exercicio_1;

import java.util.Calendar;

public class Data {

		private int dia;
		private int mes;
		private int ano;

		public Data() {
			Calendar cal = Calendar.getInstance();
			dia = cal.get(Calendar.DAY_OF_MONTH);
			mes = cal.get(Calendar.MONTH);
			ano = cal.get(Calendar.YEAR);
		}

		public String dataFormatada() {
			return dia + "/" + mes + "/" + ano;
		}


}

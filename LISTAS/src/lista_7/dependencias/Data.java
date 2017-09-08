package lista_7.dependencias;

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

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}

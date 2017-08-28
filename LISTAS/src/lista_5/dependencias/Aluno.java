package lista_5.dependencias;

public class Aluno extends Pessoa{
	
	private String numeroMatricula;
	
	@Override
	public String dadosFormatados() {
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\nMatricula: " + this.getNumeroMatricula();
		return dadosFormatados;
	}

	public String getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	
}

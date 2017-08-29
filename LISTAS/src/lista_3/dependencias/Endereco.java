package lista_3.dependencias;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Endereco {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;

	public Endereco(String cep) {
		try {
			// testado no linux, acho que para windows tem que usar "\" para o caminho
			Process p = Runtime.getRuntime().exec("python3 ./src/lista_3/dependencias_exercicio_6/getCep.py " + cep);
			BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));

			this.cep = bfr.readLine();
			this.logradouro = bfr.readLine();
			this.complemento = bfr.readLine();
			this.bairro = bfr.readLine();
			this.localidade = bfr.readLine();
			this.uf = bfr.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public String getCep() {
		return cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public String getUf() {
		return uf;
	}

}

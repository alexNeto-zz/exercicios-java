package lista_8.dependencias;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeitorArquivo {

	private File origem;
	private File destino;
	private List<String> origemEmail;

	public LeitorArquivo(String origem) {
		this.origem = new File(origem);
		this.destino = new File("destino-emails.txt");
		chamaMetodos();
	}

	public LeitorArquivo(String origem, String destino) {
		this.origem = new File(origem);
		this.destino = new File(destino);
		chamaMetodos();
	}

	private void chamaMetodos() {
		getOrigem();
		setDestino();
	}

	private void getOrigem() {
		origemEmail = new ArrayList<String>();
		String linha = "";
		Pattern padrao = Pattern.compile("from:\\S+");

		try (FileReader fileReader = new FileReader(origem); BufferedReader reader = new BufferedReader(fileReader)) {
			while ((linha = reader.readLine()) != null) {
				Matcher combina = padrao.matcher(linha);
				if (combina.find()) {
					origemEmail.add(combina.group().substring(5));
				}
			}
		} catch (IOException e) {
			// TODO fazer tratamento de exc
		}
	}

	private void setDestino() {
		try (FileWriter fileWriter = new FileWriter(destino); BufferedWriter writer = new BufferedWriter(fileWriter)) {
			Iterator<String> destinoIterator = origemEmail.iterator();
			while (destinoIterator.hasNext()) {
				writer.append(destinoIterator.next());
				writer.newLine();
			}
		} catch (IOException e) {
			// TODO fazer tratamento de exc
		}
	}

}

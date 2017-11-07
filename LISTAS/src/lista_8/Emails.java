package lista_8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Emails {

	public static void main(String[] args) {
		File file = new File("emails.txt");
		try {
			leArquivo(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leArquivo(File file) throws IOException {

		// List<String> lista = new ArrayList<>();
		String linha;
		try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader)) {
			while ((linha = reader.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			// TODO fazer tratamento de exc
		}
	}
}

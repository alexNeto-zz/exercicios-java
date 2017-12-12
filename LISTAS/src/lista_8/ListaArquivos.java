package lista_8;

import java.io.File;


public class ListaArquivos {

	 public void lsr( String caminho ) {

	        File raiz = new File(caminho);
	        File[] tudo = raiz.listFiles();

	        if (tudo == null) return;

	        for ( File arquivo : tudo) {
	            if ( arquivo.isDirectory() ) {
	                lsr( arquivo.getAbsolutePath() );
	                System.out.println( "d:" + arquivo.getAbsoluteFile() );
	            }
	            else {
	                System.out.println( "f:" + arquivo.getAbsoluteFile() );
	            }
	        }
	    }
	 
	public static void main(String[] args) {
		 ListaArquivos fw = new ListaArquivos();
		 String OS = System.getProperty("os.name").toLowerCase();
		 String raiz = "C:\\";
		 if(OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0) {
			 raiz = "/";
		 }
	        fw.lsr(raiz);
	}

}

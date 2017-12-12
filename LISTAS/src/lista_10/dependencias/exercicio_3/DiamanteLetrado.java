package lista_10.dependencias.exercicio_3;

public class DiamanteLetrado {

    private int primeiraLetra = 65;
    private int ultimaletra = 90;

    public void fazDiamante(char fim) {

        int i = primeiraLetra;
        int k = 0;
        int l = (int) fim - primeiraLetra;
        for (; i < (int) fim; i++) {

            for (int j = l; j > -0; j--) {
                System.out.print(" ");
            }
            System.out.print((char) i);
            if (i != 65) {
                for (int j = 0; j < k; j++) {
                    System.out.print(" ");
                }
                k++;
                System.out.println((char) i);

            } else {
                System.out.println();
            }
            k++;
            l--;
        }
        for (;i >= primeiraLetra; i--) {

            for (int j = l; j > -0; j--) {
                System.out.print(" ");
            }
            System.out.print((char) i);
            if (i != 65) {
                for (int j = 0; j < k; j++) {
                    System.out.print(" ");
                }
                k--;
                System.out.println((char) i);

            } else {
                System.out.println();
            }
            k--;
            l++;
        }
    }
}

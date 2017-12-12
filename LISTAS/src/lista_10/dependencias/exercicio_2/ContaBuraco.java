package lista_10.dependencias.exercicio_2;

public class ContaBuraco {

    public static int contaTexto (String texto){
        int quantidadeBuraco = 0;

        char[] textoArray = texto.toCharArray();

        for (int i = 0; i < textoArray.length; i++) {
            quantidadeBuraco += contaBuraco(textoArray[i]);
        }
        return quantidadeBuraco;
    }

    public static int contaBuraco(char letra) {

        int quantidadeBuraco = 0;
        switch (letra) {
            case 'c':
            case 'C':
            case 'E':
            case 'f':
            case 'F':
            case 'G':
            case 'h':
            case 'H':
            case 'i':
            case 'I':
            case 'j':
            case 'J':
            case 'k':
            case 'K':
            case 'l':
            case 'L':
            case 'm':
            case 'M':
            case 'n':
            case 'N':
            case 'r':
            case 's':
            case 'S':
            case 'u':
            case 'U':
            case 'v':
            case 'V':
            case 'w':
            case 'W':
            case 'x':
            case 'X':
            case 'y':
            case 'Y':
            case 'z':
            case 'Z':
            case '1':
            case '2':
            case '3':
            case '5':
            case '7':
                break;
            case 'a':
            case 'A':
            case 'b':
            case 'd':
            case 'D':
            case 'e':
            case 'g':
            case 'o':
            case 'O':
            case 'p':
            case 'P':
            case 'q':
            case 'Q':
            case 'R':
            case '0':
            case '4':
            case '6':
            case '9':
                quantidadeBuraco = 1;
                break;
            case 'B':
            case '8':
                quantidadeBuraco = 2;
                break;
            default:
                break;
        }
        return quantidadeBuraco;
    }
}
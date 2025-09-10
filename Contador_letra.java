public class Contador_letra {
    public static void main(String[] args) {
       String exemplo = "cocada";
        char letra = 'c';
        int resultado = Contador(exemplo, letra);

        System.out.println("O caractere '" + letra + "' aparece " + resultado + " vezes.");
    }
    public static int Contador(String texto, char caractere) {
        int contagem = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caractere) {
                contagem++;
            }
        }
        return contagem;
    }

}

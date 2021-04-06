package FirstCode.src;

public class TestaCaracteres {

    public static void main(String[] args) {
        char letra = 'a';
        System.out.println(letra);

        char valor = 65;
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);

        String palavra = "Curso de Java";
        // Abaixo será convertido automaticamente o 2020 em string, e concatenado
        palavra = palavra + 2020;
        System.out.println(palavra);

    }

}

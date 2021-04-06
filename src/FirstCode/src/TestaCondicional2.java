package FirstCode.src;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 20;
        int qtPessoas = 3;
        boolean acompanhado = qtPessoas >= 2;

        if (idade >= 18 && acompanhado) {
            System.out.println("Seja Welcomido!");
        } else {
            System.out.println("YOU SHALL NOT PASS!");
        }
    }
}

package FirstCode.src;

public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("testando condicional");
        int idade = 17;
        int qtPessoas = 3;

        if (idade >= 18) {
            System.out.println("Já ta passando da hora de trabalhar!");
            System.out.println("Seja Welcomido!");
        } else {
            if (qtPessoas >= 2) {
                System.out.println(" You shall not pass!");
            } else {
                System.out.println("Sola + mentos");
            }

        }
    }
}
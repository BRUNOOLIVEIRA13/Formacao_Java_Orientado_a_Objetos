package FirstCode.src;

import java.util.Scanner;

public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

//        int idade = 20;
//        int qtPessoas = 3;
//        boolean acompanhado = qtPessoas >= 2;

        int idade;
        int qtPessoas;
        try (Scanner scan = new Scanner(System.in)) {
            idade = scan.nextInt();
            qtPessoas = scan.nextInt();
        }

        boolean acompanhado = qtPessoas >= 2;

        System.out.println("Acompanhado de " + acompanhado);

        if (idade >=18 || acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("infelizmente voce nao pode entrar");
        }

    }
}

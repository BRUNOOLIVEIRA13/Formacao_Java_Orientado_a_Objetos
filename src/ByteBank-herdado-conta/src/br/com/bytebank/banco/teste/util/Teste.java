import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Bruno");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

//        Function Lambda
//        lista.sort( (c1, c2) -> c1.getNumero() - c2.getNumero());
        lista.sort(Comparator.comparing(Conta::getNumero));


//        Comparator<Conta> comp = (Conta c1, Conta c2) -> {
//
//                String nomeC1 = c1.getTitular().getNome();
//                String nomeC2 = c2.getTitular().getNome();
//
//                return nomeC1.compareTo(nomeC2);
//            };

        lista.forEach(conta -> {
            System.out.println(conta + ", " + conta.getTitular().getNome());
        });

        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

//        Collections.sort(nomes, (String s1, String s2) -> {
//                return s1.length() - s2.length();
//        });

//         função lambda
//        nomes.sort((s1, s2) -> s1.length() - s2.length());
        nomes.sort(Comparator.comparingInt(String::length));
        System.out.println(nomes);

//        for(int i = 0; i < nomes.size(); i++) {
//            System.out.println(nomes.get(i));
//        }

//        nomes.forEach(nome -> {
//            System.out.println(nome);
//        });
        nomes.forEach(System.out::println);


    }

}
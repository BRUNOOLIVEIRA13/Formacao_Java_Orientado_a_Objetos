package Java8.src.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;

import static java.util.Comparator.comparing;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Caelum");
        palavras.add("Ronaldo");
        palavras.add("Bruno");

//        Collections.sort(palavras);
        palavras.forEach(palavra -> System.out.println("Usando lambda: " + palavra));
        System.out.println("Usando method reference: ");
        palavras.forEach(System.out::println);

//        palavras.sort(String.CASE_INSENSITIVE_ORDER);
//        palavras.sort((s1, s2) -> s1.length() - s2.length());
//        palavras.sort(Comparator.comparing(s -> s.length()));
//        palavras.sort(Comparator.comparing(String::length));
        palavras.sort(comparing(String::length));

        System.out.println("Comparando cada String por length e imprimindo em uma única linha: \n" + palavras);
/*
        Formato antes do Java 8
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
        Consumer<String> consumidor = new ImprimeNaLinha();

        Para situação abaixo, era criado uma class que implementava a interface Consumer
        class ImprimeNaLinha implements Consumer<String> {

            @Override
            public void accept(String s) {
                 System.out.println("Usando método Consumer: " + s);
            }
        }
        E ai sim chamado o método
        palavras.forEach(new ImprimeNaLinha());
*/
        palavras.replaceAll(new OperadorUnario());
        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("Usando replace All via UnaryOperator: \n" + palavras);


    }
}

/*

Antes do java 1.8 sem lambda seria necessario implementar esta uma unica interface com um unico metodo
class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
        /* Linha a cima é o equivalente a escrever este if
        if(s1.length() < s2.length()) {
            return -1;
        }
        if(s1.length() > s2.length()) {
            return 1;
        }
        return 0;
    }
}
*/

class OperadorUnario implements UnaryOperator<String> {

    @Override
    public String apply(String s) {
        return s.toUpperCase();
    }
}
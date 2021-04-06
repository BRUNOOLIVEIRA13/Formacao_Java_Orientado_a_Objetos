import java.util.HashMap;
import java.util.Map;

public class TestandoMAP {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(25, "BRUNO OLIVEIRA");
        pessoas.put(24, "ANINHA ALMEIDA");
        pessoas.put(23, "VANESSA OLIVEIRA");
        pessoas.put(2, "MANU");

        System.out.println(pessoas.keySet()); //imprimir chaves : idades
        System.out.println(pessoas.values()); //imprimir valores : nomes

        /*
        For each para oercorrer atraves da chave 'keySet',
        retornando os valores por meio do get
         */
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

        // Retorna os valores, e para cada valor, imprime individualmente
        pessoas.values().forEach(pessoa -> System.out.println("Nome: " + pessoa));

        // retorna a associação de chaves e valores
        pessoas.entrySet().forEach(associacao -> {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        });
    }
}

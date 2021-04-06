import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaConjunto {

    public static void main(String[] args) {

        // Collection<Integer> numeros = new ArrayList<>();
        // 831ms com ArrayList
        Collection<Integer> numeros = new HashSet<>();
        // 9ms com HashSet

        long inicio = System.currentTimeMillis();

        for (int i = 0; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoExecucao);
    }
}

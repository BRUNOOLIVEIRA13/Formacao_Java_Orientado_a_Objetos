import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Python - 3";
        String aula2 = "Modelando com PostgreSQL";
        String aula3 = "Aprendendo Java 8 e Spring Boot";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        aulas.remove(0);
        System.out.println("Removido primeiro item da lista: " + aulas);

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula agora é " + primeiraAula);

        //Percorrer um ArrayList pelo seu size
        for (int i = 0; i < aulas.size(); i++) {
            // Para saber a informação dos elementos utiliza-se .get(posição index)
            System.out.println("Aula: " + aulas.get(i));
        }

        //Ação para cada elemento de um ArrayList, para paralelismo é mais adequado
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        //Mesma ação acima, porém enxuto utilizando função lambda, disponível a partir da versão 8
        aulas.forEach(aula -> {
            System.out.println("Percorrendo ... ");
            System.out.println(aula);
        });

        aulas.add("Formação Java");
        System.out.println(aulas);

        //Utiliza-se a classe Collections (!= da interface Collection 'sem o "s"'),
        // ao inves de aulas.sort, pois ele pediria um comparator
        Collections.sort(aulas);
        System.out.println("Depois de ordernado por ordem lexicografica/alfabetica: \r\n" + aulas);
    }
}

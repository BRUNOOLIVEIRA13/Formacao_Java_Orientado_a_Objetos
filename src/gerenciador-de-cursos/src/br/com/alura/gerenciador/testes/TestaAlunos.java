import java.util.*;

public class TestaAlunos  {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<String>();

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Alberto Souza");

        boolean estaMatriculado = alunos.contains("Bruno");
        alunos.remove("Sergio Lopes");

        System.out.println("Bruno esta matriculado? : " + estaMatriculado);

        System.out.println(alunos.size());

        // formas de imprimir em velocidade e perfomance
        for (String aluno : alunos) {
            System.out.println(aluno + " 1");
        }

        alunos.forEach(System.out::println);

        alunos.forEach(aluno -> {
            System.out.println(aluno + " 3");
        });

        List<String> alunosEmLista = new ArrayList<>(alunos);

    }
}

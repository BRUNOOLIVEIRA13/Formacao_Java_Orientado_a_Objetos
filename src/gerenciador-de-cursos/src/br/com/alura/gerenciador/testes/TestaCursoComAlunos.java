import br.com.alura.gerenciador.modulos.Aluno;
import br.com.alura.gerenciador.modulos.Aula;
import br.com.alura.gerenciador.modulos.Curso;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAlunos {

    private String numeroMatricula;

    public static void main(String[] args) {

        Curso javaColecoes = new Curso( "Dominando as coleções do Java",
                                    "Bruno Oliveira");

        javaColecoes.adiciona(new Aula("Trabalhando  com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma classe chamado Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno a1 = new Aluno("Bruno Oliveira", 3775);
        Aluno a2 = new Aluno("Aninha", 3664);
        Aluno a3 = new Aluno("Guilherme Silveira", 5617);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        /**
         *         Aluno a4 = new Aluno("Geralt de Rivia", 0007);
         *         Set<Aluno> alunos = javaColecoes.getAlunos();
         *         alunos.add(a4);
         *         System.out.println(alunos);
         *         Recebemos uma exceção do tipo UnsupportedOperationException:
         *         Isso acontece pois o conjunto não pode ser modificado pois
         *         retornamos na classe Curso um Collections.unmodifiableSet(alunos).
         */

        System.out.println("Todos os alunos matriculados: ");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();
        while (iterador.hasNext()) {
            Aluno proximo = iterador.next();
            System.out.println(proximo);
        }
//
//        for (Aluno a : javaColecoes.getAlunos()) {
//            System.out.println(a);
//        }

        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O aluno " + a1 + "está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Bruno Oliveira", 3775);
        System.out.println("Oliveira, está matriculado? \n" + javaColecoes.estaMatriculado(turini) );

        System.out.println("Aluno a1 é 'equals' ao Oliveira? \n" + a1.equals(turini));

        System.out.println(a1.hashCode() == turini.hashCode());

    }
}
import br.com.alura.gerenciador.modulos.Aluno;
import br.com.alura.gerenciador.modulos.Aula;
import br.com.alura.gerenciador.modulos.Curso;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso( "Dominando as coleções do Curso de Java no Alura",
                "Bruno Oliveira");

        javaColecoes.adiciona(new Aula("Trabalhando  com Collection", 21));
        javaColecoes.adiciona(new Aula("Criando uma classe chamado Curso", 20));
        javaColecoes.adiciona(new Aula("Modelando com TreeSets", 22));

        Aluno a1 = new Aluno("Bruno H Oliveira", 3775);
        Aluno a2 = new Aluno("Aninha <3", 3664);
        Aluno a3 = new Aluno("Paulo Silveira", 5617);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println("Quem é o aluno com matricula 3775?");
        Aluno aluno = javaColecoes.buscaMatricula(3775);
        System.out.println(aluno);

        Map<Integer, Set<Aluno>> matriculaParaAlunos;

    }

}

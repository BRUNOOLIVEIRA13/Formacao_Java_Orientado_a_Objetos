import br.com.alura.gerenciador.modulos.Aula;
import br.com.alura.gerenciador.modulos.Curso;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursosComRelacionamentos {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                                       "Bruno Oliveira");

        javaColecoes.adiciona(new Aula("Trabalhando  com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma classe chamado Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);


        /*
          O método nCopies() nos retorna uma lista imutável com a quantidade escolhida de um determinado elemento.
          Se temos uma lista específica e precisamos obter uma outra lista imutável ,
          contendo diversas cópias de um destes objetos, utilizamos o método nCopies().
          O bom deste método é que mesmo que nós solicitemos uma lista com um número grande,
          como 10000 objetos, ele na verdade se referencia a apenas um, ocupando assim um pequeno espaço.
          Este método também é utilizado para inicializar Listas recém criadas com Null,
          já que ele pode rapidamente criar diversos objetos.
         */

        List<Type> list = new ArrayList<Type>(Collections.nCopies(1000, (Type)null));

    }
}

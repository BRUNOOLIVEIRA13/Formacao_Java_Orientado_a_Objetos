package Java8.src.model;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }


}

class ExemploCursos  {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

//        cursos.forEach(curso -> System.out.println(curso.getNome()));

        OptionalDouble average = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
//                .map(curso -> curso.getAlunos())
                .mapToInt(Curso::getAlunos)
                .average();
//                .forEach(System.out::println);
//        System.out.println(sum);

        cursos.stream()
                .filter(curso -> curso.getAlunos() > 50)
                .forEach(curso -> System.out.println(curso.getNome()));

        Stream<String> nomes = cursos.stream().map(Curso::getNome);
        nomes.forEach(System.out::println);

        Optional<Curso> optionalCurso = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .findAny();

        Curso curso = optionalCurso.orElse(null);
        System.out.println("Testando optional Curso: " + curso.getNome());

        optionalCurso.ifPresent(c -> System.out.println("Se tiver o curso presente: " + c.getNome()));

        /*
        tudo o que foi escrito a cima é equivalente a fazer :
         */
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println("Usando a versão reduzida de optional na stream: " + c.getNome()));


        /*
        Voltando agora de um STREAM para um COLLECTION (LIST), utilizando COLLECTOR
        Da mesma forma seria possível, apontar a lista inicial para essa nova filtrada
         */
        List<Curso> resultado = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toList());

        // o Map dentro da stream tem um for each
        // da pra fazer ao inves de stream, parallelStream()
        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));

//        System.out.println(mapCollect);


        cursos.stream()
                .mapToDouble(Curso::getAlunos)
                .average()
                .ifPresent(System.out::println);

        Stream<Curso> stream = cursos.stream()
                .filter(c -> c.getAlunos() > 50);



//        List<Curso> cursosFiltrados = stream.collect(Collectors.toList());
        List<Curso> cursosFiltrador = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());


    }


}

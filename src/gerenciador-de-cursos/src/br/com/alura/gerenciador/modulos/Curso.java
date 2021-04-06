import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<Aluno>();
    // LinkedHashSet -->  acesso ordenado e previsível.
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
    //LinkedHashMap --> os puts são ordenados de acordo com a ordem de inserção.

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso " +
                "Nome = '" + nome + '\'' +
                ", instrutor = '" + instrutor + '\'' +
                ", tempo total: " + this.getTempoTotal() + " minutos " +
                ", aulas= " + this.aulas +
                '}';
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatricula(int numeroMatricula) {
        if(matriculaParaAluno.containsKey(numeroMatricula)){
            return matriculaParaAluno.get(numeroMatricula);
        } else {
           throw new NoSuchElementException("Matricula não encontrada: " + numeroMatricula);
        }
    }
}

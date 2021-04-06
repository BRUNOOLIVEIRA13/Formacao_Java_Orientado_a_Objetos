import java.util.Objects;

public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if(nome == null) {
            throw new NullPointerException("O nome não pode ser null / vazio");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " +
                "nome = '" + this.nome + '\'' +
                ", matricula = " + this.matricula +
                ']';
    }

    @Override
    public boolean equals(Object outroAluno) {
        if (this == outroAluno) return true;
        if (outroAluno == null || getClass() != outroAluno.getClass()) return false;
        Aluno aluno = (Aluno) outroAluno;
        return matricula == aluno.matricula && nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, matricula);
    }
}

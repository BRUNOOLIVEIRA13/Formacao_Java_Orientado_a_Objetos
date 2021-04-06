package ByteBank_herancas.src;

//nao pode instanciar esta classe, pq é abstrata
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    //método sem corpo, não ha implementação na classe mãe, porém todas as filhas precisam
    public abstract double getBonus();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
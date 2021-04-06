package ByteBank_herancas.src;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario nome) {
        double bonus = nome.getBonus();
        this.soma = this.soma + bonus;
    }

    public double getSoma() {
        return soma;
    }
}

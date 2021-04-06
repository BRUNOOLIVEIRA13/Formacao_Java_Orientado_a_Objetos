package ByteBank_herancas.src;

public class Administrador extends Funcionario implements Autenticavel {

    private Authentic autenticador;

    public Administrador() {
        this.autenticador = new Authentic();
    }

    @Override
    public double getBonus() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

}

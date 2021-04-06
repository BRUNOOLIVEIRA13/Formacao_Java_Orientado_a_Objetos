package ByteBank_herancas.src;

public class Cliente implements Autenticavel {

    private Authentic autenticador;

    public Cliente() {
        Authentic autenticador = new Authentic();
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

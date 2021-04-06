package ByteBank_herancas.src;

// Gerente é um Funcionario => Gerente extends Funcionario => (extendes => é um)
// Gerente é um Funcionario e assina o contrato Autenticavel => implements Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private Authentic autenticador;

    public Gerente() {
        this.autenticador = new Authentic();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    //reescrita do método da classe mãe na classe Gerente
    public double getBonus() {
        System.out.println("Calculando bônus para Gerente...");
        return super.getSalario();
    }

}
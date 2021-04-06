package ByteBank_Account.src.modelo;

// new modelo.ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorSaque = valor + 0.2;
        return super.saca(valorSaque);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}

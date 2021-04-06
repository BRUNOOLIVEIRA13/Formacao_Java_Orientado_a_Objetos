package ByteBank_composto.src;

public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Sem saldo suficiente!");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            System.out.println("Transferência realizada com sucesso!");
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

}

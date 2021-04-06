package ByteBank_Encapsulado.src;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    // atributo da classe
    private static int total = 0;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        Conta.total++;
        System.out.println("O total de contas criadas até o momento é de: " + Conta.total);

        System.out.println("Criando conta número . . . " + this.numero);
    }


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

    public int getNumero() {
        return this.numero;
    }

    // evita números negativos
    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Erro - Apenas valores maiores que 0!");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    // evita números negativos
    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Erro - Apenas valores maiores que 0!");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    // para conseguir invocar este método sem uma instancia,
    // ele precisa ser static igual no atributo da classe
    public static int getTotal() {
        return Conta.total;
    }

}

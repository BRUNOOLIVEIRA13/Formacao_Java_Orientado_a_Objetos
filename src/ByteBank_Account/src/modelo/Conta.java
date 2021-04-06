package ByteBank_Account.src.modelo;

public abstract class Conta {
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    // atributo da classe
    private static int total = 0;


    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        // this.saldo = 100;
        Conta.total++;
        // System.out.println("O total de contas criadas até o momento é de: " + modelo.Conta.total);

        // System.out.println("Criando conta número . . . " + this.numero);
    }


    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (this.saldo >= valor && valor >= 0) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Não foi possível realizar esta operação!");
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

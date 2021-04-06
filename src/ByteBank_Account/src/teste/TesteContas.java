package ByteBank_Account.src.teste;

import ByteBank_Account.src.modelo.ContaCorrente;
import ByteBank_Account.src.modelo.ContaPoupanca;

public class TesteContas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1006, 157);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(6969, 420);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("Saldo da modelo.Conta-Corrente: " + cc.getSaldo());
        System.out.println("Saldo da Poupança: " + cp.getSaldo());


    }

}

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(111, 333);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 444);
		cp.deposita(200.0);

		cc.transfere(10.0, cp);

		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

		System.out.println(cc);
		System.out.println(cp);


	}

}

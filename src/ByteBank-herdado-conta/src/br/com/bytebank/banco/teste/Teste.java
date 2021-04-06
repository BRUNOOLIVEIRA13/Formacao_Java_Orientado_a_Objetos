import br.com.bytebank.banco.modelo.AccountHolder;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

    public static void main(String[] args) {

        AccountHolder guardador = new AccountHolder();

        Conta cc = new ContaCorrente(22,11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(33,22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQtdElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReference(0);
        System.out.println(ref.getNumero());




    }

}

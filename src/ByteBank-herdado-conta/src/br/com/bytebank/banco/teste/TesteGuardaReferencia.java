import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ReferenceHolder;

public class TesteGuardaReferencia {
    public static void main(String[] args) {

        ReferenceHolder guardador = new ReferenceHolder();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQtdElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReference(1);
        System.out.println(ref.getNumero());

    }
}

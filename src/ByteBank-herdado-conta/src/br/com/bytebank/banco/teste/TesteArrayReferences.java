import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferences {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //int[] idades = new int [5]
        Object[] referencias = new Object[5];
        ContaCorrente cc1 = new ContaCorrente(22,11);
        ContaPoupanca cc2 = new ContaPoupanca(33,22);

        System.out.println(referencias.length);

        referencias[0] = cc1;
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

//        Object[] referenciaGenerica = contas[1];
//        System.out.println(referenciaGenerica.getNumero());

        ContaPoupanca ref = (ContaPoupanca) referencias[1]; // type cast

//        for (int i = 0; referencias[i] != null; i++) {
//            System.out.println(referencias[i].getNumero());
//        };
        System.out.println("Same numbers account bellow: ");
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

    }
}

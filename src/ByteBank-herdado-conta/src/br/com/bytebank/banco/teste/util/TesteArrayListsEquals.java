import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListsEquals {

    public static void main(String[] args) {

//        Conta cc1 = new ContaCorrente(22, 22);
//        Conta cc2 = new ContaCorrente(22, 22);
//
//        System.out.println(cc1.ehIgual(cc2));

        //Generics
        ArrayList<Conta> lista = new ArrayList<Conta>();
        /**
         * Houve uma simplificação da paremetrização do ArrayList usando os <>, a mesma linha a cima
         * pode ser escrita da seguinte forma:
         * ArrayList<Conta> lista = new ArrayList<>();
         * Sem precisar passar a referencia para o objeto criado a direita.
         */

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);
        Conta cc2 = new ContaCorrente(33, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(33, 22);
        boolean exist = lista.contains(cc3);

        System.out.println("Já existe? " + exist);

        for(Conta conta : lista){
            System.out.println(conta);
        }

    }
}

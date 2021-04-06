import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayLists {

    public static void main(String[] args) {

        //Generics
        // Podemos usar também LinkedList e Vector para criação de Lista
        // o Vector é thread safe e o LinkedList é uma lista duplamente "linkada"
        List<Conta> lista = new ArrayList<Conta>();
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

        System.out.println("Tamanho: " + lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println();
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(44, 33);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(55, 44);
        lista.add(cc4);

        for(int i=0; i<lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(lista.get(i));
        }
        System.out.println("-----");

        // Equivalente ao metodo acima seria:
        for(Conta conta : lista){
            System.out.println(conta);
        }

    }
}

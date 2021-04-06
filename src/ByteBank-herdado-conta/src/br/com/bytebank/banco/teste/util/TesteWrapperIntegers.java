import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperIntegers {

    public static void main(String[] args) {

        int idade = 29; // Primitivo do tipo Integer
        //Integer idadeRef = new Integer(29); -> metodo depreciado
        Integer idadeRef = Integer.valueOf(29); // autoboxing
        int valor = idadeRef.intValue(); // unboxing
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);


        String s = "10";
        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(idade); // Autoboxing
        /**
         * Listas são feitas para receber referências, e int é um primitivo, ou seja
         * por baixo dos panos, ele transforma primitivos em objetos e vice-versa
         * pra fazer funcionar, e isso se chama Autoboxing
         */

    }

}

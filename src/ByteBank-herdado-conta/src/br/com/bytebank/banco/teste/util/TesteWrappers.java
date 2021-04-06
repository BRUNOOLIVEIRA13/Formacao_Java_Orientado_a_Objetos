import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); // autoboxing
        System.out.println(idadeRef.doubleValue()); //unboxing

        Double dRef = 3.2;

        Number refNumero = Integer.valueOf(29);

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);


    }
}

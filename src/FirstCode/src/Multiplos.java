package FirstCode.src;

public class Multiplos {

    public static void main(String[] args) {

        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }
        }

        for (int multiplo = 3; multiplo < 100; multiplo += 3) {
            System.out.println(multiplo);
        }
    }
}

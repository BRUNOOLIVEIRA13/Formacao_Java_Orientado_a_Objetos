package FirstCode.src;

public class TestaConversao {

    public static void main(String[] args){
        double salario = 1270.50;

        //abaixo é usado o casting
        int valor = (int) salario;
        System.out.println(valor);

        int ateDoisMilhoes = 2000000;
        long numerosGrandes = 343434343L;

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total);

        // outra forma de fazer o casting, no lugar de (float) utilizar f
        float pontoFlutuante = 3.14f;
        System.out.println(pontoFlutuante);


    }
}

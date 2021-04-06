package FirstCode.src;

public class CalculoIR {

    public static void main(String[] args) {

        double imposto;
        double desconto;
        double salario = 3300.0;

        if (salario > 1900.0 && salario <= 2800.0) {
            imposto = 7.5;
            desconto = 142.0;

        } else if (salario >= 2800.01 && salario <= 3751.00) {
            imposto = 15.0;
            desconto = 350.0;

        } else if (salario >= 3751.01 && salario <= 4664.00) {
            imposto = 22.5;
            desconto = 636.0;
        } else {
            desconto = 0;
            imposto = 0;

        }

        System.out.println("O seu imposto de renda é de: " + imposto + "% " +
                "e pode deduzir na declaração o valor de R$ " + desconto);

    }
}

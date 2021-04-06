package ByteBank_Account.src.teste;

import ByteBank_Account.src.modelo.CalculadorDeImposto;
import ByteBank_Account.src.modelo.ContaCorrente;
import ByteBank_Account.src.modelo.Prioridade;
import ByteBank_Account.src.modelo.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calculo = new CalculadorDeImposto();
        calculo.registra(cc);
        calculo.registra(seguro);

        System.out.println("Total de imposto: " + calculo.getTotalImposto());

        Prioridade pMin = Prioridade.MIN;
        Prioridade pMax = Prioridade.MAX;

        System.out.println(pMin.name());
        System.out.println(pMax.name());

        System.out.println(pMin.ordinal());
        System.out.println(pMax.ordinal());

    }
}

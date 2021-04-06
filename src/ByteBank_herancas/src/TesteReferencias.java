package ByteBank_herancas.src;

public class TesteReferencias {

    public static void main(String[] args) {

        // Funciona pois o Gerente é um Funcionário, eles possuem relação é um.
        Gerente g1 = new Gerente();

        g1.setNome("Bruno");
        g1.setSalario(5000.00);

        Editor edd = new Editor();
        edd.setSalario(2500.00);

        Designer art = new Designer();
        art.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(edd);
        controle.registra(art);

        System.out.println("Soma das bonificações: " + controle.getSoma());

    }
}

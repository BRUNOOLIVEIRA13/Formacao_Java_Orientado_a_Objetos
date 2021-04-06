package ByteBank_herancas.src;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Funcionario bruno = new Gerente();
        bruno.setNome("Bruno Oliveira");
        bruno.setCpf("223355646-9");
        bruno.setSalario(2600.00);

        System.out.println(bruno.getNome());
        System.out.println(bruno.getBonus());

        //bruno.salario = 300.0;

    }

}
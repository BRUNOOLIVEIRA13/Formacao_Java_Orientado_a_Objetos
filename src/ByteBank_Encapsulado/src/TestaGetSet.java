package ByteBank_Encapsulado.src;

public class TestaGetSet {

    public static void main(String[] args) {
        Conta conta = new Conta(13,1337);

        System.out.println(conta.getNumero());

        Cliente Bruno = new Cliente();
        // conta.titular = Bruno;

        Bruno.setNome("Bruno Oliveira");
        conta.setTitular(Bruno);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Dev Jr");
        // agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Dev Jr");

        // só tem um cliente, então todos estes abaixo, apontam para a mesma coisa
        System.out.println(titularDaConta);
        System.out.println(Bruno);
        System.out.println(conta.getTitular());
    }
}

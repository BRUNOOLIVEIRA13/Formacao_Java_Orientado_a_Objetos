package ByteBank_herancas.src;

public class GerenteTeste {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNome("Bruno");
        g1.setCpf("12345678900");
        g1.setSalario(5000.00);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(1234);
        boolean autenticou = g1.autentica(1234);

        System.out.println(autenticou);
        System.out.println(g1.getBonus());
    }
}

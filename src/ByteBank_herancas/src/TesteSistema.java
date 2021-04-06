package ByteBank_herancas.src;

public class TesteSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(1234);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(1234);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);

    }
}
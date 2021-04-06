import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerial {

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Bruno");
        cliente.setProfissao("Desenvolvedor");
        cliente.setCpf("123321111-10");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(250.55);

        // transforma o fluxo em binário
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cc);
        oos.close();

    }
}

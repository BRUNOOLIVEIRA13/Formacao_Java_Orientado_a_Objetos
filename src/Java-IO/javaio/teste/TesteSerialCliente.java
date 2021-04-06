import java.io.*;

public class TesteSerialCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//
//        Cliente cliente = new Cliente();
//
//        cliente.setNome("Bruno");
//        cliente.setProfissao("Desenvolvedor");
//        cliente.setCpf("123321111-10");
//
//
//
//        // transforma o fluxo em binário
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        //transforma o arq binario em um objeto disponivel
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();

        System.out.println(cliente.getNome());
    }
}

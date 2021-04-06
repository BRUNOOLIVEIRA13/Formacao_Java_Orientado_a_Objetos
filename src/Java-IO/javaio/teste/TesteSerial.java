import java.io.*;

public class TesteSerial {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        String nome = "Bruno Oliveira";

        // transforma o fluxo em binário
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        oos.writeObject(nome);
//        oos.close();

        //transforma o arq binario em um objeto disponivel
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();

        System.out.println(nome);
    }
}

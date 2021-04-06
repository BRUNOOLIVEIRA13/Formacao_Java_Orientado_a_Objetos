package ByteBank_composto.src;

public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDaAna = new Conta();
        System.out.println(contaDaAna.getSaldo());

        // associando
        contaDaAna.titular = new Cliente();
        System.out.println(contaDaAna.titular);

        contaDaAna.titular.nome = "Marcela";
        System.out.println(contaDaAna.titular.nome);


    }

}

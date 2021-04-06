package ByteBank_composto.src;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.nome = "Bruno Oliveira";
        bruno.cpf = "222.222.222-99";
        bruno.profissao = "Dev Jr";

        Conta contaDoBruno = new Conta();
        contaDoBruno.deposita(100);

        // associa o cliente Bruno a contaDoBruno
        contaDoBruno.titular = bruno;
        System.out.println(contaDoBruno.titular.nome);
        System.out.println(contaDoBruno.titular);
        System.out.println(bruno);

    }
}

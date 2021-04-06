package ByteBank.src;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoBruno = new Conta();
        contaDoBruno.saldo = 100;

        System.out.println(contaDoBruno.saldo);
        contaDoBruno.deposita(50);

        System.out.println(contaDoBruno.saldo);

        contaDoBruno.saca(20);
        System.out.println(contaDoBruno.saldo);

        Conta contaDaAna = new Conta();
        contaDaAna.deposita(1000);

        contaDaAna.transfere(300, contaDoBruno);
        System.out.println(contaDaAna.saldo);
        System.out.println(contaDoBruno.saldo);

        contaDoBruno.titular = "Bruno Oliveira";
        System.out.println(contaDoBruno.titular);
    }

}

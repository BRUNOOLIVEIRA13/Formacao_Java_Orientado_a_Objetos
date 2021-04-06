package ByteBank_Encapsulado.src;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(50,330);

        System.out.println("Agência: " + conta.getAgencia());

        conta.deposita(200);
        System.out.println("Saldo de : " + conta.getSaldo());

        conta.setAgencia(121);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(50,1654);

        Conta conta3 = new Conta(50,6969);

        System.out.println("Total de contas " + Conta.getTotal());

    }
}
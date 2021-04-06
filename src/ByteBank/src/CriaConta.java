package ByteBank.src;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println("primeira conta tem: " + primeiraConta.saldo);
        System.out.println("segunda conta tem: " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        if (primeiraConta == segundaConta){
            System.out.println("São a mesma conta, referenciando o mesmo objeto");
        } else {
            System.out.println("Contas diferentes!");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}

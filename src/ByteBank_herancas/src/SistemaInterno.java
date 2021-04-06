package ByteBank_herancas.src;

public class SistemaInterno {

    private int senha = 1234;

    public void autentica(Autenticavel nome){
        boolean autenticou = nome.autentica(this.senha);

        if(autenticou){
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("You shall not pass!");
        }

    }
}

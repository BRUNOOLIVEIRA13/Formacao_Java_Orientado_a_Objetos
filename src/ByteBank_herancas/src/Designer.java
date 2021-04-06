package ByteBank_herancas.src;

// Editor é um funcionario, herda da classe funcionario.
public class Designer extends Funcionario {

    public double getBonus(){
        System.out.println("Calculando bônus para Designer...");
        return 200;

    }
}
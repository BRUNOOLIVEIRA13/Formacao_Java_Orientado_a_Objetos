package ByteBank_herancas.src;

// Editor é um funcionario, herda da classe funcionario.
public class Editor extends Funcionario {

    public double getBonus(){
        System.out.println("Calculando bônus para Editor...");
        return 150;

    }
}
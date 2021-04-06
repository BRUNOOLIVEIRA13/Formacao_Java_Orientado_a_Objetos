import br.com.alura.gerenciador.modulos.Aluno;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {
    public static void main(String[] args) {

        Set<String> nomes = Collections.emptySet();
//        nomes.add("Brunão"); // metodo acima é retorna vazio e é imutavel.

//        Set<Aluno> alunoSincronizados = Collections.synchronizedSet(nomes);

    }
}

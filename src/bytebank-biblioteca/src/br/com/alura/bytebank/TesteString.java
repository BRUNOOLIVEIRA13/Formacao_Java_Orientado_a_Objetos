import java.util.Arrays;

public class TesteString {
    public static void main(String[] args) {

        String nome = "Alura";
        System.out.println(nome);

        String outra = nome.replace("A", "a");
        System.out.println(outra);

        String outro = nome.replace('l', 'r');
        System.out.println(outro);

        String outras = nome.toLowerCase();
        System.out.println(outras);

        System.out.println(nome.charAt(2));

        int posicao = nome.indexOf("ur");
        System.out.println(posicao);

        String sub = nome.substring(2);
        System.out.println(sub);

        System.out.println(nome.length());

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        String vazio = "";
        System.out.println(vazio.isEmpty());

        String verificaSePossuiApenasEspacos = " ";
        System.out.println(verificaSePossuiApenasEspacos.isBlank());

        String espacos = "  Remove os espaços iniciais e finais  ";
        System.out.println(espacos);
        String semEspaco = espacos.trim();
        System.out.println(semEspaco);

        // System.out.println(espacos.contains("SequenciaString")): mesma coisa da linha abaixo
        System.out.println("SequenciaString".contains(espacos));

        System.out.println(Arrays.toString(espacos.split("ai")));
    }
}

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

public class TesteLeituraScanner {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8);

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            //System.out.println(linha);

            Scanner lineScanner = new Scanner(linha);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");

            String tipoConta = lineScanner.next();
            int agencia = lineScanner.nextInt();
            int numero = lineScanner.nextInt();
            String titular = lineScanner.next();
            double saldo = lineScanner.nextDouble();

            System.out.format(new Locale("pt", "BR"),  "%s : %04d-%08d, %s %.2f %n",
                    tipoConta, agencia, numero, titular, saldo);

            lineScanner.close();
//            String [] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));

        }
        scanner.close();


        //java.util.Properties
        Properties props = new Properties();
        props.setProperty("login", "Bruno");
        props.setProperty("senha", "alurapass");
        props.setProperty("endereco", "www.duckduckgo.com");

        props.store(new FileWriter("config.properties"), "Arquivo contendo as configurações");

        props.load(new FileReader("config.properties"));
        String login = props.getProperty("login");
        String senha = props.getProperty("senha");
        String endereco = props.getProperty("endereco");

        System.out.format("Login: %s, Senha: %s, Endereço: %s %n", login, senha, endereco);

    }
}

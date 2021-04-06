import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com um Arquivo
        InputStream fis = new FileInputStream("lorem.txt"); //entrada do arq como binario
        Reader isr = new InputStreamReader(fis); // de binario para char
        BufferedReader br = new BufferedReader(isr); //um string que representa a linha

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();

    }

}

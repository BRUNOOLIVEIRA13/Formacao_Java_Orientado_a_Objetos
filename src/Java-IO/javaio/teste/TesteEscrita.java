import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //Fluxo de saida com um Arquivo

        //classe deve ser usada para escrever bytes num arquivo.
        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos); // de binario para char
        BufferedWriter bw = new BufferedWriter(osw); //um string que representa a linha

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        //bw.newLine();
        bw.newLine();
        bw.write("New line testing :D ");
        bw.close();

    }

}

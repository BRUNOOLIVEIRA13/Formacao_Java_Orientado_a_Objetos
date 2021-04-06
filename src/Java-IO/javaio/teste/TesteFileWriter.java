import java.io.*;

public class TesteFileWriter {

    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos); // de binario para char
//        BufferedWriter bw = new BufferedWriter(osw); //um string que representa a linha

//        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("New line testing :D ");

        bw.close();

    }

}

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;

public class TestePrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos); // de binario para char
//        BufferedWriter bw = new BufferedWriter(osw); //um string que representa a linha

//        FileWriter fw = new FileWriter("lorem2.txt");

//        PrintStream ps = new PrintStream("lorem2.txt");

        PrintWriter ps = new PrintWriter("lorem2.txt", "UTF-8");

        ps.println("Lorem ipsum dolor sit amet, é TESTE Ç consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("New line testing!!! *-*");

        ps.close();

    }

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ex07 {
    public static void lerLinhasInteirasdoFicheiro()throws FileNotFoundException {
        Scanner in= new Scanner(new File("ficha07/FichaPratica07/exercicio_07.txt"));

        String linha;
        int line= 0;
        int words =0;

        while(in.hasNextLine()){
            linha=in.nextLine();
            String[]itensDaLinha= linha.split(" ");

            words+= itensDaLinha.length;

            //words+= linha.length();
            line += 1;


        }
        System.out.println(line);
        System.out.println(words);

        in.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        lerLinhasInteirasdoFicheiro();
    }
}

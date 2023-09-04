import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ex08{
    public static void lerLinhasInteirasdoFicheiro()throws FileNotFoundException {
        Scanner in= new Scanner(new File("ficha07/FichaPratica07/exercicio_08.txt"));
        String linha, specificWord;

        File file=new File("ficha07/FichaPratica07/exercicio_08_Alternativo.txt");
        PrintWriter printWriter= new PrintWriter(file);



        while(in.hasNextLine()){
            linha=in.nextLine();
            String[]itensDaLinha= linha.split("Vitor");

           if(itensDaLinha[0].length() < linha.length()){

               System.out.println(linha);

               String fileContent = linha;
               printWriter.println(fileContent);
           }

        }


        in.close();
        printWriter.close();


    }
    public static void main(String[] args) throws FileNotFoundException {
        lerLinhasInteirasdoFicheiro();
    }
}

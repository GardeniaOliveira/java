
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Ex04 {

    public static void lerLinhasInteirasdoFicheiro()throws FileNotFoundException {
        Scanner in= new Scanner(new File("ficha07/FichaPratica07/exercicio_04.csv"));

        String linha;

        while(in.hasNextLine()){
            linha=in.nextLine();
            String[]itensDaLinha= linha.split(" ,");
            System.out.println(linha);
        }

        in.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        lerLinhasInteirasdoFicheiro();
    }
}



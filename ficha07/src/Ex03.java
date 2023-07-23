import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;


public class Ex03 {

    public static void  lerLinhasInteirasdoFicheiro()throws FileNotFoundException {
        Scanner in= new Scanner(new File("ficha07/FichaPratica07/exercicio_03.txt"));
        String linha= in.nextLine();

        File file=new File("ficha07/FichaPratica07/exercicio_03_Alternativa01.txt");
        PrintWriter printWriter= new PrintWriter(file);

        while(in.hasNextLine()){
            linha=in.nextLine();
            printWriter.println(linha);
        }

        in.close();
        printWriter.close();

    }



    public static void main(String[] args) throws FileNotFoundException {

        lerLinhasInteirasdoFicheiro();
    }


}

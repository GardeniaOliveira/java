import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Ex01 {

    public static void lerLinhasInteirasdoFicheiro()throws FileNotFoundException {
        Scanner in= new Scanner(new File("ficha07/FichaPratica07/exercicio_01.txt"));

        String linha;

        while(in.hasNextLine()){
            linha=in.nextLine();
            System.out.println(linha);
        }

        in.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        lerLinhasInteirasdoFicheiro();
    }
}

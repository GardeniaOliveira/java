import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {

    public static void lerLinhasInteirasdoFicheiro()throws FileNotFoundException {
        Scanner in= new Scanner(new File("ficha07/FichaPratica07/exercicio_05_1999.txt"));

        String linha;
        int total=0;

        while(in.hasNextLine()){
            linha=in.nextLine();
            String[]itensDaLinha= linha.split(" ");

            for(int i=0; i< itensDaLinha.length; i++){
                total+= Integer.parseInt(itensDaLinha[i]);
            }
            System.out.println(total);
        }

        in.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        lerLinhasInteirasdoFicheiro();
    }
}

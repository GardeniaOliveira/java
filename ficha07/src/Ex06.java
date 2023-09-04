import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
    public static void lerLinhasInteirasdoFicheiro()throws FileNotFoundException {
        Scanner in= new Scanner(new File("ficha07/FichaPratica07/exercicio_06.txt"));

        String linha;
        String name= "";
        int oldest =0;

        while(in.hasNextLine()){
            linha=in.nextLine();
            String[]itensDaLinha= linha.split(",");

            if(oldest < Integer.parseInt(itensDaLinha[1 ]) ){
                oldest = Integer.parseInt(itensDaLinha[1 ]);
                name = itensDaLinha[0];
            }
        }
        System.out.println("The oldest person is: " + name + " with " + oldest + " years old");

        in.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        lerLinhasInteirasdoFicheiro();
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11 {
    public static void lerLinhasInteirasdoFicheiro()throws FileNotFoundException {

        //variables
        String linha;
        String[] linhaDividida = new String[4];
        int[][] matriz = new int[4][4];

        //open file
        File fileContent = new File("ficha07/FichaPratica07/exercicio_11.csv");
        Scanner scannerFile= new Scanner(fileContent);

        //next line
        scannerFile.nextLine();


        while(scannerFile.hasNextLine()){
            linha=scannerFile.nextLine();
            linhaDividida=linha.split(",");
            //System.out.println(linhaDividida);

            // Enter
            System.out.println("\n");
            System.out.println(linha);
            // Ciclo para imprimir o array -> NÃO FAZ PARTE DO EXERCÍCIO
            for(int i=0; i<linhaDividida.length;i++){
                System.out.println("Array["+i+"]: "+linhaDividida[i]);
            }

        }

        scannerFile.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        lerLinhasInteirasdoFicheiro();
    }
}

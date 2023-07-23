import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
public class Ex02 {
    public static void usingPrintWriter() throws FileNotFoundException{
        String fileContent = "This is my first line in the exercise 2";

        File file=new File("ficha07/FichaPratica07/exercicio_02.txt");
        PrintWriter printWriter= new PrintWriter(file);

        printWriter.println(fileContent);
        printWriter.println("This is my favorite ufcd");

        printWriter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        usingPrintWriter();
    }


}

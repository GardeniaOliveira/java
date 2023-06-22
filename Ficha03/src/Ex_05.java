import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int num=1, result=0;

    while(num <=100){
        System.out.println(num);
        num+=1;

        result = (result+num) -1;

        System.out.println(result);
    }



    }
}

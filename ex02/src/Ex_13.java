import java.util.Scanner;

public class Ex_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hours, minutes, newHour;

        System.out.print("Digite as horas: ");
        hours = input.nextInt();

        System.out.print("Digite os minutos: ");
        minutes = input.nextInt();

        if(hours >= 12 && hours <=24){
            newHour = hours -12;

            System.out.print(newHour + ":" + minutes);
        } else{
            System.out.print("Hora inválida ");
        }


    }
}

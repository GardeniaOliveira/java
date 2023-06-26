import java.util.Scanner;
public class Ex_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do{
        System.out.println("Escolha uma opção: 1. Criar | 2. Atualizar | 3. Eliminar | 4. Sair  ");
        option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("1. Criar ");
                    break;

                case 2:
                    System.out.println("2. Atualizar ");
                    break;

                case 3:
                    System.out.println("3. Eliminar ");
                    break;
                case 4:
                    System.out.println("4. Sair ");
                    break;


            }
        }
        while ( option !=4 );
    }
}

import java.util.Scanner;

public class Ex_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        System.out.print("Escolha uma opção: 1. Criar 2. Atualizar 3. Eliminar 4. Sair -- ");
        option = input.nextInt();

        if (option == 1 || option ==2 ||option ==3||option ==4 ){
            switch (option){
                case 1:
                    System.out.print("1. Criar ");
                    break;

                case 2:
                    System.out.print("2. Atualizar ");
                    break;

                case 3:
                    System.out.print("3. Eliminar ");
                    break;

            }
        } else{
            System.out.print("opção inválida");
        }

    }
}

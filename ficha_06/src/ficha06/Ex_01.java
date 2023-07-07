package ficha06;

import java.util.Scanner;

public class Ex_01 {

    /**
     * imprime o barulho do animal correspondente
     * @param animal
     */

    static void fazerBarulho(String animal){
        switch (animal){
            case "CAO":
                System.out.println("Au au au!");
                break;

            case "GATO":
                System.out.println("Miau!");
                break;

            case "PEIXE":
                System.out.println("Glub glub glub");
                break;

            case "VACA":
                System.out.println("Muuuu!");
                break;

            case "PORCO":
                System.out.println("Oinc! Oinc! Oinc!");
                break;

            default:
                System.out.println("Barulho indefinido");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String animalEscolhido;
        System.out.println("Escolha um animal: CAO | GATO | PEIXE | VACA | PORCO ");
        animalEscolhido = input.next();

        fazerBarulho(animalEscolhido);

        System.out.println("\nFIM!");
    }
}


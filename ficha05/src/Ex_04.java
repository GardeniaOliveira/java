public class Ex_04 {
    public static void main(String[] args) {

        int  k = 0;

        for (int n = 1; n <= 4; n++) {
            for (int i = 0; i <= 10; i++) {

                System.out.print("*");

            }
            System.out.println("*");
        }


     for (int j = 5; j >= 1; j--) {
        for (int l = j; l < 5; l++) {

            System.out.print("*");
        }
        System.out.println("*");
    }


        for (int j = 5; j >= 1; j--) {
            for ( k = j; k < 5; k++) {
                if (k==3){

             System.out.print("*");
                }

                }

            System.out.println("*");
        }


    }}

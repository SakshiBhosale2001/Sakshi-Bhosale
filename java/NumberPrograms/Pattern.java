package NumberPrograms;

public class Pattern {
    public static void main(String[] args) {
        //Right Angle
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //mirror of Right angle
        for (int i = 0; i < 8; i++) {
            for (int j = 2 + (8 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //pyramid pattern

        for (int i = 0; i < 8; i++) {
            for (int j = 8 - i; j > 1; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}


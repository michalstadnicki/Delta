import java.util.Scanner;

public class Delta {

    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;
        int number_of_elements = 0;

        System.out.println("A simple console program that counts the elements of the square equation");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter parametr a: ");
        a = scanner.nextDouble();

        if (a == 0) {

            System.out.println("a nie może równać się zero");
            return;

        } else {

            System.out.print("Enter parametr b: ");
            b = scanner.nextDouble();
            System.out.print("Enter parametr c: ");
            c = scanner.nextDouble();

            System.out.println("Square function x = " + a + "x\u00B2 " + b + "x + " + c);

            delta = (Math.pow(b, 2) - (4 * a * c));

            System.out.println("\u0394 = " + delta);

            if (delta < 0) number_of_elements = 0;
            if (delta == 0) number_of_elements = 1;
            if (delta > 0) number_of_elements = 2;

            switch (number_of_elements) {
                case 0: {

                    System.out.println("The equation has no square root");
                    break;
                }

                case 1: {

                    System.out.println("The equation has one square root");
                    break;
                }

                case 2: {

                    System.out.println("The equation has two square roots");

                    x1 = ((-b - Math.sqrt(delta)) / 2 * a);
                    x2 = ((-b + Math.sqrt(delta)) / 2 * a);

                    System.out.printf("%4.2f", x1);
                    System.out.println("");
                    System.out.printf("%4.2f", x2);
                    break;
                }
            }
            
        }

        scanner.close();

    }

}
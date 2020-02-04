import java.util.Scanner;

public class Delta {

    public static void main(String[] args) {

        double a, b, c, delta, x1, x2;
        char number_of_elements;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę a: ");
        a = scanner.nextDouble();

        if (a == 0) {

            System.out.println("a nie może równać się zero");
            return;

        } else {

            System.out.print("Podaj liczbę b: ");
            b = scanner.nextDouble();
            System.out.print("Podaj liczbę c: ");
            c = scanner.nextDouble();

            System.out.println("Funkcja kwadratowa ma postać x = " + a + "+ x^2 " + b + "+ x " + c);

            delta = (Math.pow(b,2) - (4*a*c));

            System.out.println(delta);

            x1 = ((-b-Math.sqrt(delta))/2*a);
            x2 = ((-b+Math.sqrt(delta))/2*a);

            System.out.println(x1);
            System.out.println(x2);
        }

        scanner.close();

    }
}
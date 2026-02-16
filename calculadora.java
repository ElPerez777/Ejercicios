import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean seguir = true;

        while (seguir) {

            System.out.println("calculadora");
            System.out.println("1 suma");
            System.out.println("2 resta");
            System.out.println("3 multiplicacion");
            System.out.println("4 division");
            System.out.println("0 salir");
            System.out.print("elige: ");

            int opcion = sc.nextInt();

            if (opcion == 0) {
                seguir = false;
            } else if (opcion == 1) {

                System.out.print("numero 1: ");
                double a = sc.nextDouble();

                System.out.print("numero 2: ");
                double b = sc.nextDouble();

                System.out.println("resultado: " + (a + b));

            } else if (opcion == 2) {

                System.out.print("numero 1: ");
                double a = sc.nextDouble();

                System.out.print("numero 2: ");
                double b = sc.nextDouble();

                System.out.println("resultado: " + (a - b));

            } else if (opcion == 3) {

                System.out.print("numero 1: ");
                double a = sc.nextDouble();

                System.out.print("numero 2: ");
                double b = sc.nextDouble();

                System.out.println("resultado: " + (a * b));

            } else if (opcion == 4) {

                System.out.print("numero 1: ");
                double a = sc.nextDouble();

                System.out.print("numero 2: ");
                double b = sc.nextDouble();

                if (b == 0) {
                    System.out.println("no se puede dividir entre cero");
                } else {
                    System.out.println("resultado: " + (a / b));
                }

            } else {
                System.out.println("opcion no valida");
            }

            System.out.println();
        }

        sc.close();
    }
}


package uvg.edu.gt.console;


import uvg.edu.gt.model.FileManager;
import uvg.edu.gt.model.SortingAlgorithms;

import java.util.Scanner;

public class SortingConsoleUI {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Gnome Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Quick Sort");
            System.out.println("4. Radix Sort");
            System.out.println("5. Choose The Pair Sort");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 6) {
                System.out.println("¡Adiós!");
                System.exit(0);
            }

            System.out.print("Ingrese la cantidad de números a generar y ordenar: ");
            int count = new Scanner(System.in).nextInt();



            System.out.println("\nNúmeros antes de ordenar:");



            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    continue;
            }

            System.out.println("\nNúmeros después de ordenar:");

        }
    }


}

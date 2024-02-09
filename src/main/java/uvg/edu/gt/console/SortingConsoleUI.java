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

            Integer[] numbers = generateRandomNumbers(count);

            System.out.println("\nNúmeros antes de ordenar:");
            printArray(numbers);

            FileManager.writeToFile("random_numbers.csv", numbers);

            switch (choice) {
                case 1:
                    sortingAlgorithms.gnomeSort(numbers);
                    break;
                case 2:
                    sortingAlgorithms.mergeSort(numbers, 0, numbers.length - 1);
                    break;
                case 3:
                    sortingAlgorithms.quickSort(numbers, 0, numbers.length - 1);
                    break;
                case 4:
                    sortingAlgorithms.radixSort(numbers);
                    break;
                case 5:
                    sortingAlgorithms.chooseThePairSort(numbers);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    continue;
            }

            System.out.println("\nNúmeros después de ordenar:");
            printArray(numbers);
        }
    }

    private static Integer[] generateRandomNumbers(int count) {
        Integer[] randomNumbers = new Integer[count];
        for (int i = 0; i < count; i++) {
            randomNumbers[i] = (int) (Math.random() * 1000);
        }
        return randomNumbers;
    }

    private static void printArray(Integer[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
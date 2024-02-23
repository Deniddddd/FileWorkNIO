package app;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть назву файлу (без розширення):");
        String fileName = scanner.nextLine();

        System.out.println("Введіть текстовий контент:");
        String content = scanner.nextLine();

        System.out.println("Оберіть дію:");
        System.out.println("1. Створити та записати");
        System.out.println("2. Читати");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                try {
                    FileWriteService.writeToFile(fileName, content);
                    System.out.println("Файл успішно створено та записано.");
                } catch (IOException e) {
                    System.err.println("Помилка при створенні/записі у файл: " + e.getMessage());
                }
                break;
            case 2:
                try {
                    String fileContent = FileReadService.readFromFile(fileName);
                    System.out.println("Зміст файлу:");
                    System.out.println(fileContent);
                } catch (IOException e) {
                    System.err.println("Помилка при читанні з файлу: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Невідома опція.");
        }

        scanner.close();
    }
}

package exceptiondemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = null;
        while (true) {
            try {
                System.out.println("Sisesta faili nimi: ");
                String filePath = scanner.nextLine();
                lines = Files.readAllLines(Paths.get(filePath));
                break;
            } catch (NoSuchFileException e) {
                System.out.println("Eaili ei leitud: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Ilmnes mingi jama: " + e.getMessage());
            }
        }
        System.out.println("Luuletus:");
        System.out.println(lines);
    }
}

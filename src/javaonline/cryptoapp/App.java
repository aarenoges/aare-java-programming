package javaonline.cryptoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
      //  System.out.println(args[0]); //eelnevalt tegime App, Edit Configurations, kirjutasime argumentide reale
                                     // Program arguments "VÕTI ON MATI ALL"
        List<String> lines = Files.readAllLines(Paths.get("resources/alfabeet.txt")); // delegeerisime vea
                // olukorra lahendamise main meetodile: Add exception to method signature
      //  System.out.println(lines);
        // "A, Ü", "B, Ö" jne
        // VÕTI ON MATI ALL
        // V --> F, Õ --> D jne

        Map<String, String> converterMap = new HashMap<>();
        for (String line : lines) {
      //      System.out.println(line);
            String[] lineParts = line.split(", ");
            converterMap.put(lineParts[0], lineParts[1]);
        }

       // System.out.println(converterMap); // mapis jrk võib muutuda, kuid paarid on samad

        // VÕTI ON MATI ALL
        // V --> F, Õ --> D jne
        String message = args[0];
        String[] messageChars = message.split("");
        String encryptedMessage = "";

        for (String messageChar : messageChars) {
            encryptedMessage = encryptedMessage + converterMap.get(messageChar.toUpperCase());
            // toUpperCase tagab selle, et algne sõnum tõstetakse suurtähtedesse õ --> Õ
        }

        System.out.println("Krüpteerimist vajav sõnum: " + message);
        System.out.println("Krüpteeritud sõnum: " + encryptedMessage);
    }
}

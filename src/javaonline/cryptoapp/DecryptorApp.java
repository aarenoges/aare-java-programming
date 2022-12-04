package javaonline.cryptoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecryptorApp {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("resources/alfabeet.txt"));

        // "FDHž.PQ.RÜHŽ.ÜSS" --> "VÕTI ON MATI ALL"  F --> V
        Map<String, String> decryptorMap = new HashMap<>();
        for (String line : lines) {
            String[] lineparts = line.split(", "); // "Z, J" --> { "Z", "J" }
            decryptorMap.put(lineparts[1], lineparts[0]);
        }
        String encryptedMessage = args[0];
        String[] messageChars = encryptedMessage.split("");
        String decryptedMessage = "";

        for (String messageChar : messageChars) {
            decryptedMessage = decryptedMessage + decryptorMap.get(messageChar.toUpperCase());
            // toUpperCase tagab selle, et algne sõnum tõstetakse suurtähtedesse õ --> Õ
        }

        System.out.println("Krüpteeritud sõnum: " + encryptedMessage);
        System.out.println("Dekrüpteeritud sõnum: " + decryptedMessage);
    }
}

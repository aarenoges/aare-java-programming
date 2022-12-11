package javaonline.cryptoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("resources/alfabeet.txt"));
        // me loeme sisse alfabeet.txt read

        String message = args[0]; // me loeme sisse eraldi muutujasse käsurea parameetri "VÕTI ON MATI ALL"
        System.out.println("Algne sõnum: " + message);
//      Cryptor encryptor = new Cryptor(lines); // seejärel loome Cryptor objekti, anname Cryptor
                                         // konstruktorparameetrile kaasa alfabeet.txt failis olevad read
        // peale seda, kui tekitasime klassi Encryptor, edaspidi ei loo objekti Cryptorist vaid kasutame Encryptorit:
        Encryptor encryptor = new Encryptor(lines);

        String encryptedMessage = encryptor.convert(message); // tulemuseks on encryptor, mis on piisavalt tark
        System.out.println("Krüpteeritud sõnum: " + encryptedMessage);

        Decryptor decryptor = new Decryptor(lines);
        String decryptedMessage = decryptor.convert(encryptedMessage);
        System.out.println("Dekrüpteeritud sõnum: " + decryptedMessage);
    }
}

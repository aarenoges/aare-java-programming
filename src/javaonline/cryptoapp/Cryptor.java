package javaonline.cryptoapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cryptor {
    private  Map<String, String> conversionMap;

    public Cryptor(List<String> alphabetLines) {
        this.conversionMap = createConversionMap(alphabetLines);
    }

    protected Map<String, String> createConversionMap(List<String> alphabetLines) {
        // ["A, Ü", ...] "A" --> "Ü", ...
        for (String line : alphabetLines) {
            //      System.out.println(line);
            Map<String, String> map = HashMap<>();
            String[] lineParts = line.split(", ");
            map.put(lineParts[0], lineParts[1]);
        }
        return map;
    }

    public String convert(String message) {
        String[] messageChars = message.split("");
        String convertedMessage = "";

        for (String messageChar : messageChars) {
            convertedMessage = convertedMessage + this.conversionMap.get(messageChar.toUpperCase());
            // toUpperCase tagab selle, et algne sõnum tõstetakse suurtähtedesse õ --> Õ
        }
        return convertedMessage;
    }
}

package javaonline.cryptoapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Decryptor extends Cryptor {
    public Decryptor(List<String> alphabetLines) { // tekitame Decryptor-objekti, kõige esimese asjana kutsutakse
        super(alphabetLines);  // välja Decryptori konstruktor, see omakorda kutsub välja Cryptor-klassi konstruktoru
    }

    @Override  // override-ime createConversionMap-i meetodi
    protected Map<String, String> createConversionMap(List<String> alphabetLines) {
        // teeme Map-i, aga teeme kõik vastupidiselt
        Map<String,String> map = new HashMap<>();

        for (String line : alphabetLines) {
            String[] lineParts = line.split(", ");
            map.put(lineParts[1], lineParts[0]);
        }
        return map;
    }
}

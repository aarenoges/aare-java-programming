package javaonline.cryptoapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Encryptor extends Cryptor{ // peale seda, kui extends Cryptor, ütleb et default konstr-it ei ole, tuleb luua
    public Encryptor(List<String> alphabetLines) {
        super(alphabetLines);
    }
    @Override // override-ime createConversionMap-i meetodi
    protected Map<String, String> createConversionMap(List<String> alphabetLines) {
        // ["A, Ü", ...] "A" --> "Ü", ...
        Map<String, String> map = new HashMap<>();
        for (String line : alphabetLines) {
            //      System.out.println(line);
            String[] lineParts = line.split(", ");
            map.put(lineParts[0], lineParts[1]);
        }
        return map;
    }

}

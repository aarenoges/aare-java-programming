package javaonline.cryptoapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Cryptor {  // abstract-i lisasime hiljem, vt. allpool
    private  Map<String, String> conversionMap; // eesmärk on tekitada stringide listist Map tüüpi võtmetega objekt

    public Cryptor(List<String> alphabetLines) { // see on konstruktor
        this.conversionMap = createConversionMap(alphabetLines);
    }

//    protected Map<String, String> createConversionMap(List<String> alphabetLines) {
//        return null;
//        // ["A, Ü", ...] "A" --> "Ü", ...
//        Map<String, String> map = new HashMap<>();
//        for (String line : alphabetLines) {
//            //      System.out.println(line);
//            String[] lineParts = line.split(", ");
//            map.put(lineParts[0], lineParts[1]);
//        }
//        return map;
//   }
      // peale seda, kui olime selle meetodi nii Decryptoris kui ka Encryptoris override-nud, võime selle // või
      // kustutada ja lisada return null
      // nüüd on tekkinud olukord, kus ma ei taha Cryptor klassis luua mitte ühtegi objekti, kasutan teda baasklassina
      // tuletatud klasside defineerimiseks, soovituslik on ta nimetada abstract-klassiks

    // üks mugandus on veel:
    // protected Map<String, String> createConversionMap(List<String> alphabetLines) {
    //        return null;
    // asemel, kuna Cryptor klassi extenditakse ja neil on kohustus see f-n override-da, võime jõuga öelda sellele f-le
    // et ta on abstraktne:
    protected abstract Map<String, String> createConversionMap(List<String> alphabetLines);


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

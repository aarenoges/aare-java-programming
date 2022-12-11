package javaonline.basics;

public class TextProcessing2 {
    public static void main(String[] args) {
        String text1 = "Elon Musk";
        String text2 = "Elon";
        String text3 = "Musk";
        String text4 = text2 + " " + text3;
        System.out.println(text1.equals(text4)); // tulemuseks on true
        System.out.println(text1 == text4); // tulemuseks on false; stringe tuleb võrrelda equals meetodiga

        // Tekstist numbri tegemine
        String myNumberText = "4";
        int myNumberInt = Integer.parseInt(myNumberText); // Integer.parseInt muudab string 4 täisarv 4-ks
        System.out.println(myNumberInt == 4); // tulemuseks on true

        double myNumberDouble = Double.parseDouble(myNumberText); // Double.parseDouble kümnendarv 4.0-ks
        System.out.println(myNumberDouble == 4.0);

        // Primitiivist numbrist teksti tegemine
        double myDouble2 = 4.5;
        String myDouble2Str1 = String.valueOf(myDouble2); // V1: konverteerib primit.muutuja tekstiks
        String myDouble2Str2 = ((Double)4.5).toString(); // V2: konverteerib primit.muutuja tekstiks
        System.out.println(myDouble2Str1);
        System.out.println(myDouble2Str2);

        // Veel olulisi meetodeid
        String text5 = "Aias sadas saia.";
        System.out.println(text5.length()); // kui pikk on string?
        System.out.println(text5.startsWith("Aias")); // kas tekst algab ...?
        System.out.println(text5.endsWith("saia.")); // kas tekst lõpeb ....?
        char[] text5Chars = text5.toCharArray(); // tagastab massiivi primit. char tüüpi muutujatest

        int textSadasPosition = text5.indexOf("sadas"); // otsib üles alamteksti mitmendast positsioonist algab
        System.out.println(textSadasPosition);

        System.out.println("Tere ".repeat(5)); // paljundab Tere 5x


    }
}

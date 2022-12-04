package javaonline.basics;

public class TextProcessing {

    public static void main(String[] args) {

        String myText = "Isa ütles: \"Tule siia!\"";
        System.out.println(myText);
        String locationOfMySecretFile = "C:\\secret\\file.txt";
        System.out.println(locationOfMySecretFile);

        String someText = "See on esimene rida \n" +
                "See on teine rida";
        System.out.println(someText);
        String lyrics = "Põhjamaa,\n\t" +
                "tuulte,\t\n" +
                "range,\n\t" +
                "virmaliste.";
        System.out.println(lyrics);
    }
}

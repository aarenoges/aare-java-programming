package javaonline.basics;

public class TextProcessing2 {
    public static void main(String[] args) {
        String text1 = "Elon Musk";
        String text2 = "Elon";
        String text3 = "Musk";
        String text4 = text2 + " " + text3;
        System.out.println(text1.equals(text4));
        System.out.println(text1 == text4);

        // Tekstist numbri tegemine
        String myNumberText = "4";
        int myNumberInt = Integer.parseInt(myNumberText);
        System.out.println(myNumberInt == 4);

        double myNumberDouble = Double.parseDouble(myNumberText);
        System.out.println(myNumberDouble == 4.0);

        // Primitiivist numbrist teksti tegemine
        double myDouble2 = 4.5;
        String myDouble2Str1 = String.valueOf(myDouble2);
        String myDouble2Str2 = ((Double)4.5).toString();
        System.out.println(myDouble2Str1);
        System.out.println(myDouble2Str2);

        // Veel olulisi meetodeid
        String text5 = "Aias sadas saia.";
        System.out.println(text5.length());
        System.out.println(text5.startsWith("Aias"));
        System.out.println(text5.endsWith("saia."));
        char[] text5Chars = text5.toCharArray();

        int textSadasPosition = text5.indexOf("sadas");
        System.out.println(textSadasPosition);

        System.out.println("Tere ".repeat(5));


    }
}

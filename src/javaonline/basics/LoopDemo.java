package javaonline.basics;

public class LoopDemo {
    public static void main(String[] args) {

        int[] numbers = {2, 5, 76, 89, 99, 1}; // olgu meil täisarvude massiiv 5 liikmega
        int sum = 0;

        // while tsükkel
        int a = 0; // defineerime abimuutuja a; a ütleb, mitu korda olen tsüklit juba läbi käinud
        while (a < numbers.length) {
            sum = sum + numbers[a];
            a++; // pean kindlasti a-d suurendama, muidu jääb tsükkel tööle igavesti
        }
        System.out.println(sum);

        // do..while tsükkel (enne tee, siis mõtle tsükkel)
        int b = 0; // defineerime uue muutuja
        sum = 0; // resetime summa taas nulliks; see muutuja on meil eespool juba defineeritud
        do {
            sum = sum + numbers[b];
            b++;
        } while (b < numbers.length);
        System.out.println(sum);

        // for tsükkel
        sum = 0; // resetime summa taas nulliks; see muutuja on meil eespool juba defineeritud
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; // juhtmuutuja i on näha ainult tsükli sees, väljaspool mitte
        }
        System.out.println(sum);

        // for(-each) tsükkel
        sum = 0;  // resetime summa taas nulliks; see muutuja on meil eespool juba defineeritud
        for (int number : numbers) {   // NB! päise vahel on 2 sektsiooni ja nende vahel on koolon :
            sum = sum + number;  //paremale poole koolonit tuleb panna see massiiv, mida tahame läbi lapata
        }                       // ja vasakule poole tuleb panna abimuutuja, näit int number
        System.out.println(sum);

        // break
        sum = 0;  // resetime summa taas nulliks; see muutuja on meil eespool juba defineeritud
        for (int number : numbers) {
            if (number > 10) {
                System.out.println("Viga");
                break; // lõpeta koheselt tsükli töö
            }
            sum = sum + number;
        }
        System.out.println(sum);

        // continue
        sum = 0;
        for (int number : numbers) {
            if (number > 10) {
                System.out.println("Pehme viga");
                continue; // jätka tsüklit järgmisest elemendist
            }
            sum = sum + number;
        }
        System.out.println(sum);

        // ülesanne
        int[] arr = {7, 8, 9, 10, 11};
        int r = 0;
        for (int i : arr) {
            r+=i;
        }
        System.out.println(r);
    }
}

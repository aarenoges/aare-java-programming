package javaonline.basics;

public class LoopDemo {
    public static void main(String[] args) {

        int[] numbers = {2, 5, 76, 89, 99, 1};
        int sum = 0;

        // while
        int a = 0;
        while (a < numbers.length) {
            sum = sum + numbers[a];
            a++;
        }
        System.out.println(sum);

        // do..while
        int b = 0;
        sum = 0;
        do {
            sum = sum + numbers[b];
            b++;
        } while (b < numbers.length);
        System.out.println(sum);

        // for
        sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

        // for(each)
        sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);

        // break
        sum = 0;
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

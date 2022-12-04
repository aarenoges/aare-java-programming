package javaonline.basics;

public class DataTypeExercises1 {

    public static void main(String[] args) {

        // Harjutused
        byte myByte1 = 100;
        byte myByte2 = 2;
        byte myByte3 = 50;
        int myNumber1 = 10000;
        int myNumber2 = 30;
        double myDouble1 = 1.234;
        float myFloat1 = (float)myDouble1 + 2.91F + myNumber2;

        System.out.println(myByte1 + myByte2);
        System.out.println(myByte1 + myByte3);
        System.out.println(myNumber1 + myByte2);
        System.out.println(myDouble1 - myFloat1);

    }
}

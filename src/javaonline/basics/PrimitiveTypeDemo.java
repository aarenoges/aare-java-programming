package javaonline.basics;

public class PrimitiveTypeDemo {

    public static void main(String[] args) {

        //byte
        byte myByte1 = 12 + 13;
        System.out.println(myByte1);
        byte myByte2 = (byte)200;
        System.out.println(myByte2);
        int myInt1 = 10;
        byte myByte3 = (byte)myInt1;
        System.out.println(myByte3);

        // short
        short myShort1 = 20000;
        System.out.println(myShort1);

        // int
        int myLargeInteger = 1_000_000;
        System.out.println(myLargeInteger);

        // long
        long myExtremelyLargeNumber = 10_000_000_000_000_000L;

        // double
        double myPiValue = 3.14159;
        double particleCountInUniverse = 1000000000000000000000000000000000000000000000000000000D;

        // float
        float myAnotherPiValue = 3.14159F;

        // char
        char myChar1 = 'b';
        System.out.println((short)myChar1);
        System.out.println((char) 99);
        System.out.println((short)'1');

        // boolean
        boolean isValid = false;
        System.out.println(isValid);

        // Test
        byte a = 111;
        byte b = 1;
        byte c = (byte)(a + b);
        System.out.println(c);

        boolean test = (true && false || true) && 5<6;
        System.out.println(test);

        int t = 5 % 2;
        System.out.println(t);

        int s = 5;
        int k = ++s;
        System.out.println(k);

        double u = 4.5;
        double m = 9.0;
        m /= u;
        System.out.println(m);
    }
}

package javaonline.basics;

public class ExpressionsDemo {

    public static void main(String[] args) {

        // Liitmine, lahutamine
        int a = 5;
        int b = 6;
        int c = 5 + a -b;
        System.out.println(c);

        // ++, --
        int d = 19;
        d++; // 20
        System.out.println(d);
        int e = ++d; // e = ?
        System.out.println(e);
        System.out.println(d);
        int f = d--; // 21
        System.out.println(f);
        System.out.println(d);
        int g = d++ - 4;
        System.out.println(g);
        System.out.println(d);

        d = d + 1; // d++;
        d = d - 1; // d--;
        System.out.println(d);

        // d = d + 5;
        d += 5;
        System.out.println(d);

        d *= 10; // d = d * 10;
        System.out.println(d);

        d /= 10;
        System.out.println(d);

        int i = 97;
        i = i % 10;
        System.out.println(i);

        // Tingimuslikud avaldised ja operaatorid
        int myNum1 = 5;
        int myNum2 = 5;
        int myNum3 = 6;;

        System.out.println(myNum1 == myNum2);
        boolean areEqual = myNum1 == myNum2;
        System.out.println(areEqual);
        boolean areNotEqual = myNum1 != myNum3;
        System.out.println(areNotEqual);
        boolean isGreater = myNum1 > myNum3;
        System.out.println(isGreater);

        // Loogilised avaldised &&: Logical AND ehk loogiline korrutamine
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println(false && false);
        // ! Logical NOT ehk loogilise avaldise ümberpööramine
        System.out.println(true && !false); // true && true
        int l = 5;
        int k = 6;
        boolean r = l++ == k;
        System.out.println(r);
        int u = 9;
        int v = u/2;
        System.out.println(v);
    }
}

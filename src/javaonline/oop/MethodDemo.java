package javaonline.oop;

public class MethodDemo {
    public static void main(String[] args) {
        int number1 = 20;
        int tripleNumber1 = tripleNumber(number1);
        System.out.println(tripleNumber1);
        int trpleNumber2 = tripleNumber(10);
        System.out.println(trpleNumber2);

        String personalCode = "61107121760";
        System.out.println("Isikukood; " + personalCode);
        System.out.println("Isikukoodi omaniku sugu: " + deriveGender(personalCode));
        System.out.println("Iskukoodi omaniku sünniaasta: " + deriveBirthYear(personalCode));
    }

    private static int tripleNumber(int number) {  // funktsiooni nimi võiks olla käskivas kõneviisis
        int result = 3 * number;
        return result;
    }
    private static String deriveGender(String personalCode) { // "49403136526"
        String firstDigitString = String.valueOf(personalCode.charAt(0)); // saame nr kujul 4, muudame stringiks"4"
        int firstDigit = Integer.parseInt(firstDigitString); // muudame numbriks 4
        if (firstDigit % 2 == 0) {
            return "F";
        } else  {
            return "M";
        }
    }

    private  static int deriveBirthYear(String personalCode) { // "49403136526" --> 1994
        String firstDigitString = String.valueOf(personalCode.charAt(0)); // "4"
        String birthYearDigitsString = personalCode.substring(1, 3); // "94" ;(1, 3) tähendab alates 1-st kuni 3(mitte)
        int birthYearDigits = Integer.parseInt(birthYearDigitsString); // "94" --> 94

        switch (firstDigitString) {
            case "1":
            case "2":
                return 1800 + birthYearDigits;
            case "3":
            case "4":
                return 1900 + birthYearDigits;
            case "5":
            case "6":
                return 2000 + birthYearDigits;
            case "7":
            case "8":
                return 2100 + birthYearDigits;
            default:
                return -1;
        }
    }
}

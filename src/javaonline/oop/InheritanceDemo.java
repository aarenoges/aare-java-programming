package javaonline.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class InheritanceDemo {
    public static void main(String[] args) {

        Republic estonia = new Republic(); // defineerime ära nüüd riigid
        estonia.primeMinister("Jüri Ratas");
        estonia.setArea(45227);
        estonia.setName("Eesti Vabariik");

        Federation usa = new Federation();  // defineerime ära nüüd riigid
        usa.setPresident("Donald Trump");
        usa.setArea(9525067);
        usa.setName("Ameerika Ühendriigid");

        Kingdom spain = new Kingdom();  // defineerime ära nüüd riigid
        spain.setMonarch("Felipe VI");
        spain.setArea(505992);
        spain.setName("Hispaania Kunungriik");

        List<Country> countries = new ArrayList<>();
        countries.add(estonia);
        countries.add(usa);
        countries.add(spain);

        System.out.println(countries);

    }

    public static class Republic extends Country {
        private String primeMinister;


//        public Republic(String name, int area) {
//            super(name, area);
//        }
    }

        public String getPrimeMinister() {
            return primeMinister;
        }

        public void setPrimeMinister(String primeMinister) {
            this.primeMinister = primeMinister;
        }

        @Override
        public String toString() {
            return "Republic[" + primeMinister + ", " + this.getName() + ", " + this.getArea() + "]";
        }
    }

    public static class Kingdom extends Country {
        private String monarch;

//        public Kingdom(String name, int area) {
//            super(name, area);
//        }

        public String getMonarch() {
            return monarch;
        }

        public void setMonarch(String monarch) {
            this.monarch = monarch;
        }
        @Override
        public String toString() {
            return "Republic[" + monarch + ", " + this.getName() + ", " + this.getArea() + "]";
        }
    }

    public static class Federation extends Country { // kuna Federation pärineb Country klassist, kus me lõime
        private String president;   // konstruktori, peame ka siin looma konstruktori!

//        public Federation(String president, String name, int area) { //see on konstruktor,mis kutsub käsuga super
//            super(name, area);  // välja baasklassi konstruktori, ta on samade sisendparameetritega name ja area
//            this president = president; // võime ise edasi tuunida, lisada presidendi: String president + this pr = pr
//        }

        public String getPresident() {
            return president;
        }

        public void setPresident(String president) {
            this.president = president;
        }
        @Override
        public String toString() {
            return "Republic[" + president + ", " + this.getName() + ", " + this.getArea() + "]";
        }
    }
    public static class Country extends Territory {
        private String name; // igal Countril on ka nimi, lisame nime

//        public Country(String name, int area) { // siin tegime vaikimisi konstruktori asemel uue konstruktori
//          this.name = name; // Alt + Insert abil, lisasime parameetri int area setter meetodiga,
//          this.setArea(area);  // kuna area on defineeritud private muutujana Territory klassist
//          this.area = area;
//        }                    // nüüd peame klassides, kes pärinevad Country klassist, looma ka konstruktorid!

        public String getName() {  // tekitasime klassile Country Getterid ja Setterid
            return name;
        }

        public void setName(String name) {  // tekitasime klassile Country Getterid ja Setterid
            this.name = name;
        }
    }
    public static class Territory {
    // static tähendab siin midagi sellist, et pöördumiseks Territory poole, pean ma eelevalt p-ma InheritanceDemo poole
        // ehk javaonline.oop.InheritanceDemo.Territory
        protected int area; // muudame private --> protected-iks

        public int getArea() { // tekitasime Getterid ja Setterid
            return area;
        }

        public void setArea(int area) {
            this.area = area;
        }
    }
}

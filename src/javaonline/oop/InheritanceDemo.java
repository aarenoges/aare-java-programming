package javaonline.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class InheritanceDemo {  // 1. Loome klassi InheritanceDemo
    public static void main(String[] args) {  // 2. Defineerime main-funktsiooni

        Republic estonia = new Republic(); // 18. defineerime ära nüüd riigid: estonia  // 30. eesti puhul on kõik ok
        estonia.setPrimeMinister("Jüri Ratas");
        estonia.setArea(45227);
        estonia.setName("Eesti Vabariik");

        Federation usa = new Federation();  // 19. defineerime ära nüüd riigid: usa // 31. siin peame andma parameetrid
        usa.setPresident("Donald Trump");
        usa.setArea(9525067);
        usa.setName("Ameerika Ühendriigid");

        Kingdom spain = new Kingdom();  // 20. def-me ära nüüd riigid: spain // 32. samuti ka siin, kuna tekit.constr-id
        spain.setMonarch("Felipe VI");
        spain.setArea(505992);
        spain.setName("Hispaania Kunungriik");

        List<Country> countries = new ArrayList<>(); // 21. tahan tekitada listi riikidest
        countries.add(estonia);
        countries.add(usa);
        countries.add(spain);

        System.out.println(countries);

    }

        public static class Republic extends Country { // 9. def. riigitüübi jaoks uue klassi Republik, pärineb Country-st
            private String primeMinister; // 12. vabariiki juhib peaminister



//        public Republic() { // 30. kutsume välja konstruktori, oletame, et eesti puhul soovime kasutada
//            super(name null, area 0); // parameetriteta konstruktorit, kustutame parameetrid, Country klassil ei ole
//        }  // parameetriteta konstr, aga tahame et Republic-ul oleks -> peame Country konstr-i välja kutsuma ja
            // andma null-parameetrid


        public String getPrimeMinister () { // 13. tekitame getterid ja setterid
            return primeMinister;
        }

        public void setPrimeMinister (String primeMinister){ // 13. tekitame getterid ja setterid
            this.primeMinister = primeMinister;
        }

        @Override // 22. kirjutame baasklassi Object.java meetodi üle, soovitavalt näidata annotatsiooni @Override
        public String toString () {
            return "Republic[" + primeMinister + ", " + this.getName() + ", " + this.getArea() + "]";
        }
    }


        public static class Kingdom extends Country { // 10. def. riigitüübi jaoks uue klassi Kingdom, pärineb Country-st
            private String monarch; // 14. Kuningriiki juhib kroonitud pea

//        public Kingdom(String monargh, String name, int area) { // 29. tekitame kondtruktori
//            super(name, area);
//            this.monarch = monarch;
//        }

            public String getMonarch() {
                return monarch;
            } // 15. tekitame getterid ja setterid

            public void setMonarch(String monarch) {
                this.monarch = monarch;
            } // 15. tekitame getterid ja setterid

            @Override // 23. kirjutame baasklassi Object.java meetodi üle, soovitavalt näidata annotatsiooni @Override
            public String toString() {
                return "Republic[" + monarch + ", " + this.getName() + ", " + this.getArea() + "]";
            }
        }

        public static class Federation extends Country { //11. def. riigitüübi jaoks klassi Federation, pärineb Country-st
            // kuna Federation pärineb Country klassist, kus me lõime
            private String president; // 16. föderaalriiki juhib president
            // konstruktori, peame ka siin looma konstruktori!

//        public Federation(String president, String name, int area) { //28. see on konstruktor,mis kutsub käsuga super
//            super(name, area);  // välja baasklassi konstruktori, ta on samade sisendparameetritega name ja area
//            this president = president; // võime ise edasi tuunida, lisada presidendi: String president + this pr = pr
//        }

            public String getPresident() {
                return president;
            } // 17. tekitame getterid ja setterid

            public void setPresident(String president) {
                this.president = president;
            } // 17. tekitame getterid ja setterid

            @Override // 24. kirjutame baasklassi Object.java meetodi üle, soovitavalt näidata annotatsiooni @Override
            public String toString() {
                return "Republic[" + president + ", " + this.getName() + ", " + this.getArea() + "]";
            }
            // 25. kui ma tahan kasutada ka baasklassi meetodit ilma ülekirjutamata, siis -> super.toString
        }
        public static class Country extends Territory { // 6. Defineerime klassi Country; ehkki varasemast on meil
            // olemas klass Country, siis see meid ei sega, sest me definnerime selle klassi teise klassi sees
            // 7. Igat riiki iseloomustab territoorium, kasutame pärinemist Territory-st extends võtmesõnaga
            private String name; // 8. igal Country-l on ka nimi, lisame nime; tekitame getterid ja setterid

//        public Country(String name, int area) { // 25. siin tegime vaikimisi konstruktori asemel uue konstruktori
//          this.name = name; // Alt + Insert abil, lisasime parameetri int area,
//          this.setArea(area);  // kuna area on defineeritud private muutujana Territory klassist, this.setArea(area)
//          this.area = area; // 27. kuna muutsime private --> protected-iks, saame ellmise rea asemel lihtsamalt
//        }                    // nüüd peame klassides, kes pärinevad Country klassist, looma ka konstruktorid!

            public String getName() {  // tekitasime klassile Country Getterid ja Setterid
                return name;
            }

            public void setName(String name) {  // tekitasime klassile Country Getterid ja Setterid
                this.name = name;
            }
        }
        public static class Territory { // 3. defineerime klassi Territory; ühe klassi sisse võib defineerida teisi klasse
            // static tähendab siin midagi sellist, et pöördumiseks Territory poole, pean ma eelevalt p-ma InheritanceDemo poole
            // ehk javaonline.oop.InheritanceDemo.Territory
            protected int area; // 4. klassil Territory on üks privaatne muutuja: area;
                    // 26. muudame private --> protected-iks, siis ei pea kasutama konstruktori juures setterit

            // 5. tekitame getterid ja setterid:

            public int getArea() { // tekitasime Getterid ja Setterid
                return area;
            }

            public void setArea(int area) {
                this.area = area;
            }
        }

    }







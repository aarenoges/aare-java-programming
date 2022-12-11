package javaonline.oop;

public class Country {
    private String name; // algselt oli objekti muutuja public, muudame private-ks; s.o. kapseldamine: vähem on rohkem
    private double gdp; // algselt oli objekti muutuja public, muudame private-ks; s.o. kapseldamine: vähem on rohkem
    private int population; // algselt oli objekti muutuja public, muudame private-ks; kapseldamine: vähem on rohkem

    public Country(String name, double gdp, int population) { // siin tekitame uue konstruktori
        this.name = name; // siin me anname objektiülesele muutujale name lokaalse muutuja name sees oleva väärtuse
        this.gdp = gdp; // sama gdp-ga
        this.population = population; // sama populationiga
    }

    public Country() {  // see konstruktor oli olemas vaikimisi, seda pole näha,selle tekitab Java kompilaator
        // kompileerimisel, samas kui me tekitame ise konstruktori, siis see vaikimisi konstruktor ei rakendu
        // ja kui me soovime, et see konstruktor ka rakenduks, peame ta manuaalselt kirjutama kl.komb. (Alt+Insert)
        // või paremklikk, valime Generate ja Constructor, nüüd on meil 2 konstruktorit
    }

    // getterite ja setterite loomiseks paremklikk, siis Generate, siis Getter and Setter
    // hoian all Ctrl klahvi ja selekteerin ära kõik klassi muutujad, vajutan OK ja intelliJ teeb selle ise ära
    public String getName() {
        String sizeCategory = this.population >= 10_000_000 ? "SUUR RIIK" : "VÄIKE RIIK";
        return this.name + " (" + sizeCategory + ")"; // võimalus valideerida, mida ma väljastan
    }

    public void setName(String name) {
        if (name != null && name.length() > 2) { // mul on Setter meetodi puhul võimalus valideerida sisendit
            this.name = name;
        }
    }

    public double getGdp() {
        return this.gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGdpPerCapita() {
       return this.gdp / this.population * 1_000_000;
    }

//  kui me otsustame objektimuutujalt minna üle klassimuutujale, lisame static,staatiline f-n ei tea ojekti
//   public static double getGdpPerCapita(Country country) { // kontekstist midagi, anname obj sisendparam-ina kaasa
//       return country.gdp / country.population * 1_000_000; // this asemel country
//    }

//      See siin on objektimuutuja:
//     public double getGdpPerCapita() {
//        return this.gdp / this.population * 1_000_000;
//        }
    }


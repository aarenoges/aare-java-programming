package javaonline.oop;

import javaonline.oop.Country;

public class OopBasics {
    public static void main(String[] args) {
        /*
             NIMI        SKP (MUSD)     RAHVAARV
             Austraalia  1376255        25725000
             Eesti       31038          1328976
             Saksamaa    3863344        83149300
         */

        Country australia = new Country("Austraalia", 1376255, 25725000);
//        australia.name = "Australia";
//        australia.gdp = 1376255;
//        australia.population = 25725000;

        Country estonia = new Country();
        estonia.setName("Eesti"); // name = "Eesti" --> setName("Eesti"), kuna public --> private, Setter
        estonia.setGdp(31038); // gdp = 31038 --> setGdp(31038), kuna public --> private, Setter
        estonia.setPopulation(1328976); // population = 1328976 --> setPopulation(1328976), kuna public -> private,Setter

        Country germany = new Country();
        germany.setName("Saksamaa"); // analoogne eelmise, Eesti näitega
        germany.setGdp(3863344); // analoogne eelmise, Eesti näitega
        germany.setPopulation(83149300); // analoogne eelmise, Eesti näitega

        System.out.println("Riik: " + australia.getName()); // name --> getName(),kuna public --> private, Getter
        System.out.println("SKP: " + australia.getGdp()); // gdp --> getGdp(), kuna public --> private, Getter
        System.out.println("SKP inimese kohta: " + australia.getGdpPerCapita());

        System.out.println("---");

        System.out.println("Riik: " + estonia.getName()); // name --> getName(),kuna public --> private, Getter
        System.out.println("SKP: " + estonia.getGdp()); // gdp --> getGdp(), kuna public --> private, Getter
        System.out.println("SKP inimese kohta: " + estonia.getGdpPerCapita());

        System.out.println("---");

        System.out.println("Riik: " + germany.getName()); // name --> getName(),kuna public --> private, Getter
        System.out.println("SKP: " + germany.getGdp()); // gdp --> getGdp(), kuna public --> private, Getter
        System.out.println("SKP inimese kohta: " + germany.getGdpPerCapita());
    }
}

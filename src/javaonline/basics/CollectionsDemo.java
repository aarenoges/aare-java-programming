package javaonline.basics;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        // List
        List<String> names = new ArrayList<>();
        names.add("Kati");  // add meetodiga lisatakse listi väärtuseid
        names.add("Mati");
        names.add("Kristo");
        System.out.println(names); // Listi on parem välja printida kui massiivi, saame [Kati, Mati, Kristo]
        names.remove("Kristo"); // eemaldan listist Kristo
        System.out.println(names); // [Kati, Mati]
        names.set(1, "Mari");  // Mati asemele tahaks väärtust Mari, set on meetod, mis tahab 2 parameetrit
        System.out.println(names);

        // Set
        Set<String> namesSet = new HashSet<>();
        namesSet.add("Kati");  // add meetodiga lisatakse Set-ti väärtuseid
        namesSet.add("Mati");
        namesSet.add("Malle");
        System.out.println(namesSet); // järjekord võib Set-is muutuda: [Kati, Malle, Mati]

        for (String name : namesSet) {
            System.out.println(name);
        }
        namesSet.add("Malle");  // uue Malle lisamine ei muuda midagi, Set-is on elemendid unikaalsed
        System.out.println(namesSet);

        // Map , see on võti ja võtmele vastav väärtus
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Estonia", "Tallinn");  // NB! mitte add vaid put meetodiga lisatakse Map-pi väärtuseid
        capitals.put("Finland", "Helsinki");
        capitals.put("Sweden", "Stokholm");
        System.out.println(capitals);  // järjekord võib muutuda: {Sweden=Stokholm, Finland=Helsinki, Eston..}
        for (String countryName : capitals.keySet()) {
            System.out.println(countryName + " - " + capitals.get(countryName));
        }
    }
}

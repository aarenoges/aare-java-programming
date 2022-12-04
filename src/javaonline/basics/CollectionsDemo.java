package javaonline.basics;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        // List
        List<String> names = new ArrayList<>();
        names.add("Kati");
        names.add("Mati");
        names.add("Kristo");
        System.out.println(names);
        names.remove("Kristo");
        System.out.println(names);
        names.set(1, "Mari");
        System.out.println(names);

        // Set
        Set<String> namesSet = new HashSet<>();
        namesSet.add("Kati");
        namesSet.add("Mati");
        namesSet.add("Malle");
        System.out.println(namesSet);

        for (String name : namesSet) {
            System.out.println(name);
        }
        namesSet.add("Malle");  // uue Malle lisamine ei muuda midagi, Set-is on elemendid unikaalsed
        System.out.println(namesSet);

        // Map
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Estonia", "Tallinn");
        capitals.put("Finland", "Helsinki");
        capitals.put("Sweden", "Stokholm");
        System.out.println(capitals);
        for (String countryName : capitals.keySet()) {
            System.out.println(countryName + " - " + capitals.get(countryName));
        }
    }
}

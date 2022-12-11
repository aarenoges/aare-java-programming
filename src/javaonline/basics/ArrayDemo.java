package javaonline.basics;

public class ArrayDemo {
    public static void main(String[] args) {
        String[][] seasons = {
                {"Kevad", "Roheline"},
                {"Suvi", "Roheline"},
                {"Sügis", "Pruun"},
                {"Talv", "Valge"}
        };
        seasons[1][1] = "Kollane"; // tahan massiivi sees olevat väärtust muuta, et Suvi -> Kollane
        System.out.println(seasons[1][1]); // Kollane
    }
}

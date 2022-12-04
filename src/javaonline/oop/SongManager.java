package javaonline.oop;

public class SongManager {
    public static void main(String[] args) {
        String[] genresSong1 = {"Rock", "Pop"};
        Song song1 = new Song(
                "Tere Perestroika",
                "https://www.youtube.com/watch?v=5hkNVXVlBfw",
                "J.M.K.E", "Külmale maale", 1989, genresSong1,
                "Pilvitu on taevas meri sinine\n" +
                        "Täiel rinnal hingab nüüd iga inime\n" +
                        "Sirp ja vasar enam kedagi ei löö\n" +
                        "Tähendavad meile nüüd nad rõõmsat tööd\n" +
                        "Tere perestroika demokraatia\n" +
                        "Diktatuuri küüsist on pääsemas üks maa\n" +
                        "Tere perestroika tere õnne tipp\n" +
                        "Enam nii jube ei tundu punalipp\n" +
                        "Traktor künnab põldu vilja kannab puu\n" +
                        "\"Rahva Hääl\" ei valeta ei suitse ta suu\n" +
                        "Keelatud filmid kõik kinos jooksvad nüüd\n" +
                        "Kõlab ka keelatud bändide hüüd\n" +
                        "Tere perestroika demokraatia\n" +
                        "Diktatuuri küüsist on mõnus pääseda\n" +
                        "Tere perestroika tere vabadus\n" +
                        "Pioneerilaulud nüüd kõigil on suus\n" +
                        "Auuu auuu\n" +
                        "Nüüd miilitsamunder ei aja öökima\n" +
                        "Hõbedaseks nimetada teda lausa saab\n" +
                        "Miilits ja punkar sõbralikult näe\n" +
                        "Ulatavad teineteisele nüüd käe\n" +
                        "Tere perestroika taaderiideraa\n" +
                        "Sinule ja minule kuulub nüüd maa\n" +
                        "On igal aastal juubel - Suur Viinakuu\n" +
                        "Juubeldab rahvas juhhei auuu\n" +
                        "Auuu auuu\n" +
                        "Virumaal kuivaks ei jää ükski kaev\n" +
                        "Mausoleumi ees maandub õhulaev\n" +
                        "Ei no mis sa kostad demokraatia on nii suur\n" +
                        "Et seda imetledes lahti jääbki suu\n" +
                        "Tere perestroika rõõmus kodumaa\n" +
                        "Ütlen sulle tere niikaua kui sind saan\n" +
                        "Tere perestroika demokraatia\n" +
                        "Tere perestroika anna käppa ka");

        System.out.println("Laul 1:");
        System.out.println(song1);

        Song song2 = new Song(
                "Massikommunikatsioon",
                "https://www.youtube.com/watch?v=bLEu00yuL0k",
                "Singer Vinger",
                "Reanimatsioon",
                1995, new String[]{"Punk", "Pop"},
                "Õhtustest lehtedest teada ma saan\n" +
                "seda, kes surma on saand\n" +
                "Tooliga teleri ette end aan\n" +
                "värvides veikleb ekraan\n" +
                "R:\n" +
                "Mõnus massikommunikatsioon,\n" +
                "lala laa laa laa,\n" +
                "lala lal lal lal lal laa\n" +
                "Kallis kauge informatsioon\n" +
                "...niisiis\n" +
                "Hiinas on uputus, Taanis on tuul\n" +
                "meitel on naer ikka suul\n" +
                "{Uurivad ruumi ja kaapavad kuu}\n" +
                "ikka on midagi uut\n" +
                "Raukadel raadio ja noortel on hääl\n" +
                "kokku on kõik 'Rahva Hääl'\n" +
                "Kõiksugu uudiseid maakera pääl\n" +
                "pajatab diktori hääl\n" +
                "Informatsioonita olla ei saa\n" +
                "vajan kui õhku ma\n" +
                "Ilmaprognoosita ilma ei tea\n" +
                "kui pole halb, siis on hea");

        System.out.println("---");

        System.out.println("Laul 2:");
        System.out.println(song2);
    }
}

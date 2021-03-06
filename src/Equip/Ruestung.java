package Equip;

import java.util.ArrayList;

public class Ruestung extends Equip {

    public Ruestung(
            final int ap,
            final int vp,
            final int hp,
            final int mp,
            final int kraft,
            final boolean fk,
            final boolean fire,
            final boolean earth,
            final boolean ice,
            final boolean air,
            final int opfer,
            final String name) {
        super(ap, vp, hp, mp, kraft, fk, fire, earth, ice, air, opfer, name);
    }

    /* erzeuge einen array der klasse ruestung in dem alle ruestungen gespeichert sind*/
    public static ArrayList<Ruestung> erstelleRuestungen() {
        final ArrayList<Ruestung> list = new ArrayList<>();

        list.add(new Ruestung(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"));
        list.add(new Ruestung(0, 3, 5, 0, 2, false, false, false, false, false, 0, "Flickenpanzer"));
        list.add(new Ruestung(0, 5, 15, 0, 5, false, false, false, false, false, 1, "Lederrüstung"));
        list.add(new Ruestung(5, 25, 25, 0, 12, false, false, false, false, false, 1, "Dornenweste"));
        list.add(new Ruestung(10, 10, 10, 0, 8, false, false, false, false, false, 1, "Lederharnisch"));
        list.add(new Ruestung(10, 50, 30, 0, 35, false, false, false, false, false, 1, "Kettenhemd"));
        list.add(new Ruestung(10, 25, 25, 0, 20, false, false, false, false, false, 1, "Dunkle Rüstung"));
        list.add(new Ruestung(10, 32, 31, 0, 20, false, false, false, false, false, 2, "Kriegsausrüstung"));
        list.add(new Ruestung(0, 46, 39, 25, 34, false, false, false, false, false, 3, "Himmlischer Plattenpanzer"));
        list.add(new Ruestung(0, 60, 0, 15, 20, false, false, false, false, false, 3, "Zakaras Verschwindibusrobe"));
        list.add(new Ruestung(-10, 105, -30, 0, 75, false, false, false, false, false, 3, "Eiserne Jungfrau"));
        list.add(new Ruestung(0, 35, 50, 0, 35, false, false, true, false, false, 3, "Maulwurfsrüstung"));
        list.add(new Ruestung(0, 50, 90, 0, 65, false, false, false, false, false, 4, "Titanpanzer"));
        list.add(new Ruestung(50, 20, 0, 10, 20, false, false, false, false, false, 4, "Neptunsrobe"));
        list.add(new Ruestung(55, 95, -50, 0, 80, false, true, false, false, false, 4, "Lavarüstung"));
        list.add(new Ruestung(-5, 50, 30, 0, 25, false, false, false, true, false, 5, "Morgenreif-Harnisch"));
        list.add(new Ruestung(-190, 90, 230, 0, 115, false, false, false, false, false, 5, "Rüstung des Friedens"));
        list.add(new Ruestung(0, 5, 0, 30, 15, false, false, false, false, false, 5, "Einhornfell"));
        list.add(new Ruestung(0, 50, 50, 0, 20, false, false, true, false, false, 5, "Erdenmantel"));
        list.add(new Ruestung(0, 150, 150, 0, 150, false, false, false, false, false, 5, "Paladin-Rüstung"));
        list.add(new Ruestung(10, 98, 98, 0, 45, false, true, false, false, false, 5, "Heilige Rüstung des Drachentöters"));
        list.add(new Ruestung(0, 70, 100, 0, 95, false, false, true, false, false, 5, "Obsidianpanzer"));
        list.add(new Ruestung(0, 140, 200, 0, 186, false, false, false, false, true, 6, "Windmacht"));
        list.add(new Ruestung(10, 300, 225, 0, 100, false, false, false, false, false, 7, "Plattenpanzer"));
        list.add(new Ruestung(75, 315, 320, 0, 120, false, false, false, false, false, 8, "Gigas Rüstung"));
        list.add(new Ruestung(50, 150, 150, 5, 100, false, false, false, false, true, 8, "Gewitterrüstung"));
        list.add(new Ruestung(0, 200, -25, 0, 15, false, false, false, false, false, 9, "Tückische Ruestung"));
        list.add(new Ruestung(0, 1000, 0, 0, 300, false, false, true, false, false, 10, "Trutzrüstung"));
        list.add(new Ruestung(380, 600, 550, 0, 470, false, true, false, false, false, 10, "Silberner Prunkharnisch"));
        list.add(new Ruestung(200, 370, 410, 0, 320, false, false, true, false, false, 10, "Rostfreie Rüstung eines toten Helden"));
        list.add(new Ruestung(100, 200, 140, 0, 75, false, false, false, false, false, 10, "Geschenk des Himmels"));
        list.add(new Ruestung(-70, 800, 600, 0, 290, false, false, false, false, false, 10, "Furcht"));

        return list;
    }

}

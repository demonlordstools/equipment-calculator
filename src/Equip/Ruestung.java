package Equip;

import java.util.ArrayList;

/*
 * hält daten
 */
public class Ruestung extends Equip{

    public Ruestung (int ap, int vp, int hp, int mp, int kraft, boolean fk, boolean fire, boolean earth, boolean ice, boolean air, int opfer, String name)
    {
        super(ap, vp, hp, mp, kraft, fk, fire, earth, ice, air, opfer, name);

    }

    /* erzeuge einen array der klasse ruestung in dem alle ruestungen gespeichert sind*/
    public static ArrayList<Ruestung> erstelleRuestungen()
    {
        ArrayList<Ruestung> list = new ArrayList<Ruestung>();

        list.add( new Ruestung(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"));
        list.add( new Ruestung(0, 3, 5, 0, 2, false, false, false, false, false, 0, "Flickenpanzer"));
        list.add( new Ruestung(0, 5, 15, 0, 5, false, false, false, false, false, 1, "Lederruestung"));
        list.add( new Ruestung(5, 25, 25, 0, 12, false, false, false, false, false, 1, "Dornenweste"));
        list.add( new Ruestung(10, 10, 10, 0, 8, false, false, false, false, false, 1, "Lederharnisch"));
        list.add( new Ruestung(10, 50, 30, 0, 35, false, false, false, false, false, 1, "Kettenhemd"));
        list.add( new Ruestung(10, 25, 25, 0, 20, false, false, false, false, false, 1, "Dunkle Ruestung"));
        list.add( new Ruestung(15, 25, -3, 0, 35, false, false, false, false, false, 2, "Zwangsjacke"));
        list.add( new Ruestung(10, 32, 31, 0, 20, false, false, false, false, false, 2, "Kriegsausruestung"));
        list.add( new Ruestung(0, 46, 39, 25, 34, false, false, false, false, false, 3, "Himmlischer Plattenpanzer"));
        list.add( new Ruestung(0, 60, 0, 15, 20, false, false, false, false, false, 3, "Zakaras Verschwindibusrobe"));
        list.add( new Ruestung(-10, 105, -30, 0, 75, false, false, false, false, false, 3, "Eiserne Jungfrau"));
        list.add( new Ruestung(0, 35, 50, 0, 35, false, false, true, false, false, 3, "Maulwurfsruestung"));
        list.add( new Ruestung(0, 50, 90, 0, 65, false, false, false, false, false, 4, "Titanpanzer"));
        list.add( new Ruestung(-10, 25, 0, 25, 15, false, false, false, false, false, 4, "Heilige Mithrilrobe"));
        list.add( new Ruestung(50, 20, 0, 10, 20, false, false, false, false, false, 4, "Neptunsrobe"));
        list.add( new Ruestung(55, 95, -50, 0, 80, false, true, false, false, false, 4, "Lavaruestung"));
        list.add( new Ruestung(-5, 50, 30, 0, 25, false, false, false, true, false, 5, "Morgenreif-Harnisch"));
        list.add( new Ruestung(-190, 90, 230, 0, 115, false, false, false, false, false, 5, "Ruestung des Friedens"));
        list.add( new Ruestung(0, 5, 0, 30, 15, false, false, false, false, false, 5, "Einhornfell"));
        list.add( new Ruestung(0, 50, 50, 0, 20, false, false, true, false, false, 5, "Erdenmantel"));
        list.add( new Ruestung(0, 150, 150, 0, 150, false, false, false, false, false, 5, "Paladin-Ruestung"));
        list.add( new Ruestung(10, 98, 98, 0, 45, false, true, false, false, false, 5, "Heilige Ruestung des Drachentoeters"));
        list.add( new Ruestung(0, 70, 100, 0, 95, false, false, true, false, false, 5, "Obsidianpanzer"));
        list.add( new Ruestung(5, 120, 120, 0, 120, false, false, false, false, false, 6, "Diamantpanzer"));
        list.add( new Ruestung(-10, 195, 75, 0, 145, false, false, true, false, false, 6, "Zwergenruestung"));
        list.add( new Ruestung(0, 140, 200, 0, 186, false, false, false, false, true, 6, "Windmacht"));
        list.add( new Ruestung(20, 170, 200, 0, 200, false, false, false, false, false, 7, "Gigantenruestung"));
        list.add( new Ruestung(10, 300, 225, 0, 100, false, false, false, false, false, 7, "Plattenpanzer"));
        list.add( new Ruestung(10, 190, 35, 0, 95, false, false, true, false, false, 7, "Gajas Umarmung"));
        list.add( new Ruestung(75, 315, 320, 0, 120, false, false, false, false, false, 8, "Gigas Ruestung"));
        list.add( new Ruestung(10, 230, 210, 0, 270, false, true, false, false, false, 8, "Daemonenpanzer"));
        list.add( new Ruestung(50, 150, 150, 5, 100, false, false, false, false, true, 8, "Gewitterruestung"));
        list.add( new Ruestung(-30, 325, 250, 0, 238, false, false, false, true, false, 9, "Polarscholle"));
        list.add( new Ruestung(0, 200, -25, 0, 15, false, false, false, false, false, 9, "Tueckische Ruestung"));
        list.add( new Ruestung(0, 1000, 0, 0, 300, false, false, true, false, false, 10, "Trutzruestung"));
        list.add( new Ruestung(380, 600, 550, 0, 470, false, true, false, false, false, 10, "Silberner Prunkharnisch"));
        list.add( new Ruestung(200, 370, 410, 0, 320, false, false, true, false, false, 10, "Rostfreie Ruestung eines toten Helden"));
        list.add( new Ruestung(100, 200, 140, 0, 75, false, false, false, false, false, 10, "Geschenk des Himmels"));
        list.add( new Ruestung(-70, 800, 600, 0, 290, false, false, false, false, false, 10, "Furcht"));

        return list;
    }

}

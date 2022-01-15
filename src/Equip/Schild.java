package Equip;

import java.util.ArrayList;

public class Schild extends Equip {

    public Schild(
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

    /* erzeuge einen array der klasse Schild in dem alle schilder gespeichert sind*/
    public static ArrayList<Schild> erstelleSchilder() {
        final ArrayList<Schild> list = new ArrayList<Schild>();

        list.add(new Schild(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"));
        list.add(new Schild(0, 15, 5, 0, 5, false, false, false, false, false, 1, "Holzschild"));
        list.add(new Schild(0, 18, 23, 0, 14, false, false, false, false, false, 1, "Rundschild"));
        list.add(new Schild(25, -13, -15, 0, 20, false, false, false, false, false, 1, "Schild des Perseus"));
        list.add(new Schild(10, 35, 20, 0, 20, false, false, false, false, false, 1, "Dornenschild"));
        list.add(new Schild(15, 10, 9, 0, 13, false, false, false, true, false, 3, "Armschienen"));
        list.add(new Schild(0, 25, 40, 10, 20, false, false, false, true, false, 3, "Wappenschild"));
        list.add(new Schild(-10, 18, 11, 15, 9, false, false, false, true, false, 3, "Polarkristall"));
        list.add(new Schild(5, 34, 23, 45, 32, false, true, false, false, false, 3, "Brennender Schild"));
        list.add(new Schild(15, 20, 20, 0, 24, false, false, true, false, false, 3, "Stachelschild"));
        list.add(new Schild(10, 55, 55, 0, 33, false, false, false, false, false, 3, "Turmschild"));
        list.add(new Schild(0, 30, -10, 0, 25, false, false, false, false, true, 3, "Sturmschild"));
        list.add(new Schild(34, 23, 5, 0, 18, false, false, false, false, true, 4, "Tornadoschild"));
        list.add(new Schild(5, 60, 190, 0, 85, false, false, false, false, false, 5, "Drachenschild"));
        list.add(new Schild(15, 65, 75, 0, 48, false, false, false, false, true, 6, "Sturmblocker"));
        list.add(new Schild(0, 5, 5, 20, 10, false, false, false, false, true, 6, "Federschild"));
        list.add(new Schild(20, 98, 98, 0, 55, false, true, false, false, false, 6, "Heiliger Schild des Drachentöters"));
        list.add(new Schild(15, 70, 110, 0, 75, false, false, true, false, false, 7, "Knochenschild"));
        list.add(new Schild(50, 150, 0, 0, 15, false, false, false, false, false, 7, "Orkenschild"));
        list.add(new Schild(-180, 255, 120, 0, 120, false, false, false, false, false, 8, "Schild des Friedens"));
        list.add(new Schild(-135, 250, 230, 0, 140, false, false, false, true, false, 8, "Frostwurmschuppen"));
        list.add(new Schild(60, 200, 105, 30, 40, false, false, false, false, false, 10, "Gewebter Harnisch des Ketzers"));
        list.add(new Schild(30, 70, 110, 0, 20, false, false, false, true, false, 10, "Panzer der Schildkrötenprinzessin"));
        list.add(new Schild(50, 160, 110, 0, 30, false, true, false, false, false, 10, "Brustkorb eines Erzfeindes"));
        list.add(new Schild(50, 160, 110, 0, 30, false, false, false, true, false, 10, "Brustkorb eines kalten Erzfeindes"));

        return list;
    }
}

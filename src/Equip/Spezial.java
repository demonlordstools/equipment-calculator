package Equip;

import java.util.ArrayList;

/*
 * hält daten
 */
public class Spezial extends Equip{

    public Spezial (int ap, int vp, int hp, int mp, int kraft, boolean fk, boolean fire, boolean earth, boolean ice, boolean air, int opfer, String name)
    {
        super(ap, vp, hp, mp, kraft, fk, fire, earth, ice, air, opfer, name);

    }

    /* erzeuge einen array der klasse spezial in dem jeder schmuck/sonstiges gespeichert sind*/
    public static ArrayList<Spezial> erstelleSpezial()
    {
        ArrayList<Spezial> list = new ArrayList<Spezial>();

        list.add( new Spezial(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"));
        list.add( new Spezial(0, 3, 2, 0, 0, false, false, false, false, false, 1, "Ranzige Stiefel"));
        list.add( new Spezial(0, 5, 5, 0, 1, false, false, false, false, false, 1, "Bronzering"));
        list.add( new Spezial(0, 0, 5, 4, 1, false, false, false, false, false, 1, "Wundertuete"));
        list.add( new Spezial(0, 0, 0, 8, 1, false, false, false, false, false, 1, "gefluegelte Sandalen"));
        list.add( new Spezial(5, 15, 10, 0, 5, false, false, false, false, false, 1, "Falkenring"));
        list.add( new Spezial(0, 0, 0, 0, -1, false, false, false, false, false, 1, "Blindenhund"));
        list.add( new Spezial(0, 0, -3, 0, 20, false, false, false, false, false, 1, "Schwerer Ohrring des Stammeshauuptlings"));
        list.add( new Spezial(0, 0, 15, 10, 15, false, false, false, false, false, 2, "Voodoopuppe"));
        list.add( new Spezial(0, 12, 12, 5, 10, false, false, false, false, false, 2, "Tarot Karten"));
        list.add( new Spezial(0, 0, 0, 15, 20, false, false, false, false, false, 2, "Feenamulett"));
        list.add( new Spezial(0, 0, 0, 10, 10, false, false, false, false, true, 3, "Ring der Erzmagier"));
        list.add( new Spezial(30, -20, -25, 0, 24, false, false, false, false, false, 3, "Pestring"));
        list.add( new Spezial(0, 25, 40, 0, 14, false, false, false, false, false, 3, "Schutzring"));
        list.add( new Spezial(0, 25, 50, 0, 22, false, true, false, false, false, 3, "Hoellenauge"));
        list.add( new Spezial(45, -30, -35, 0, 28, false, false, false, false, false, 3, "Glorienring"));
        list.add( new Spezial(29, 7, 13, 0, 16, false, false, false, false, false, 4, "Kampfhalsband"));
        list.add( new Spezial(0, 0, 2, 1, 0, false, false, false, false, false, 4, "Bestickte Handtasche"));
        list.add( new Spezial(0, 30, 90, 0, 36, false, false, false, false, false, 4, "Elfenbeinamulett"));
        list.add( new Spezial(45, 35, 15, 0, 28, false, false, true, false, false, 4, "Knochenring"));
        list.add( new Spezial(-70, 50, 115, 0, 30, false, false, false, false, false, 4, "Amulett des Friedens"));
        list.add( new Spezial(0, 110, 0, 0, 42, false, false, false, false, false, 4, "Harnischamulett"));
        list.add( new Spezial(-12, 12, 115, 0, 58, false, false, false, false, false, 4, "Lindwurmamulett"));
        list.add( new Spezial(0, 0, 0, 0, -20, false, false, false, false, false, 4, "Amulett der Kraft"));
        list.add( new Spezial(-5, 5, 85, 4, 32, false, false, false, true, false, 4, "Magischer Eiskristall"));
        list.add( new Spezial(-25, 78, 56, 0, 31, false, true, false, false, false, 4, "Feuerring des Drachentoeters"));
        list.add( new Spezial(0, 80, 0, 0, 15, false, true, false, false, false, 5, "Feuerring"));
        list.add( new Spezial(-40, 0, 25, 12, 2, false, false, false, false, false, 5, "Caduceus"));
        list.add( new Spezial(0, 0, 0, 0, -30, false, false, false, false, false, 5, "Kraftring"));
        list.add( new Spezial(0, 0, 0, 0, -30, false, false, false, false, false, 5, "Ogerkraft-Amulett"));
        list.add( new Spezial(0, 0, 0, 30, 50, false, false, false, false, false, 5, "Ring des Geistes"));
        list.add( new Spezial(-33, 99, -25, 0, 50, false, false, false, true, false, 6, "Leviathan-Schuppen"));
        list.add( new Spezial(0, 0, 0, 45, 25, false, false, false, false, false, 6, "Sonnenring"));
        list.add( new Spezial(0, 0, 0, 1, 3, false, false, false, false, false, 6, "Schwarze Peruecke"));
        list.add( new Spezial(0, 5, 23, 36, 14, false, false, false, false, false, 7, "Schillender Armreif"));
        list.add( new Spezial(-800, -400, 0, 0, 450, false, false, false, false, false, 7, "Riesiger ausgehBaumstumpf"));
        list.add( new Spezial(0, 0, 0, 50, 40, false, false, false, false, false, 7, "Angars magisches Amulett"));
        list.add( new Spezial(173, 97, 224, 5, 100, false, true, false, false, false, 8, "Phoenixfederschmuck"));
        list.add( new Spezial(50, 60, 45, 20, 240, false, false, false, false, false, 8, "Aldeas Halsband"));
        list.add( new Spezial(110, 150, 225, 0, 45, false, false, false, false, false, 9, "Wikingerring"));
        list.add( new Spezial(0, 100, 50, 0, -50, false, false, false, false, true, 9, "Eiserne Krafthandschuhe"));
        list.add( new Spezial(40, 40, 70, -180, 75, false, false, false, false, false, 9, "Elfenbeinring"));
        list.add( new Spezial(0, 0, 0, 100, 5, false, false, false, false, false, 10, "Auge der Seherin"));
        list.add( new Spezial(140, 220, 310, 0, 60, false, true, false, false, false, 10, "Ring des Spatzenkoenigs"));
        list.add( new Spezial(140, 220, 310, 0, 60, false, false, false, true, false, 10, "Ring der Maeusekoenigin"));
        list.add( new Spezial(0, 0, 0, 0, -57, false, false, false, false, false, 10, "Ring der 100 Moeglichkeiten"));

        return list;
    }
}

package Equip;

import java.util.ArrayList;

public class Helm extends Equip{

    public Helm (int ap, int vp, int hp, int mp, int kraft, boolean fk, boolean fire, boolean earth, boolean ice, boolean air, int opfer, String name)
    {
        super(ap, vp, hp, mp, kraft, fk, fire, earth, ice, air, opfer, name);

    }

    /* erzeuge einen array der klasse helm in dem alle helme gespeichert sind*/
    public static ArrayList<Helm> erstelleHelme()
    {
        ArrayList<Helm> list = new ArrayList<Helm>();

        list.add( new Helm(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"));
        list.add( new Helm(0, 5, 5, 0, 2, false, false, false, false, false, 1, "Federkappe"));
        list.add( new Helm(0, 5, 0, 4, 2, false, false, false, false, false, 1, "Zauberhut"));
        list.add( new Helm(3, 16, 19, 0, 18, false, false, false, false, false, 1, "Eisenhelm"));
        list.add( new Helm(13, 28, 25, 0, 30, false, false, false, false, false, 1, "Schaedelplatte"));
        list.add( new Helm(15, -8, -10, 0, 10, false, false, false, false, false, 1, "Spiegelhelm"));
        list.add( new Helm(15, 55, 45, 0, 52, false, false, true, false, false, 3, "Totenschaedelhelm"));
        list.add( new Helm(10, 60, 50, 0, 50, false, false, false, false, false, 3, "Normannenhelm"));
        list.add( new Helm(35, 50, 30, 20, 75, false, true, false, false, false, 4, "Gehoernter Helm"));
        list.add( new Helm(0, 0, 0, 29, 13, false, false, false, false, false, 4, "Diadem der Toten"));
        list.add( new Helm(-20, 50, 50, 0, 40, false, false, false, false, false, 4, "Wolfsmaske"));
        list.add( new Helm(0, 15, 5, 20, 38, false, false, false, false, true, 4, "Diadem"));
        list.add( new Helm(-135, 30, 150, 0, 95, false, false, false, false, false, 5, "Helm des Friedens"));
        list.add( new Helm(10, 45, 95, 0, 60, false, false, false, false, false, 5, "Drachenhelm"));
        list.add( new Helm(16, 46, 53, 0, 32, false, true, false, false, false, 5, "Heiliger Helm des Drachentoeters"));
        list.add( new Helm(30, 30, 50, 0, 45, false, false, false, true, false, 6, "Kalte Maske"));
        list.add( new Helm(0, 25, 5, 30, 9, false, false, false, false, false, 7, "Athenes Weisheit"));
        list.add( new Helm(-30, 200, 0, 10, 98, false, false, false, false, true, 7, "Tarnkappe"));
        list.add( new Helm(0, 0, 200, 0, 20, false, false, false, false, false, 9, "Kessel des Kuechenmeisters"));
        list.add( new Helm(95, 50, 80, 90, 140, false, false, false, false, false, 9, "Helm der Requisition"));
        list.add( new Helm(110, 90, 120, 0, 90, false, false, false, false, false, 10, "Knochenhelm des Ketzers"));
        list.add( new Helm(220, 90, 175, 30, 120, false, false, false, false, false, 10, "Verzierter Stahlhelm"));

        return list;
    }

}

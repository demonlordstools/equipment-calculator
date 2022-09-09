package Equip;

import java.io.Serializable;
import java.util.ArrayList;

public class Einheiten implements Serializable {

    public final String name;
    public final Tags rasse;
    public final int kraft;
    public final boolean fk;
    public final int kp;

    public final int ap;
    public final int vp;
    public final int hp;
    public final int mp;

    public final boolean fire;
    public final boolean air;
    public final boolean earth;
    public final boolean ice;

    public Einheiten(
            final String name,
            final Tags rasse,
            final int kraft,
            final boolean fk,
            final int kp,
            final int ap,
            final int vp,
            final int hp,
            final int mp,
            final boolean fire,
            final boolean air,
            final boolean earth,
            final boolean ice) {
        this.name = name;
        this.rasse = rasse;
        this.kraft = kraft;
        this.fk = fk;
        this.kp = kp;

        this.ap = ap;
        this.vp = vp;
        this.hp = hp;
        this.mp = mp;

        this.fire = fire;
        this.air = air;
        this.earth = earth;
        this.ice = ice;
    }

    public static Einheiten[] erstelleEhs() {
        final ArrayList<Einheiten> ehs = new ArrayList<>();

        ehs.add(new Einheiten("Dummy", Tags.NIX, 0, true, 0, 0, 0, 0, 0, false, false, false, false));
        ehs.add(new Einheiten("Späher", Tags.MENSCH, 30, true, 10, 30, 55, 32, 0, false, false, false, false));
        ehs.add(new Einheiten("Magier", Tags.MENSCH, 20, false, 15, 20, 15, 49, 50, false, false, false, false));
        ehs.add(new Einheiten("Kreuzritter", Tags.MENSCH, 120, false, 25, 120, 75, 115, 0, false, false, false, false));
        ehs.add(new Einheiten("Drachenjäger", Tags.MENSCH, 270, true, 40, 300, 120, 300, 0, false, false, false, false));
        ehs.add(new Einheiten("Pikenier", Tags.MENSCH, 350, false, 60, 1000, 350, 540, 0, false, false, false, false));
        ehs.add(new Einheiten("Erzengel", Tags.MENSCH, 430, false, 80, 780, 640, 730, 200, false, true, false, false));
        ehs.add(new Einheiten("Titan", Tags.MENSCH, 580, false, 120, 1800, 1500, 2500, 0, false, false, true, false));
        ehs.add(new Einheiten("Skelettkrieger", Tags.UNTOT, 25, true, 15, 110, 70, 110, 0, false, false, false, false));
        ehs.add(new Einheiten("Lich", Tags.UNTOT, 170, false, 60, 155, 120, 195, 30, false, false, false, false));
        ehs.add(new Einheiten("Teufel", Tags.UNTOT, 420, false, 90, 900, 1000, 1000, 0, false, false, false, false));
        ehs.add(new Einheiten("Ifrit", Tags.UNTOT, 650, false, 210, 1930, 1720, 2550, 0, true, false, false, false));
        ehs.add(new Einheiten("Daktyle", Tags.DAEMON, 250, false, 80, 1350, 775, 1050, 300, false, false, false, false));
        ehs.add(new Einheiten("Jötun", Tags.DAEMON, 200, true, 140, 1120, 800, 1425, 0, false, false, false, false));
        ehs.add(new Einheiten("Thurse", Tags.DAEMON, 650, false, 235, 4325, 3120, 4100, 0, false, false, true, false));
        ehs.add(new Einheiten("Tyr", Tags.DAEMON, 900, false, 300, 3950, 3260, 4510, 0, false, false, false, false));
        ehs.add(new Einheiten("Eiselementar", Tags.ELEMENTAR, 150, false, 50, 1570, 1170, 1240, 300, false, false, false, true));
        ehs.add(new Einheiten("Luftelementar", Tags.ELEMENTAR, 375, true, 90, 2700, 2500, 2390, 0, false, true, false, false));
        ehs.add(new Einheiten("Banshee", Tags.GEIST, 150, false, 120, 245, 1950, 3000, 625, false, true, false, false));
        ehs.add(new Einheiten("Hüter des Silberhains", Tags.GEIST, 350, false, 145, 1480, 1700, 1850, 55, false, false, false, true));
        ehs.add(new Einheiten("Harlekin", Tags.GEIST, 200, true, 140, 2100, 1950, 2150, 0, false, false, false, false));


        return (Einheiten[]) ehs.toArray(new Einheiten[0]);
    }

    public static Einheiten[] erstelleZusatzEhs() {
        final ArrayList<Einheiten> ehs = new ArrayList<>();

        ehs.add(new Einheiten("Schwertkämpfer", Tags.MENSCH, 0, false, 15, 250, 200, 250, 0, false, false, false, false));
        ehs.add(new Einheiten("Cerberus", Tags.UNTOT, 0, false, 45, 320, 240, 230, 0, false, false, false, false));
        ehs.add(new Einheiten("Knochendrache", Tags.UNTOT, 0, true, 75, 1350, 1200, 1000, 0, false, false, false, false));
        ehs.add(new Einheiten("Chimaira", Tags.UNTOT, 0, false, 150, 1400, 1590, 2450, 0, false, false, false, false));
        ehs.add(new Einheiten("Kostchtchie", Tags.DAEMON, 0, false, 180, 1625, 2700, 2700, 0, false, true, false, false));
        ehs.add(new Einheiten("Erdelementar", Tags.ELEMENTAR, 0, false, 60, 1200, 3900, 4790, 0, false, false, true, false));
        ehs.add(new Einheiten("Feuerelementar", Tags.ELEMENTAR, 0, false, 80, 4000, 2480, 3500, 0, true, false, false, false));
        ehs.add(new Einheiten("Drache", Tags.DRACHE, 0, false, 200, 0, 0, 0, 0, false, false, false, false));
        ehs.add(new Einheiten("Felsendrache", Tags.DRACHE, 0, false, 225, 0, 0, 0, 0, false, false, true, false));
        ehs.add(new Einheiten("Donnervogel", Tags.DRACHE, 0, false, 250, 0, 0, 0, 0, false, true, false, false));
        ehs.add(new Einheiten("Eiswyrm", Tags.DRACHE, 0, false, 275, 0, 0, 0, 0, false, false, false, true));
        ehs.add(new Einheiten("Phoenix", Tags.DRACHE, 0, false, 300, 0, 0, 0, 0, true, false, false, false));

        return (Einheiten[]) ehs.toArray(new Einheiten[0]);
    }

    public static float[][] drachenBasisWerte() {
        // ap, vp, hp
        return new float[][]{
                {35f, 29.5f, 31f},
                {39.5f, 30.5f, 38f},
                {41f, 34f, 41, 5f},
                {47f, 35f, 42f},
                {49.5f, 45.5f, 42.5f}
        };
    }

}

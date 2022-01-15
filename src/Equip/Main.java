package Equip;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static Waffe[] waffensammlung;
    public static Schild[] schildsammlung;
    public static Ruestung[] ruestungssammlung;
    public static Helm[] helmsammlung;
    public static Spezial[] sonstiges;
    public static SetEquip ergebnis = null;

    public static int maxOp = 0;
    public static int maxKraft = 0;
    public static int lvlSk = 0;
    public static BoxElemente boxi = new BoxElemente();
    public static float app = 0.0f;
    public static float vpp = 0.0f;
    public static float hpp = 0.0f;
    public static float mpp = 0.0f;

    private static final ArrayList<Waffe> ALL_WEAPONS = Waffe.erstelleWaffen();
    private static final ArrayList<Schild> ALL_SHIELDS = Schild.erstelleSchilder();
    private static final ArrayList<Ruestung> ALL_ARMOR = Ruestung.erstelleRuestungen();
    private static final ArrayList<Helm> ALL_HELMETS = Helm.erstelleHelme();
    private static final ArrayList<Spezial> ALL_ACCESSOIRES = Spezial.erstelleSpezial();
    public static ArrayList<Waffe> waffen;
    public static ArrayList<Schild> schilder;
    public static ArrayList<Ruestung> ruestungen;
    public static ArrayList<Helm> helme;
    public static ArrayList<Spezial> spezial;

    public static Einheiten[] einheiten = Einheiten.erstelleEhs();
    public static Einheiten[] zusatzUnits = Einheiten.erstelleZusatzEhs();
    public static EinheitenSave[] ehgesichert = new EinheitenSave[30];
    public static int ehindex = 0;
    public static EinheitenSave aktuelleserg = new EinheitenSave("nix", Tags.NIX, 0, false, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, 0, "nix", 0);

    public static SetEquip[] skEquipSaves = new SetEquip[30];
    public static String[] equipSaves = new String[30];
    public static String[] titels = new String[30];

    public static boolean sperren = true;
    public static boolean vorgeben = false;
    public static boolean[] gesperrtwaf = new boolean[ALL_WEAPONS.size()];
    public static boolean[] gesperrtsch = new boolean[ALL_SHIELDS.size()];
    public static boolean[] gesperrtrue = new boolean[ALL_ARMOR.size()];
    public static boolean[] gesperrthel = new boolean[ALL_HELMETS.size()];
    public static boolean[] gesperrtson = new boolean[ALL_ACCESSOIRES.size()];
    public static ArrayList<Point> sperrfolge = new ArrayList<>();
    public static int w = -1;
    public static int s = -1;
    public static int r = -1;
    public static int h = -1;
    public static int so = -1;

    /*
     * startet die gui
     */
    public static void main(final String[] args) {
        Arrays.fill(gesperrtwaf, false);
        Arrays.fill(gesperrtsch, false);
        Arrays.fill(gesperrtrue, false);
        Arrays.fill(gesperrthel, false);
        Arrays.fill(gesperrtson, false);
        Arrays.fill(ehgesichert, aktuelleserg);
        Oberflaeche.Interface();
    }

    /**
     * errechnet das beste equip gemäß den parametern
     */
    public static void los() {
        waffen = new ArrayList<>(ALL_WEAPONS);
        schilder = new ArrayList<>(ALL_SHIELDS);
        ruestungen = new ArrayList<>(ALL_ARMOR);
        helme = new ArrayList<>(ALL_HELMETS);
        spezial = new ArrayList<>(ALL_ACCESSOIRES);

        int erdeeis = 0;
        int feuerwind = 0;
        int fernk = 0;
        if (boxi.ehHatEarth || boxi.ehHatIce) {
            erdeeis = 1;
        }
        if (boxi.ehHatFire || boxi.ehHatAir) {
            feuerwind = 1;
        }
        if (w >= 0) {
            if (waffen.get(w).Eis || waffen.get(w).Erde) {
                erdeeis = 1;
            }
            if (waffen.get(w).Feuer || waffen.get(w).Wind) {
                feuerwind = 1;
            }
            if (waffen.get(w).FK) {
                fernk = 1;
            } else {
                fernk = -1;
            }
            if (waffen.get(w).OP > maxOp) {
                erdeeis = 1;
                feuerwind = 1;
            }
            if (waffen.get(w).Kraft > maxKraft) {
                erdeeis = 1;
                feuerwind = 1;
            }
        }
        if (s >= 0) {
            if (schilder.get(s).Eis || schilder.get(s).Erde) {
                erdeeis = 1;
            }
            if (schilder.get(s).Feuer || schilder.get(s).Wind) {
                feuerwind = 1;
            }
            if (schilder.get(s).OP > maxOp) {
                erdeeis = 1;
                feuerwind = 1;
            }
            if (schilder.get(s).Kraft > maxKraft) {
                erdeeis = 1;
                feuerwind = 1;
            }
        }
        if (r >= 0) {
            if (ruestungen.get(r).Eis || ruestungen.get(r).Erde) {
                erdeeis = 1;
            }
            if (ruestungen.get(r).Feuer || ruestungen.get(r).Wind) {
                feuerwind = 1;
            }
            if (ruestungen.get(r).OP > maxOp) {
                erdeeis = 1;
                feuerwind = 1;
            }
            if (ruestungen.get(r).Kraft > maxKraft) {
                erdeeis = 1;
                feuerwind = 1;
            }
        }
        if (h >= 0) {
            if (helme.get(h).Eis || helme.get(h).Erde) {
                erdeeis = 1;
            }
            if (helme.get(h).Feuer || helme.get(h).Wind) {
                feuerwind = 1;
            }
            if (helme.get(h).OP > maxOp) {
                erdeeis = 1;
                feuerwind = 1;
            }
            if (helme.get(h).Kraft > maxKraft) {
                erdeeis = 1;
                feuerwind = 1;
            }
        }
        if (so >= 0) {
            if (spezial.get(so).Eis || spezial.get(so).Erde) {
                erdeeis = 1;
            }
            if (spezial.get(so).Feuer || spezial.get(so).Wind) {
                feuerwind = 1;
            }
            if (spezial.get(so).OP > maxOp) {
                erdeeis = 1;
                feuerwind = 1;
            }
            if (spezial.get(so).Kraft > maxKraft) {
                erdeeis = 1;
                feuerwind = 1;
            }
        }

        if ((feuerwind == 1 && erdeeis == 1) || (fernk == -1 && boxi.mussFkNutzen) || (fernk == 1 && boxi.darfNichtFkNutzen)) {
            final JFrame f = new JFrame("ERROR");
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setSize(400, 100);
            final JLabel errormessage = new JLabel("<html><body> Die vorgegebenen Gegenstaende passen nicht zu den<br>restlichen Einstellungen (Elemente, FK, OP, kraft) !</body></html>");
            f.getContentPane().add(errormessage);
            f.setLocation(400, 300);
            f.setVisible(true);
        } else {
            prozAnpassen();

            /* aussortieren der nicht benoetigten elemente aus der liste */
            if (w >= 0) {
                final Waffe fix = waffen.get(w);
                waffen.clear();
                waffen.add(fix);
            } else {
                int deletecount = 0;
                for (int i = 0; i < ALL_WEAPONS.size(); i++) {
                    if (gesperrtwaf[i]) {
                        waffen.remove(i - deletecount);
                        deletecount++;
                    }
                }

                for (final Iterator<Waffe> it = waffen.iterator(); it.hasNext(); ) {
                    final Waffe a = it.next();

                    if (a.FK && !boxi.ehHatFk) {
                        it.remove();
                        continue;
                    }

                    if (a.FK && (!boxi.darfFkNutzen || boxi.darfNichtFkNutzen)) {
                        it.remove();
                        continue;
                    }

                    if (boxi.mussFkNutzen && !a.FK) {
                        it.remove();
                        continue;
                    }

                    if (a.OP > maxOp) {
                        it.remove();
                        continue;
                    }

                    if (a.Kraft > (maxKraft + 60)) {
                        it.remove();
                        continue;
                    }

                    if (!boxi.atDarfEleNutzen && (a.Eis || a.Erde || a.Feuer || a.Wind)) {
                        it.remove();
                        continue;
                    }

                    if ((a.Feuer && boxi.ehHatIce) || (a.Feuer && boxi.ehHatEarth) || (a.Wind && boxi.ehHatIce) || (a.Wind && boxi.ehHatEarth)) {
                        it.remove();
                        continue;
                    }

                    if ((a.Erde && boxi.ehHatFire) || (a.Erde && boxi.ehHatAir) || (a.Eis && boxi.ehHatFire) || (a.Eis && boxi.ehHatAir)) {
                        it.remove();
                        continue;
                    }

                    if (boxi.atMussEis && !a.Eis) {
                        it.remove();
                        continue;
                    }

                    if (boxi.atMussErde && !a.Erde) {
                        it.remove();
                        continue;
                    }

                    if (boxi.atMussFeuer && !a.Feuer) {
                        it.remove();
                        continue;
                    }

                    if (boxi.atMussWind && !a.Wind) {
                        it.remove();
                    }

                }
            }

            if (s >= 0) {
                final Schild fix = schilder.get(s);
                schilder.clear();
                schilder.add(fix);
            } else {
                int deletecount = 0;
                for (int i = 0; i < ALL_SHIELDS.size(); i++) {
                    if (gesperrtsch[i]) {
                        schilder.remove(i - deletecount);
                        deletecount++;
                    }
                }

                for (final Iterator<Schild> it = schilder.iterator(); it.hasNext(); ) {
                    final Schild schild = it.next();

                    if (schild.OP > maxOp) {
                        it.remove();
                        continue;
                    }

                    if (schild.Kraft > (maxKraft + 60)) {
                        it.remove();
                        continue;
                    }

                    if (!schild.Eis && !schild.Erde && !schild.Feuer && !schild.Wind) {
                        continue;
                    }

                    if (!boxi.defDarfEleNutzen) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.defMussEis || boxi.defMussErde) && (schild.Feuer || schild.Wind)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.defMussFeuer || boxi.defMussWind) && (schild.Eis || schild.Erde)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.atMussEis || boxi.atMussErde) && (schild.Feuer || schild.Wind)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.atMussFeuer || boxi.atMussWind) && (schild.Eis || schild.Erde)) {
                        it.remove();
                        continue;
                    }

                    if ((schild.Feuer && boxi.ehHatIce) || (schild.Feuer && boxi.ehHatEarth) || (schild.Wind && boxi.ehHatIce) || (schild.Wind && boxi.ehHatEarth)) {
                        it.remove();
                        continue;
                    }

                    if ((schild.Erde && boxi.ehHatFire) || (schild.Erde && boxi.ehHatAir) || (schild.Eis && boxi.ehHatFire) || (schild.Eis && boxi.ehHatAir)) {
                        it.remove();
                    }
                }
            }

            if (r >= 0) {
                final Ruestung fix = ruestungen.get(r);
                ruestungen.clear();
                ruestungen.add(fix);
            } else {
                int deletecount = 0;
                for (int i = 0; i < ALL_ARMOR.size(); i++) {
                    if (gesperrtrue[i]) {
                        ruestungen.remove(i - deletecount);
                        deletecount++;
                    }
                }

                for (final Iterator<Ruestung> it = ruestungen.iterator(); it.hasNext(); ) {
                    final Ruestung ruestung = it.next();

                    if (ruestung.OP > maxOp) {
                        it.remove();
                        continue;
                    }

                    if (ruestung.Kraft > (maxKraft + 60)) {
                        it.remove();
                        continue;
                    }

                    if (!ruestung.Eis && !ruestung.Erde && !ruestung.Feuer && !ruestung.Wind) {
                        continue;
                    }

                    if (!boxi.defDarfEleNutzen) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.defMussEis || boxi.defMussErde) && (ruestung.Feuer || ruestung.Wind)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.defMussFeuer || boxi.defMussWind) && (ruestung.Eis || ruestung.Erde)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.atMussEis || boxi.atMussErde) && (ruestung.Feuer || ruestung.Wind)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.atMussFeuer || boxi.atMussWind) && (ruestung.Eis || ruestung.Erde)) {
                        it.remove();
                        continue;
                    }

                    if ((ruestung.Feuer && boxi.ehHatIce) || (ruestung.Feuer && boxi.ehHatEarth) || (ruestung.Wind && boxi.ehHatIce) || (ruestung.Wind && boxi.ehHatEarth)) {
                        it.remove();
                        continue;
                    }

                    if ((ruestung.Erde && boxi.ehHatFire) || (ruestung.Erde && boxi.ehHatAir) || (ruestung.Eis && boxi.ehHatFire) || (ruestung.Eis && boxi.ehHatAir)) {
                        it.remove();
                    }
                }
            }

            if (h >= 0) {
                final Helm fix = helme.get(h);
                helme.clear();
                helme.add(fix);
            } else {
                int deletecount = 0;
                for (int i = 0; i < ALL_HELMETS.size(); i++) {
                    if (gesperrthel[i]) {
                        helme.remove(i - deletecount);
                        deletecount++;
                    }
                }

                for (final Iterator<Helm> it = helme.iterator(); it.hasNext(); ) {
                    final Helm helm = it.next();

                    if (helm.OP > maxOp) {
                        it.remove();
                        continue;
                    }

                    if (helm.Kraft > (maxKraft + 60)) {
                        it.remove();
                        continue;
                    }

                    if (!helm.Eis && !helm.Erde && !helm.Feuer && !helm.Wind) {
                        continue;
                    }

                    if ((boxi.defMussEis || boxi.defMussErde) && (helm.Feuer || helm.Wind)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.defMussFeuer || boxi.defMussWind) && (helm.Eis || helm.Erde)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.atMussEis || boxi.atMussErde) && (helm.Feuer || helm.Wind)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.atMussFeuer || boxi.atMussWind) && (helm.Eis || helm.Erde)) {
                        it.remove();
                        continue;
                    }

                    if ((helm.Feuer && boxi.ehHatIce) || (helm.Feuer && boxi.ehHatEarth) || (helm.Wind && boxi.ehHatIce) || (helm.Wind && boxi.ehHatEarth)) {
                        it.remove();
                        continue;
                    }

                    if ((helm.Erde && boxi.ehHatFire) || (helm.Erde && boxi.ehHatAir) || (helm.Eis && boxi.ehHatFire) || (helm.Eis && boxi.ehHatAir)) {
                        it.remove();
                    }
                }
            }

            if (so >= 0) {
                final Spezial fix = spezial.get(so);
                spezial.clear();
                spezial.add(fix);
            } else {
                int deletecount = 0;
                for (int i = 0; i < ALL_ACCESSOIRES.size(); i++) {
                    if (gesperrtson[i]) {
                        spezial.remove(i - deletecount);
                        deletecount++;
                    }
                }

                for (final Iterator<Spezial> it = spezial.iterator(); it.hasNext(); ) {
                    final Spezial spezial = it.next();

                    if (spezial.OP > maxOp) {
                        it.remove();
                        continue;
                    }

                    if (spezial.Kraft > (maxKraft + 60)) {
                        it.remove();
                        continue;
                    }

                    if (!spezial.Eis && !spezial.Erde && !spezial.Feuer && !spezial.Wind) {
                        continue;
                    }

                    if ((boxi.defMussEis || boxi.defMussErde) && (spezial.Feuer || spezial.Wind)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.defMussFeuer || boxi.defMussWind) && (spezial.Eis || spezial.Erde)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.atMussEis || boxi.atMussErde) && (spezial.Feuer || spezial.Wind)) {
                        it.remove();
                        continue;
                    }

                    if ((boxi.atMussFeuer || boxi.atMussWind) && (spezial.Eis || spezial.Erde)) {
                        it.remove();
                        continue;
                    }

                    if ((spezial.Feuer && boxi.ehHatIce) || (spezial.Feuer && boxi.ehHatEarth) || (spezial.Wind && boxi.ehHatIce) || (spezial.Wind && boxi.ehHatEarth)) {
                        it.remove();
                        continue;
                    }

                    if ((spezial.Erde && boxi.ehHatFire) || (spezial.Erde && boxi.ehHatAir) || (spezial.Eis && boxi.ehHatFire) || (spezial.Eis && boxi.ehHatAir)) {
                        it.remove();
                    }
                }
            }

            /* gekürzte listen in arrays umwandeln um diese in die globalen variablen zu speichern */
            waffensammlung = (Waffe[]) waffen.toArray(new Waffe[0]);
            schildsammlung = (Schild[]) schilder.toArray(new Schild[0]);
            ruestungssammlung = (Ruestung[]) ruestungen.toArray(new Ruestung[0]);
            helmsammlung = (Helm[]) helme.toArray(new Helm[0]);
            sonstiges = (Spezial[]) spezial.toArray(new Spezial[0]);

            /* alle sets in die globale variable speichern */
            erstelleSetEquip(maxKraft, app, vpp, hpp, mpp);

            /* ausgabe der optimalen kombination */
            Oberflaeche.russi = ergebnis.toString();
            Oberflaeche.werti = ergebnis.Werte();
            Oberflaeche.prozente = "<html><body>AP (" + app + " %):<br> <br> VP (" + vpp + " %):<br> <br> HP (" + hpp + " %):<br> <br> MP (" + mpp + " %):<br> <br> Kraft:<br><body><html>";
        }
    }


    /* alle kombinationen an ausrüstungssets mit den noch verwendbaren gegenständen als sets erstellen und speichern */
    public static void erstelleSetEquip(final int check, final float app, final float vpp, final float hpp, final float mpp) {
        ergebnis = new SetEquip(waffensammlung[0], schildsammlung[0], ruestungssammlung[0], helmsammlung[0], sonstiges[0], "unbekannt");
        final int[] eles = new int[5]; // nix = 0, feuer/wind = 1, eis/erde = 2


        for (final Waffe waffe : waffensammlung) {
            Arrays.fill(eles, 0);
            eles[0] = waffe.getEle();

            for (final Schild schild : schildsammlung) {
                eles[1] = schild.getEle();

                for (final Ruestung ruestung : ruestungssammlung) {
                    eles[2] = ruestung.getEle();

                    for (final Helm helm : helmsammlung) {
                        eles[3] = helm.getEle();

                        for (final Spezial sonstige : sonstiges) {
                            eles[4] = sonstige.getEle();

                            if (Freigabe(eles)) {
                                if (defenseEle(schild, ruestung)) {
                                    if (check >= (waffe.Kraft + schild.Kraft + ruestung.Kraft + helm.Kraft + sonstige.Kraft)) {
                                        final float weightedAP = (app / 100) * (waffe.AP + schild.AP + ruestung.AP + helm.AP + sonstige.AP);
                                        final float weightedVP = (vpp / 100) * (waffe.VP + schild.VP + ruestung.VP + helm.VP + sonstige.VP);
                                        final float weightedHP = (hpp / 100) * (waffe.HP + schild.HP + ruestung.HP + helm.HP + sonstige.HP);
                                        final float weightedMP = (mpp / 100) * (waffe.MP + schild.MP + ruestung.MP + helm.MP + sonstige.MP);
                                        final float weightedTotal = weightedAP + weightedVP + weightedHP + weightedMP;
                                        final float previousWeightedTotal = (app / 100) * ergebnis.getAp()
                                                + (vpp / 100) * ergebnis.getVp()
                                                + (hpp / 100) * ergebnis.getHp()
                                                + (mpp / 100) * ergebnis.getMp();
                                        if (weightedTotal > previousWeightedTotal) {
                                            ergebnis = new SetEquip(waffe, schild, ruestung, helm, sonstige, "unbekannt");
                                        } else eles[4] = 0;
                                        continue;
                                    } else eles[4] = 0;
                                    continue;
                                } else eles[4] = 0;
                                continue;
                            }
                            eles[4] = 0;
                        }
                        eles[3] = 0;
                    }
                    eles[2] = 0;
                }
                eles[1] = 0;
            }
        }
    }

    /*
     * kombiniert das equip auch keine falschen elemente ?
     */
    public static boolean Freigabe(final int[] eles) {

        boolean feuerwind = false;
        boolean eiserde = false;

        for (final int b : eles) {
            if (b == 1) {
                feuerwind = true;
            }
            if (b == 2) {
                eiserde = true;
            }
        }

        return !feuerwind || !eiserde;
    }

    /*
     * die eingestellten Prozentzahlen auf 100% verrechnen
     * */
    public static void prozAnpassen() {
        if (app > 0.5 && vpp < 0.5 && hpp < 0.5 && mpp < 0.5) {
            app = 100;
            return;
        }
        if (app < 0.5 && vpp > 0.5 && hpp < 0.5 && mpp < 0.5) {
            vpp = 100;
            return;
        }
        if (app < 0.5 && vpp < 0.5 && hpp > 0.5 && mpp < 0.5) {
            hpp = 100;
            return;
        }
        if (app < 0.5 && vpp < 0.5 && hpp < 0.5 && mpp > 0.5) {
            mpp = 100;
            return;
        }


        final ArrayList<Float> prozi = new ArrayList<>();
        if (app > 0.5) {
            prozi.add(app);
        }
        if (vpp > 0.5) {
            prozi.add(vpp);
        }
        if (hpp > 0.5) {
            prozi.add(hpp);
        }
        if (mpp > 0.5) {
            prozi.add(mpp);
        }

        if (prozi.size() > 0) {
            final Float[] proz = prozi.toArray(new Float[0]);
            Arrays.sort(proz);
            final float basis = proz[0];
            float teile = 0;

            for (final float n : proz) {
                teile = teile + (n / basis);
            }
            final float prozsatz = 100 / teile;

            final float mp = (mpp / basis) * prozsatz * 100;
            final float hp = (hpp / basis) * prozsatz * 100;
            final float ap = (app / basis) * prozsatz * 100;
            final float vp = (vpp / basis) * prozsatz * 100;

            final float mps = Math.round(mp);
            final float hps = Math.round(hp);
            final float aps = Math.round(ap);
            final float vps = Math.round(vp);

            app = aps / 100;
            vpp = vps / 100;
            hpp = hps / 100;
            mpp = mps / 100;
        } else {
            app = 0;
            vpp = 0;
            hpp = 0;
            mpp = 0;
        }

    }

    /*
     * überprüft, ob die elemente von rüstung und schild zusammen passen und auch den wünschen entsprechen
     */
    public static boolean defenseEle(final Schild schild, final Ruestung ruestung) {
        if (boxi.defMussEis && !boxi.defMussErde) {
            if (schild.Erde || ruestung.Erde) {
                return false;
            }
            return schild.Eis || ruestung.Eis;
        }

        if (boxi.defMussErde && !boxi.defMussEis) {
            if (schild.Eis || ruestung.Eis) {
                return false;
            }
            return schild.Erde || ruestung.Erde;
        }

        if (boxi.defMussFeuer && !boxi.defMussWind) {
            if (schild.Wind || ruestung.Wind) {
                return false;
            }
            return schild.Feuer || ruestung.Feuer;
        }

        if (boxi.defMussWind && !boxi.defMussFeuer) {
            if (schild.Feuer || ruestung.Feuer) {
                return false;
            }
            return schild.Wind || ruestung.Wind;
        }

        if (boxi.defMussEis) {
            return (schild.Eis && ruestung.Erde) || (schild.Erde && ruestung.Eis);
        }

        if (boxi.defMussFeuer) {
            return (schild.Feuer && ruestung.Wind) || (schild.Wind && ruestung.Feuer);
        }

        return true;
    }

    /*
     * gibt die gespeicherten sets als liste zurück
     */
    public static LinkedList<SetEquip> getListEquips() {
        return new LinkedList<>(Arrays.asList(skEquipSaves));
    }

    /*
     * gibt die gespeicherten ehs als liste zurück
     */
    public static LinkedList<EinheitenSave> getListEhs() {
        final LinkedList<EinheitenSave> ehs = new LinkedList<>();
        for (final EinheitenSave einheit : ehgesichert) {
            if (!einheit.titel.equals("nix")) {
                ehs.add(einheit);
            }
        }

        return ehs;
    }

    /*
     * beim laden werden die arrays hier mit den geladenen equips gefüllt
     */
    public static void setEquips(final LinkedList<SetEquip> alpha) {
        for (final SetEquip equip : alpha) {

            if (equip != null) {
                boolean flag = false;

                for (final SetEquip gla : Main.skEquipSaves) {
                    if (gla != null) {
                        if (equip.name.equals(gla.name)) {
                            flag = true;
                        }
                    }
                }

                if (!flag) {
                    Main.titels[Oberflaeche.indexEquipSave] = equip.name;
                    Main.skEquipSaves[Oberflaeche.indexEquipSave] = equip;
                    Main.equipSaves[Oberflaeche.indexEquipSave] = equip.Werte();
                    Oberflaeche.indexEquipSave++;
                    if (Oberflaeche.indexEquipSave > 29) Oberflaeche.indexEquipSave = 0;
                }
            }
        }
    }

    /*
     * beim laden werden die arrays hier mit den geladenen ehs gefüllt
     */
    public static void setEhVorlagen(final LinkedList<EinheitenSave> beta) {
        for (final EinheitenSave eh : beta) {
            if (eh != null) {
                boolean flag = false;

                for (final EinheitenSave gla : Main.ehgesichert) {
                    if (gla != null) {
                        if (eh.titel.equals(gla.titel)) {
                            flag = true;
                        }
                    }
                }

                if (!flag) {
                    Main.ehgesichert[Main.ehindex] = eh;
                    Main.ehindex = Main.ehindex + 1;
                    if (Main.ehindex >= 30) {
                        Main.ehindex = 0;
                    }
                }
            }
        }
    }

    /*
     * Aendert die werte/eigenschaften des dummys
     */
    public static void setDummy(final Einheiten dum) {
        einheiten[0] = dum;
    }

}

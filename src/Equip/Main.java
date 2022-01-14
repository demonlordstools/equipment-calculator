package Equip;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.awt.*;
import javax.swing.*;

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

    public static ArrayList<Waffe> waffen ;
    public static ArrayList<Schild> schilder ;
    public static ArrayList<Ruestung> ruestungen ;
    public static ArrayList<Helm> helme ;
    public static ArrayList<Spezial> spezial ;

    public static Einheiten[] einheiten = Einheiten.erstelleEhs();
    public static Einheiten[] zusatzUnits = Einheiten.erstelleZusatzEhs();
    public static EinheitenSave[] ehgesichert = new EinheitenSave[30];
    public static int ehindex = 0;
    public static EinheitenSave aktuelleserg = new EinheitenSave("nix", Tags.NIX, 0, false, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, 0, "nix",0);

    public static SetEquip[] skEquipSaves = new SetEquip[30];
    public static String[] equipSaves = new String[30];
    public static String[] titels = new String[30];

    public static boolean sperren = true;
    public static boolean vorgeben = false;
    public static boolean[] gesperrtwaf = new boolean[87];
    public static boolean[] gesperrtsch = new boolean[28];
    public static boolean[] gesperrtrue = new boolean[40];
    public static boolean[] gesperrthel = new boolean[25];
    public static boolean[] gesperrtson = new boolean[46];
    public static ArrayList<Point>  sperrfolge = new ArrayList<Point>();
    public static int w = -1;
    public static int s = -1;
    public static int r = -1;
    public static int h = -1;
    public static int so = -1;

    /*
     * startet die gui
     */
    public static void main(String[] args) {

        Arrays.fill(gesperrtwaf, false);
        Arrays.fill(gesperrtsch, false);
        Arrays.fill(gesperrtrue, false);
        Arrays.fill(gesperrthel, false);
        Arrays.fill(gesperrtson, false);
        Arrays.fill(ehgesichert, aktuelleserg);
        Oberflaeche.Interface();

    }

    /**
     * errechnet das beste equip gemden parametern
     */
    public static void los()
    {

        waffen = Waffe.erstelleWaffen();
        schilder = Schild.erstelleSchilder();
        ruestungen = Ruestung.erstelleRuestungen();
        helme = Helm.erstelleHelme();
        spezial = Spezial.erstelleSpezial();

        int erdeeis = 0;
        int feuerwind = 0;
        int fernk = 0;
        if(boxi.ehHatEarth || boxi.ehHatIce)
        {erdeeis = 1;}
        if(boxi.ehHatFire || boxi.ehHatAir)
        {feuerwind = 1;}
        if(w >= 0)
        {	if(waffen.get(w).Eis || waffen.get(w).Erde) {erdeeis = 1;}
            if(waffen.get(w).Feuer || waffen.get(w).Wind) {feuerwind = 1;}
            if(waffen.get(w).FK){fernk = 1;} else{fernk = -1;}
            //if(!waffen.get(w).FK && boxi.mussFkNutzen) {erdeeis = 1; feuerwind = 1;}
            if(waffen.get(w).OP > maxOp) {erdeeis = 1; feuerwind = 1;}
            if(waffen.get(w).Kraft > maxKraft) {erdeeis = 1; feuerwind = 1;}}
        if(s >= 0)
        {	if(schilder.get(s).Eis || schilder.get(s).Erde) {erdeeis = 1;}
            if(schilder.get(s).Feuer || schilder.get(s).Wind) {feuerwind = 1;}
            if(schilder.get(s).OP > maxOp) {erdeeis = 1; feuerwind = 1;}
            if(schilder.get(s).Kraft > maxKraft) {erdeeis = 1; feuerwind = 1;}}
        if(r >= 0)
        {	if(ruestungen.get(r).Eis || ruestungen.get(r).Erde) {erdeeis = 1;}
            if(ruestungen.get(r).Feuer || ruestungen.get(r).Wind) {feuerwind = 1;}
            if(ruestungen.get(r).OP > maxOp) {erdeeis = 1; feuerwind = 1;}
            if(ruestungen.get(r).Kraft > maxKraft) {erdeeis = 1; feuerwind = 1;}}
        if(h >= 0)
        {	if(helme.get(h).Eis || helme.get(h).Erde) {erdeeis = 1;}
            if(helme.get(h).Feuer || helme.get(h).Wind) {feuerwind = 1;}
            if(helme.get(h).OP > maxOp) {erdeeis = 1; feuerwind = 1;}
            if(helme.get(h).Kraft > maxKraft) {erdeeis = 1; feuerwind = 1;}}
        if(so >= 0)
        {	if(spezial.get(so).Eis || spezial.get(so).Erde) {erdeeis = 1;}
            if(spezial.get(so).Feuer || spezial.get(so).Wind) {feuerwind = 1;}
            if(spezial.get(so).OP > maxOp) {erdeeis = 1; feuerwind = 1;}
            if(spezial.get(so).Kraft > maxKraft) {erdeeis = 1; feuerwind = 1;}}



        if((feuerwind == 1 && erdeeis == 1) || (fernk == -1 && boxi.mussFkNutzen) || (fernk == 1 && boxi.darfNichtFkNutzen))
        {
            JFrame f = new JFrame("ERROR");
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.setSize(400, 100);
            JLabel errormessage = new JLabel("<html><body> Die vorgegebenen Gegenstaende passen nicht zu den<br>restlichen Einstellungen (Elemente, FK, OP, kraft) !</body></html>");
            f.getContentPane().add(errormessage);
            f.setLocation(400, 300);
            f.setVisible(true);


        }

        else {
            prozAnpassen();

            /* aussortieren der nicht benoetigten elemente aus der liste */
            if(w >= 0) {Waffe fix = waffen.get(w);	waffen.clear();	waffen.add(fix);}
            else
            {
                int deletecount = 0;
                for(int i = 0; i< 87; i++)
                {
                    if( gesperrtwaf[i]) { waffen.remove(i-deletecount); deletecount++;}
                }

                for ( Iterator<Waffe> it = waffen.iterator(); it.hasNext(); )
                {
                    Waffe a = it.next();

                    if( a.FK && !boxi.ehHatFk)
                    { it.remove(); continue;}

                    if( a.FK && (!boxi.darfFkNutzen || boxi.darfNichtFkNutzen))
                    { it.remove(); continue;}

                    if(boxi.mussFkNutzen && !a.FK)
                    { it.remove(); continue;}

                    if( a.OP > maxOp)
                    { it.remove(); continue;}

                    if( a.Kraft > (maxKraft+60))
                    { it.remove(); continue;}

                    if(!boxi.atDarfEleNutzen && (a.Eis || a.Erde || a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if( (a.Feuer && boxi.ehHatIce) || (a.Feuer && boxi.ehHatEarth) || (a.Wind && boxi.ehHatIce) || (a.Wind && boxi.ehHatEarth))
                    { it.remove(); continue;}

                    if( (a.Erde && boxi.ehHatFire) || (a.Erde && boxi.ehHatAir) || (a.Eis && boxi.ehHatFire) || (a.Eis && boxi.ehHatAir))
                    { it.remove(); continue;}

                    if(boxi.atMussEis && !a.Eis)
                    { it.remove(); continue;}

                    if(boxi.atMussErde && !a.Erde)
                    { it.remove(); continue;}

                    if(boxi.atMussFeuer && !a.Feuer)
                    { it.remove(); continue;}

                    if(boxi.atMussWind && !a.Wind)
                    { it.remove(); }

                };}

            if(s >= 0) {Schild fix = schilder.get(s); schilder.clear();	schilder.add(fix);}
            else
            {
                int deletecount = 0;
                for(int i = 0; i< 27; i++)
                {
                    if( gesperrtsch[i]) { schilder.remove(i-deletecount); deletecount++;}
                }

                for ( Iterator<Schild> it = schilder.iterator(); it.hasNext(); )
                {
                    Schild a = it.next();

                    if( a.OP > maxOp)
                    { it.remove(); continue;}

                    if( a.Kraft > (maxKraft+60))
                    { it.remove(); continue;}

                    if( !a.Eis && !a.Erde && !a.Feuer && !a.Wind)
                    { continue;}

                    if(!boxi.defDarfEleNutzen && (a.Eis || a.Erde || a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.defMussEis || boxi.defMussErde) && (a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.defMussFeuer || boxi.defMussWind) && (a.Eis || a.Erde))
                    { it.remove(); continue;}

                    if((boxi.atMussEis || boxi.atMussErde) && (a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.atMussFeuer || boxi.atMussWind) && (a.Eis || a.Erde))
                    { it.remove(); continue;}

                    if( (a.Feuer && boxi.ehHatIce) || (a.Feuer && boxi.ehHatEarth) || (a.Wind && boxi.ehHatIce) || (a.Wind && boxi.ehHatEarth))
                    { it.remove(); continue;}

                    if( (a.Erde && boxi.ehHatFire) || (a.Erde && boxi.ehHatAir) || (a.Eis && boxi.ehHatFire) || (a.Eis && boxi.ehHatAir))
                    { it.remove();}
                };}

            if(r >= 0) { Ruestung fix = ruestungen.get(r); ruestungen.clear(); ruestungen.add(fix);}
            else
            {
                int deletecount = 0;
                for(int i = 0; i< 39; i++)
                {
                    if( gesperrtrue[i]) { ruestungen.remove(i-deletecount); deletecount++;}
                }

                for ( Iterator<Ruestung> it = ruestungen.iterator(); it.hasNext(); )
                {
                    Ruestung a = it.next();

                    if( a.OP > maxOp)
                    { it.remove(); continue;}

                    if( a.Kraft > (maxKraft+60))
                    { it.remove(); continue;}

                    if( !a.Eis && !a.Erde && !a.Feuer && !a.Wind)
                    { continue;}

                    if(!boxi.defDarfEleNutzen && (a.Eis || a.Erde || a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.defMussEis || boxi.defMussErde) && (a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.defMussFeuer || boxi.defMussWind) && (a.Eis || a.Erde))
                    { it.remove(); continue;}

                    if((boxi.atMussEis || boxi.atMussErde) && (a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.atMussFeuer || boxi.atMussWind) && (a.Eis || a.Erde))
                    { it.remove(); continue;}

                    if( (a.Feuer && boxi.ehHatIce) || (a.Feuer && boxi.ehHatEarth) || (a.Wind && boxi.ehHatIce) || (a.Wind && boxi.ehHatEarth))
                    { it.remove(); continue;}

                    if( (a.Erde && boxi.ehHatFire) || (a.Erde && boxi.ehHatAir) || (a.Eis && boxi.ehHatFire) || (a.Eis && boxi.ehHatAir))
                    { it.remove();}
                };}

            if(h >= 0) {Helm fix = helme.get(h); helme.clear(); helme.add(fix);}
            else
            {
                int deletecount = 0;
                for(int i = 0; i< 24; i++)
                {
                    if( gesperrthel[i]) { helme.remove(i-deletecount); deletecount++;}
                }

                for ( Iterator<Helm> it = helme.iterator(); it.hasNext(); )
                {
                    Helm a = it.next();

                    if( a.OP > maxOp)
                    { it.remove(); continue;}

                    if( a.Kraft > (maxKraft+60))
                    { it.remove(); continue;}

                    if( !a.Eis && !a.Erde && !a.Feuer && !a.Wind)
                    { continue;}

                    if((boxi.defMussEis || boxi.defMussErde) && (a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.defMussFeuer || boxi.defMussWind) && (a.Eis || a.Erde))
                    { it.remove(); continue;}

                    if((boxi.atMussEis || boxi.atMussErde) && (a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.atMussFeuer || boxi.atMussWind) && (a.Eis || a.Erde))
                    { it.remove(); continue;}

                    if( (a.Feuer && boxi.ehHatIce) || (a.Feuer && boxi.ehHatEarth) || (a.Wind && boxi.ehHatIce) || (a.Wind && boxi.ehHatEarth))
                    { it.remove(); continue;}

                    if( (a.Erde && boxi.ehHatFire) || (a.Erde && boxi.ehHatAir) || (a.Eis && boxi.ehHatFire) || (a.Eis && boxi.ehHatAir))
                    { it.remove();}
                };}

            if(so >= 0) {Spezial fix = spezial.get(so); spezial.clear(); spezial.add(fix);}
            else
            {
                int deletecount = 0;
                for(int i = 0; i< 45; i++)
                {
                    if( gesperrtson[i]) { spezial.remove(i-deletecount); deletecount++;}
                }

                for ( Iterator<Spezial> it = spezial.iterator(); it.hasNext(); )
                {
                    Spezial a = it.next();

                    if( a.OP > maxOp)
                    { it.remove(); continue;}

                    if( a.Kraft > (maxKraft+60))
                    { it.remove(); continue;}

                    if( !a.Eis && !a.Erde && !a.Feuer && !a.Wind)
                    { continue;}

                    if((boxi.defMussEis || boxi.defMussErde) && (a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.defMussFeuer || boxi.defMussWind) && (a.Eis || a.Erde))
                    { it.remove(); continue;}

                    if((boxi.atMussEis || boxi.atMussErde) && (a.Feuer || a.Wind))
                    { it.remove(); continue;}

                    if((boxi.atMussFeuer || boxi.atMussWind) && (a.Eis || a.Erde))
                    { it.remove(); continue;}

                    if( (a.Feuer && boxi.ehHatIce) || (a.Feuer && boxi.ehHatEarth) || (a.Wind && boxi.ehHatIce) || (a.Wind && boxi.ehHatEarth))
                    { it.remove(); continue;}

                    if( (a.Erde && boxi.ehHatFire) || (a.Erde && boxi.ehHatAir) || (a.Eis && boxi.ehHatFire) || (a.Eis && boxi.ehHatAir))
                    { it.remove();}
                };}



            /* geklisten in arrays umwandeln um diese in die globalen variablen zu speichern */
            waffensammlung = (Waffe[]) waffen.toArray( new Waffe[0]);
            schildsammlung = (Schild[]) schilder.toArray( new Schild[0]);
            ruestungssammlung = (Ruestung[]) ruestungen.toArray( new Ruestung[0]);
            helmsammlung = (Helm[]) helme.toArray( new Helm[0]);
            sonstiges= (Spezial[]) spezial.toArray( new Spezial[0]);

            //System.out.println(sammlung.length);

            /* alle sets in die globale variable speichern */
            erstelleSetEquip(maxKraft, app, vpp, hpp, mpp);


            /* ausgabe der optimalen kombination */
//		System.out.println(boxi.testString());
//		System.out.println("kaft : " +maxKraft + "   OP : "+ maxOp );
            Oberflaeche.russi = ergebnis.toString();
            Oberflaeche.werti = ergebnis.Werte();
            Oberflaeche.prozente = "<html><body>AP (" + app+ " %) :<br> <br> VP ("+vpp+" %):<br> <br> HP (" + hpp+" %):<br> <br> MP ("+mpp+" %):<br> <br> Kraft :<br><body><html>";
        }
    }


    /* alle kombinationen an ausrmit den noch verwendbaren gegenstals sets erstellen und speichern */
    public static void erstelleSetEquip(int check, float app,  float vpp, float hpp, float mpp)
    {
        ergebnis = new SetEquip(waffensammlung[0], schildsammlung[0], ruestungssammlung[0], helmsammlung[0], sonstiges[0], "unbekannt");
        int[] eles = new int[5]; // nix = 0, feuer/wind = 1, eis/erde = 2


        for(int i=0; i < waffensammlung.length; i++)
        {
            Arrays.fill( eles, 0);
            eles[0] = waffensammlung[i].getEle();

            for(int j =0; j< schildsammlung.length; j++)
            {
                eles[1] = schildsammlung[j].getEle();

                for(int k=0; k < ruestungssammlung.length; k++)
                {
                    eles[2] = ruestungssammlung[k].getEle();

                    for(int l =0; l < helmsammlung.length; l++)
                    {
                        eles[3] = helmsammlung[l].getEle();

                        for( int m =0; m< sonstiges.length; m++)
                        {
                            eles[4] = sonstiges[m].getEle();

                            if(Freigabe(eles))
                            {
                                if(defenseEle( schildsammlung[j],  ruestungssammlung[k]))
                                {
                                    if(check >= (waffensammlung[i].Kraft + schildsammlung[j].Kraft + ruestungssammlung[k].Kraft + helmsammlung[l].Kraft + sonstiges[m].Kraft))
                                    {
                                        if(((app/100)*waffensammlung[i].AP + (app/100)*schildsammlung[j].AP + (app/100)*ruestungssammlung[k].AP + (app/100)*helmsammlung[l].AP + (app/100)*sonstiges[m].AP + (vpp/100)*waffensammlung[i].VP + (vpp/100)*schildsammlung[j].VP + (vpp/100)*ruestungssammlung[k].VP + (vpp/100)*helmsammlung[l].VP + (vpp/100)*sonstiges[m].VP + (hpp/100)*waffensammlung[i].HP + (hpp/100)*schildsammlung[j].HP + (hpp/100)*ruestungssammlung[k].HP + (hpp/100)*helmsammlung[l].HP + (hpp/100)*sonstiges[m].HP + (mpp/100)*waffensammlung[i].MP + (mpp/100)*schildsammlung[j].MP + (mpp/100)*ruestungssammlung[k].MP + (mpp/100)*helmsammlung[l].MP + (mpp/100)*sonstiges[m].MP) > (float) ((app/100) * ergebnis.getAp() + (vpp/100)*ergebnis.getVp() + (hpp/100)*ergebnis.getHp() +(mpp/100)*ergebnis.getMp()))
                                        {
                                            ergebnis = new SetEquip(waffensammlung[i], schildsammlung[j], ruestungssammlung[k], helmsammlung[l], sonstiges[m], "unbekannt");
                                        }
                                        else eles[4]=0; continue;
                                    }
                                    else eles[4]=0; continue;}
                                else eles[4]=0; continue;
                            }
                            eles[4]=0;
                        }eles[3]=0;}eles[2]=0;}eles[1]=0;}}

    }

    /*
     * kombiniert das equip auch keine falschen elemente ?
     */
    public static boolean Freigabe(int[] eles)
    {

        boolean feuerwind = false;
        boolean eiserde= false;

        for(int b : eles)
        {
            if (b==1)
            {feuerwind =true;}
            if(b==2)
            {eiserde=true;}
        }

        if(feuerwind && eiserde)
            return false;
        else
            return true;


    }

    /*
     * die eingestellten Prozentzahlen auf 100% verrechnen
     * */
    public static void prozAnpassen()
    {
        if(app >0.5 && vpp<0.5 && hpp <0.5 && mpp<0.5) {app = 100; return;}
        if(app <0.5 && vpp>0.5 && hpp <0.5 && mpp<0.5) {vpp = 100; return;}
        if(app <0.5 && vpp<0.5 && hpp >0.5 && mpp<0.5) {hpp = 100; return;}
        if(app <0.5 && vpp<0.5 && hpp <0.5 && mpp>0.5) {mpp = 100; return;}

        float basis = 0;
        float teile=0;

        ArrayList<Float> prozi = new ArrayList<Float>();
        if(app>0.5) {prozi.add(app);}
        if(vpp>0.5) {prozi.add(vpp);}
        if(hpp>0.5) {prozi.add(hpp);}
        if(mpp>0.5) {prozi.add(mpp);}

        if(prozi.size() >0)
        {	Float[] proz = (Float[]) prozi.toArray( new Float[0]);
            Arrays.sort(proz);
            basis = proz[0];

            for(float n : proz)
            {
                teile = teile + (n/basis);
            }
            float prozsatz= 0;
            prozsatz = 100/teile;

            float mp =(mpp/basis)*prozsatz*100;
            float hp =(hpp/basis)*prozsatz*100;
            float ap =(app/basis)*prozsatz*100;
            float vp =(vpp/basis)*prozsatz*100;

            float mps =Math.round(mp);
            float hps =Math.round(hp);
            float aps =Math.round(ap);
            float vps =Math.round(vp);

            app = aps/100;
            vpp = vps/100;
            hpp = hps/100;
            mpp = mps/100;
        }
        else {app = 0; vpp = 0; hpp =0; mpp=0;}

    }

    /*
     * ob ide elemente von rund schild zusammen passen und auch den wentsprechen
     */
    public static boolean defenseEle(Schild schild, Ruestung ruestung)
    {
        if(boxi.defMussEis && !boxi.defMussErde)
        {
            if(schild.Erde || ruestung.Erde) {return false;}
            if(schild.Eis || ruestung.Eis) {return true;} else {return false;}
        }

        if(boxi.defMussErde && !boxi.defMussEis)
        {
            if(schild.Eis || ruestung.Eis) {return false;}
            if(schild.Erde || ruestung.Erde) {return true;} else {return false;}
        }

        if(boxi.defMussFeuer && !boxi.defMussWind)
        {
            if(schild.Wind || ruestung.Wind) { return false;}
            if(schild.Feuer || ruestung.Feuer) {return true;} else {return false;}
        }

        if(boxi.defMussWind && !boxi.defMussFeuer)
        {
            if(schild.Feuer || ruestung.Feuer) {return false;}
            if(schild.Wind || ruestung.Wind) {return true;} else {return false;}
        }

        if(boxi.defMussEis && boxi.defMussErde)
        {
            if((schild.Eis && ruestung.Erde) || (schild.Erde && ruestung.Eis))
            {return true;}
            else {return false;}
        }

        if(boxi.defMussFeuer && boxi.defMussWind)
        {
            if((schild.Feuer && ruestung.Wind) || (schild.Wind && ruestung.Feuer))
            {return true;}
            else {return false;}
        }

        return true;
    }

    /*
     * gibt die gespeicherten sets als liste zur
     */
    public static LinkedList<SetEquip> getListEquips()
    {
        return new LinkedList<SetEquip>(Arrays.asList(skEquipSaves));
    }

    /*
     * gibt die gespeicherten ehs als liste zur
     */
    public static LinkedList<EinheitenSave> getListEhs()
    {
        LinkedList<EinheitenSave> ehs = new LinkedList<EinheitenSave>();
        for( EinheitenSave bla : ehgesichert)
        {
            if( !bla.titel.equals("nix"))
            {
                ehs.add(bla);
            }
        }

        return ehs;
    }

    /*
     * beim laden werden die arrays hier mit den geladenen equips gef
     */
    public static void setEquips(LinkedList<SetEquip> alpha)
    {
        for( SetEquip bla : alpha)
        {

            if(bla != null)
            {	boolean flag = false;

                for( SetEquip gla : Main.skEquipSaves)
                {
                    if(gla != null)
                    {if(bla.name.equals(gla.name))
                    {flag = true;}
                    }
                }

                if(!flag)
                {Main.titels[Oberflaeche.indexEquipSave] = bla.name;
                    Main.skEquipSaves[Oberflaeche.indexEquipSave] = bla;
                    Main.equipSaves[Oberflaeche.indexEquipSave] = bla.Werte();
                    Oberflaeche.indexEquipSave++;
                    if(Oberflaeche.indexEquipSave >29) Oberflaeche.indexEquipSave=0;}
            }}
    }

    /*
     * beim laden werden die arrays hier mit den geladenen ehs gef
     */
    public static void setEhVorlagen(LinkedList<EinheitenSave> beta)
    {
        for(EinheitenSave eh : beta)
        {
            if(eh != null)
            {	boolean flag = false;

                for( EinheitenSave gla : Main.ehgesichert)
                {
                    if(gla != null)
                    {if(eh.titel.equals(gla.titel))
                    {flag = true;}
                    }
                }

                if(!flag)
                {Main.ehgesichert[Main.ehindex] = eh;
                    Main.ehindex = Main.ehindex+1;
                    if(Main.ehindex >= 30) {Main.ehindex = 0;}
                }
            }}
    }

    /*
     * Aendert die werte/eigenschaften des dummys
     */
    public static void setDummy(Einheiten dum)
    {
        einheiten[0]=dum;
    }

}

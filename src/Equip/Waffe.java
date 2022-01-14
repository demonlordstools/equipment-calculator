package Equip;

import java.util.ArrayList;

public class Waffe extends Equip{

    public Waffe (int ap, int vp, int hp, int mp, int kraft, boolean fk, boolean fire, boolean earth, boolean ice, boolean air, int opfer, String name)
    {
        super(ap, vp, hp, mp, kraft, fk, fire, earth, ice, air, opfer, name);

    }
    

    /* erzeuge einen array der klasse waffen in dem alle waffen gespeichert sind*/
    public static ArrayList<Waffe> erstelleWaffen()
    {
        ArrayList<Waffe> list = new ArrayList<Waffe>();

        list.add( new Waffe(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"));
        list.add( new Waffe(3, 0, 0, 0, 2, false, false, false, false, false, 0, "Angespitzer Holzstock"));
        list.add( new Waffe(35, 10, 10, 0, 9, false, false, false, false, false, 1, "Kurzschwert"));
        list.add( new Waffe(45, 0, 0, 0, 25, true, false, false, false, false, 1, "Leichte Armbrust"));
        list.add( new Waffe(10, 0, 0, 0, 3, true, false, false, false, false, 1, "Wurfpfeile"));
        list.add( new Waffe(18, 0, 0, 0, 5, true, false, false, false, false, 1, "Kurzbogen"));
        list.add( new Waffe(-10, 0, 0, 5, 8, true,  false,  false,  true,  false, 1, "Harfe der Banshee" ));
        list.add( new Waffe(15, 0, 0, 10, 15,  false,  false,  false, false,  false, 1, "Langdolch der Geister"));
        list.add( new Waffe(25, 15, 0, 0, 10, true,  false,  false,  false,  false, 1, "Stabschleuder"));
        list.add( new Waffe(10, -5, 0, 0, 10,  false,  false,  false,  false, true, 1, "Federschwert"));
        list.add( new Waffe(61, -45, -49, 0, 51,  false, true,  false,  false,  false, 1, "Magmaaxt"));
        list.add( new Waffe(20, 5, 5, 0, 12,  false,  false,  false,  false, true, 1, "Wirbelwindfaust"));
        list.add( new Waffe(10, 5, 3, 0, 10,  false,  false,  false, true,  false, 1, "Eisdolch"));
        list.add( new Waffe(-40, -20, 0, 15, 7,  false, true,  false,  false,  false, 2, "Novizenstab"));
        list.add( new Waffe(30, 30, 0, 0, 35,  false,  false,  false,  false, true, 2, "Tanzender Krummsaebel"));
        list.add( new Waffe(37, 9 , 35, 0, 33,  false,  false, false,  false,  false, 2, "Krummsaebel"));
        list.add( new Waffe(40, 20, 20, 0, 50,  false,  false,  false, true, false, 3, "Froststab"));
        list.add( new Waffe(75, 0, 0, 0, 30, true,  false,  false,  false,  false, 3, "Schwere Armbrust"));
        list.add( new Waffe(60, -12, 0, 0, 40, false, false, false, true, false, 3, "Frostbrand"));
        list.add( new Waffe(20, 0, 5, 10, 20, true, false, false, false, true, 3, "Lichtbogen"));
        list.add( new Waffe(90, 50, -90, -50, 75, false, false, false, false, false, 3, "Chronitonklingen"));
        list.add( new Waffe(45, 38, 23, 0, 39, false, true, false, false, false, 3, "Feuerhellebarde"));
        list.add( new Waffe(25, 0, 0, 0, 8, true, false, true, false, false, 3, "Dreckschleuder"));
        list.add( new Waffe(95, 0, 0, 0, 75, false, false, true, false, false, 4, "Erdvernichter"));
        list.add( new Waffe(45, 0, 0, 0, 20, true, false, false, false, true, 4, "Bogen des Windes"));
        list.add( new Waffe(100, 50, 30, -100, 120, false, false, true, false, false, 4, "Zwergischer Schmiedehammer"));
        list.add( new Waffe(40, 0, 0, 0, 25, true, true, false, false, false, 4, "Feuerbogen"));
        list.add( new Waffe(44, 20, 0, 0, 20, false, false, false, false, false, 5, "Bo"));
        list.add( new Waffe(95, -15, 5, 0, 60, false, false, true, false, false, 5, "Zwergenaxt"));
        list.add( new Waffe(145, -55, 0, 0, 75, true, false, false, false, false, 5, "Elfischer Jagdbogen"));
        list.add( new Waffe(-200, -150, 0, 40, 30, false, true, false, false, false, 5, "Flammenstab"));
        list.add( new Waffe(50, 0, 0, 0, 20, true, false, false, true, false, 5, "Eisbogen"));
        list.add( new Waffe(250, -45, -5, 0, 100, false, false, false, false, false, 5, "Heliosklinge"));
        list.add( new Waffe(128, -16, 0, 0, 67, true, true, false, false, false, 5, "Schwere Balliste des Drachentoeters"));
        list.add( new Waffe(80, 0, 30, 10, 100, false, false, false, true, false, 5, "Eislanze"));
        list.add( new Waffe(140, 60, 45, 0, 132, false, true, false, false, false, 5, "Feuerkrallen"));
        list.add( new Waffe(170, -170, 120, 0, 112, false, false, false, false, false, 5, "Grosse Spaltaxt"));
        list.add( new Waffe(175, -40, 0, 0, 78, true, true, false, false, false, 6, "Daemonenarmbrust"));
        list.add( new Waffe(85, -5, -5, 0, 33, true, false, false, false, true, 6, "Sturmbogen"));
        list.add( new Waffe(155, -30, -10, 0, 60, true, false, true, false, false, 6, "Knochenarmbrust"));
        list.add( new Waffe(110, -25, 0, 0, 40, true, false, false, true, false, 7, "Splitterbogen"));
        list.add( new Waffe(250, 25, 25, 0, 225, false, false, true, false, false, 7, "Titanengladius"));
        list.add( new Waffe(100, 30, 5, 0, 40, false, false, false, true, false, 7, "Eissaebel"));
        list.add( new Waffe(200, 50, 0, 0, 50, false, true, false, false, false, 8, "Blutbeflecktes Schwert des Zorns"));
        list.add( new Waffe(400, 120, 120, 0, 155, false, false, false, false, false, 8, "Goetterzucht"));
        list.add( new Waffe(400, 0, 0, 50, 65, false, false, false, true, false, 8, "Hammer des Gletscherkoenigs"));
        list.add( new Waffe(410, -10, -10, 0, 235, false, true, false, false, false, 9, "Hoellenschwert"));
        list.add( new Waffe(510, 60, 15, 0, 400, false, false, false, true, false, 9, "Dimensionenklingen"));
        list.add( new Waffe(100, 0, 0, 0, 40, true, true, false, false, false, 9, "Karmesinroter Bogen"));
        list.add( new Waffe(100, 0, 0, 200, 35, false, false, false, false, false, 9, "Stab der Erleuchtung"));
        list.add( new Waffe(600, 200, 200, 20, 500, false, false, false, false, true, 10, "Mjoelnir"));
        list.add( new Waffe(400, 200, 200, 0, 103, false, false, false, false, false, 10, "Verzauberte Knochenaxt"));
        list.add( new Waffe(130, 0, 0, 0, 35, true, false, false, false, false, 10, "Uralter Sauwerfer"));
        list.add( new Waffe(180, 60, 20, 0, 55, false, false, false, true, false, 10, "Toedlicher Splitter"));

        return list;
    }

}

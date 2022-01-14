package Equip;

/*
 * hält die methoden zum einheiten lvln unter parametern, sowie das erstellen einer gelvelten einheit aus der bastelliste
 */
public class Bausystem {

  public static int brennendesBlut = 0;
  public static int steinhaut = 0;
  public static int dunklesOmen = 0;
  public static int geisterruestung = 0;
  public static int hoellenaura = 0;
  public static int verrotten = 0;
  public static int energiefokuss = 0;
  public static int goetterschild = 0;
  public static int heiligerRitus = 0;
  public static int meditation = 0;
  public static int drachenwut = 0;
  public static int drachenhaut = 0;
  public static int dhstufe = 0;
  public static int dhausbildungsdauer = 0; // x * 30 min = ausbildungsdauer
  public static int hospi = 0;
  public static int takti = 0;

  public static char trank = '0'; // 0=keiner , 1=50ap , 2=150ap , 3=350ap , 4=700ap , 5=50vp , 6=150vp , 7=350vp , 8=700vp , 9=50hp , a=150hp , b=400hp , c=1000hp , d=50mp , e=100mp , f=200mp , g=750mp
  public static int gott = 0;	// 0 = keiner , 1 = ap-mensch , 2 = vp-mensch , 3 = hp-mensch , 4 = mp-mensch , 5 = ap-untot , 6 = vp-untot , 7 = hp-untot , 8 = ap-daemonen, 9=ap-drache, 10=vp-drache
  public static Einheiten einheit = Main.einheiten[0];
  public static SetEquip equip1 = null;
  public static SetEquip equip2 = null;

  public static int lvlcount = 0;


  /*
   * errechnet den wert eines attributs nach gewissen lvl parametern
   */
  public static int stufenwert(int stufe , int art , int basis , int auslassen)
  {	double base = basis;

    if(basis <= 0) {return basis;}

    if(art == 1)
    {
      double baseProz = 1.15;
      baseProz = baseProz - (auslassen*0.01);

      for(int i = 0; i < stufe; i++)
      {
        base = base*baseProz;
        baseProz =  baseProz-0.01;
      }
      return (int)(Math.round(base));
    }
    if(art == 2)
    {
      double baseProz = 1.3;
      baseProz = baseProz - (auslassen*0.01);

      for(int i = 0; i < stufe; i++)
      {
        base = base*baseProz;
        baseProz =  baseProz-0.01;
      }
      return (int)(Math.round(base));
    }
    if(art == 3)
    {
      double baseProz = 1.25;
      baseProz = baseProz - (auslassen*0.02);

      for(int i = 0; i < stufe; i++)
      {
        base = base*baseProz;
        baseProz =  baseProz-0.02;
      }
      return (int)(Math.round(base));
    }
    if(art == 4)
    {
      double baseProz = 1.25;
      baseProz = baseProz - (auslassen*0.01);

      for(int i = 0; i < stufe; i++)
      {
        base = base*baseProz;
        baseProz =  baseProz-0.01;
      }
      return (int)(Math.round(base));
    }
    return 0;
  }

  /*
   * erstellt die tabelle in der bei jedem lvl jeder wert angezeigt wird.
   * berwerden trforschungen , gruppengebs und equips
   */
  public static Integer[][] Rechnen(int equi)	//1=equip1 , 2=equip2 , 3=kein equi
  {
    if(einheit.kraft==0){equi=0;}

    Integer[][] tabelle = new Integer[11][5];

    for(int i = 0; i<11; i++)
    {tabelle[i][0] = i;}

    tabelle[0][1] = einheit.ap;
    tabelle[0][2] = einheit.vp;
    tabelle[0][3] = einheit.hp;
    tabelle[0][4] = einheit.mp;


    if(einheit.rasse.equals(Tags.MENSCH))
    { 	float ap = (energiefokuss*0.01f);
      float vp = (heiligerRitus*0.015f);
      float hp = (goetterschild*0.01f);
      int mp = 6*meditation;
      tabelle[0][1] = ((int) (einheit.ap *ap)) + tabelle[0][1];
      tabelle[0][2] = ((int) (einheit.vp *vp)) + tabelle[0][2];
      tabelle[0][3] = ((int) (einheit.hp *hp)) + tabelle[0][3];
      tabelle[0][4] = mp + tabelle[0][4];

      float grpvp = (takti*0.03f);
      float grphp = (hospi*0.02f);
      tabelle[0][2] = ((int) (einheit.vp *grpvp)) + tabelle[0][2];
      tabelle[0][3] = ((int) (einheit.hp *grphp)) + tabelle[0][3];

      if(gott == 1) { tabelle[0][1] = ((int) (einheit.ap *0.3)) + tabelle[0][1];}
      if(gott == 2) { tabelle[0][2] = ((int) (einheit.vp *0.35)) + tabelle[0][2];}
      if(gott == 3) { tabelle[0][3] = ((int) (einheit.hp *0.25)) + tabelle[0][3];}
      if(gott == 4) { tabelle[0][4] = ((int) (einheit.mp *0.4)) + tabelle[0][4];}
    }
    if(einheit.rasse.equals(Tags.UNTOT))
    { 	float ap = (verrotten*0.02f);
      float vp = (dunklesOmen*0.015f);
      float hp = (geisterruestung*0.02f);
      int mp = hoellenaura*10;
      tabelle[0][1] = ((int) (einheit.ap *ap)) + tabelle[0][1];
      tabelle[0][2] = ((int) (einheit.vp *vp)) + tabelle[0][2];
      tabelle[0][3] = ((int) (einheit.hp *hp)) + tabelle[0][3];
      tabelle[0][4] = mp + tabelle[0][4];

      float grpvp = (takti*0.03f);
      float grphp = (hospi*0.02f);
      tabelle[0][2] = ((int) (einheit.vp *grpvp)) + tabelle[0][2];
      tabelle[0][3] = ((int) (einheit.hp *grphp)) + tabelle[0][3];

      if(gott == 5) { tabelle[0][1] = ((int) (einheit.ap *0.2)) + tabelle[0][1];}
      if(gott == 6) { tabelle[0][2] = ((int) (einheit.vp *0.25)) + tabelle[0][2];}
      if(gott == 7) { tabelle[0][3] = ((int) (einheit.hp *0.2)) + tabelle[0][3];}
    }
    if(einheit.rasse.equals(Tags.DAEMON))
    { 	float ap = (brennendesBlut*0.02f);
      float vp = (steinhaut*0.02f);
      tabelle[0][1] = ((int) (einheit.ap *ap)) + tabelle[0][1];
      tabelle[0][2] = ((int) (einheit.vp *vp)) + tabelle[0][2];

      float grpvp = (takti*0.03f);
      float grphp = (hospi*0.02f);
      tabelle[0][2] = ((int) (einheit.vp *grpvp)) + tabelle[0][2];
      tabelle[0][3] = ((int) (einheit.hp *grphp)) + tabelle[0][3];

      if(gott == 8) { tabelle[0][1] = ((int) (einheit.ap *0.125)) + tabelle[0][1];}
    }
    if(einheit.rasse.equals(Tags.DRACHE))
    {
      int mult = 1;
      switch(dhausbildungsdauer) {
        case 1 : mult = 1; break;
        case 2 : mult = 2; break;
        case 3 : mult = 4; break;
        case 4 : mult = 5; break;
        case 5 : mult = 7; break;
        case 6 : mult = 9; break;
        default : break;
      }

      float[][] drachis = Einheiten.drachenBasisWerte();
      float[] werte= drachis[0];
      if(einheit.name.equals("Felsendrache")) {werte = drachis[1];}
      if(einheit.name.equals("Donnervogel")) {werte = drachis[2];}
      if(einheit.name.equals("Eiswyrm")) {werte = drachis[3];}
      if(einheit.name.equals("Phoenix")) {werte = drachis[4];}

      int grundap = tabelle[0][1] = Math.round(werte[0] *dhstufe*mult) ;
      int grundvp = tabelle[0][2] = Math.round(werte[1] *dhstufe*mult) ;
      int grundhp = tabelle[0][3] = Math.round(werte[2] *dhstufe*mult) ;

      float grpvp = (takti*0.03f);
      float grphp = (hospi*0.02f);
      tabelle[0][2] = ((int) (grundvp *grpvp)) + tabelle[0][2];
      tabelle[0][3] = ((int) (grundhp *grphp)) + tabelle[0][3];

      float ap = (drachenwut*0.01f);
      float vp = (drachenhaut*0.025f);
      tabelle[0][1] = ((int) (grundap *ap)) + tabelle[0][1];
      tabelle[0][2] = ((int) (grundvp *vp)) + tabelle[0][2];

      if(gott == 9) { tabelle[0][1] = ((int) (grundap *0.1)) + tabelle[0][1];}
      if(gott == 10) { tabelle[0][2] = ((int) (grundvp *0.1)) + tabelle[0][2];}
    }


    if(equip1 != null && equip2 != null)
    {if(equi==1)
    {
      tabelle[0][1] = tabelle[0][1] + equip1.getAp();
      tabelle[0][2] = tabelle[0][2] + equip1.getVp();
      tabelle[0][3] = tabelle[0][3] + equip1.getHp();
      tabelle[0][4] = tabelle[0][4] + equip1.getMp();

    }
      if(equi == 2)
      {
        tabelle[0][1] = tabelle[0][1] + equip2.getAp();
        tabelle[0][2] = tabelle[0][2] + equip2.getVp();
        tabelle[0][3] = tabelle[0][3] + equip2.getHp();
        tabelle[0][4] = tabelle[0][4] + equip2.getMp();
      }}

    switch(trank){
      case '0': {break;}
      case '1': {tabelle[0][1] = tabelle[0][1] +50; break;}
      case '2': {tabelle[0][1] = tabelle[0][1] +150; break;}
      case '3': {tabelle[0][1] = tabelle[0][1] +350; break;}
      case '4': {tabelle[0][1] = tabelle[0][1] +700; break;}
      case '5': {tabelle[0][2] = tabelle[0][2] +50; break;}
      case '6': {tabelle[0][2] = tabelle[0][2] +150; break;}
      case '7': {tabelle[0][2] = tabelle[0][2] +350; break;}
      case '8': {tabelle[0][2] = tabelle[0][2] +700; break;}
      case '9': {tabelle[0][3] = tabelle[0][3] +50; break;}
      case 'a': {tabelle[0][3] = tabelle[0][3] +150; break;}
      case 'b': {tabelle[0][3] = tabelle[0][3] +400; break;}
      case 'c': {tabelle[0][3] = tabelle[0][3] +1000; break;}
      case 'd': {tabelle[0][4] = tabelle[0][4] +50; break;}
      case 'e': {tabelle[0][4] = tabelle[0][4] +100; break;}
      case 'f': {tabelle[0][4] = tabelle[0][4] +200; break;}
      case 'g': {tabelle[0][4] = tabelle[0][4] +750; break;}
      default: {break;}
    }

    for(int i = 1; i<11; i++)
    {
      for(int j = 1; j<5; j++)
      {
        tabelle[i][j] = stufenwert(i , j , tabelle[0][j], 0);
      }
    }

    return tabelle;
  }

  /*
   * nimmt sich die elemente aus der liste (eh basteln) und erstellt daraus die gelevelte einheit.
   * diese wird dann im rechten feld angezeigt.
   */
  public static String basteln(String[] elements, int laenge)
  {
    Integer[][] stufen = Rechnen(3);
    int ap = stufen[0][1];
    int vp = stufen[0][2];
    int hp = stufen[0][3];
    int mp = stufen[0][4];

    int titelIndex = 0;
    int aplvls=0;
    int vplvls=0;
    int hplvls=0;
    int mplvls=0;

    SetEquip angelegt = new SetEquip(new Waffe(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"), new Schild(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"),
            new Ruestung(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"), new Helm(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix"),
            new Spezial(0, 0, 0, 0, 0, false, false, false, false, false, 0, "besser nix") , "unbekannt");

    for(String gla : elements)
    {
      if(gla.charAt(0)=='e')
      {
        ap = ap-angelegt.getAp();
        vp = vp-angelegt.getVp();
        hp = hp-angelegt.getHp();
        mp = mp-angelegt.getMp();

        String name = gla.substring(3);

        for(int i =0; i<laenge; i++)
        {if(Main.titels[i].equals(name)) {titelIndex = i;}}

        if(Main.skEquipSaves[titelIndex] != null)
        {angelegt = Main.skEquipSaves[titelIndex];}

        ap = ap+angelegt.getAp();
        vp = vp+angelegt.getVp();
        hp = hp+angelegt.getHp();
        mp = mp+angelegt.getMp();
      }
      else
      {
        int stufenlvln = 0;
        if(gla.indexOf("10")>=0){stufenlvln=10;}
        else{int lvl = Integer.parseInt(""+gla.charAt((gla.indexOf(" x")-1))); stufenlvln = lvl; }
        if(gla.contains("Ap")) { ap = stufenwert(stufenlvln , 1 , ap , aplvls); aplvls = aplvls + stufenlvln;}
        if(gla.contains("Vp")) { vp = stufenwert(stufenlvln , 2 , vp , vplvls); vplvls = vplvls + stufenlvln;}
        if(gla.contains("Hp")) { hp = stufenwert(stufenlvln , 3 , hp , hplvls); hplvls = hplvls + stufenlvln;}
        if(gla.contains("Mp")) { mp = stufenwert(stufenlvln , 4 , mp , mplvls); mplvls = mplvls + stufenlvln;}

      }
    }
    String bla = einheit.name;
    StringBuffer str = new StringBuffer();
    str.append("<html><body>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Einheit : "+bla+"<br><br>&nbsp;&nbsp;lvl : " + (aplvls+vplvls+hplvls+mplvls)+
            "<br>&nbsp;&nbsp;Ap : "+ap+"<br>&nbsp;&nbsp;Vp : "+vp+"<br>&nbsp;&nbsp;Hp : "+hp+"<br>&nbsp;&nbsp;Mp : "+mp+"<br>");

    int op = (int) (((aplvls+vplvls+hplvls+mplvls)+1)*(ap*0.2432+vp*0.1728+hp*0.1408+mp*0.1728));
    str.append("&nbsp;&nbsp;Opferpunkte : " + op + " <br><br>");

    boolean atfeuer = false;
    boolean atluft = false;
    boolean ateis = false;
    boolean aterde = false;
    boolean weaponFk = false;

    if(angelegt.weapon.Eis || einheit.ice) {ateis = true;}
    if(angelegt.weapon.Erde || einheit.earth) {aterde = true;}
    if(angelegt.weapon.Feuer || einheit.fire) {atfeuer = true;}
    if(angelegt.weapon.Wind || einheit.air) {atluft = true;}
    if(angelegt.weapon.FK) {weaponFk = true;}

    if(!atfeuer && !atluft && !aterde && !ateis && weaponFk) {str.append("&nbsp;&nbsp;AtElement : Keines - FK<br>");}
    if(atfeuer && !atluft && weaponFk) {str.append("&nbsp;&nbsp;AtElement : Feuer - FK<br>");}
    if(!atfeuer && atluft && weaponFk) {str.append("&nbsp;&nbsp;AtElement : Luft - FK<br>");}
    if(atfeuer && atluft && weaponFk) {str.append("&nbsp;&nbsp;AtElemente : Feuer/Luft - FK<br>");}
    if(aterde && !ateis && weaponFk) {str.append("&nbsp;&nbsp;AtElement : Erde - FK<br>");}
    if(!aterde && ateis && weaponFk) {str.append("&nbsp;&nbsp;AtElement : Eis - FK<br>");}
    if(aterde && ateis && weaponFk) {str.append("&nbsp;&nbsp;AtElemente : Erde/Eis - FK<br>");}
    if(!atfeuer && !atluft && !aterde && !ateis && !weaponFk) {str.append("&nbsp;&nbsp;AtElement : Keines<br>");}
    if(atfeuer && !atluft && !weaponFk) {str.append("&nbsp;&nbsp;AtElement : Feuer<br>");}
    if(!atfeuer && atluft && !weaponFk) {str.append("&nbsp;&nbsp;AtElement : Luft<br>");}
    if(atfeuer && atluft && !weaponFk) {str.append("&nbsp;&nbsp;AtElemente : Feuer/Luft<br>");}
    if(aterde && !ateis && !weaponFk) {str.append("&nbsp;&nbsp;AtElement : Erde<br>");}
    if(!aterde && ateis && !weaponFk) {str.append("&nbsp;&nbsp;AtElement : Eis<br>");}
    if(aterde && ateis && !weaponFk) {str.append("&nbsp;&nbsp;AtElemente : Erde/Eis<br>");}


    boolean feuer = false;
    boolean luft = false;
    boolean eis = false;
    boolean erde = false;

    if(einheit.air || angelegt.shield.Wind || angelegt.armor.Wind) {luft = true;}
    if(einheit.fire || angelegt.shield.Feuer || angelegt.armor.Feuer) {feuer = true;}
    if(einheit.earth || angelegt.shield.Erde || angelegt.armor.Erde) {erde = true;}
    if(einheit.ice || angelegt.shield.Eis || angelegt.armor.Eis) {eis = true;}

    if(!feuer && !luft && !erde && !eis) {str.append("&nbsp;&nbsp;DefElement : Keines<br>");}
    if(feuer && !luft) {str.append("&nbsp;&nbsp;DefElement : Feuer<br>");}
    if(!feuer && luft) {str.append("&nbsp;&nbsp;DefElement : Luft<br>");}
    if(feuer && luft) {str.append("&nbsp;&nbsp;DefElemente : Feuer/Luft<br>");}
    if(erde && !eis) {str.append("&nbsp;&nbsp;DefElement : Erde<br>");}
    if(!erde && eis) {str.append("&nbsp;&nbsp;DefElement : Eis<br>");}
    if(erde && eis) {str.append("&nbsp;&nbsp;DefElemente : Erde/Eis<br>");}

    str.append("</body></html>");

    int spezielleKp = einheit.kp;
    if(einheit.rasse.equals(Tags.DRACHE))
    {
      int div = 1;
      switch(dhausbildungsdauer) {
        case 1 : div = 9; break;
        case 2 : div = 7; break;
        case 3 : div = 5; break;
        case 4 : div = 4; break;
        case 5 : div = 2; break;
        case 6 : div = 1; break;
        default : break;
      }
      spezielleKp = Math.round(einheit.kp / div);
    }

    Main.aktuelleserg = new EinheitenSave(bla, einheit.rasse, angelegt.weapon.Kraft, weaponFk, spezielleKp, ap, vp, hp, mp, feuer, luft, erde, eis,  atfeuer, atluft, aterde, ateis, (aplvls+vplvls+hplvls+mplvls), "unbekannt", op);


    return new String(str);
  }

}

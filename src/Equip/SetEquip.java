package Equip;

import java.io.Serializable;

/*
 * hält daten über ein ausrüstungsset.
 * hält viele methoden um differenziert auskunft über das set zu erteilen
 */
public class SetEquip implements Serializable{

    public Waffe weapon;
    public Schild shield;
    public Ruestung armor;
    public Helm head;
    public Spezial special;
    public String name;

    public SetEquip(Waffe a, Schild b, Ruestung c, Helm d, Spezial e, String itel)
    {

        weapon = a;
        shield=b;
        armor=c;
        head=d;
        special=e;
        name = itel;
    }

    // liefert werte mit sk verrechnet
    public String Werte()	//<html><body>...<br> <br> ...<br> <br> ...<br> <br> ...<br> <br> ...<br><body><html>
    {
        String werte = "<html><body>" + getSkAp() +  "<br><br>" + getSkVp() + "<br><br>" +
                getSkHp() +   "<br><br> " + getSkMp() + "<br><br>"+ 	this.getKraft() + "<br><body><html>" ;
        return werte;
    }

    //liefert textfeld in dem AP + wert mit sk verrechnet drin steht
    public String WerteString()	//<html><body>...<br> <br> ...<br> <br> ...<br> <br> ...<br> <br> ...<br><body><html>
    {
        String werte = "<html><body>" + "AP: "+getSkAp() +  "<br><br>" + "VP: "+getSkVp() + "<br><br>" +
                "HP:"+getSkHp() +   "<br><br> " +"MP:"+ getSkMp() + "<br><br>"+ "Kraft:"+	this.getKraft() + "<br><body><html>" ;
        return werte;
    }

    // liefert die namen der ausr
    public String toString()
    { String s = "<html><body>" + weapon.name + "<br><br>" + shield.name + "<br><br>" + armor.name +  "<br><br>" + head.name +  "<br><br>" + special.name +"<br><body><html>" ;
        return s;
    }

    // gibt die rmit namen und ihren elementen zur
    public String EquipInfos()
    { 	StringBuffer buf = new StringBuffer();
        buf.append("<html><body>" + weapon.name + "  ");
        if(weapon.getEle() != 0 || weapon.FK)
        {	if(weapon.Eis && !weapon.FK) buf.append("(Eis)");
            if(weapon.Erde  && !weapon.FK) buf.append("(Erde)");
            if(weapon.Feuer  && !weapon.FK) buf.append("(Feuer)");
            if(weapon.Wind  && !weapon.FK) buf.append("(Wind)");
            if(weapon.Eis && weapon.FK) buf.append("(Eis , FK)");
            if(weapon.Erde  && weapon.FK) buf.append("(Erde , FK)");
            if(weapon.Feuer  && weapon.FK) buf.append("(Feuer , FK)");
            if(weapon.Wind  && weapon.FK) buf.append("(Wind , FK)");
            if(!weapon.Eis && !weapon.Erde && !weapon.Feuer && !weapon.Wind && weapon.FK) buf.append("(FK)");
        }
        buf.append("<br><br>" + shield.name + "  ");
        if(shield.getEle() != 0)
        {	if(shield.Eis) buf.append("(Eis)");
            if(shield.Erde) buf.append("(Erde)");
            if(shield.Feuer) buf.append("(Feuer)");
            if(shield.Wind) buf.append("(Wind)");
        }
        buf.append("<br><br>" + armor.name +  "  ");
        if(armor.getEle() != 0)
        {	if(armor.Eis) buf.append("(Eis)");
            if(armor.Erde) buf.append("(Erde)");
            if(armor.Feuer) buf.append("(Feuer)");
            if(armor.Wind) buf.append("(Wind)");
        }
        buf.append("<br><br>" + head.name +  "  ");
        if(head.getEle() != 0)
        {	if(head.Eis) buf.append("(Eis)");
            if(head.Erde) buf.append("(Erde)");
            if(head.Feuer) buf.append("(Feuer)");
            if(head.Wind) buf.append("(Wind)");
        }
        buf.append("<br><br>" + special.name +"  ");
        if(special.getEle() != 0)
        {	if(special.Eis) buf.append("(Eis)");
            if(special.Erde) buf.append("(Erde)");
            if(special.Feuer) buf.append("(Feuer)");
            if(special.Wind) buf.append("(Wind)");
        }
        buf.append("<body><html>");
        String s = new String(buf);
        return s;
    }

    // gesamt ap eines sets
    public int getAp()
    {
//		int summe = (weapon.AP + shield.AP + armor.AP + head.AP + special.AP);
//		return ((int)(Math.round(((Main.lvlSk*0.025)*(summe)))))+summe;
        return (weapon.AP + shield.AP + armor.AP + head.AP + special.AP);
    }

    // gesamt vp eines sets
    public int getVp()
    {
//		int summe = (weapon.VP + shield.VP + armor.VP + head.VP + special.VP);
//		return ((int)(Math.round(((Main.lvlSk*0.025)*(summe)))))+summe;
        return (weapon.VP + shield.VP + armor.VP + head.VP + special.VP);
    }

    // gesamt hp eines sets
    public int getHp()
    {
//		int summe = (weapon.HP + shield.HP + armor.HP + head.HP + special.HP);
//		return ((int)(Math.round(((Main.lvlSk*0.025)*(summe)))))+summe;
        return (weapon.HP + shield.HP + armor.HP + head.HP + special.HP);
    }

    // gesamt mp eines sets
    public int getMp()
    {
//		int summe = (weapon.MP + shield.MP + armor.MP + head.MP + special.MP);
//		return ((int)(Math.round(((Main.lvlSk*0.025)*(summe)))))+summe;
        return (weapon.MP + shield.MP + armor.MP + head.MP + special.MP);
    }

    // gesamt ap eines sets inkl. sk
    public int getSkAp()
    {
        return (Oberflaeche.umrechnen(weapon.AP) + Oberflaeche.umrechnen(shield.AP) + Oberflaeche.umrechnen(armor.AP) + Oberflaeche.umrechnen(head.AP) + Oberflaeche.umrechnen(special.AP));
    }

    // gesamt vp eines sets inkl. sk
    public int getSkVp()
    {
        return (Oberflaeche.umrechnen(weapon.VP) + Oberflaeche.umrechnen(shield.VP) + Oberflaeche.umrechnen(armor.VP) + Oberflaeche.umrechnen(head.VP) + Oberflaeche.umrechnen(special.VP));
    }

    // gesamt hp eines sets inkl. sk
    public int getSkHp()
    {
        return (Oberflaeche.umrechnen(weapon.HP) + Oberflaeche.umrechnen(shield.HP) + Oberflaeche.umrechnen(armor.HP) + Oberflaeche.umrechnen(head.HP) + Oberflaeche.umrechnen(special.HP));
    }

    // gesamt mp eines sets inkl. sk
    public int getSkMp()
    {
        return (Oberflaeche.umrechnen(weapon.MP) + Oberflaeche.umrechnen(shield.MP) + Oberflaeche.umrechnen(armor.MP) + Oberflaeche.umrechnen(head.MP) + Oberflaeche.umrechnen(special.MP));
    }

    // die ben kraft eines sets
    public int getKraft()
    {
        return (weapon.Kraft + shield.Kraft + armor.Kraft + head.Kraft + special.Kraft);
    }
}

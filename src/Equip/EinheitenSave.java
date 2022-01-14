package Equip;

import java.io.Serializable;

public class EinheitenSave extends Einheiten implements Serializable{

    public int lvl;
    public int opwert;
    public boolean atfire;
    public boolean atair;
    public boolean atice;
    public boolean atearth;
    public String titel;


    public EinheitenSave(String name, Tags rasse,int kraft, boolean fk, int kp, int ap, int vp, int hp, int mp,
                         boolean fire, boolean air, boolean earth, boolean ice , boolean atfire , boolean atair, boolean atice ,boolean atearth ,
                         int lvl, String titel, int opwert)
    {
        super(name, rasse, kraft, fk, kp, ap,  vp,  hp,  mp,  fire,  air,  earth,  ice);
        this.lvl = lvl;
        this.atfire = atfire;
        this.atair = atair;
        this.atice=atice;
        this.atearth=atearth;
        this.titel = titel;
        this.opwert = opwert;
    }

    public EinheitenSave(EinheitenSave vorlage)
    {
        super(vorlage.name, vorlage.rasse, vorlage.kraft, vorlage.fk, vorlage.kp, vorlage.ap, vorlage.vp, vorlage.hp, vorlage.mp, vorlage.fire, vorlage.air, vorlage.earth, vorlage.ice);
        this.atfire = vorlage.atfire;
        this.atair =  vorlage.atair;
        this.atice = vorlage.atice;
        this.atearth = vorlage.atearth;
        this.lvl = vorlage.lvl;
        this.titel = vorlage.titel;
        this.opwert = vorlage.opwert;
    }
}

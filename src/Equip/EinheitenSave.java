package Equip;

import java.io.Serializable;

public class EinheitenSave extends Einheiten implements Serializable {

    public int lvl;
    public int opwert;
    public boolean atfire;
    public boolean atair;
    public boolean atice;
    public boolean atearth;
    public String titel;

    public EinheitenSave(
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
            final boolean ice,
            final boolean atfire,
            final boolean atair,
            final boolean atice,
            final boolean atearth,
            final int lvl,
            final String titel,
            final int opwert) {
        super(name, rasse, kraft, fk, kp, ap, vp, hp, mp, fire, air, earth, ice);
        this.lvl = lvl;
        this.atfire = atfire;
        this.atair = atair;
        this.atice = atice;
        this.atearth = atearth;
        this.titel = titel;
        this.opwert = opwert;
    }

    public EinheitenSave(final EinheitenSave vorlage) {
        super(vorlage.name,
                vorlage.rasse,
                vorlage.kraft,
                vorlage.fk,
                vorlage.kp,
                vorlage.ap,
                vorlage.vp,
                vorlage.hp,
                vorlage.mp,
                vorlage.fire,
                vorlage.air,
                vorlage.earth,
                vorlage.ice);
        this.atfire = vorlage.atfire;
        this.atair = vorlage.atair;
        this.atice = vorlage.atice;
        this.atearth = vorlage.atearth;
        this.lvl = vorlage.lvl;
        this.titel = vorlage.titel;
        this.opwert = vorlage.opwert;
    }
}

package Equip;

import java.io.Serializable;

public class Equip implements Serializable {

    public final int AP;
    public final int VP;
    public final int HP;
    public final int MP;
    public final int Kraft;
    public final boolean FK;
    public final boolean Feuer;
    public final boolean Erde;
    public final boolean Eis;
    public final boolean Wind;
    public final int OP;
    public final String name;

    public Equip(
            final int ap,
            final int vp,
            final int hp,
            final int mp,
            final int kraft,
            final boolean fk,
            final boolean fire,
            final boolean earth,
            final boolean ice,
            final boolean air,
            final int opfer,
            final String name) {
        AP = ap;
        VP = vp;
        HP = hp;
        MP = mp;
        Kraft = kraft;
        FK = fk;
        Feuer = fire;
        Erde = earth;
        Eis = ice;
        Wind = air;
        OP = opfer;
        this.name = name;
    }

    public int getEle() {
        if (Feuer || Wind) {
            return 1;
        } else if (Eis || Erde) {
            return 2;
        } else return 0;
    }

}

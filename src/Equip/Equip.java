package Equip;

import java.io.Serializable;

/*
 * hält daten
 */
public class Equip implements Serializable{

    public int AP;
    public int VP;
    public int HP;
    public int MP;
    public int Kraft;
    public boolean FK;
    public boolean Feuer;
    public boolean Erde;
    public boolean Eis;
    public boolean Wind;
    public int OP;
    public String name;

    public Equip (int ap, int vp, int hp, int mp, int kraft, boolean fk, boolean fire, boolean earth, boolean ice, boolean air, int opfer, String name)
    {
        AP=ap;
        VP=vp;
        HP=hp;
        MP=mp;
        Kraft=kraft;
        FK=fk;
        Feuer=fire;
        Erde= earth;
        Eis=ice;
        Wind=air;
        OP=opfer;
        this.name= name;
    }

    public int getEle()
    {
        if( Feuer || Wind)
            return 1;
        else
        {
            if( Eis || Erde)
            {return 2;}
            else return 0;
        }
    }

}

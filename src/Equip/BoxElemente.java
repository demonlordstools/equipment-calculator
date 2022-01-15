package Equip;

/*
 * hält die eles einer eh mit equips und wünsche für elementwahl
 * fk auch ^^
 */
public class BoxElemente {

    public Boolean ehHatFk = true;
    public Boolean darfFkNutzen = true;
    public Boolean mussFkNutzen = false;
    public Boolean darfNichtFkNutzen = false;

    public boolean aendernErlaubt = true;
    public Boolean ehHatFire = false;
    public Boolean ehHatEarth = false;
    public Boolean ehHatIce = false;
    public Boolean ehHatAir = false;

    public Boolean atMussFeuer = false;
    public Boolean atMussWind = false;
    public Boolean atMussEis = false;
    public Boolean atMussErde = false;
    public Boolean atDarfEleNutzen = true;

    public Boolean defMussFeuer = false;
    public Boolean defMussWind = false;
    public Boolean defMussEis = false;
    public Boolean defMussErde = false;
    public Boolean defDarfEleNutzen = true;


    public BoxElemente() {
    }

}

package Equip;

/*
 * hält die eles einer eh mit equips und wünsche für elementwahl
 * fk auch ^^
 */
public class BoxElemente {

    public Boolean ehHatFk =true;
    public Boolean darfFkNutzen =true;
    public Boolean mussFkNutzen =false;
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


    public BoxElemente()
    {}

    public void clearAt()
    {atMussFeuer = false;
        atMussWind = false;
        atMussEis = false;
        atMussErde = false;
        atDarfEleNutzen = false;}

    public void clearDef()
    {defMussFeuer = false;
        defMussWind = false;
        defMussEis = false;
        defMussErde = false;
        defDarfEleNutzen = false;}

    public String testString()
    {
        return "ehHatFk : "+ehHatFk+"\n"+"darfFkNutzen : "+darfFkNutzen+"\n"+"mussFkNutzen :"+mussFkNutzen+"\n"+"darfNichtFkNutzen :"+darfNichtFkNutzen+"\n\n"+
                "ehHatFire : "+ehHatFire+"\n"+"ehHatEarth : "+ehHatEarth+"\n"+"ehHatIce : "+ehHatIce+"\n"+"ehHatAir : "+ehHatAir+"\n\n"+
                "atMussFeuer : "+atMussFeuer+"\n"+"atMussWind : "+atMussWind+"\n"+"atMussEis : "+atMussEis+"\n"+"atMussErde : "+atMussErde+"\n"+"atDarfEleNutzen : "+atDarfEleNutzen+"\n\n"+
                "defMussFeuer : "+defMussFeuer+"\n"+"defMussWind : "+defMussWind+"\n"+"defMussEis : "+defMussEis+"\n"+"defMussErde : "+defMussErde+"\n"+"defDarfEleNutzen : "+defDarfEleNutzen;
    }

}

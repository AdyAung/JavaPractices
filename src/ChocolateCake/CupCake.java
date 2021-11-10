package ChocolateCake;

public class CupCake {
    String flavor;
    boolean sprinkles;

    public CupCake(String flavorType, boolean sprinklesTop){
        this.flavor = flavorType;
        this.sprinkles = sprinklesTop;
    }

    public CupCake(CupCake copy){
        this.flavor = copy.flavor;
        this.sprinkles = copy.sprinkles;
    }
}

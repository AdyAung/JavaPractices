package InheraitanceAndPolymorphism;

public class Noodle {
    double lengthInCentimeters;
    double widthInCentimeters;
    String shape;
    String ingredients;
    String texture;

    //Constructors
    Noodle(double lenInCent, double wthInCent, String shp, String ingr){
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public final boolean isTasty(){
        return true;
    }

    public String cook(){
        return "Boil noodles for 7 minutes and add sauce";

    }


    public static void main(String[] args) {
        Ramen ichi = new Ramen();
        System.out.println(ichi.shape + " " + ichi.ingredients);
        System.out.println(ichi.isTasty());

        Noodle spaghetti, pho, ramen;

        spaghetti = new Spaghetti();
        pho = new Pho();
        ramen = new Ramen();

        Noodle[] allNoodles = {spaghetti, pho, ramen};

        for(Noodle allNoodle : allNoodles){
            System.out.println(allNoodle.cook());
        }

    }
}

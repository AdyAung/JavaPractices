package InheraitanceAndPolymorphism;

public class Ramen extends Noodle {

    Ramen(){
        super(30.2, 22.3, "Flat", "Flour");

    }

    @Override
    public String cook() {
        return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
    }
}

package InheraitanceAndPolymorphism;

/**
 * Build an array or ArrayList of several language objects and loop through them to call getInfo().
 * Add new methods that allow users to set a specific region, change the number of speakers, or modify the word order.
 * Create several more language family classes that pertain to languages you’re interested in.
 * Map out the sign language families.
 * Add in further linguistic features (e.g., which genders are used, whether the language is tonal, etc.).
 */


public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    //Constructor
    public Language(String inputName, int numberOfSpeakers, String regSpoken, String wordOfOrder){
        this.name = inputName;
        this.numSpeakers = numberOfSpeakers;
        this.regionsSpoken = regSpoken;
        this.wordOrder = wordOfOrder;

    }

    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers +
                " people mainly in " + regionsSpoken + ". \n The language " +
                "follows the word order: " + wordOrder);
    }



    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 500000,
                "Spain", "Subject-Verb-Objectc");
        spanish.getInfo();

        Mayan mayan = new Mayan("Mayan", 3333);
        mayan.getInfo();

        SinoTibetan sino = new SinoTibetan("Mandarin Chinese", 333);
        SinoTibetan bur = new SinoTibetan("Burmese", 1111111);

        sino.getInfo();
        bur.getInfo();

        Language mayanLan, sinoTibetan;

        mayanLan = new Mayan("Mayan", 3333);
        sinoTibetan = new Mayan("Burmese", 111111);

        Language[] languages = {mayanLan, sinoTibetan};

        for(Language language : languages){
            language.getInfo();
        }











    }
}

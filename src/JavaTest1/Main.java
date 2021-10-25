package JavaTest1;

public class Main {
    public static void main(String[] args) {

        Person personA = new Person("Kazuma", 33);
        Person personB = new Person("Lala", 28);

        personA.introduce();

        personB.introduce();
        personB.fight();
        personA.fight();
    }
}

package AccessMethods;

public class Person {
    public int age;
    public int wisdom;
    public int fitness;

    public Person(int inputAge){
        this.age = inputAge;
        this.wisdom = inputAge * 5;
        this.fitness = 100 - inputAge;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setWisdom(int newWisdom){
        this.wisdom = newWisdom;
    }

    public void setFitness(int newFitness){
        this.fitness = newFitness;
    }

    public void hasBirthday(){
        this.setAge(this.age + 1);
        this.setWisdom(this.wisdom += 5);
        this.setFitness(this.fitness -= 3);
    }



    public static void main(String[] args) {
        Person emily = new Person(20);

        System.out.println("Before change: ");
        System.out.println("Old age: " + emily.age);
        System.out.println("Old Wisdom: " + emily.wisdom);
        System.out.println("Old Fitness: " + emily.fitness);

        System.out.println("After change ");
        emily.hasBirthday();

        System.out.println("New Age: " + emily.age);
        System.out.println("New Wisdom: " + emily.wisdom);
        System.out.println("New Fitness: " + emily.fitness);


    }
}

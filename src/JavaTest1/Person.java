package JavaTest1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void introduce(){
        System.out.println("Name is: " + name + " and " + age + " years old.");
    }

    public void fight(){
        System.out.println(name + " is fighting with monsters");
    }
}

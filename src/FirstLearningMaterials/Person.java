package FirstLearningMaterials;

public class Person {
    String name;
    int age;

    public void set_value (){
        name = "Ma Ji";
        age = 27;
        System.out.println("Hello");
    }

    public void  get_value(){
        System.out.println("Her name is " + name);
        System.out.println("She is " + age + " years old.");
    }

    public static void main(String[] args) {
        Person myGirlFriend = new Person();
        myGirlFriend.set_value();
        myGirlFriend.get_value();
    }
}
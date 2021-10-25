package AccessMethods;

public class Dog {
    public String name;

    public Dog(String inputName){
        name = inputName;
    }

    public void speakName(){
        System.out.println("Hello my new name is " + this.name);
    }

    public void setName(String name){
        this.name = name;
    }


    public static void main(String[] args) {
        Dog burmeton = new Dog("Burmeton");

        burmeton.speakName();
        burmeton.setName("Bur");

        burmeton.speakName();

    }
}

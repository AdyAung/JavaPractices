package AccessMethods;

public class Test1 {
    private String name = "MOrrison";



    public String getName(){
        return name;
    }

    public String setName(){
        String newName = "Blah Blah";
        name = newName;
        return name;
    }

    public static void main(String[] args) {
        Test1 myName = new Test1();


        System.out.println(myName.getName());
        System.out.println(myName.setName());
    }
}

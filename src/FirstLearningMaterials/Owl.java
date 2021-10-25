package FirstLearningMaterials;

public class Owl {
    String speak;
    boolean nocturnal;

    public Owl(){
        speak = "Hoot";
        nocturnal = true;
    }

    public static void main(String[] args) {
        Owl hedwig = new Owl();
        System.out.println(hedwig.speak);
    }
}

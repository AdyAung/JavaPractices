package AccessMethods;

public class Test2 {
    public static void main(String[] args) {
        double area = 81.0;
        double side = Math.sqrt(area);
        System.out.println(side);

        int random =(int)(Math.random() * 11) + 10;
        int anohterRandom = (int)(Math.random() * 3) + 5;

        System.out.println(random);
        System.out.println(anohterRandom);
    }
}

package FirstLearningMaterials;

public class Math {
    public int sum(int a, int b){
        int k = a + b;
        return k;
    }
    public int substract(int x, int y){
        int t = x - y;
        return t;
    }

    public static void main(String[] args) {
        Math solution = new Math();
        int result = solution.sum(4,6);
        int subtractResult = solution.substract(10, 5);
        System.out.println(result);
        System.out.println(subtractResult);
    }
}
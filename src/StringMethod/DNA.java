package StringMethod;

public class DNA {
    public static void main(String[] args) {

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String[] dnaArray = {dna1, dna2, dna3};

        for(int i = 0; i < dnaArray.length; i++){
            if(dnaArray[i].contains("ATG") && dnaArray[i].contains("TGA")
                    && dnaArray[i].length() % 3 == 0){
                System.out.println("It does have protein");
            }else {
                System.out.println("It does not have protein");
            }
        }
    }
}

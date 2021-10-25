package FirstLearningMaterials;

public class CookiesStore {
    //Instant Fields
    String productType;

    //Constructor Method
    public CookiesStore(String product){
        productType = product;
    }

    //non-static method (behaviours)(instruction)
    public void advertise () {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        String cookie = "Cookies";
        CookiesStore cookieShop = new CookiesStore(cookie);

        cookieShop.advertise();
    }
}

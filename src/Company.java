public class Company {
    String brandName;

    Company(){
        brandName = "apple";
    }

    public static void main(String[] args) {
        Company c = new Company();
        System.out.println(c.brandName);
    }
}

package JavaProjectsFaDu.P05_HalukMarketOOPeng;

public class Products {

    String code;
    String name;
    double price;
    double userKg;

    public Products () {

    }

    public Products(String code, String name,  double price, double userKg) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.userKg=userKg;
    }

    @Override
    public String toString() {
        return "Products{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

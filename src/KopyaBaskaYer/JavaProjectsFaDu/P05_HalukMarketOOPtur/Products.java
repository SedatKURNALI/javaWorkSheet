package JavaProjectsFaDu.P05_HalukMarketOOPtur;

public class Products {

    // 1 - variable lar

    String code;
    String name;
    double price;
    double userKg;  // musterinin sectigi kg

    // 2 - Constructor lar (1 tane default)
    public Products() { // parametresiz const

    }

    public Products(String code, String name, double price, double userKg) { // parametreli const
        this.code = code;
        this.name = name;
        this.price = price;
        this.userKg = userKg;
    }

    // 3- Getter and Setters


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getUserKg() {
        return userKg;
    }

    public void setUserKg(double userKg) {
        this.userKg = userKg;
    }


    // 4- toString()

    @Override
    public String toString() {
        return "Products{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

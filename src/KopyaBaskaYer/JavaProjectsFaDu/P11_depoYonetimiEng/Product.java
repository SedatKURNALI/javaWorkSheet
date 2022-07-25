package JavaProjectsFaDu.P11_depoYonetimiEng;

public class Product {

    // 1- Variables

    private static int idCounter = 1000;
    private static int productId;
    private String productName;
    private String productProducer;
    private int productQuantity;
    private String productUnit;
    private String productShelfNo;

    // 2- Construction

    public Product() {

    }

    public Product(int productId, String productName, String productProducer, int productQuantity, String productUnit, String productShelfNo) {
        this.productId = idCounter++;
        this.productName = productName;
        this.productProducer = productProducer;
        this.productQuantity = productQuantity;
        this.productUnit = productUnit;
        this.productShelfNo = productShelfNo;
    }

    public Product(String productName, String productProducer, String productUnit) {
        this.productName = getProductName();
        this.productProducer = getProductProducer();
        this.productUnit = getProductUnit();

    }


    // 3- Getter and Setter

    public static int getProductId() {
        return ++idCounter;
    }

    public static void setProductId(int productId) {
        Product.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductProducer() {
        return productProducer;
    }

    public void setProductProducer(String productProducer) {
        this.productProducer = productProducer;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductShelfNo() {
        return productShelfNo;
    }

    public void setProductShelfNo(String productShelfNo) {
        this.productShelfNo = productShelfNo;
    }


    // 4- toString


    @Override
    public String toString() {
        return "Product: " +
                "productID='" + productId + '\'' +
                "productName='" + productName + '\'' +
                ", productProducer='" + productProducer + '\'' +
                ", productQuantity=" + productQuantity +
                ", productUnit='" + productUnit + '\'' +
                ", productShelfNo='" + productShelfNo + "\n";
    }

    // 5- Method


}

package Entities;

public class Product {

    private String productName;
    private Double productPrice;
    
    public Product(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }   
}

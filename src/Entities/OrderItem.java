package Entities;


public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(){
    }
    
    public OrderItem(Integer quantity, Double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    } 
    public Product getProduct(){
        return product;
    } 
    public void setProduct(Product product){
        this.product = product;
    }

    public Double subTotal(){
        return quantity * price;
    }  

    public String toString() {
        return product.getProductName()
        +", $"+String.format("%.2f", price)
        +", Quantidade: "
        +quantity 
        + ", Subtotal: $"
        +String.format("%.2f", subTotal());  
      }
}

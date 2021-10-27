package javaapplication22;

public class Product {
    
    private int id;
    private int price;
    private String name;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }
    
    public int calculateValue(int quantity){
        return this.price * quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}

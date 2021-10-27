package javaapplication22;

public class Order {
    
    private User user;
    private Restaurant restaurant;
    private Product[] products;

    public Order(User user, Restaurant restaurant, Product[] products) {
        this.user = user;
        this.restaurant = restaurant;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    
    
    
}

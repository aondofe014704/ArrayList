package ECommercePackage;

import java.util.List;

public class ShoppingCart {
    private Order orders;
    private Product product;

    List<Order> oderId;

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }

    public int generateOrderId(){
        return oderId.size() + 1;
    }

    List<Product> products;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
//    public ShoppingCart

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}

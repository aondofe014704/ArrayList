package ECommercePackage;

import PackageForDiary.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ecommerce {
    Product product = new Product();
    List<User> users = new ArrayList<>();
    ShoppingCart shoppingCart = new ShoppingCart();

    List<ShoppingCart> carts;


    public int purchase(int id, String name, double price) {
         product.setProductName(name);
         product.setProductPrice(price);
         product.setProductId(id);
         shoppingCart.setProduct(product);
         int shoppingId = shoppingCart.generateOrderId();
         carts.add(shoppingCart);
        return shoppingId;
    }


    public void register(String userName, String email, String password) {
        User userSave = new User(userName, email, password);

//        userSave.setUserName(userName);
//        userSave.setEmailAddress(email);
//        userSave.setPassword(password);

        users.add(userSave);
        System.out.println(userSave  + "got here...............................");

//        return userSave;

    }
    public int count(){
        return users.size();
    }
    public User findUserByUsername(String username) {
        for (User user : users){
            if (user.getUserName().equals(username)){
                return user;
            }
        }
        throw new RuntimeException("User not found");
    }



}

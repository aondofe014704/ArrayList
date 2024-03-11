import ECommercePackage.Ecommerce;
import ECommercePackage.Order;
import ECommercePackage.Product;
import ECommercePackage.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EcommerceTest {
    Ecommerce ecommerce = new Ecommerce();


    @Test
    public void userCanRegister() {
        User user = new User("James Brown", "James@gmail.com", "6969");



        ecommerce.register("James Brown", "James@gmail.com", "6969");
        int counter = ecommerce.count();
        assertEquals(1,counter);


        assertEquals( "James Brown", ecommerce.findUserByUsername("James Brown").getUserName());

    }

//    @Test
//    public void testUserCanOrder() {
//        Ecommerce ecommerce = new Ecommerce();
//
//        Order id = ecommerce.purchase();
//        Product product = new Product();
//        product.setProductId(1);
//    }

}



package dao;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductDAOTest <Product> {
	
	ProductDAO dao = new ProductDAO();

    @Test
    void testGetAllProducts() {

        List<Product> products = dao.getAllProducts();

        assertNotNull(products);

    }

    @Test
    void testProductListNotEmpty() {

        List<Product> products = dao.getAllProducts();

        assertFalse(products.isEmpty());

    }

}

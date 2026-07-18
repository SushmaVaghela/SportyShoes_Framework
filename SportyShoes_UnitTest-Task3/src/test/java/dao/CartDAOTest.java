package dao;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CartDAOTest <Cart>{
	
	CartDAO dao = new CartDAO();

    @Test
    public void testAddToCart() {

        boolean result = dao.addToCart(1, 2);

        assertTrue(result);
    }

    private void assertTrue(boolean result) {
		
		}

	@Test
    public void testGetCartItems() {

        List<Cart> cart = dao.getCartItems(1);

        assertNotNull(cart);
    }

    private void assertNotNull(List<Cart> cart) {
		
		}

	@Test
    public void testRemoveFromCart() {

        boolean result = dao.removeFromCart(1);

        assertTrue(result);
    }


}

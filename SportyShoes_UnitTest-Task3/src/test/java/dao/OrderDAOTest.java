package dao;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OrderDAOTest {
	
	OrderDAO dao = new OrderDAO();

    @Test
    public void testPlaceOrder() {

        boolean result = dao.placeOrder(1);

        assertTrue(result);
    }

    private void assertTrue(boolean result) {
		
	}
    
    @Test
    public void testGetOrders() {

        List<Order> orders = dao.getOrders();

        assertNotNull(orders);

   }

	private void assertNotNull(List<Order> orders) {
	}


}

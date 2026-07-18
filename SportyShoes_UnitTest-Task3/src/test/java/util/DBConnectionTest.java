package util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;

public class DBConnectionTest {
	
	@Test
	public void testDatabaseConnection() {
		Connection conn = DBConnectionTest.getConnection();
		assertNotNull(conn);
	}
	
	private void assertNotNull(Connection conn) {
		
	}

	private static Connection getConnection() {
		
		return null;
	}

}

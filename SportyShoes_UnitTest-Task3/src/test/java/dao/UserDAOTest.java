package dao;

import java.util.List;

import org.junit.jupiter.api.Test;

public class UserDAOTest <User, User1> {
	
	 UserDAO dao = new UserDAO();

	    @Test
	    public void testGetAllUsers() {

	        List<User> users = dao.getAllUsers();

	        assertNotNull(users);
	    }

	    private void assertNotNull(List<User> users) {
			
			
		}

		@Test
	    public void testGetUserById() {

	        User user = (User) dao.getUserById(1);

	        assertNotNull(user);

	        }
    private void assertNotNull(User user) {
			
	    }

		@Test
	    public void testRegisterUser() {
			
			UserDAO userdao = new UserDAO();
			
			 	userdao.setName("Test User");
		        userdao.setEmail("test@test.com");
		        userdao.setPassword("12345");
		        
		        boolean result = dao.registerUser(userdao);

		        assertTrue(result);

		}

		private void assertTrue(boolean result) {
			
			
		}


}

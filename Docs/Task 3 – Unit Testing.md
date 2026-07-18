# Task 3 – Unit Testing

## Objective

Perform unit testing on all backend classes and methods using JUnit 5.

---

## Technologies Used

- Java
- Maven
- JUnit 5

---

## Backend Classes Tested

- ProductDAO
- UserDAO
- CartDAO
- OrderDAO
- DBConnection

---

## Steps Performed

1. Created JUnit test classes.
2. Tested DAO methods.
3. Verified database connection.
4. Validated returned values using assertions.
5. Executed all test cases.

---

## Algorithm

### ProductDAO Testing

Step 1: Create ProductDAO object.
Step 2: Call getAllProducts().
Step 3: Verify returned list is not null.
Step 4: Verify list contains products.
Step 5: Mark test as passed.

---

### UserDAO Testing

Step 1: Create UserDAO object.
Step 2: Retrieve user information.
Step 3: Verify user exists.
Step 4: Compare expected values.
Step 5: Pass test.

---

### Database Connection Test

Step 1: Create database connection.
Step 2: Verify connection object.
Step 3: Ensure connection is established.

---

## Assertions Used

- assertEquals()
- assertTrue()
- assertFalse()
- assertNotNull()

---

## Expected Result

All backend methods execute successfully and pass all assertions.

---

## Outcome

Successfully verified backend functionality through JUnit unit testing.
/**
 * 
 */
package com.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Ire
 *
 */
public class DBConectorTest {

	/**
	 * @throws java.lang.Exception
	 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
    */
	/**
	 * @throws java.lang.Exception
	 
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
    */
	/**
	 * @throws java.lang.Exception
	 
	@Before
	public void setUp() throws Exception {
	}
	*/

	/**
	 * @throws java.lang.Exception
	
	@After
	public void tearDown() throws Exception {
	}
	*/

	/**
	 * Test method for {@link com.example.DBConector#driver()}.
	 */
	@Test
	public void testDriver() {
		try{
			assertTrue(DBConector.driver());
		}catch(Exception ex){
			System.out.println(ex.toString());
			fail();
		}
		   
	}
	
	/**
	 * Test method for {@link com.example.DBConector#Connection()}.
	 */
	@Test
	public void testConnection() {
		assertNotNull(DBConector.connection());
	}
	
	/**
	 * Test method for {@link com.example.DBConector#Connection()}.
	 */
	@Test
	public void createTable() {		
		assertTrue(DBConector.createTable());
	}
}

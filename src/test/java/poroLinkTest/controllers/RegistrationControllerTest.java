package poroLinkTest.controllers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poroLink.utils.processExecution.ProcessManager;

public class RegistrationControllerTest {
	
	private static ProcessManager process;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		process = new ProcessManager(ProcessManager.WAMP);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		process.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRegistrationController() {
		fail("Not yet implemented");
	}

	@Test
	public void testInitEvent() {
		fail("Not yet implemented");
	}

}

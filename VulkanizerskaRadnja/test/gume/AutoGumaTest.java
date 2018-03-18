package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AutoGumaTest {

	AutoGuma a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Tigar");
		assertEquals(a.getMarkaModel(), "Tigar");
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
		assertEquals(a.getMarkaModel(), null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKratko() {
		a.setMarkaModel("t");
		assertEquals(a.getMarkaModel(),"t");
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(18);
		assertEquals(a.getPrecnik(),18);
	}
	
	@Test (expected = java.lang.RuntimeException.class)	
	public void testSetPrecnikMali() {
		a.setPrecnik(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeliki() {
		a.setPrecnik(50);
	}

	@Test 
	public void testSetSirina() {
		a.setSirina(200);
		assertEquals(a.getSirina(),200);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaPreuska() {
		a.setSirina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaPresiroka() {
		a.setSirina(400);
	}

	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(a.getVisina(),50);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaNiska() {
		a.setVisina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVisoka() {
		a.setVisina(100);
	}
	@Test
	public void testToString() {
		a.setMarkaModel("Tigar");
		a.setVisina(40);
		a.setSirina(150);
		a.setPrecnik(20);
		
		assertEquals("AutoGuma [markaModel=Tigar, precnik=20, sirina=150, visina=40]" , a.toString());
	}

	@Test
	public void testEqualsObject() {
		a.setMarkaModel("Tigar");
		a.setVisina(40);
		a.setSirina(150);
		a.setPrecnik(20);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Tigar");
		a2.setVisina(40);
		a2.setSirina(150);
		a2.setPrecnik(20);
		
		assertEquals(a.equals(a2),true);
		
	}
	
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Tigar");
		a.setVisina(40);
		a.setSirina(150);
		a.setPrecnik(20);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Sava");
		a2.setVisina(60);
		a2.setSirina(200);
		a2.setPrecnik(20);
		
		assertEquals(a.equals(a2),false);
		
	}
}
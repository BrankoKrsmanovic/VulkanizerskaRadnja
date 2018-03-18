package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {

	public VulkanizerskaRadnja vr;
	public AutoGuma a,b;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
		vr = new VulkanizerskaRadnja();
	    a = new AutoGuma();
	    b = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		vr = null;
	}

	@Test
	public void testDodajGumu() {
		vr.dodajGumu(a);
		assertEquals(vr.gume.get(vr.gume.size()-1),a);
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		vr.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajIstuGumu() {
		vr.dodajGumu(a);
		vr.dodajGumu(a);
	}
	
	@Test
	public void testPronadjiGumu() {
		vr.gume.add(a);
		vr.gume.add(b);
		a.setMarkaModel("Tigar");
		b.setMarkaModel("Sava");
		assertEquals(vr.pronadjiGumu("Tigar").get(0),a);
	}
	
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(vr.pronadjiGumu(null),null);
		}
	
	@Test
	public void testPronadjiNepostojecuGumu() {
		vr.gume.add(a);
		vr.gume.add(b);
		a.setMarkaModel("Tigar");
		b.setMarkaModel("Sava");
		assertEquals(vr.pronadjiGumu("Michelin"),null);
	}
	
	@Test
	public void testPronadjiGumu4() {
		vr.gume.add(a);
		vr.gume.add(b);
		a.setMarkaModel("Tigar");
		b.setMarkaModel("Tigar");
		assertEquals(vr.pronadjiGumu("Tigar").get(0),a);
		assertEquals(vr.pronadjiGumu("Tigar").get(1),b);
	}

}
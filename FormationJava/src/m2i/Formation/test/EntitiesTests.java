package m2i.Formation.test;

import org.junit.*;
import m2i.Formation.VenteEnLigne.entities.*;

public class EntitiesTests {

	@Test
	public void test() {
		Book b = new Book();
		b.setId(3);
		Assert.assertEquals(3, b.getId());
	}
	
	@Test
	public void VATPricetest() {
		Media m = new Book();
		m.setPrice(10);
		Assert.assertEquals(10.5, m.getVATPrice(),0.001);
	}
	
	@Test
	public void testFirsttest() {
		Book b = new Book();
		int eval = b.getEvaluation();
		Assert.assertEquals(0, eval);
	}

}

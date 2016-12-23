import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddtitionTest {
	Addition addition;
	
	@Before
	public void init() {
		addition = new Addition();
		
	}

	@Test
	public void adder1() {
		int c = addition.add(10,12);
		Assert.assertEquals(22, c);
	}
	
	@Test
	public void adder2() {
		int c = addition.add(10,16);
		Assert.assertEquals(22, c);
	}
}

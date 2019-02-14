import org.junit.Assert;
import org.junit.Test;
public class JunitTest {
	@Test
	public void testGetFirstName(){
		Person per = new Person("Ankush","bathla");
		Assert.assertEquals("Ankush",per.getFirstName());
	}
	@Test
	public void testGetLastName(){
		Person per= new Person("Vikram","bathla");
		Assert.assertEquals("bathla",per.getLastName());
	} 
}
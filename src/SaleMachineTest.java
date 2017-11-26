
import static org.junit.Assert.assertEquals; 
import org.junit.Test; 
public class SaleMachineTest {

	//pick 4 beers one by one with 50 coin, 
	//the message should be three times "ok" 
	//and "failed" at the last time; 
	@Test public void test_50Beer(){ 
	SaleMachine sm = new SaleMachine(); 
//	assertEquals(sm.buy("beer", 50), "请取饮料"); 
//	assertEquals(sm.buy("beer", 50), "请取饮料"); 
//	assertEquals(sm.buy("beer", 50), "请取饮料"); 
//	assertEquals(sm.buy("beer", 50), "目前该饮料已经售完。"); 
	
//	assertEquals(sm.buy("orange", 100), "请取饮料，并取回找钱。"); 
//	assertEquals(sm.buy("orange", 100), "请取饮料，并取回找钱。"); 
//	assertEquals(sm.buy("orange", 100), "请取饮料，并取回找钱。"); 
//	assertEquals(sm.buy("orange", 100), "目前该饮料已经售完。"); 
	
	assertEquals(sm.buy("orange", 100), "请取饮料，并取回找钱。"); 
	assertEquals(sm.buy("orange", 100), "请取饮料，并取回找钱。"); 
	assertEquals(sm.buy("orange", 100), "请取饮料，并取回找钱。"); 
	assertEquals(sm.buy("beer", 100), "请取饮料，并取回找钱。"); 
	assertEquals(sm.buy("beer", 100), "请取饮料，并取回找钱。"); 
	assertEquals(sm.buy("beer", 100), "对不起，目前不能找钱，请投 5 角硬币。"); 
	
	} 
}

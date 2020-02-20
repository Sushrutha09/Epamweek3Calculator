package CleanCode.CleanCode;
import static org.junit.Assert.*;

import org.junit.Test;


public class HouseConstructionExampleTest {


	HouseConstructionExampleTest t=new HouseConstructionExampleTest();
	    
		@Test
		public void testCost() {
			assertEquals(250000.0,t.cost("high standard material" , 100, "fully automated home"),0);
			
		}

	}




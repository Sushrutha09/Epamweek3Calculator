package CleanCode.CleanCode;
import static org.junit.Assert.*;
import org.junit.Test;
public class InterestsTest {


	    InterestsTest t=new InterestsTest();
	    
		@Test
		public void testSimple() {
			assertEquals(60.0,t.Simple(1000.0,2.0,3.0));
		}

		@Test
		public void testCompound() {
			assertEquals(2.0,t.Compound(100.0, 2.0, 1.0));
		}

	}




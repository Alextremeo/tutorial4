package Testcalc;

import org.junit.jupiter.api;
import static org.junit.jupiter.api.Assertions.*;


public class CalcTest 
    
{
	@Test
	public void testAdd(){
	
       assertEquals(2, new Calc().add(1,1));
	}
}

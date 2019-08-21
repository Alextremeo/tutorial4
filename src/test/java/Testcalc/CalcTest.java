package Testcalc;

import junit.*;



public class CalcTest 
    
{
	@Test
	public void testAdd(){
	
       assertEquals(2, new Calc().add(1,1));
	}
}

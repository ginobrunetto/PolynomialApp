import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class polynomialTest {

	@BeforeEach
	void setUp() throws Exception {
	};
	
	@Test
	public void polynomialInit0() 
	{	
	    polynomial a = new polynomial() ;
	    int expectedResult = 0 ;
	    
	    assertEquals(expectedResult, a);
	};
	
	@Test
	public void polynomialAdd() 
	{	
		int[] aa= {1,1,1,1,1};
		int[] bb= {1,1,1,1};
		int[] cc= {1,2,2,2,2};
	    polynomial a = new polynomial(aa) ;
	    polynomial b = new polynomial(bb) ;
	    polynomial expectedResult = new polynomial(cc) ;
	    
	    assertEquals(expectedResult, a.add(b));
	};
	
	@Test
	public void getCoefficient() 
	{	
		int[] aa= {1,2,3,4};
		polynomial a = new polynomial(aa) ;
		int f=a.getCoefficient(3);
		int expectedResult=4;
	    
	    assertEquals(expectedResult, f);
	};
	
	@Test
	public void valueOf() 
	{	
		int[] bb= {2,2,2};
		polynomial b = new polynomial(bb) ;
		float a=b.valueOf(2);
		float expectedResult=14;
		assertEquals(expectedResult, a);
	}
	
	@Test
	public void equals() 
	{	
		int[] aa= {2,2,2};
		int[] bb= {2,2,2};
		polynomial a = new polynomial(aa) ;
		polynomial b = new polynomial(bb) ;
		
		boolean expectedResult=true;
		assertEquals(expectedResult, a.equals(b));
	}
//	
//	@Test
//	public void toString() 
//	{	
//		int[] aa= {2,2,2};
//		polynomial a = new polynomial(aa) ;
//		assertEquals("2x^2+2x^1+2", a.toString());
//	}
};
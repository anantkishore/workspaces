/**
 * 
 */
package com.kishore.anant1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.kishore.anant.Calculator;

/**
 * @author Anant Kishore
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
	
	@Mock
	private Calculator calc;
	
	/*@Before
	public void beforeTestRun() {
		MockitoAnnotations.initMocks(Calculator.class);
	}*/

	@Test
	public void testAddMethod() {
		
		when(calc.add(10,20)).thenReturn(50);
		
		int result = calc.add(10, 20);
		
		assertEquals(50, result);
		
	}	
	
	@Test(expected = RuntimeException.class)
	public void testDivideMethod()
	{
		when(calc.divide(anyInt(), eq(0))).thenThrow(RuntimeException.class);
		
		int result = calc.divide(10, 0);
		
		assertEquals("Zero is not a valid denominator", calc.divide(30, 0));
	}
	
	@Test
	public void testSubstractMethod() 
	{
		doAnswer(new Answer<String>() {
		     public String answer(InvocationOnMock invocation) {
		         Object[] args = invocation.getArguments();
		         Object mock = invocation.getMock();
		         return "called with arguments: " + args;
		     }
		}).when(calc).substract(anyInt(), anyInt(), anyString());
		
		
	}

}

package com.calculator.instructionscalculator.InstructionsCalculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestDivisionInstruction {

	
	@Test (expected=ArithmeticException.class)
	public void testDivisionWithZero() {
		
		Instruction instruction=new Division(0);
		instruction.setNumber1(5);
		instruction.performOperation();
	}
	
	@Test
	public void testDivisionResult()
	{
		Instruction instruction=new Division(3);
		instruction.setNumber1(9);
		int result=instruction.performOperation();
		assertEquals("The result is",3,result);
	}
	
	@Test
	public void testDivisionWithNegativeDivisor()
	{
		Instruction instruction=new Division(-3);
		instruction.setNumber1(9);
		int result=instruction.performOperation();
		assertEquals("The result is",-3,result);
	}
	
	@Test (expected=ArithmeticException.class)
	public void testDivisionWithNegativeDividend()
	{
		Instruction instruction=new Division(3);
		instruction.setNumber1(-9);
		int result=instruction.performOperation();
		assertEquals("The result is",-3,result);
	}

	
	@Test (expected=ArithmeticException.class)
	public void testDivisionWithNegativeDividendAndNegativeDivisor()
	{
		Instruction instruction=new Division(-3);
		instruction.setNumber1(-9);
		int result=instruction.performOperation();
		assertEquals("The result is",3,result);
	}
}

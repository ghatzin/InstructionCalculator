package com.calculator.instructionscalculator.InstructionsCalculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiplyOperation {

	
	@Test
	public void testMultiplyOperation() 
	{
		Instruction instruction=new Multiply(2);
		instruction.setNumber1(4);;
		int result=instruction.performOperation();
		assertEquals("Result is",8,result);
		
	}
	
	@Test
	public void testMultiplyName()
	{
		Instruction instruction=new Multiply(2);
		assertEquals("Instruction Name is:","multiply",instruction.getInstructionName());
	}

}

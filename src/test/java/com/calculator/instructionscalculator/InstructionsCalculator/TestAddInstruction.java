package com.calculator.instructionscalculator.InstructionsCalculator;
import static org.junit.Assert.*;


import org.junit.Test;

public class TestAddInstruction {

	
	
	@Test
	public void testAddOperation() 
	{
		Instruction instruction=new Add(2);
		instruction.setNumber1(4);
		int result=instruction.performOperation();
		assertEquals("Result is",6,result);
		
	}
	
	@Test
	public void testAddName()
	{
		Instruction instruction=new Add(2);
		assertEquals("Instruction Name is:","add",instruction.getInstructionName());
	}

}

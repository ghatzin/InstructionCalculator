package com.calculator.instructionscalculator.InstructionsCalculator;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestApplyInstruction {


	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testApplyOperation() 
	{
	
		try
		{
			Instruction instruction=Apply.getApplyInstance(5);
			int result=instruction.performOperation();
			assertEquals("Result is",5,result);
		}
		catch (Exception e)
		{
			e.getMessage();
		}
	}
	
	@Test
	public void testApplyName()
	{
		try
		{
			Instruction instruction=Apply.getApplyInstance(4);
			assertEquals("Instruction Name is:","apply",instruction.getInstructionName());
		}
		catch (Exception e)
		{
			e.getMessage();
		}
	}
	
	
	

	
}

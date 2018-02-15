package com.calculator.instructionscalculator.InstructionsCalculator;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import java.util.*;

public class TestCalculator {

	private static List<Instruction> instructions;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		instructions=null;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		instructions=null;
	}
	
	@Before
	public void setUp(){
		
		instructions=new ArrayList<Instruction>();
	
	}
	
	@After 
	public void tearDown()
	{
		instructions=null;
	}
		
	@Test (expected=IndexOutOfBoundsException.class)
	public void testIFInstructionListIsEmpty()
	{
		
		Calculator calculator=new Calculator(instructions);
		calculator.instructionsNotEmpty();
	}
	
	
	@Test
	public void testInstructionNotEmpty()
	{
		
		instructions.add(new Add(2));
		Calculator calculator=new Calculator(instructions);
		boolean isEmpty=calculator.instructionsNotEmpty();
		assertEquals("Instruction List is not Empty",true,isEmpty);
	}
	
	
	@Test 
	public void testIsApplyLastInstruction()
	{
		try
		{
			instructions.add(Apply.getApplyInstance(4));
			Calculator calculator=new Calculator(instructions);
			boolean isApply=calculator.IsApplyLastInstruction();
			assertTrue(isApply);
		}
		catch (ApplyException e)
		{
			e.printStackTrace();
		}
		
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testApplyIsNotLastInstruction()
	{
		
		instructions.add(new Add(4));
		Calculator calculator=new Calculator(instructions);
		calculator.IsApplyLastInstruction();
	}
	
	@Test
	public void testCalculateWithOneInstruction()
	{
		
		try
		{
		  Instruction instruction1=Apply.getApplyInstance(4);
		  instructions.add(instruction1);
		  Calculator calculator=new Calculator(instructions);
		  int result=calculator.calculate();
		  assertEquals("Result is",4,result);
		}
		catch (ApplyException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void testCalculateWithTwoInstructions()
	{
		
		
		try
		{
		  Instruction instruction1=new Add(2);
		  instructions.add(instruction1);		
		  Instruction instruction2=Apply.getApplyInstance(4);
		  instructions.add(instruction2);
		  Calculator calculator=new Calculator(instructions);
		  int result=calculator.calculate();
		  assertEquals("Result is",6,result);
		}
		catch (ApplyException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	@Test
	public void testCalculateWithTreeInstructions() {
		
		try
		{
			Instruction instruction1=new Add(2);
			Instruction instruction2=new Multiply(3);
			instructions.add(instruction1);
			instructions.add(instruction2);
			Instruction instruction3=Apply.getApplyInstance(4);
			instructions.add(instruction3);
			Calculator calculator=new Calculator(instructions);
			int result=calculator.calculate();
			
			assertEquals("The result is",18,result);
		}
		catch (ApplyException e)
		{
			e.printStackTrace();
		}
		
		
		
		
	}
	
	@Test
	public void testCalculateWithFourInstructions() {
		
		
		try
		{
			Instruction instruction1=new Add(2);
			Instruction instruction2=new Multiply(3);
			Instruction instruction3=new Division(18);
			instructions.add(instruction1);
			instructions.add(instruction2);
			instructions.add(instruction3);
			Instruction instruction4=Apply.getApplyInstance(4);
			instructions.add(instruction4);
			Calculator calculator=new Calculator(instructions);
			int result=calculator.calculate();
			assertEquals("The size of list",1,result);
		}
		catch (ApplyException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	@Test
	public void testcalculateWithDivision()
	{
		
		try
		{
			Instruction instruction1=new Division(2);
			instructions.add(instruction1);
			Instruction instruction2=Apply.getApplyInstance(4);
			instructions.add(instruction2);
			Calculator calculator=new Calculator(instructions);
			int result=calculator.calculate();
			assertEquals("Result is",2,result);
		}
		catch (ApplyException e)
		{
			e.printStackTrace();
		}
		
	}
	
	

}

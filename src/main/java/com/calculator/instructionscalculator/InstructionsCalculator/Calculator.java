package com.calculator.instructionscalculator.InstructionsCalculator;

import java.util.*;

public class Calculator 
{
	List<Instruction> instructions;
	
	public Calculator(List<Instruction> instructions)
	{
		this.instructions=instructions;
	}
	
	public boolean instructionsNotEmpty()
	{
		if (instructions.size()==0)
			 throw new IndexOutOfBoundsException("There are no instructions");
		else
			return true;
	}
	
	public boolean IsApplyLastInstruction()
	{
		int size=instructions.size()-1;
		if (instructions.get(size).getInstructionName().equals("apply"))
				return true;
		else
			throw new IllegalArgumentException("Last Instruction in the file should be apply");
		
	}
	

	public int calculate()
	{
		
			int lastInstruction=instructions.size()-1;
			Instruction instruction=instructions.get(lastInstruction);
		
			int result=instruction.performOperation();
			int size=instructions.size()-1;
			for (int i=0;i<size;i++)
			{
				instructions.get(i).setNumber1(result);
				result=instructions.get(i).performOperation();
			}
		
		return result;
	}
	
	public List<Instruction> getInstructions()
	{
		return instructions;
	}
	
	public void reset()
	{
		this.instructions=null;
	}
	

}

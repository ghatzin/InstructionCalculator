package com.calculator.instructionscalculator.InstructionsCalculator;
import java.util.*;


public class Parser
{

	private List<String> keywords;
    private	String[] instructionParts;
    private int numberOfApplyObjects;

	public Parser(List<String> keywords)
	{
		this.keywords=new ArrayList<String>();
		this.keywords=keywords;
		numberOfApplyObjects=0;
		instructionParts=null;
	}
	
	
	public void getInstructionParts(String instruction)
	{
		instructionParts=instruction.split("\\s");
		
	}
	
	
	
	public boolean instructionHasTwoParts()
	{
		if (instructionParts.length==2)
			return true;
		else
			throw new IllegalArgumentException("Instruction should have two parts");
	
	}
	
	public boolean firstPartIsValidKeyWord()
	{
		String keyword=instructionParts[0];
		for (int i=0;i<keywords.size();i++)
		{
			if (keyword.equals(keywords.get(i)))
				return true;	
		}
		
		throw new IllegalArgumentException("Not Valid keyword");
	}
	
	public boolean secondPartIsValidNumber()
	{
		String number=instructionParts[1];
		if (number.matches("\\d+"))
			return true;
		else
			throw new IllegalArgumentException("Not Valid Number");
	}
	
	
	public boolean checkNumberOfApplyObjects()
	{
		if (numberOfApplyObjects==1)
			throw new IllegalArgumentException("An apply instruction already exist");
		else
			return true;
	}
	
	
	public boolean checkInstructionCorrectness() 
	{
		
			if (instructionHasTwoParts() && firstPartIsValidKeyWord() && secondPartIsValidNumber() && checkNumberOfApplyObjects())
				return true;
			else
				throw new IllegalArgumentException();
		
	}
	
	
	public Instruction developInstruction()
	{
		
		int number=Integer.parseInt(instructionParts[1]);
		if (instructionParts[0].equals("apply"))
		{
			try
			{
			   return Apply.getApplyInstance(number);
			}
			catch (ApplyException e)
			{
				System.out.println(e.getMessage());
				System.exit(10);
			}
		}
		else if (instructionParts[0].equals("multiply"))
			return new Multiply(number);
		else if (instructionParts[0].equals("add"))
			return new Add(number);
		else if (instructionParts[0].equals("divide"))
			return new Division(number);
	
		return null;
		
	
	}
		
}

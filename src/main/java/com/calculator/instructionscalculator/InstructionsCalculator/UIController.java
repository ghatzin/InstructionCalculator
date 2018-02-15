package com.calculator.instructionscalculator.InstructionsCalculator;
import java.util.*;


public class UIController implements UseCaseController {
	
	private List<String> instructions;
	private List<Instruction> instructionsObjects;
	private Calculator calculator;
	private Parser parser;
	
	public void readData(String fileName)
	{
		InstructionsFileReader instructionsReader=new InstructionsFileReader();
		instructionsReader.readInstructions("c:\\instructions.txt");
		instructions=instructionsReader.getInstructions();
	}
	
	
	public void parseInstructions()
	{
		
		instructionsObjects=new ArrayList<Instruction>();
	    
		parser=new Parser(setKeywords());
		
		for (int i=0;i<instructions.size();i++)
		{	
		
			try
			{
				parser.getInstructionParts(instructions.get(i));
				parser.checkInstructionCorrectness();	
				instructionsObjects.add(parser.developInstruction());
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
			    System.exit(0);
			}
		}
		
		
	}
	
	public int calculate()
	{
		calculator=new Calculator(instructionsObjects);
		int result=0;
		try
		{
			if (calculator.instructionsNotEmpty() && calculator.IsApplyLastInstruction())
				result=calculator.calculate();
		}
		catch(IndexOutOfBoundsException ibe)
		{
			System.out.println(ibe.getMessage());
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		
		return result;
	
	}
	
	private List<String> setKeywords()
	{
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("add");
		keywords.add("multiply");
		keywords.add("divide");
		
		return keywords;
	}

}

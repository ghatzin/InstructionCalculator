package com.calculator.instructionscalculator.InstructionsCalculator;
//This is a singleton class and enforce the rule that only one apply instruction
//should be in the instructions file

public class Apply implements Instruction
{
	private static int number1;
	
	private  static Apply applySingleton;
	
	private Apply(int number)
	{
	  setNumber1(number);
	}
	
	
	public static Apply getApplyInstance(int number) throws ApplyException 
	{
		
		
		if (applySingleton!=null)
		{
			throw new ApplyException("The file cannot contain two Apply instructions");
		}
		else
		{
			applySingleton=new Apply(number);
			return applySingleton;	
		}
		 		 	 
	}

	
	public int performOperation()
	{
		return number1;
		
	}
	
	 
	public String getInstructionName(){
		
		return "apply";
	}



	public void setNumber1(int number1) {
		
		Apply.number1=number1;
	}
		
	
	

}

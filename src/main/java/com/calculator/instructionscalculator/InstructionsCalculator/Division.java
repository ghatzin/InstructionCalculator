package com.calculator.instructionscalculator.InstructionsCalculator;

public class Division implements Instruction
{
	private int number1;
	private int number2;
	
	public Division(int number2)
	{
		
		this.number2=number2;
		
	}
	
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumber2(int number2)
	{
		this.number2=number2;
	}
	
	public int getNumber2()
	{
		return number2;
	}
	

	public int performOperation()
	{
		int dividend=number1;
		int divisor=number2;
		if (divisor==0 )
			throw new ArithmeticException("Divisor should not be 0");
		if (dividend<divisor)
			throw new ArithmeticException("Dividend should not be smaller than the divisor");
		else
			return dividend/divisor;
				
	}
	
	public String getInstructionName()
	{
		return "divide";
	}
	

}

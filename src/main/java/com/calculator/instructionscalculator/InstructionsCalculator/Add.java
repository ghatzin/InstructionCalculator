package com.calculator.instructionscalculator.InstructionsCalculator;

public class Add implements Instruction
{
	private int number1;
	private int number2;
	
	public Add(int number2)
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
	
	public int performOperation() {
		return number1+number2;
	}
	
	public String getInstructionName()
	{
		return "add";
	}
	
	
}

package com.calculator.instructionscalculator.InstructionsCalculator;

public interface Instruction {
	
	public int performOperation();
	public void setNumber1(int number1);
	public String getInstructionName();
}

package com.calculator.instructionscalculator.InstructionsCalculator;


public interface UseCaseController {
	
	public void readData(String fileName);
	public void parseInstructions();
	public int calculate();
	
}

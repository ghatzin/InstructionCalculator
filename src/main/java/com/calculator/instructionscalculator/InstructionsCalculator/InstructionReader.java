package com.calculator.instructionscalculator.InstructionsCalculator;
//The interface decouple from how the program reads the instructions 

public interface InstructionReader {
	
	public void readInstructions(String instructionsSource);
}

package com.calculator.instructionscalculator.InstructionsCalculator;

public class CalculatorMain {

	public static void main(String[] args) {
		
		TextUI textUI=new TextUI();
		
		try
		{
			 textUI.readData(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You Should give a file name as parameter");
			System.exit(0);
		}
			
		textUI.display();
		
	}
	
}

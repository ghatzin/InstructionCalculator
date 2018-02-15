package com.calculator.instructionscalculator.InstructionsCalculator;

public class TextUI
{
		
	UIController controller;
	
	public TextUI()
	{
		controller=new UIController();
		
	}
	
	
	public void readData(String fileName)
	{
		controller.readData(fileName);
	}
	
	
	
	public void display()
	{
		controller.parseInstructions();
		System.out.println(controller.calculate());
	}



}

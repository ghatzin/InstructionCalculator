package com.calculator.instructionscalculator.InstructionsCalculator;
import static org.junit.Assert.*;


import org.junit.Test;
import java.util.*;

public class ParserTest {


	@Test
	public void testIfInstuctionsHasTwoParts() {
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("multiply");
		keywords.add("add");
		keywords.add("divide");
		
		String instruction="add 2";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		boolean validKeyword=parser.instructionHasTwoParts();
		assertTrue(validKeyword);
	}
	
	
	@Test (expected=IllegalArgumentException.class)
	public void testIfInstuctionsHasThreeParts() {
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("multiply");
		keywords.add("add");
		keywords.add("divide");
		
		String instruction="apply  4";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		parser.instructionHasTwoParts();
		
	}
	
	
	
	@Test
	public void testIfInstuctionsContainsValidKeyWord() {
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("add");
		keywords.add("multiply");
		keywords.add("divide");
		
		String instruction="apply 4";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		boolean validKeyword=parser.firstPartIsValidKeyWord();
		assertEquals("Keyword",true,validKeyword);
	}

	
	@Test
	public void testIfInstuctionsContainsValidNumberWithOneDigit() {
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("add");
		keywords.add("multiply");
		keywords.add("divide");
		
		String instruction="apply 4";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		boolean validNumber=parser.secondPartIsValidNumber();
		assertEquals("Keyword",true,validNumber);
	}
	
	@Test
	public void testIfInstuctionsContainsValidNumberWithTwoDigits() {
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("add");
		keywords.add("multiply");
		keywords.add("divide");
		
		String instruction="apply 40";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		boolean validNumber=parser.secondPartIsValidNumber();
		assertEquals("Keyword",true,validNumber);
	}
	
	@Test
	public void testIfInstuctionsContainsValidNumberWithTreeDigits() {
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("add");
		keywords.add("multiply");
		keywords.add("divide");
		
		String instruction="apply 4";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		boolean validNumber=parser.secondPartIsValidNumber();
		assertEquals("Keyword",true,validNumber);
	}
	
	
	@Test
	public void testInstructorCorrectnessAllValid()
	{
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("add");
		keywords.add("multiply");
		keywords.add("divide");
		
		String instruction="apply 4";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		boolean validInstruction=parser.checkInstructionCorrectness();
		assertEquals("Instruction is valid",true,validInstruction);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testInstructorCorrectnesInstructionsWithTwoSpaces()
	{
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("add");
		keywords.add("multiply");
		keywords.add("divide");
		
		String instruction="apply   4";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		boolean validInstruction=parser.checkInstructionCorrectness();
		assertEquals("Instruction is valid",true,validInstruction);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testInstructorCorrectnesInstructionsWithInvalidKeyword()
	{
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("add");
		keywords.add("multiply");
		keywords.add("divide");
		
		String instruction="compile 4";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		boolean validInstruction=parser.checkInstructionCorrectness();
		assertEquals("Instruction is valid",true,validInstruction);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testInstructorCorrectnesInstructionsWithInvalidNumber()
	{
		
		List<String> keywords=new ArrayList<String>();
		keywords.add("apply");
		keywords.add("add");
		keywords.add("multiply");
		keywords.add("divide");
		
		String instruction="multiply 23.0";
		
		Parser parser=new Parser(keywords);
		parser.getInstructionParts(instruction);
		boolean validInstruction=parser.checkInstructionCorrectness();
		assertEquals("Instruction is valid",true,validInstruction);
	}
	
	
}

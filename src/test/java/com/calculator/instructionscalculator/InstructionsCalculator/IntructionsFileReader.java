package com.calculator.instructionscalculator.InstructionsCalculator;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class IntructionsFileReader {

	

	@Test
	public void testReadInstructionsFromFile()
	{
		InstructionsFileReader instructionsReader=new InstructionsFileReader();
		instructionsReader.readInstructions("C:\\InstructionsFile\\instructions.txt");
		assertEquals("First instruction","add 2",instructionsReader.getInstructions().get(0));
		assertEquals("First instruction","multiply 3",instructionsReader.getInstructions().get(1));
		assertEquals("First instruction","apply 4",instructionsReader.getInstructions().get(2));
	
	}

}

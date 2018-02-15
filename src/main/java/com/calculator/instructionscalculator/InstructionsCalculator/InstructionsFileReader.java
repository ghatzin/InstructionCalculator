package com.calculator.instructionscalculator.InstructionsCalculator;
import java.util.*;
import java.io.*;


public class InstructionsFileReader implements InstructionReader
{
	private List<String> instructions;
	
	
	public InstructionsFileReader()
	{
		instructions=new ArrayList<String>();
	}
	
	public void readInstructions(String fileName)
	{
		BufferedReader br=null;
		try
		{
		 	File file = new File(fileName);
	        br = new BufferedReader(new FileReader(file));
	        String line;
	        while((line=br.readLine()) != null)
	        {
	            instructions.add(line);
	        }
	        
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (br!=null)
			  try
			  {
				br.close();
			  }
			  catch(IOException e)
			  {
				e.printStackTrace();  
			  }
		}
	}
	
	
	
	public List<String> getInstructions()
	{
		return instructions;
	}
	
	

}

package mypackage;

import java.io.FileNotFoundException;
import java.nio.CharBuffer;

public class PrintOut {
	public static void print(CharBuffer charBuffer) throws FileNotFoundException
	{	
		for(char c:charBuffer.toString().toCharArray())
		{
			System.out.print(c);
		}
		
	}

}

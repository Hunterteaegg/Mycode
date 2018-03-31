package mypackage;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Stack<Character> stack=new Stack<Character>();
		char[] characters=null;
		
		while (!StdIn.isEmpty()) {
			characters=StdIn.readString().toCharArray();
		}
		for(int i=0;i<characters.length;i++)
		{
			if(characters[i]=='['||characters[i]=='('||characters[i]=='{')
			{
				stack.push(characters[i]);
			}
			else
			{
				if(characters[i]!=stack.pop())
				{
					System.out.println("false");
					System.exit(0);
				}
			}
		}
		System.out.println("true");

	}

}

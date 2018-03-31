package mypackage;

import edu.princeton.cs.algs4.Stack;

public class MyStack extends Stack<Object> {
	public MyStack(Object[] objects) {
		// TODO 自动生成的构造函数存根
		for(Object obj:objects)
		{
			this.push(obj);
		}
	}

}

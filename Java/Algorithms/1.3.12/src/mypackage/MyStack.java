package mypackage;

import edu.princeton.cs.algs4.Stack;

public class MyStack extends Stack<Object> {
	public MyStack(Object[] objects) {
		// TODO �Զ����ɵĹ��캯�����
		for(Object obj:objects)
		{
			this.push(obj);
		}
	}

}

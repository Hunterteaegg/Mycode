package mypackage;

import java.io.Serializable;

public class ClassTwo implements Serializable {
	private int id;
	public ClassTwo(int id) {
		// TODO 自动生成的构造函数存根
		this.id=id;
	}
	public String toString()
	{
		return "ClassTwo "+id;
	}

}

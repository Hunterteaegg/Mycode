package mypackage;

import java.io.Serializable;

public class ClassTwo implements Serializable {
	private int id;
	public ClassTwo(int id) {
		// TODO �Զ����ɵĹ��캯�����
		this.id=id;
	}
	public String toString()
	{
		return "ClassTwo "+id;
	}

}

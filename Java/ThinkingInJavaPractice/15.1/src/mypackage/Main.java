package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Holder3<MyBaseClass> holder3=new Holder3<MyBaseClass>(new MyExtendClass());
		holder3.get().print();

	}

}

class MyBaseClass
{
	void print()
	{
		System.out.println(this.getClass().getSimpleName());
	}
}

class MyExtendClass extends MyBaseClass
{
	;
}
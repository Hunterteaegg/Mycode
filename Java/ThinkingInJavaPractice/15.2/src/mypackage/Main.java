package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Holder<Integer> holder=new Holder<Integer>(5,8,10);
		System.out.println(holder.a+" "+holder.getB()+" "+holder.getC());

	}

}

class Holder<T>
{
	T a,b,c;
	
	public Holder(T a,T b,T c) {
		// TODO �Զ����ɵĹ��캯�����
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public T getA()
	{
		return a;
	}
	
	public T getB()
	{
		return b;
	}
	
	public T getC() {
		return c;
	}
}
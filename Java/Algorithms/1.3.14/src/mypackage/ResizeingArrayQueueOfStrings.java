package mypackage;

public class ResizeingArrayQueueOfStrings<T> {
	private T[] objects;
	private int first=0;
	private int last=0;
	
	public ResizeingArrayQueueOfStrings() {
		// TODO �Զ����ɵĹ��캯�����
		this.objects=(T[]) new Object[10];
	}
	public void add(T obj)
	{
		objects[last++]=obj;
	}
	public T pop()
	{
		return (T)objects[first++];
	}

}

package mypackage;

import java.util.PriorityQueue;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		PriorityQueue<MyClass> group=new PriorityQueue<MyClass>();
		Random random=new Random(47);
		
		for(int i=0;i<10;i++)
		{
			group.add(new MyClass(random.nextInt(100)));
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(group.poll().id);
		}

	}

}

class MyClass implements Comparable<MyClass>
{
	int id;
	
	public MyClass(int i) {
		// TODO �Զ����ɵĹ��캯�����
		this.id=i;
	}

	@Override
	public int compareTo(MyClass arg0) {
		// TODO �Զ����ɵķ������
		if(id>arg0.id)
		{
			return 1;
		}
		else if(id==arg0.id)
		{
			return 0;
		}
		else {
			return -1;
		}
	}
	
}
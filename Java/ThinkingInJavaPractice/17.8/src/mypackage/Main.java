package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		SList list=new SList();
		SListIterator it=list.literator();
		
		for(int i=0;i<5;i++)
		{
			it.add();
		}
		System.out.println();

	}

}

class SList
{
	private static int num=0;
	public final int id=num++;
	public SList next=null;
	
	public String toString()
	{
		return ("Slist "+id);
	}
	public SListIterator literator()
	{
		return new SListIterator(this);
	}
}

class SListIterator
{
	private SList temp;
	
	public SListIterator(SList temp) {
		// TODO �Զ����ɵĹ��캯�����
		this.temp=temp;
	}
	public void add()
	{
		temp.next=new SList();
		temp=temp.next;
	}
	public void remove()
	{
		SList s=temp;
		
		while(s.next!=null)
		{
			s=s.next;
		}
		s=null;
	}
	
}
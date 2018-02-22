package mypackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

public class SlowSet<E> extends AbstractSet<E> {
	ArrayList<E> list=new ArrayList<E>();
	
	@Override
	public boolean add(E arg0) {
		// TODO 自动生成的方法存根
		if(list.contains((E)arg0))
		{
			return true;
		}
		else {
			list.add((E)arg0);
			
			return true;
		}
	}
	
	public E get(int i)
	{
		return list.get(i);
	}
	
	@SuppressWarnings("unchecked")
	public boolean remove(Object e)
	{
		return list.remove((E)e);
	}

	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return list.size();
	}

	@Override
	public Iterator<E> iterator() {
		// TODO 自动生成的方法存根
		return list.iterator();
	}
	
	@Override
	public String toString()
	{
		StringBuilder stringBuilder=new StringBuilder();
		
		stringBuilder.append("[");
		for(E e:this.list)
		{
			stringBuilder.append(e+" ");
		}
		stringBuilder.append("]");
		
		return stringBuilder.toString();
	}

}

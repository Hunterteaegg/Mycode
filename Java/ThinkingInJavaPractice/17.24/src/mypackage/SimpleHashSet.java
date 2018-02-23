package mypackage;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleHashSet<E> extends AbstractSet<E> {
	private ArrayList<E> arraylist=new ArrayList<E>();
	static final int SIZE=997;
	@SuppressWarnings("unchecked")
	ArrayList<E>[] buckets=new ArrayList[SIZE];
	
	@Override
	public boolean add(E arg0) {
		// TODO 自动生成的方法存根
		int index=Math.abs(arg0.hashCode())%SIZE;
		
		if(buckets[index]==null)
		{
			buckets[index].add(arg0);
		}
		else if (arg0.equals(buckets[index].get(0))) {
			return true;
		}
		else {
			buckets[index].add(arg0);
		}
		
		return super.add(arg0);
	}

	@Override
	public Iterator<E> iterator() {
		// TODO 自动生成的方法存根
		return this.iterator();
	}

	@Override
	public int size() {
		// TODO 自动生成的方法存根
		return arraylist.size();
	}

}

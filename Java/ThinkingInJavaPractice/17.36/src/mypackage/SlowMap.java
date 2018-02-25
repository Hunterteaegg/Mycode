package mypackage;

import java.util.ArrayList;

public class SlowMap<K,V> {
	private ArrayList<MPair<K,V>> arrayList=new ArrayList<MPair<K,V>>();
	
	public void put(K key,V value)
	{
		arrayList.add(new MPair<K, V>(key, value));
	}
	public V get(K key)
	{
		for(MPair<K, V> mPair:arrayList)
		{
			if(mPair.k.equals(key))
			{
				return mPair.v;
			}
		}
		
		return null;
	}
	public String toString()
	{
		return arrayList.toString();
	}

}

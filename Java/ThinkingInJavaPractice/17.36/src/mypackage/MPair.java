package mypackage;

public class MPair<K,V> {
	K k;
	V v;
	
	public MPair(K k,V v) {
		// TODO 自动生成的构造函数存根
		this.k=k;
		this.v=v;
	}
	
	public String toString()
	{
		return ("K:"+k+",V:"+v);
	}

}

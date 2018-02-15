package mypackage;

class Holder<Integer> {
	Integer i;
	
	public Holder(Integer start) {
		// TODO 自动生成的构造函数存根
		this.i=start;
	}
	Integer get()
	{
		return i;
	}
	void set(Integer change)
	{
		this.i=change;
	}
	public String toString()
	{
		return "The number is "+i;
	}

}

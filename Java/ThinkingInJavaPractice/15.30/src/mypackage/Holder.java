package mypackage;

class Holder<Integer> {
	Integer i;
	
	public Holder(Integer start) {
		// TODO �Զ����ɵĹ��캯�����
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

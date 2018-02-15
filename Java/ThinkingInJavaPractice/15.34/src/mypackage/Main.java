package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(new InSelfBound().use(new InSelfBound()).getClass());

	}

}

abstract class SelfBound<T extends SelfBound<T>>
{
	abstract T produce(T x);
	T use(T x)
	{
		return produce(x);
	}
}

class InSelfBound extends SelfBound<InSelfBound>
{
	InSelfBound produce(InSelfBound x)
	{
		return x;
	}
}
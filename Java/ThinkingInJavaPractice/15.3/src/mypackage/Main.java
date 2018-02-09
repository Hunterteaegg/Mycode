package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(new SixTuple<Integer, Long, Double, Float, Character, Boolean>(6, 5520l, 3.25d, 55.3f, 'b', true));

	}

}

@SuppressWarnings("hiding")
class SixTuple<Integer,Long,Double,Float,Character,Boolean>
{
	public SixTuple(int i,long l,double d,float f,char c,boolean b) {
		// TODO 自动生成的构造函数存根
		this.i=i;
		this.l=l;
		this.d=d;
		this.f=f;
		this.c=c;
		this.b=b;
	}
	public final int i;
	public final long l;
	public final double d;
	public final float f;
	public final char c;
	public final boolean b;
}
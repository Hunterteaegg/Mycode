package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(new SixTuple<Integer, Long, Double, Float, Character, Boolean>(6, 5520l, 3.25d, 55.3f, 'b', true));

	}

}

@SuppressWarnings("hiding")
class SixTuple<Integer,Long,Double,Float,Character,Boolean>
{
	public SixTuple(int i,long l,double d,float f,char c,boolean b) {
		// TODO �Զ����ɵĹ��캯�����
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
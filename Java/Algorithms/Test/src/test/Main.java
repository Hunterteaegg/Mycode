package test;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double s=0,n=1;
		while(!(s<-4))
		{
			s=s+(Math.log10(n+1)/Math.log10(2))-(Math.log10(n+2)/Math.log10(2));
			n=n+1;
		}
		System.out.println(n);

	}

}

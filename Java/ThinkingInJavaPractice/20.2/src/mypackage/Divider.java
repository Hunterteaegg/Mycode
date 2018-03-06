package mypackage;

@ExtractInterface("Divider")
public class Divider {
	public double divide(int x,int y)
	{
		return ((double)x/y);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("5/3="+new Divider().divide(5, 3));

	}

}

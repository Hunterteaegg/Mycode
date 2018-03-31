package mypackage;

public class Rational {
	public Rational(int numerator,int denominator) {
		// TODO 自动生成的构造函数存根
		value=((double)numerator/(double)denominator);
	}
	private Double value;
	
	public String toString()
	{
		return Double.toString(value);
	}
	public void plus(Rational b)
	{
		value+=Double.parseDouble(b.toString());
	}
	public void minus(Rational b)
	{
		value-=Double.parseDouble(b.toString());
	}
	public void times(Rational b)
	{
		value*=Double.parseDouble(b.toString());
	}
	public void divides(Rational b)
	{
		value/=Double.parseDouble(b.toString());
	}
	public boolean equals(Rational b)
	{
		return this.toString().equals(b.toString());
	}
	public void test()
	{
		assert value>0:"Nice Number";
	}

}

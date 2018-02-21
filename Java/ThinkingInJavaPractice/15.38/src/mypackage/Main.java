package mypackage;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Coffee coffee=new Coffee();
		
		coffee.set("Good Coffee");
		new Milk(coffee, true);
		new Chocolate(coffee, true);
		System.out.println("milk:"+coffee.milk);
		System.out.println("bubble:"+coffee.bubble);
		System.out.println("chcolate:"+coffee.chocolate);
		System.out.println("sugar:"+coffee.sugar);
		System.out.println("cheese:"+coffee.cheese);
		

	}

}

class Coffee
{
	private String name;
	protected Coffee coffee;
	protected boolean milk=false;
	protected boolean bubble=false;
	protected boolean chocolate=false;
	protected boolean sugar=false;
	protected boolean cheese=false;
	
	public void set(String val)
	{
		this.name=val;
	}
	public String get()
	{
		return name;
	}
}

class Decorator extends Coffee
{
	
	public Decorator(Coffee coffee) {
		// TODO 自动生成的构造函数存根
		super.coffee=coffee;
	}
	public void set(String val)
	{
		coffee.set(val);
	}
	public String get()
	{
		return coffee.get();
	}
}

class Milk extends Decorator
{
	public Milk(Coffee coffee,boolean milk) {
		// TODO 自动生成的构造函数存根
		super(coffee);
		this.milk=milk;
	}
	public boolean checkMilk()
	{
		return super.milk;
	}
}

class Bubble extends Decorator
{
	public Bubble(Coffee coffee,boolean bubble)
	{
		super(coffee);
		super.bubble=bubble;
	}
	public boolean checkBubble()
	{
		return super.bubble;
	}
}

class Chocolate extends Decorator
{
	public Chocolate(Coffee coffee,boolean chocolate) {
		// TODO 自动生成的构造函数存根
		super(coffee);
		super.chocolate=chocolate;
	}
	public boolean checkChocolate()
	{
		return super.chocolate;
	}
}

class Sugar extends Decorator
{
	public Sugar(Coffee coffee,boolean sugar) {
		// TODO 自动生成的构造函数存根
		super(coffee);
		super.sugar=sugar;
	}
	public boolean checkSugar()
	{
		return super.sugar;
	}
}

class Cheese extends Decorator
{
	public Cheese(Coffee coffee,boolean cheese) {
		// TODO 自动生成的构造函数存根
		super(coffee);
		super.cheese=cheese;
	}
	public boolean checkCheese()
	{
		return super.cheese;
	}
}

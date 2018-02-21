package mypackage;

import java.util.ArrayList;
import java.util.Random;
import net.mindview.util.*;

public class Ship extends ArrayList<Container> {
	private ArrayList<CheckoutStand> checkouts=new ArrayList<CheckoutStand>();
	private Office office=new Office();
	public Ship(int nContainer,int nBox,int nProduct)
	{
		for(int i=0;i<nContainer;i++)
		{
			add(new Container(nBox, nProduct));
		}
	}
	public String toString()
	{
		StringBuilder result=new StringBuilder();
		
		for(Container c:this)
		{
			for(Box b:c)
			{
				for(Product p:b)
				{
					result.append(p);
					result.append("\n");
				}
			}
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(new Ship(20, 8, 66));

	}

}

class Product
{
	private final int id;
	private String description;
	private double price;
	
	public Product(int IDnumber,String descr,double price)
	{
		this.id=IDnumber;
		this.description=descr;
		this.price=price;
		System.out.println(toString());
	}
	public String toString()
	{
		return id+" "+description+" ,price: $"+price;
	}
	public void priceChange(double change)
	{
		price+=change;
	}
	public static Generator<Product> generator=new Generator<Product>() {
		
		@Override
		public Product next() {
			// TODO 自动生成的方法存根
			return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble()*1000)+0.99);
		}
		private Random rand=new Random(156);
	};
}

class Box extends ArrayList<Product>
{
	public Box(int nProducts)
	{
		Generators.fill(this, Product.generator, nProducts);
	}
}

class Container extends ArrayList<Box>
{
	public Container(int nBox,int nProducts)
	{
		for(int i=0;i<nBox;i++)
		{
			add(new Box(nProducts));
		}
	}
}

class CheckoutStand
{
	;
}

class Office
{
	;
}


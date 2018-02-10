package mypackage;
import java.util.ArrayList;
import java.util.List;

import net.mindview.util.New;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		@SuppressWarnings("unchecked")
		ArrayList<Animal> animals=(ArrayList)New.<Animal>list();
		animals.add(new Animal("Cat"));
		animals.add(new Animal("Dog"));
		animals.add(new Animal("Fish"));
		System.out.println(animals);

	}

}

class Animal
{
	String name;
	public Animal(String name) {
		// TODO 自动生成的构造函数存根
		this.name=name;
	}
	public String toString()
	{
		return "Animal "+name;
	}
}